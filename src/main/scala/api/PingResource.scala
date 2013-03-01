package api

import javax.ws.rs.{GET, Consumes, Produces, Path}
import scala.Array
import javax.ws.rs.core.MediaType

case class PingResponse(message:String)

@Path("/ping")
@Consumes(Array(MediaType.APPLICATION_JSON))
@Produces(Array(MediaType.APPLICATION_JSON))
class PingResource {

  @GET
  def ping = PingResponse("pong")

}
