object Task1 {
def summm (ar: Array[Int]): Array[Int] = {
  if (ar(0) != 0) { 
        ar(1) = ar(1) + (ar(0) % 10)
        ar(0) = ar(0) / 10
        return summm(ar)
    }
    return ar
}
  def main(args: Array[String]): Unit = {
     val ar:Array[Int] = new Array[Int](2)
     ar(0) = 9853233
     ar(1) = 0
    println(summm(ar)(1))
  }
  
}