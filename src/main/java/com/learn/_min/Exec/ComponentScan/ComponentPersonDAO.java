package com.learn._min.Exec.ComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class ComponentPersonDAO {
    @Autowired
    private ComponentJDBCConnection jdbcConnection;

    public ComponentJDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(ComponentJDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
