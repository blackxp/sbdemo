package com.xpp.sbdemo;

import com.xpp.sbdemo.config.MerchantYaml;
import com.xpp.sbdemo.domain.MerchantInfo;
import com.xpp.sbdemo.domain.Student;
import com.xpp.sbdemo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTransactionRollbackException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SbdemoApplicationTests {

    @Autowired
    private MerchantYaml merchantYaml;

    @Autowired
    private StudentService studentService;

    @Test
    public void getMerchantInfo() {
        try {
            //每三秒打印一行log
            SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHmmss");
            String sd = sdf.format(new Date());
            log.info("ip===" + merchantYaml.getMerchant().size());
            List<MerchantInfo> ipList = merchantYaml.getMerchant();
            for (int i = 0; i < ipList.size(); i++) {
                MerchantInfo merchantInfo = ipList.get(i);
                System.out.println(merchantInfo.getFtphost());
            }
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 这里的rollbackFor并没有生效，不管什么Exception，依然都回滚了！！！
     * @throws Exception
     */
    @Test
    @Transactional(rollbackFor = SQLTransactionRollbackException.class)
    public void testDruid() throws Exception{
        Student stu = new Student();
        stu.setName("test1");
        stu.setAge(19);
        stu.setClassname("test1 class rooback");
        //tt通过替换service的datatsource注解实现数据源的切换
        System.out.println(studentService.insert(stu) ? "添加成功" : "添加失败");
//        throw new SQLTransactionRollbackException();
        throw new NullPointerException();
    }

    @Test
    public void testBuild(){
        //有点问题、、、感觉是构造函数的问题
//        MerchantInfo merchantInfo = MerchantInfo.builder().isftp("Y").build();
//        System.out.println(merchantInfo.getIsftp());
    }
}