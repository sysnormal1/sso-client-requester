package com.sysnormal.security.auth.sso.sso_client_requester.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * jwt properties
 *
 * @author aalencarvz1
 * @version 1.0.0
 */
@ConfigurationProperties(prefix = "spring.jwt")
@Getter
@Setter
public class JwtSsoClientRequesterProperties {
    private boolean enabled = true;
    private String publicKeyPath;
}

