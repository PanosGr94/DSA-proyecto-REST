package edu.upc.eetac.dsa.beeter;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

/**
 * Created by Panos on 02-Mar-16.
 */
public class BeeterResourceConfig extends ResourceConfig {

    public BeeterResourceConfig() {
        packages("edu.upc.eetac.dsa.beeter");
        //de 4.3 o 5.1
        packages("edu.upc.eetac.dsa.beeter.auth");
        //de 5.1
        register(RolesAllowedDynamicFeature.class);
    }

}
