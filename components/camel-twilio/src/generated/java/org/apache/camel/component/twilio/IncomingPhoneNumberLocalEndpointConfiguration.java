
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.incomingphonenumber.Local
 */
@UriParams
@Configurer
public final class IncomingPhoneNumberLocalEndpointConfiguration extends TwilioConfiguration {

    @UriParam
    private String pathAccountSid;

    @UriParam
    private com.twilio.type.PhoneNumber phoneNumber;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public com.twilio.type.PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(com.twilio.type.PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
