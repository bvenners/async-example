package example

import scala.concurrent.{Future, Promise}

object FutureExamples {
  def fortyTwo: Future[Int] = Promise.successful(42).future
  def oops: Future[Int] = Promise.failed(new Exception("oops")).future
}

