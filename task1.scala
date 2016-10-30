object Task1 {
def summm (ar: Array[Int]): Array[Int] = {
  var ar1 = ar  
  if (ar1(0) != 0) { 
        ar1(1) = ar1(1) + (ar1(0) % 10)
        ar1(0) = ar1(0) / 10
        ar1 = summm(ar1)
    }
    return ar1
}
  def main(args: Array[String]): Unit = {
     var ar:Array[Int] = new Array[Int](2)
     ar(0) = 9853233
     ar(1) = 0
    println(summm(ar)(1))
  }
  
}