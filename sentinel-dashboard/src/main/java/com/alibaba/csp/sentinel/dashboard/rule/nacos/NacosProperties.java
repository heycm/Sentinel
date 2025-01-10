package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author hey
 * @version 1.0
 * @since 2025/1/10 17:18
 */
@ConfigurationProperties(prefix = "sentinel.datasource.nacos")
public class NacosProperties {

    private String serverAddr = "127.0.0.1:8848";

    private String namespace;

    private String username;

    private String password;

    private String group = NacosConfigUtil.GROUP_ID;

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
