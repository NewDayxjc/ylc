package com.ylc.kuaishou.config;

import lombok.Data;


@Data
public class KuaiShouInfo {
    private String serverHost;
    private String appKey;
    private String appSecret;
    private String signSecret;
    private String messageSign;

}
