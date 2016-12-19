object Lab1 {

  def main(argv: Array[String]) {

    def NOD(x: Int, y:Int): Int = {
      if (x != 0) {
		NOD( y % x, x)
	  } else {
		println( y )
		y
	  }
  
	}
    NOD(10, 100)
  }
}