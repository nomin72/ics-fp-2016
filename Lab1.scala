

object Lab1 {
  
  def main(argv : Array[String]) {
  
def combineProv(n : Int, k : Int) = 
if (n < 0 || k < 0 || n<k) println("error")
else combine(n,k)
def combine(n: Int, k : Int) : Int =
     if (k == 0 || n == k) 1 else
    combine(n - 1, k) + combine(n - 1, k - 1)
var testrez=combineProv(7,2)
println(testrez)
  }
}
