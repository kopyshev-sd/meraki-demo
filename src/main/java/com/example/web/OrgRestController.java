package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class OrgRestController {

    @GetMapping("/organizations/{id}/networks")
    public String getNetworks(@PathVariable String id) {
        return """
                [
                    {
                        "id": "N_24329156",
                        "organizationId": "2930418",
                        "name": "Main Office",
                        "productTypes": [
                            "appliance",
                            "switch",
                            "wireless"
                        ],
                        "timeZone": "America/Los_Angeles",
                        "tags": [ "tag1", "tag2" ],
                        "enrollmentString": "my-enrollment-string",
                        "url": "https://n1.meraki.com//n//manage/nodes/list",
                        "notes": "Additional description of the network",
                        "isBoundToConfigTemplate": false
                    },
                    
                    {
                        "id": "N_24329156",
                        "organizationId": "2930418",
                        "name": "Main Office",
                        "productTypes": [
                            "appliance",
                            "switch",
                            "wireless"
                        ],
                        "timeZone": "America/Los_Angeles",
                        "tags": [ "tag1", "tag2" ],
                        "enrollmentString": "my-enrollment-string",
                        "url": "https://n1.meraki.com//n//manage/nodes/list",
                        "notes": "Additional description of the network",
                        "isBoundToConfigTemplate": false
                    }
                ]
                """;
    }

    @GetMapping("/organizations/{id}/uplinks/statuses")
    public String getDeviceStatuses(@PathVariable int id) {
        return """
                [
                    {
                        "networkId": "N_24329156",
                        "serial": "Q234-ABCD-5678",
                        "model": "MX68C",
                        "lastReportedAt": "2018-02-11T00:00:00Z",
                        "uplinks": [
                            {
                                "interface": "wan1",
                                "status": "active",
                                "ip": "1.2.3.4",
                                "gateway": "1.2.3.5",
                                "publicIp": "123.123.123.1",
                                "primaryDns": "8.8.8.8",
                                "secondaryDns": "8.8.4.4",
                                "ipAssignedBy": "static",
                                "provider": "at&t",
                                "signalStat": {
                                    "rsrp": "-120",
                                    "rsrq": "-13"
                                },
                                "connectionType": "4g",
                                "apn": "internet",
                                "dns1": "111.111.111.111",
                                "dns2": "222.222.222.222",
                                "signalType": "4G",
                                "iccid": "123456789"
                            }
                        ]
                    }
                ]
                """;
    }
}
