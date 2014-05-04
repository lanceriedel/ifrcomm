package com.hivedata.mobileappserver.webapp.service;

import com.hivedata.mobileappserver.webapp.config.MainConfiguration;
import com.hivedata.mobileappserver.webapp.resources.TemplatedExperimentSearchResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.client.HttpClientBuilder;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.views.ViewBundle;
import org.apache.http.client.HttpClient;

public class MainService extends Service<MainConfiguration> {
    public static void main(String[] args) throws Exception {
        new MainService().run(args);
    }

    @Override
    public void initialize(Bootstrap<MainConfiguration> bootstrap) {
        bootstrap.setName("hello-world");
        bootstrap.addBundle(new ViewBundle());

        bootstrap.addBundle(new AssetsBundle("/assets", "/"));
        bootstrap.addBundle(new AssetsBundle("/public", "/public/"));
    }

    @Override
    public void run(MainConfiguration configuration,
                    Environment environment) {

        try {


            environment.addResource(new TemplatedExperimentSearchResource());


        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        //  environment.addHealthCheck(new TemplateHealthCheck(template));

    }

}