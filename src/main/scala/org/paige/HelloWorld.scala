package org.paige

import java.io._

class HelloWorld() {
    var msg: String = "hello world"

    def sayHello(m: String = msg):String = {
        println (m)
        return m
    }
}