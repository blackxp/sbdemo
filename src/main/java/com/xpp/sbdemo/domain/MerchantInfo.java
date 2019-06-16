package com.xpp.sbdemo.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//@Builder
public class MerchantInfo {
    private String mername;
    private String isftp;
    private String ftphost;
    private String ftpport;
    private String mccode;
    private String isclosed;
}
