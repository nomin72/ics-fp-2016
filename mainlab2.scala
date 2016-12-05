

object lab2ob {
  def fun(i:Int) = i % 2
    
  
  def map[L]( list: List[L], f: L=>L) = 
    list.foldRight(List[L]())
    {
    (data, y) => f(data)+:y
    }
    
    
    def main (args: Array[String]) {
       var l = List(1,2,3,4,5,6) 
       println(l);
       var l1 = map(l,fun);
       println(l1);
  
}
}
   