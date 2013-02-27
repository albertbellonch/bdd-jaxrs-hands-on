package bdd

import cucumber.api.scala.{EN, ScalaDsl}
import cucumber.runtime.PendingException
import org.scalatest.matchers.ShouldMatchers

class RestStepsDefinitions extends ScalaDsl with EN with ShouldMatchers {

  var lastResponse: Response = Response(200, Map(), "")

  When("""^I (\w+) (.+)$"""){ (method: String, uri: String) =>
    lastResponse = Http.send(method, uri)
  }

  Then("""^the response status is a (\d+)$"""){ (expectedStatus: Int) =>
    lastResponse.status should be(expectedStatus)
  }

}
