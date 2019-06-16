package com.xpp.sbdemo.config;

import lombok.Data;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@PropertySource("classpath:bakapplication.properties")
@Data
public class OtherProperties {
    private String name;
    private String age;
    private String isboss;
    private List<Map<String,String>> lists;
}
