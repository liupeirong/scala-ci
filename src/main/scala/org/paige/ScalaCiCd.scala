package org.paige

//
// to run using scala binary:
//    scala -classpath scalacicd-0.0.1-SNAPSHOT.jar org.paige.ScalaCiCd teapot
// to run using java: 
//    java -cp "c:\Program Files (x86)\scala\lib\scala-library.jar;scalacicd-0.0.1-SNAPSHOT.jar" org.paige.ScalaCiCd teapot
// the installed scala-library.jar and the compiled maven scala library must be the same version
//
object ScalaCiCd extends App {
   //def main(args: Array[String]): Unit = {
       val hw = new HelloWorld;
       println ("args:" + args.length)
       if (args.length > 0) {
           hw.sayHello("hello " + args(0))
       } else {
           hw.sayHello()
       } 
   //} 
}