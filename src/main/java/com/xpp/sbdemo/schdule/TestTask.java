package com.xpp.sbdemo.schdule;

import com.xpp.sbdemo.config.MerchantYaml;
import com.xpp.sbdemo.config.TestYaml;
import com.xpp.sbdemo.domain.MerchantInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 定时任务，注意默认的是单线程的，会出现时间漂移的问题。解决办法：
 * 自定义一个schdule线程池
 */

@Component
@Slf4j
public class TestTask {

    @Autowired
    private MerchantYaml merchantYaml;

    @Scheduled(cron="*/5 * * * * *")
    public void reportCurrentTime() {
//        try {
//            //每三秒打印一行log
//            SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHmmss");
//            String sd = sdf.format(new Date());
//            log.info("ip===" + merchantYaml.getMerchant().size());
//            List<MerchantInfo>  ipList = merchantYaml.getMerchant();
//            for (int i = 0; i < ipList.size(); i++) {
//                MerchantInfo merchantInfo =  ipList.get(i);
//                System.out.println(merchantInfo.getFtphost());
//            }
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
