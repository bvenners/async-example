package example

import org.scalatest._
import concurrent.ScalaFutures._
import FutureExamples._

class ExampleSpec extends WordSpec with Matchers {

  "A Future" can {
    "succeed in providing a value that passes an assertion" in {
      fortyTwo.futureValue shouldEqual 42
    }
    "succeed in providing a value that fails an assertion" in {
      fortyTwo.futureValue shouldEqual 43
    }
    "fail altogether" in {
      oops.futureValue shouldEqual 42
    }
  }
}

