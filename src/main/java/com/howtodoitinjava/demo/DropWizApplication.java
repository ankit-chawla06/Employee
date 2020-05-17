package com.howtodoitinjava.demo;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.howtodoitinjava.demo.resources.EmployeeRESTController;
public class DropWizApplication extends Application<DropWizConfiguration> {

    private static  final Logger logger = LoggerFactory.getLogger(DropWizApplication.class);
    public static void main(final String[] args) throws Exception {
        new DropWizApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropWiz";
    }

    @Override
    public void initialize(final Bootstrap<DropWizConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropWizConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        logger.info("Registering REST resources");
        environment.jersey().register(new EmployeeRESTController(environment.getValidator()));
    }

}
