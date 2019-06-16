package com.xpp.sbdemo.config;

import com.xpp.sbdemo.domain.MerchantInfo;
import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @desc yaml自定义数组配置测试
 * 测试商户信息
 * @Warn：
 * 需要注意yml文件会把0开头的当做8进制来读，比如020089读出来是20089.0
 * 0开头的值需要自己加引号
 *
 *
 * @ConfigurationProperties(prefix  = "merchants")
 * 1、注意是yml的开头元素，当然也可以使用.来进入多层
 * 2、merchant  这个必须与配置的一致，不然是不生效的。
 */
@Configuration
@ConfigurationProperties(prefix  = "merchants")
@Data
@Validated
public class MerchantYaml {
    @NonNull
    private List<MerchantInfo> merchant;
}
