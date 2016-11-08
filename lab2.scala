
object HelloWorld {
    
    def fun(i:Int) = i*2
    
    def map[A](list : List[A], f: A => A) = 
        list.foldRight(List[A]()){(data, y) => f(data)+:y}
    
    
    def main(args: Array[String]) {
        var list = List(0,10,20,30,40,50,60)
        println(list)
        println(map(list, fun))
    }
}