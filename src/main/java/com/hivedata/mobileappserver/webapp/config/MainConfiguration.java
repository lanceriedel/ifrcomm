package com.hivedata.mobileappserver.webapp.config;


import com.yammer.dropwizard.client.HttpClientConfiguration;
import com.yammer.dropwizard.config.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class MainConfiguration extends Configuration {


    @NotEmpty
    @JsonProperty
    private String brokerhostport;

    public String getBrokerhostport() {
        return brokerhostport;
    }


    @NotEmpty
    @JsonProperty
    private String kvhostport;

    public String getKvhostport() {
        return kvhostport;
    }


    @Valid
    @NotNull
    @JsonProperty
    private HttpClientConfiguration httpClient = new HttpClientConfiguration();

    public HttpClientConfiguration getHttpClientConfiguration() {
        return httpClient;
    }

}