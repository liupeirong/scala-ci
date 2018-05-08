package org.paige

import org.scalatest._

class HelloWorldTest extends FlatSpec with Matchers {
    "HelloWorld" should "say hello world without parameter" in {
        val hw = new HelloWorld
        hw.sayHello() should be ("hello world")
    }

    it should "repeat the parameter" in {
        val hw = new HelloWorld
        hw.sayHello("hello friend") should be ("hello friend") 
    }
}
