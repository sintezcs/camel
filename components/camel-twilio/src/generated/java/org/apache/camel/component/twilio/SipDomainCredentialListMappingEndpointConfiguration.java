
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.sip.domain.CredentialListMapping
 */
@UriParams
@Configurer
public final class SipDomainCredentialListMappingEndpointConfiguration extends TwilioConfiguration {

    @UriParam
    private String credentialListSid;

    @UriParam
    private String pathAccountSid;

    @UriParam
    private String pathDomainSid;

    @UriParam
    private String pathSid;

    public String getCredentialListSid() {
        return credentialListSid;
    }

    public void setCredentialListSid(String credentialListSid) {
        this.credentialListSid = credentialListSid;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathDomainSid() {
        return pathDomainSid;
    }

    public void setPathDomainSid(String pathDomainSid) {
        this.pathDomainSid = pathDomainSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
