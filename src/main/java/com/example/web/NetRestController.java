package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NetRestController {

    @GetMapping("/networks/{id}/appliance/vlans/settings")
    public String getNetBackgroundAvgLatency(@PathVariable String id) {
        return "{ \"vlansEnabled\": true }";
    }

    @GetMapping("/networks/{id}/wireless/latencyStats")
    public String getLatencyStats(@PathVariable String id) {
        return """
                {
                    "backgroundTraffic": {
                        "rawDistribution": {
                            "0": 1234,
                            "1": 2345,
                            "2": 3456,
                            "4": 4567,
                            "8": 5678,
                            "16": 6789,
                            "32": 7890,
                            "64": 8901,
                            "128": 9012,
                            "256": 83,
                            "512": 1234,
                            "1024": 2345,
                            "2048": 9999
                        },
                        "avg": 606.52
                    },
                    "bestEffortTraffic": "same shape as backgroundTraffic",
                    "videoTraffic": "same shape as backgroundTraffic",
                    "voiceTraffic": "same shape as backgroundTraffic"
                }
                """;
    }

    @GetMapping("/networks/{id}/wireless/connectionStats")
    public String getConnectionStats(@PathVariable String id) {
        return """
                {
                    "assoc": 1,
                    "auth": 5,
                    "dhcp": 0,
                    "dns": 0,
                    "success": 51
                }
                """;
    }

    @GetMapping("/networks/{id}/traffic")
    public String getTraffic(@PathVariable String id) {
        return """
                [
                    {
                        "application": "Gmail",
                        "destination": null,
                        "protocol": "TCP",
                        "port": 443,
                        "sent": 138,
                        "recv": 61,
                        "numClients": 7,
                        "activeTime": 77000,
                        "flows": 300
                    }
                ]
                """;
    }

    @GetMapping("/networks/{id}/wireless/ssids")
    public String getSSIDs(@PathVariable String id) {
        return """
                [
                    {
                        "number": 0,
                        "name": "My SSID",
                        "enabled": true,
                        "splashPage": "Click-through splash page",
                        "ssidAdminAccessible": false,
                        "authMode": "8021x-radius",
                        "encryptionMode": "wpa-eap",
                        "wpaEncryptionMode": "WPA2 only",
                        "radiusServers": [
                            {
                                "host": "0.0.0.0",
                                "port": 3000,
                                "openRoamingCertificateId": 2,
                                "caCertificate": "-----BEGIN CERTIFICATE-----\\nMIIEKjCCAxKgAwIBAgIRANb+lsED3eb4+6YKLFFYqEkwDQYJKoZIhvcNAQELBQAw\\ngYcxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMREwDwYDVQQHDAhT\\nYW4gSm9zZTEcMBoGA1UECgwTQ2lzY28gU3lzdGVtcywgSW5jLjESMBAGA1UECwwJ\\nRE5BU3BhY2VzMR4wHAYDVQQDDBVjaXNjby5vcGVucm9hbWluZy5vcmcwHhcNMjAx\\nMTA1MjEzMzM1WhcNMjExMTA1MjIzMzM1WjCBpDEcMBoGCgmSJomT8ixkAQETDGRu\\nYXNwYWNlczpVUzELMAkGA1UEBhMCVVMxCzAJBgNVBAgTAkNBMQ4wDAYDVQQKEwVD\\naXNjbzEcMBoGA1UECxMTV0JBOldSSVggRW5kLUVudGl0eTE8MDoGA1UEAxMzNjQ3\\nMDcwNDM4NDQ5NjQxMjAwMDAuMTg4MzQuaHMuY2lzY28ub3BlbnJvYW1pbmcub3Jn\\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoqjP9QgRGyUO3p7SH9QK\\nuTq6UYK7nAyjImgS4yQxeBkyZ5f2EUkX8m/AOcewpPxxPBhjPKRwxGeX3S50ksiA\\nayFomUeslR0S0Z7RN9rzJa+CFyi9MwWIHMbLgXpB8tsSpgTAqwrzoTzOGq9fgC6u\\npZhdZrBkg3FeJgD88goCi9mZDsY2YAoeGRLFJ2fR8iICqIVQy+Htq9pE22WBLpnS\\nKjL3+mR9FArHNFtWlhKF2YHMUqyHHrnZnF/Ns7QNoMMF7/CK18iAKgnb+2wuGKM2\\naEMddOeOTtz+i/rgjkp/RGMt011EdCsso0/cTo9qqX/bxOOCE4/Mne/ChMkQPnNU\\nCwIDAQABo3IwcDAJBgNVHRMEAjAAMB8GA1UdIwQYMBaAFIG+4l5yiB01gP0sw4ML\\nUSopqYcuMB0GA1UdDgQWBBSby1T9leYVOVVdOZXiHCSaDDEMiDAOBgNVHQ8BAf8E\\nBAMCBaAwEwYDVR0lBAwwCgYIKwYBBQUHAwIwDQYJKoZIhvcNAQELBQADggEBAEyE\\n1mjSUyY6uNp6W4l20w7SskALSJDRKkOeZxAgF3VMxlsCuEl70s9oEfntwIpyQtSa\\njON/9yJHbwm/Az824bmk8Dc7AXIPhay+dftXb8j529gPuYB9AKoPNg0NctkyYCQh\\na/3YQVdDWX7XgmEiXkL57M7G6+IdcPDONLArfjOcT9qHdkVVq1AIjlMSx3OQQmm/\\nuoLb/G9q/97QA2/l8shG/Na8HjVqGLcl5TNZdbNhs2w9ogxr/GNzqdvym6RQ8vT/\\nUR2n+uwH4n1MUxmHYYeyot5dnIV1IJ6hQ54JAncM9HvCLFk1WHz6RKshQUCuPBiJ\\nwTw70BVktzJnb0VLeDg=\\n-----END CERTIFICATE-----"
                            }
                        ],
                        "radiusAccountingEnabled": false,
                        "radiusEnabled": true,
                        "radiusAttributeForGroupPolicies": "Filter-Id",
                        "radiusFailoverPolicy": "null",
                        "radiusLoadBalancingPolicy": "null",
                        "ipAssignmentMode": "NAT mode",
                        "adminSplashUrl": "http://example.com",
                        "splashTimeout": "30 minutes",
                        "walledGardenEnabled": true,
                        "walledGardenRanges": [
                            "example.com",
                            "1.1.1.1/32"
                        ],
                        "minBitrate": 11,
                        "bandSelection": "5 GHz band only",
                        "perClientBandwidthLimitUp": 0,
                        "perClientBandwidthLimitDown": 0,
                        "visible": true,
                        "availableOnAllAps": false,
                        "availabilityTags": [ "test-tag" ],
                        "perSsidBandwidthLimitUp": 0,
                        "perSsidBandwidthLimitDown": 0,
                        "mandatoryDhcpEnabled": false,
                        "radiusAccountingServers": [
                            {
                                "host": "0.0.0.0",
                                "port": 3000,
                                "openRoamingCertificateId": 2,
                                "caCertificate": "-----BEGIN CERTIFICATE-----\\nMIIEKjCCAxKgAwIBAgIRANb+lsED3eb4+6YKLFFYqEkwDQYJKoZIhvcNAQELBQAw\\ngYcxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMREwDwYDVQQHDAhT\\nYW4gSm9zZTEcMBoGA1UECgwTQ2lzY28gU3lzdGVtcywgSW5jLjESMBAGA1UECwwJ\\nRE5BU3BhY2VzMR4wHAYDVQQDDBVjaXNjby5vcGVucm9hbWluZy5vcmcwHhcNMjAx\\nMTA1MjEzMzM1WhcNMjExMTA1MjIzMzM1WjCBpDEcMBoGCgmSJomT8ixkAQETDGRu\\nYXNwYWNlczpVUzELMAkGA1UEBhMCVVMxCzAJBgNVBAgTAkNBMQ4wDAYDVQQKEwVD\\naXNjbzEcMBoGA1UECxMTV0JBOldSSVggRW5kLUVudGl0eTE8MDoGA1UEAxMzNjQ3\\nMDcwNDM4NDQ5NjQxMjAwMDAuMTg4MzQuaHMuY2lzY28ub3BlbnJvYW1pbmcub3Jn\\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoqjP9QgRGyUO3p7SH9QK\\nuTq6UYK7nAyjImgS4yQxeBkyZ5f2EUkX8m/AOcewpPxxPBhjPKRwxGeX3S50ksiA\\nayFomUeslR0S0Z7RN9rzJa+CFyi9MwWIHMbLgXpB8tsSpgTAqwrzoTzOGq9fgC6u\\npZhdZrBkg3FeJgD88goCi9mZDsY2YAoeGRLFJ2fR8iICqIVQy+Htq9pE22WBLpnS\\nKjL3+mR9FArHNFtWlhKF2YHMUqyHHrnZnF/Ns7QNoMMF7/CK18iAKgnb+2wuGKM2\\naEMddOeOTtz+i/rgjkp/RGMt011EdCsso0/cTo9qqX/bxOOCE4/Mne/ChMkQPnNU\\nCwIDAQABo3IwcDAJBgNVHRMEAjAAMB8GA1UdIwQYMBaAFIG+4l5yiB01gP0sw4ML\\nUSopqYcuMB0GA1UdDgQWBBSby1T9leYVOVVdOZXiHCSaDDEMiDAOBgNVHQ8BAf8E\\nBAMCBaAwEwYDVR0lBAwwCgYIKwYBBQUHAwIwDQYJKoZIhvcNAQELBQADggEBAEyE\\n1mjSUyY6uNp6W4l20w7SskALSJDRKkOeZxAgF3VMxlsCuEl70s9oEfntwIpyQtSa\\njON/9yJHbwm/Az824bmk8Dc7AXIPhay+dftXb8j529gPuYB9AKoPNg0NctkyYCQh\\na/3YQVdDWX7XgmEiXkL57M7G6+IdcPDONLArfjOcT9qHdkVVq1AIjlMSx3OQQmm/\\nuoLb/G9q/97QA2/l8shG/Na8HjVqGLcl5TNZdbNhs2w9ogxr/GNzqdvym6RQ8vT/\\nUR2n+uwH4n1MUxmHYYeyot5dnIV1IJ6hQ54JAncM9HvCLFk1WHz6RKshQUCuPBiJ\\nwTw70BVktzJnb0VLeDg=\\n-----END CERTIFICATE-----"
                            }
                        ]
                    }
                ]
                """;
    }
}
