package com.nnyath.hello;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.moxy.json.*;

import com.nnyath.hello.filters.*;

@ApplicationPath("/")
public class HelloApp extends ResourceConfig {

    private static final String CONTROLLERS_PACKAGE_PREFIX = ".controllers";

    public HelloApp() {
        //Scan and add packages (controllers)
        packages(this.getClass().getPackage().getName() + CONTROLLERS_PACKAGE_PREFIX);
        
        //Register Moxy JSON mapping
        register(new MoxyJsonFeature());
        
        //Register CORS Response Filter
        register(CORSResponseFilter.class);
    }

}
