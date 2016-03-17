package edu.upc.eetac.dsa.beeter.cors;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import java.io.IOException;

/**
 * Created by Panos on 18-Mar-16.
 */
public class CORSResponseFilter implements ContainerRequestFilter {

    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
            responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
            responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
            String reqHead = requestContext.getHeaderString("Access-Control-Request-Headers");

            if (null != reqHead && !reqHead.equals("")) {
                responseContext.getHeaders().add("Access-Control-Allow-Headers", reqHead);
            }

            responseContext.getHeaders().add("Access-Control-Expose-Headers", "Content-Type, Access-Control-Allow-Origin, Access-Control-Allow-Credentials, Location");
        }

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {

    }
}

