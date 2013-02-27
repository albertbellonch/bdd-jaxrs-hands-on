package server

import org.eclipse.jetty.server.Server

object Runner extends App {
  val server = new Server(8080)
  server.start()
}
