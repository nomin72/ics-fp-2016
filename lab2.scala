class FlatMapWithFor[T] {
	def flat_map(_list: List[List[T]], func: T => T): List[T] = {
	    var out = _list.head.map(func)

	    for (i <- 1 until _list.length)
	    	out = out ::: _list(i).map(func)
    out
  }
}