package com.sysnormal.libs.security.sso.spring.client_requester.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "sso")
@Component
@Getter
@Setter
public class SsoProperties {
    private String baseEndpoint = "http://localhost:3001";
    private String loginEndpoint = "/auth/login";
    private String refreshTokenEndpoint = "/auth/refresh_token";
    private String defaultEmail = "jumbo.ti@jumboalimentos.com.br";
    private String defaultPassword = "1#__ .*Racnela08__XY+ ##*0 -Z_";
    private Long defaultSystemId = 1L;
}
