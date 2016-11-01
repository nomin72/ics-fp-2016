package lesson_20161025

object worksheet1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val value1 = 15                                 //> value1  : Int = 15
  
  val result = value1 match {
  	case _ => println("anything"); 1
  }                                               //> anything
                                                  //| result  : Int = 1
 	val ss: String = "test"                   //> ss  : String = test
 
  "Hello" match {
  	case "Hello" => println(s"${ss}")
  	case "another string" => println("never be here")
  	case _ => ???
  }                                               //> test
  
  val option = Option(None)                       //> option  : Option[None.type] = Some(None)
  
  val none = None                                 //> none  : None.type = None
  
  option match {
  	case Some(s) => println(s)
  	case None => println("none")
  }                                               //> None
}