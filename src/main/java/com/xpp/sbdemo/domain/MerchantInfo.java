package com.xpp.sbdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MerchantInfo {
    private String mername;
    private String isftp;
    private String ftphost;
    private String ftpport;
    private String mccode;
    private String isclosed;
}
