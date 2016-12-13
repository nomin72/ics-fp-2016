package lab2

class FlatMapWithFor[F] {

  def flat_Map(_list: List[List[F]], func: F => F): List[F] = {

    var out = _list.head.map(func)

    for (i <- 1 until _list.length)
      out = out ::: _list(i).map(func)

    out
  }
}