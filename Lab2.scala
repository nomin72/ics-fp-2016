

object Lab2 {
  
  def main(argv : Array[String]) {
    
   
  def _map[A, B](list : List[A], function : A => B) : List[B] =
    list.foldRight(List[B]())((x : A, xs : List[B]) => List(function(x)) ++ xs)

  def _mapTest() {
    println("#_mapTest test")
    def _mapLocalTest[A, B](list : List[A], function : A => B) {
      assert(_map(list, function) == list.map(function))
    }
    _mapLocalTest(List(1, 2, 3), (x : Int) => 2 * x)
    _mapLocalTest(List[Int](), (x : Int) => 2 * x)
    _mapLocalTest(List(1, 2, 3), (x : Int) => String.valueOf(x))
    println("#passed")
  }

  _mapTest()
  }

}