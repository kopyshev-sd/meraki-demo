package com.example.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrgRestController {

    @GetMapping("/organizations/{id}/networks")
    public String getNetworks(@PathVariable String id) {
        return "[\n" +
               "    {\n" +
               "        \"id\": \"N_24329156\",\n" +
               "        \"organizationId\": \"2930418\",\n" +
               "        \"name\": \"Main Office\",\n" +
               "        \"productTypes\": [\n" +
               "            \"appliance\",\n" +
               "            \"switch\",\n" +
               "            \"wireless\"\n" +
               "        ],\n" +
               "        \"timeZone\": \"America/Los_Angeles\",\n" +
               "        \"tags\": [ \"tag1\", \"tag2\" ],\n" +
               "        \"enrollmentString\": \"my-enrollment-string\",\n" +
               "        \"url\": \"https://n1.meraki.com//n//manage/nodes/list\",\n" +
               "        \"notes\": \"Additional description of the network\",\n" +
               "        \"isBoundToConfigTemplate\": false\n" +
               "    },\n" +
               "\n" +
               "    {\n" +
               "        \"id\": \"N_24329156\",\n" +
               "        \"organizationId\": \"2930418\",\n" +
               "        \"name\": \"Main Office\",\n" +
               "        \"productTypes\": [\n" +
               "            \"appliance\",\n" +
               "            \"switch\",\n" +
               "            \"wireless\"\n" +
               "        ],\n" +
               "        \"timeZone\": \"America/Los_Angeles\",\n" +
               "        \"tags\": [ \"tag1\", \"tag2\" ],\n" +
               "        \"enrollmentString\": \"my-enrollment-string\",\n" +
               "        \"url\": \"https://n1.meraki.com//n//manage/nodes/list\",\n" +
               "        \"notes\": \"Additional description of the network\",\n" +
               "        \"isBoundToConfigTemplate\": false\n" +
               "    }\n" +
               "]\n";
    }

    @GetMapping("/organizations/{id}/uplinks/statuses")
    public String getDeviceStatuses(@PathVariable int id) {
        return "[\n" +
               "    {\n" +
               "        \"networkId\": \"N_24329156\",\n" +
               "        \"serial\": \"Q234-ABCD-5678\",\n" +
               "        \"model\": \"MX68C\",\n" +
               "        \"lastReportedAt\": \"2018-02-11T00:00:00Z\",\n" +
               "        \"uplinks\": [\n" +
               "            {\n" +
               "                \"interface\": \"wan1\",\n" +
               "                \"status\": \"active\",\n" +
               "                \"ip\": \"1.2.3.4\",\n" +
               "                \"gateway\": \"1.2.3.5\",\n" +
               "                \"publicIp\": \"123.123.123.1\",\n" +
               "                \"primaryDns\": \"8.8.8.8\",\n" +
               "                \"secondaryDns\": \"8.8.4.4\",\n" +
               "                \"ipAssignedBy\": \"static\",\n" +
               "                \"provider\": \"at&t\",\n" +
               "                \"signalStat\": {\n" +
               "                    \"rsrp\": \"-120\",\n" +
               "                    \"rsrq\": \"-13\"\n" +
               "                },\n" +
               "                \"connectionType\": \"4g\",\n" +
               "                \"apn\": \"internet\",\n" +
               "                \"dns1\": \"111.111.111.111\",\n" +
               "                \"dns2\": \"222.222.222.222\",\n" +
               "                \"signalType\": \"4G\",\n" +
               "                \"iccid\": \"123456789\"\n" +
               "            }\n" +
               "        ]\n" +
               "    }\n" +
               "]\n";
    }

    @GetMapping("/organizations")
    public String getOrganizations() {
        return "[\n" +
               "    {\n" +
               "        \"id\": \"2930418\",\n" +
               "        \"name\": \"My organization\",\n" +
               "        \"url\": \"https://dashboard.meraki.com/o/VjjsAd/manage/organization/overview\"\n" +
               "    }\n" +
               "]";
    }
}
