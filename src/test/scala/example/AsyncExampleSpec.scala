package example

import org.scalatest._
import scala.concurrent.ExecutionContext
import FutureExamples._

class AsyncExampleSpec extends AsyncWordSpec with Matchers {

  implicit val executionContext: ExecutionContext =
    scala.concurrent.ExecutionContext.global

  "A Future" can {
    "succeed in providing a value that passes an assertion" in {
      fortyTwo map { _ shouldEqual 42 }
    }
    "succeed in providing a value that fails an assertion" in {
      fortyTwo map { _ shouldEqual 43 }
    }
    "fail altogether" in {
      oops map { _ shouldEqual 42 }
    }
  }
}
