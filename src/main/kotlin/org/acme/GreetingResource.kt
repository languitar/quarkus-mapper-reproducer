package org.acme

import io.vertx.core.json.JsonObject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

data class Model(
    val data: Int,
)

@Path("/hello")
class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        JsonObject("{\"data\": 42}").mapTo(Model::class.java)
        return "Hello from RESTEasy Reactive"
    }
}
