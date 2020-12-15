//package BillingSystem.com;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import lombok.Getter;
//
//import javax.servlet.http.HttpServletResponse;
//import javax.ws.rs.*;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//@Path("/locations")
//public class Location {
//
//    private final Logger logger = LogManager.getLogger(this.getClass());
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("/zipcode")
//    public Response getLocation(@Context HttpServletResponse req, @QueryParam("zipcode") String zipcode,
//                                @DefaultValue("1") @QueryParam("maxRows") String maxRows){
//        JSONArray locations = new JSONArray();
//        Search[] searches = geoDao.getGeoLocationsByZipcode(Integer.parseInt(zipcode), Integer.parseInt(maxRows));
//        // loop searches
//        for (Search search : searches) { locations.put(searchToJson(search)); }
//
//    }
//    return Response.ok().build();
//
//    protected JSONObject searchToJson(Search search) {
//        // create json object and setting properties manually to avoid unwanted fields
//        JSONObject geoObject = new JSONObject();
//
//        // add longitude and latitude for json object
//        geoObject.put("lat", search.getLatitude());
//        geoObject.put("lng", search.getLongitude());
//        geoObject.put("city", search.getCity());
//        geoObject.put("state", search.getState());
//        geoObject.put("zipcode", search.getZipcode());
//
//        return geoObject;
//    }
//}
