package com.example.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class DeviceRestController {

    @GetMapping("/devices/{serial}/clients")
    public String getClientCount(@PathVariable String serial) {
        return "[\n" +
               "    {\n" +
               "        \"usage\": { \"sent\": 138, \"recv\": 61 },\n" +
               "        \"id\": \"k74272e\",\n" +
               "        \"description\": \"Miles's phone\",\n" +
               "        \"mac\": \"22:33:44:55:66:77\",\n" +
               "        \"ip\": \"1.2.3.4\",\n" +
               "        \"user\": \"milesmeraki\",\n" +
               "        \"vlan\": \"255\",\n" +
               "        \"namedVlan\": \"Named Vlan\",\n" +
               "        \"switchport\": null,\n" +
               "        \"adaptivePolicyGroup\": null,\n" +
               "        \"mdnsName\": \"Miles's phone\",\n" +
               "        \"dhcpHostname\": \"MilesPhone\"\n" +
               "    }\n" +
               "]\n";
    }

    @GetMapping("/networks/{id}/devices")
    public String getDevices(@PathVariable String id) {
        return "[\n" +
               "    {\n" +
               "        \"name\": \"My AP\",\n" +
               "        \"lat\": 37.4180951010362,\n" +
               "        \"lng\": -122.098531723022,\n" +
               "        \"serial\": \"Q234-ABCD-5678\",\n" +
               "        \"mac\": \"00:11:22:33:44:55\",\n" +
               "        \"model\": \"MR34\",\n" +
               "        \"address\": \"1600 Pennsylvania Ave\",\n" +
               "        \"notes\": \"My AP's note\",\n" +
               "        \"lanIp\": \"1.2.3.4\",\n" +
               "        \"tags\": \" recently-added \",\n" +
               "        \"networkId\": \"N_24329156\",\n" +
               "        \"beaconIdParams\": {\n" +
               "            \"uuid\": \"00000000-0000-0000-0000-000000000000\",\n" +
               "            \"major\": 5,\n" +
               "            \"minor\": 3\n" +
               "        },\n" +
               "        \"firmware\": \"wireless-25-14\",\n" +
               "        \"floorPlanId\": \"g_1234567\"\n" +
               "    }\n" +
               "]\n";
    }
}
