package com.dsm.xlsxparser;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.jdbc.core.JdbcTemplate;

public class DatabaseConfiguration {

    private static final String DRIVER = "";
    private static final String URL = "";
    private static final String USERNAME = "";
    private static final String PASSWORD = "";

    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(DataSourceBuilder
                .create()
                .driverClassName(DRIVER)
                .url(URL)
                .username(USERNAME)
                .password(PASSWORD)
                .build()
        );
    }
}
