package com.xpp.sbdemo.druidMybatisConfig;

import com.alibaba.druid.filter.FilterChain;
import com.alibaba.druid.filter.FilterEventAdapter;
import com.alibaba.druid.proxy.jdbc.ConnectionProxy;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class DruidFilter extends FilterEventAdapter {
    @Override
    public void connection_connectBefore(FilterChain chain, Properties info) {
        log.info("before connect");
        super.connection_connectBefore(chain, info);
    }

    @Override
    public void connection_connectAfter(ConnectionProxy connection) {
        log.info("after connect");
        super.connection_connectAfter(connection);
    }
}
