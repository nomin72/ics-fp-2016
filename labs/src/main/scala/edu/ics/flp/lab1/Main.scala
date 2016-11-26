package edu.ics.flp.lab1

/**
  * Created on 13.11.2016.
  */
object Main {

  def isPowerOfTwo(number: Int): Boolean ={

    val div = number / 2
    val mod = number % 2
    if(mod==0 && div>0){
      isPowerOfTwo(div)
    }
    else if(mod==1 && div==0)
      true
    else
      false
  }


  def main(args: Array[String]): Unit = {
    val numbers = List(0, 1, 2, 8, 10, 27)

    numbers.foreach(element => println(s"${element} is a power of 2: ${Main.isPowerOfTwo(element)}"))
  }

}
