package com.example.demo.api;


import com.example.demo.IgniteDataConfiguration;
import com.example.demo.deviceAssetAssignmentRecord.DeviceAssetAssignmentRecordRepository;
import com.example.demo.deviceGeofenceAssignmentRecord.DeviceGeofenceAssignmentRecord;
import com.example.demo.deviceGeofenceAssignmentRecord.DeviceGeofenceAssignmentRecordRepository;
import com.example.demo.deviceInfo.DeviceInfo;
import com.example.demo.deviceInfo.DeviceInfoRepository;
import com.example.demo.geofence.Geofence;
import com.example.demo.geofence.GeofenceRepository;
import com.example.demo.request.DeviceRegistration;
import com.example.demo.response.DefaultResponse;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteAtomicLong;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Random;
import java.util.UUID;


@Service
public class DeviceTemplateService {
    private AnnotationConfigApplicationContext context;
    private DeviceInfoRepository deviceInfoRepository;
    private GeofenceRepository geofenceRepository;
    private DeviceGeofenceAssignmentRecordRepository deviceGeofenceAssignmentRecordRepository;

    public DeviceTemplateService() {
        context = new AnnotationConfigApplicationContext();
        context.register(IgniteDataConfiguration.class);
        context.refresh();
        deviceInfoRepository = context.getBean(DeviceInfoRepository.class);
        geofenceRepository = context.getBean(GeofenceRepository.class);
        deviceGeofenceAssignmentRecordRepository = context.getBean(DeviceGeofenceAssignmentRecordRepository.class);
    }
    /*Register a new device and its geofence assignment */
    public DefaultResponse deviceRegistration()
    {
        DeviceRegistration deviceRegistration=new DeviceRegistration();
        String locationUUID=deviceRegistration.getLocationUUID();
        DeviceInfo deviceInfo=deviceRegistration.getDeviceInfo();
        deviceInfo.setUuid(UUID.randomUUID().toString());
        deviceInfoRepository.save(1L,deviceInfo);
        Geofence geofence=geofenceRepository.findByLocationUUID(locationUUID);
        DeviceGeofenceAssignmentRecord deviceGeofenceAssignmentRecord=new DeviceGeofenceAssignmentRecord();
        deviceGeofenceAssignmentRecord.setAssignedDateTime(new Date());
        deviceGeofenceAssignmentRecord.setDeviceUUID(deviceInfo.getUuid());
        deviceGeofenceAssignmentRecord.setUuid(UUID.randomUUID().toString());
        deviceGeofenceAssignmentRecord.setGeofenceUUID(geofence.getUuid());
        deviceGeofenceAssignmentRecordRepository.save(1L,deviceGeofenceAssignmentRecord);
        return new DefaultResponse("Success", "Device Added Successfully", "200", deviceInfo.getUuid());
    }

    /*Register a geoFence*/
    public DefaultResponse addGeoFence()
    {

        return new DefaultResponse("Success", "Device Added Successfully", "200", "");
    }

    public void generateEpc(int count){
        for (int j = 0; j < count; j++){
            int leftLimit = 48; // numeral '0'
            int rightLimit = 122; // letter 'z'
            int targetStringLength = 10;
            Random random = new Random();

            String generatedString = random.ints(leftLimit, rightLimit + 1)
                    .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                    .limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            DeviceInfo temp;
            temp = deviceInfoRepository.getByUniqueHardwareId(generatedString);
            if (temp == null){
                temp.setUniqueHardwareId(generatedString);
                deviceInfoRepository.save(temp);
                j--;
            }
            j++;

            System.out.println(generatedString);
        }

    }

}
