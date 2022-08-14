package com.example.demo.api;

import com.example.demo.deviceInfo.DeviceInfo;
import com.example.demo.geofence.Geofence;
import com.example.demo.request.DeviceRegistration;
import com.example.demo.response.DefaultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping(path="/device")
@CrossOrigin
public class DeviceTemplateController {

    @Autowired
    DeviceTemplateService deviceTemplateService;


    @RequestMapping(path="/register")
    public @ResponseBody
    DefaultResponse addDevice()  {
        return deviceTemplateService.deviceRegistration();
    }


    @RequestMapping(path = "/geoFence")
    public @ResponseBody
    DefaultResponse addGeoFence()
    {
        return this.deviceTemplateService.addGeoFence();
    }

    @RequestMapping(value = "/epc/{count}", method = RequestMethod.GET)
    @ResponseBody
    public String generateEpc(
            @PathVariable("count") int count) {
        return "Successful!";
    }

}
