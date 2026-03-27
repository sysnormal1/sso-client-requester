package com.sysnormal.security.auth.sso.sso_client_requester.configs;

import com.sysnormal.security.auth.sso.sso_client_requester.properties.JwtSsoClientRequesterProperties;
import com.sysnormal.security.auth.sso.sso_client_requester.services.jwt.JwtSsoClientRequesterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * SecurityAutoConfiguration
 *
 * @author aalencarvz1
 * @version 1.0.0
 */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(JwtSsoClientRequesterProperties.class)
public class JwtAutoConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(JwtAutoConfiguration.class);

    @Bean
    //@ConditionalOnMissingBean(JwtSsoClientRequesterService.class)
    public JwtSsoClientRequesterService jwtSsoClientRequesterService(JwtSsoClientRequesterProperties jwtSsoClientRequesterProperties) throws NoSuchAlgorithmException, InvalidKeySpecException, IOException {
        logger.debug("INIT {}.{}", this.getClass().getSimpleName(), "jwtSsoClientRequesterService");
        logger.debug("END {}.{}", this.getClass().getSimpleName(), "jwtSsoClientRequesterService");
        return new JwtSsoClientRequesterService(jwtSsoClientRequesterProperties);
    }

}
