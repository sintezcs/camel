
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.call.Feedback;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.call.Feedback
 */
public enum CallFeedbackApiMethod implements ApiMethod {

    CREATOR(
        com.twilio.rest.api.v2010.account.call.FeedbackCreator.class,
        "creator",
        arg("pathCallSid", String.class),
        arg("qualityScore", Integer.class)),

    CREATOR_1(
        com.twilio.rest.api.v2010.account.call.FeedbackCreator.class,
        "creator",
        arg("pathAccountSid", String.class),
        arg("pathCallSid", String.class),
        arg("qualityScore", Integer.class)),

    FETCHER(
        com.twilio.rest.api.v2010.account.call.FeedbackFetcher.class,
        "fetcher",
        arg("pathCallSid", String.class)),

    FETCHER_1(
        com.twilio.rest.api.v2010.account.call.FeedbackFetcher.class,
        "fetcher",
        arg("pathAccountSid", String.class),
        arg("pathCallSid", String.class)),

    UPDATER(
        com.twilio.rest.api.v2010.account.call.FeedbackUpdater.class,
        "updater",
        arg("pathCallSid", String.class),
        arg("qualityScore", Integer.class)),

    UPDATER_1(
        com.twilio.rest.api.v2010.account.call.FeedbackUpdater.class,
        "updater",
        arg("pathAccountSid", String.class),
        arg("pathCallSid", String.class),
        arg("qualityScore", Integer.class));

    

    private final ApiMethod apiMethod;

    private CallFeedbackApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Feedback.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
