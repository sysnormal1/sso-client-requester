package com.sysnormal.security.auth.sso.sso_client_requester.services.jwt;

import com.sysnormal.security.auth.sso.sso_client_requester.properties.JwtSsoClientRequesterProperties;
import com.sysnormal.security.core.security_core.services.jwt.JwtCoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * jwt service
 *
 * @author aalencarvz1
 * @version 1.0.0
 */
//@Service //dont use this in starters
@EnableConfigurationProperties(JwtSsoClientRequesterProperties.class)
public class JwtSsoClientRequesterService extends JwtCoreService {

    private static final Logger logger = LoggerFactory.getLogger(JwtSsoClientRequesterService.class);

    private final JwtSsoClientRequesterProperties jwtSsoClientRequesterProperties;

    public JwtSsoClientRequesterService(JwtSsoClientRequesterProperties jwtSsoClientRequesterProperties) throws NoSuchAlgorithmException, InvalidKeySpecException, IOException {
        super();
        logger.debug("INIT {}.{}", this.getClass().getSimpleName(), "JwtSsoClientRequesterService");
        this.jwtSsoClientRequesterProperties = jwtSsoClientRequesterProperties;
        this.setPublicPemFilePath(jwtSsoClientRequesterProperties.getPublicKeyPath());
        logger.debug("END {}.{}", this.getClass().getSimpleName(), "JwtSsoClientRequesterService");
    }

}
