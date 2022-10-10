package com.example.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class NetRestController {

    @GetMapping("/networks/{id}/appliance/vlans/settings")
    public String getNetBackgroundAvgLatency(@PathVariable String id) {
        return "{ \"vlansEnabled\": true }";
    }

    @GetMapping("/networks/{id}/wireless/latencyStats")
    public String getLatencyStats(@PathVariable String id) {
        return "{\n" +
               "    \"backgroundTraffic\": {\n" +
               "        \"rawDistribution\": {\n" +
               "            \"0\": 1234,\n" +
               "            \"1\": 2345,\n" +
               "            \"2\": 3456,\n" +
               "            \"4\": 4567,\n" +
               "            \"8\": 5678,\n" +
               "            \"16\": 6789,\n" +
               "            \"32\": 7890,\n" +
               "            \"64\": 8901,\n" +
               "            \"128\": 9012,\n" +
               "            \"256\": 83,\n" +
               "            \"512\": 1234,\n" +
               "            \"1024\": 2345,\n" +
               "            \"2048\": 9999\n" +
               "        },\n" +
               "        \"avg\": 606.52\n" +
               "    },\n" +
               "    \"bestEffortTraffic\": \"same shape as backgroundTraffic\",\n" +
               "    \"videoTraffic\": \"same shape as backgroundTraffic\",\n" +
               "    \"voiceTraffic\": \"same shape as backgroundTraffic\"\n" +
               "}\n";
    }

    @GetMapping("/networks/{id}/wireless/connectionStats")
    public String getConnectionStats(@PathVariable String id) {
        return "{\n" +
               "    \"assoc\": 1,\n" +
               "    \"auth\": 5,\n" +
               "    \"dhcp\": 0,\n" +
               "    \"dns\": 0,\n" +
               "    \"success\": 51\n" +
               "}\n";
    }

    @GetMapping("/networks/{id}/traffic")
    public String getTraffic(@PathVariable String id) {
        return "[\n" +
               "    {\n" +
               "        \"application\": \"Gmail\",\n" +
               "        \"destination\": null,\n" +
               "        \"protocol\": \"TCP\",\n" +
               "        \"port\": 443,\n" +
               "        \"sent\": 138,\n" +
               "        \"recv\": 61,\n" +
               "        \"numClients\": 7,\n" +
               "        \"activeTime\": 77000,\n" +
               "        \"flows\": 300\n" +
               "    }\n" +
               "]\n";
    }

    @GetMapping("/networks/{id}/wireless/ssids")
    public String getSSIDs(@PathVariable String id) {
        return "[\n" +
               "    {\n" +
               "        \"number\": 0,\n" +
               "        \"name\": \"My SSID\",\n" +
               "        \"enabled\": true,\n" +
               "        \"splashPage\": \"Click-through splash page\",\n" +
               "        \"ssidAdminAccessible\": false,\n" +
               "        \"authMode\": \"8021x-radius\",\n" +
               "        \"encryptionMode\": \"wpa-eap\",\n" +
               "        \"wpaEncryptionMode\": \"WPA2 only\",\n" +
               "        \"radiusServers\": [\n" +
               "            {\n" +
               "                \"host\": \"0.0.0.0\",\n" +
               "                \"port\": 3000,\n" +
               "                \"openRoamingCertificateId\": 2,\n" +
               "                \"caCertificate\": \"-----BEGIN CERTIFICATE-----\\nMIIEKjCCAxKgAwIBAgIRANb+lsED3eb4+6YKLFFYqEkwDQYJKoZIhvcNAQELBQAw\\ngYcxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMREwDwYDVQQHDAhT\\nYW4gSm9zZTEcMBoGA1UECgwTQ2lzY28gU3lzdGVtcywgSW5jLjESMBAGA1UECwwJ\\nRE5BU3BhY2VzMR4wHAYDVQQDDBVjaXNjby5vcGVucm9hbWluZy5vcmcwHhcNMjAx\\nMTA1MjEzMzM1WhcNMjExMTA1MjIzMzM1WjCBpDEcMBoGCgmSJomT8ixkAQETDGRu\\nYXNwYWNlczpVUzELMAkGA1UEBhMCVVMxCzAJBgNVBAgTAkNBMQ4wDAYDVQQKEwVD\\naXNjbzEcMBoGA1UECxMTV0JBOldSSVggRW5kLUVudGl0eTE8MDoGA1UEAxMzNjQ3\\nMDcwNDM4NDQ5NjQxMjAwMDAuMTg4MzQuaHMuY2lzY28ub3BlbnJvYW1pbmcub3Jn\\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoqjP9QgRGyUO3p7SH9QK\\nuTq6UYK7nAyjImgS4yQxeBkyZ5f2EUkX8m/AOcewpPxxPBhjPKRwxGeX3S50ksiA\\nayFomUeslR0S0Z7RN9rzJa+CFyi9MwWIHMbLgXpB8tsSpgTAqwrzoTzOGq9fgC6u\\npZhdZrBkg3FeJgD88goCi9mZDsY2YAoeGRLFJ2fR8iICqIVQy+Htq9pE22WBLpnS\\nKjL3+mR9FArHNFtWlhKF2YHMUqyHHrnZnF/Ns7QNoMMF7/CK18iAKgnb+2wuGKM2\\naEMddOeOTtz+i/rgjkp/RGMt011EdCsso0/cTo9qqX/bxOOCE4/Mne/ChMkQPnNU\\nCwIDAQABo3IwcDAJBgNVHRMEAjAAMB8GA1UdIwQYMBaAFIG+4l5yiB01gP0sw4ML\\nUSopqYcuMB0GA1UdDgQWBBSby1T9leYVOVVdOZXiHCSaDDEMiDAOBgNVHQ8BAf8E\\nBAMCBaAwEwYDVR0lBAwwCgYIKwYBBQUHAwIwDQYJKoZIhvcNAQELBQADggEBAEyE\\n1mjSUyY6uNp6W4l20w7SskALSJDRKkOeZxAgF3VMxlsCuEl70s9oEfntwIpyQtSa\\njON/9yJHbwm/Az824bmk8Dc7AXIPhay+dftXb8j529gPuYB9AKoPNg0NctkyYCQh\\na/3YQVdDWX7XgmEiXkL57M7G6+IdcPDONLArfjOcT9qHdkVVq1AIjlMSx3OQQmm/\\nuoLb/G9q/97QA2/l8shG/Na8HjVqGLcl5TNZdbNhs2w9ogxr/GNzqdvym6RQ8vT/\\nUR2n+uwH4n1MUxmHYYeyot5dnIV1IJ6hQ54JAncM9HvCLFk1WHz6RKshQUCuPBiJ\\nwTw70BVktzJnb0VLeDg=\\n-----END CERTIFICATE-----\"\n" +
               "            }\n" +
               "        ],\n" +
               "        \"radiusAccountingEnabled\": false,\n" +
               "        \"radiusEnabled\": true,\n" +
               "        \"radiusAttributeForGroupPolicies\": \"Filter-Id\",\n" +
               "        \"radiusFailoverPolicy\": \"null\",\n" +
               "        \"radiusLoadBalancingPolicy\": \"null\",\n" +
               "        \"ipAssignmentMode\": \"NAT mode\",\n" +
               "        \"adminSplashUrl\": \"http://example.com\",\n" +
               "        \"splashTimeout\": \"30 minutes\",\n" +
               "        \"walledGardenEnabled\": true,\n" +
               "        \"walledGardenRanges\": [\n" +
               "            \"example.com\",\n" +
               "            \"1.1.1.1/32\"\n" +
               "        ],\n" +
               "        \"minBitrate\": 11,\n" +
               "        \"bandSelection\": \"5 GHz band only\",\n" +
               "        \"perClientBandwidthLimitUp\": 0,\n" +
               "        \"perClientBandwidthLimitDown\": 0,\n" +
               "        \"visible\": true,\n" +
               "        \"availableOnAllAps\": false,\n" +
               "        \"availabilityTags\": [ \"test-tag\" ],\n" +
               "        \"perSsidBandwidthLimitUp\": 0,\n" +
               "        \"perSsidBandwidthLimitDown\": 0,\n" +
               "        \"mandatoryDhcpEnabled\": false,\n" +
               "        \"radiusAccountingServers\": [\n" +
               "            {\n" +
               "                \"host\": \"0.0.0.0\",\n" +
               "                \"port\": 3000,\n" +
               "                \"openRoamingCertificateId\": 2,\n" +
               "                \"caCertificate\": \"-----BEGIN CERTIFICATE-----\\nMIIEKjCCAxKgAwIBAgIRANb+lsED3eb4+6YKLFFYqEkwDQYJKoZIhvcNAQELBQAw\\ngYcxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMREwDwYDVQQHDAhT\\nYW4gSm9zZTEcMBoGA1UECgwTQ2lzY28gU3lzdGVtcywgSW5jLjESMBAGA1UECwwJ\\nRE5BU3BhY2VzMR4wHAYDVQQDDBVjaXNjby5vcGVucm9hbWluZy5vcmcwHhcNMjAx\\nMTA1MjEzMzM1WhcNMjExMTA1MjIzMzM1WjCBpDEcMBoGCgmSJomT8ixkAQETDGRu\\nYXNwYWNlczpVUzELMAkGA1UEBhMCVVMxCzAJBgNVBAgTAkNBMQ4wDAYDVQQKEwVD\\naXNjbzEcMBoGA1UECxMTV0JBOldSSVggRW5kLUVudGl0eTE8MDoGA1UEAxMzNjQ3\\nMDcwNDM4NDQ5NjQxMjAwMDAuMTg4MzQuaHMuY2lzY28ub3BlbnJvYW1pbmcub3Jn\\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoqjP9QgRGyUO3p7SH9QK\\nuTq6UYK7nAyjImgS4yQxeBkyZ5f2EUkX8m/AOcewpPxxPBhjPKRwxGeX3S50ksiA\\nayFomUeslR0S0Z7RN9rzJa+CFyi9MwWIHMbLgXpB8tsSpgTAqwrzoTzOGq9fgC6u\\npZhdZrBkg3FeJgD88goCi9mZDsY2YAoeGRLFJ2fR8iICqIVQy+Htq9pE22WBLpnS\\nKjL3+mR9FArHNFtWlhKF2YHMUqyHHrnZnF/Ns7QNoMMF7/CK18iAKgnb+2wuGKM2\\naEMddOeOTtz+i/rgjkp/RGMt011EdCsso0/cTo9qqX/bxOOCE4/Mne/ChMkQPnNU\\nCwIDAQABo3IwcDAJBgNVHRMEAjAAMB8GA1UdIwQYMBaAFIG+4l5yiB01gP0sw4ML\\nUSopqYcuMB0GA1UdDgQWBBSby1T9leYVOVVdOZXiHCSaDDEMiDAOBgNVHQ8BAf8E\\nBAMCBaAwEwYDVR0lBAwwCgYIKwYBBQUHAwIwDQYJKoZIhvcNAQELBQADggEBAEyE\\n1mjSUyY6uNp6W4l20w7SskALSJDRKkOeZxAgF3VMxlsCuEl70s9oEfntwIpyQtSa\\njON/9yJHbwm/Az824bmk8Dc7AXIPhay+dftXb8j529gPuYB9AKoPNg0NctkyYCQh\\na/3YQVdDWX7XgmEiXkL57M7G6+IdcPDONLArfjOcT9qHdkVVq1AIjlMSx3OQQmm/\\nuoLb/G9q/97QA2/l8shG/Na8HjVqGLcl5TNZdbNhs2w9ogxr/GNzqdvym6RQ8vT/\\nUR2n+uwH4n1MUxmHYYeyot5dnIV1IJ6hQ54JAncM9HvCLFk1WHz6RKshQUCuPBiJ\\nwTw70BVktzJnb0VLeDg=\\n-----END CERTIFICATE-----\"\n" +
               "            }\n" +
               "        ]\n" +
               "    }\n" +
               "]\n";
    }
}
