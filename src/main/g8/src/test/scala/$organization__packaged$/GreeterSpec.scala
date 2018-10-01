package $organization$

import org.scalatest.{FlatSpec, Matchers}

class GreeterSpec extends FlatSpec with Matchers {

  it should "work" in {

    val d = new Greeter("earthling")
    d.greet shouldBe "Hello earthling"

  }
}