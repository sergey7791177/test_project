package my.groupId;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
 /* Перенести в GreetingResource
@Path("/start")
  */
public class Repository {
     /* Перенести в GreetingResource
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("/getCustomersWithOrder")

      */

    public List<Test> books(@QueryParam("size")Integer size, @QueryParam("page")Integer page) {

        List <Test> books = new ArrayList<>();


        books.add(new Test(1,"Master",300,"Sergey"));
        books.add(new Test(2,"Dyna",150,"Alex"));
        return books;

}
    /* Перенести в GreetingResource

    public Test getPlacesByQueryParam(
            @QueryParam("size") int size,
            @QueryParam("page") int page) {
        return Response.ok(Book.b(id, size)).build();
    }
*/





    }



