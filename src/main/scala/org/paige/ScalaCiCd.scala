package org.paige

object ScalaCiCd {
   def main(args: Array[String]): Unit = {
       val hw = new HelloWorld;
       println ("args:" + args.length)
       if (args.length > 0) {
           hw.sayHello("hello " + args(0))
       } else {
           hw.sayHello()
       } 
   } 
}