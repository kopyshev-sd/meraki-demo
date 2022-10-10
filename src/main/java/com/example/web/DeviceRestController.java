package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DeviceRestController {

    @GetMapping("/devices/{serial}/clients")
    public String getClientCount(@PathVariable String serial) {
        return """
                [
                    {
                        "usage": { "sent": 138, "recv": 61 },
                        "id": "k74272e",
                        "description": "Miles's phone",
                        "mac": "22:33:44:55:66:77",
                        "ip": "1.2.3.4",
                        "user": "milesmeraki",
                        "vlan": "255",
                        "namedVlan": "Named Vlan",
                        "switchport": null,
                        "adaptivePolicyGroup": null,
                        "mdnsName": "Miles's phone",
                        "dhcpHostname": "MilesPhone"
                    }
                ]
                """;
    }

    @GetMapping("/networks/{id}/devices")
    public String getDevices(@PathVariable String id) {
        return """
                [
                    {
                        "name": "My AP",
                        "lat": 37.4180951010362,
                        "lng": -122.098531723022,
                        "serial": "Q234-ABCD-5678",
                        "mac": "00:11:22:33:44:55",
                        "model": "MR34",
                        "address": "1600 Pennsylvania Ave",
                        "notes": "My AP's note",
                        "lanIp": "1.2.3.4",
                        "tags": " recently-added ",
                        "networkId": "N_24329156",
                        "beaconIdParams": {
                            "uuid": "00000000-0000-0000-0000-000000000000",
                            "major": 5,
                            "minor": 3
                        },
                        "firmware": "wireless-25-14",
                        "floorPlanId": "g_1234567"
                    }
                ]
                """;
    }
}
