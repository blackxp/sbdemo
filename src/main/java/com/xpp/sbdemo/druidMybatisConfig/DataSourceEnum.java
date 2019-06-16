package com.xpp.sbdemo.druidMybatisConfig;

/**
 * 如果有新增的数据源，
 * 1、需要在这里加一个enum实例
 * 2、在MyBatiesPlusConfiguration增加一个bean。同时sqlSessionFactory也要加
 */
public enum DataSourceEnum {

    DB1("test1"),DB2("test2");

    private String value;

    DataSourceEnum(String value){this.value=value;}

    public String getValue() {
        return value;
    }
}
