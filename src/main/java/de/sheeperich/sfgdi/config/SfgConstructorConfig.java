package de.sheeperich.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * @author Sheeperich
 */

@ConstructorBinding
@ConfigurationProperties("de.sheeperich")
public class SfgConstructorConfig {

    private final String username;
    private final String password;
    private final String jbdcurl;

    public SfgConstructorConfig(String username, String password, String jbdcurl) {
        this.username = username;
        this.password = password;
        this.jbdcurl = jbdcurl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jbdcurl;
    }
}
