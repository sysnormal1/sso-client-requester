package com.sysnormal.security.auth.sso.sso_client_requester.configs;

import com.sysnormal.security.auth.sso.sso_client_requester.properties.SsoProperties;
import com.sysnormal.security.auth.sso.sso_client_requester.services.SsoClientRequesterService;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@ConditionalOnClass(name = "org.springframework.boot.SpringApplication")
@Import({
        SsoProperties.class,
        SsoClientRequesterService.class,
        JwtAutoConfiguration.class
})
public class SsoClientRequesterAutoConfiguration {


}
