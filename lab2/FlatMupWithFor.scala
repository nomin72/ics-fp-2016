/**
  * Created by Romashkin on 13.11.2016.
  */

package flatMupWithFor

class FlatMupWithFor[T] {

  def flat_Mup(_list: List[List[T]], func: T => T): List[T] = {

    var out = _list.head.map(func)

    for (i <- 1 until _list.length)
      out = out ::: _list(i).map(func)

    out
  }

}
