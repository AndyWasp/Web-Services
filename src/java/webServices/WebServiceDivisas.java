/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServices;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Andrea
 */
@Path("generic")
public class WebServiceDivisas {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ServiceResource
     */
    public WebServiceDivisas() {
    }

    /**
     * Retrieves representation of an instance of webServices.WebServiceDivisas
     * @param pesos
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/cDivisas/pesos={pesos}&moneda={moneda}")
    @Produces(MediaType.TEXT_PLAIN)
    public double cDivisas(@PathParam("pesos") String pesos,@PathParam("moneda") String moneda) {
        double cantidad = 0.0;
        double pesosD = Double.parseDouble(pesos);
        switch(moneda)
        {
            case "DolarEstadounidense":
                cantidad = pesosD / 18.57;
                break;
            case "Euro":
                cantidad = pesosD / 19.71;
                break;
            case "Yen":
                cantidad = pesosD / 0.17;
                break;
            case "CoronaIslandesa":
                cantidad = pesosD / 0.16;
                break;
            case "CoronaDanesa":
                cantidad = pesosD / 2.64;
                break;
        }
        return cantidad;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
        public String getService(){
        return "Servicio cargado";
    }
    /**
     * PUT method for updating or creating an instance of WebServiceDivisas
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
    
}
