package my.groupId;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;
@Path("/start")
public class Repository {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Test> books(@QueryParam("size")Integer size, @QueryParam("page")Integer page) {

        List <Test> books = new ArrayList<>();


        books.add(new Test(1,"Master",300,"Sergey"));
        books.add(new Test(2,"Dyna",150,"Alex"));
        return books;





    }


}
