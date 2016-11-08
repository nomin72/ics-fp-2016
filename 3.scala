/**
 * Purely Functional Sets.
 */
object FunSets {
	type Set = Int => Boolean
	 
	/**
	 * Indicates whether a set contains a given element.
	 */
	def contains(s: Set, elem: Int): Boolean = s(elem)
	 
	/**
	 * Returns the set of the one given element.
	 */
	def singletonSet(elem: Int): Set = Set(elem)

	/**
	 * Returns the union of the two given sets,
	 * the sets of all elements that are in either `s` or `t`.
	 */
	def union(s: Set, t: Set): Set = (i : Int) => s(i) || t(i)

	/**
	 * Returns the intersection of the two given sets,
	 * the set of all elements that are both in `s` and `t`.
	 */
	def intersect(s: Set, t: Set): Set = (i : Int) => s(i) && t(i)

	/**
	 * Returns the difference of the two given sets,
	 * the set of all elements of `s` that are not in `t`.
	 */
	def diff(s: Set, t: Set): Set = (i : Int) => s(i) && !t(i)

	/**
	 * Returns the subset of `s` for which `p` holds.
	 */
	def filter(s: Set, p: Int => Boolean): Set = intersect(s, p)

	/**
	 * The bounds for `forall` and `exists` are +/- 1000.
	 */
	val bound = 1000

	/**
	 * Returns whether all bounded integers within `s` satisfy `p`.
	 */
	def forall(s: Set, p: Int => Boolean): Boolean = {
		var i:Int = -bound
		def iter(i:Int): Boolean = {
			if (i > bound) 
				true
			else if (contains(s, i) && (!contains(p, i))) 
				false
			else 
				iter ( i + 1 )
		}
		iter(i)
	}

	/**
	 * Returns whether there exists a bounded integer within `s`
	 * that satisfies `p`.
	 */
	def exists(s: Set, p: Int => Boolean): Boolean = {
		var i:Int = -bound
		def iter(i:Int): Boolean = {
			if (i > bound) 
				false
			else if ((contains(s, i)) && (contains(p, i))) 
				true
			else
				iter ( i + 1 )
		}
		iter(i)
	}

	/**
	* Returns a set transformed by applying `f` to each element of `s`.
	*/
	def map(s: Set, f: Int => Int): Set = {
		def iter(s:Set, i:Int, resultSet:Set): Set = {
			if (i > bound)
				resultSet
			else if (contains(s, i))
				iter(s, i + 1, union(resultSet, singletonSet(f(i))))
			else
				iter(s, i + 1, resultSet)
		}

		iter(s, -bound, diff(s, s))
	}

	/**
	 * Displays the contents of a set
	 */
	def toString(s: Set): String = {
		val xs = for (i <- -bound to bound if contains(s, i)) yield i
		xs.mkString("{", ",", "}")
	}

	/**
	 * Prints the contents of a set on the console.
	 */
	def printSet(s: Set) {
		println(toString(s))
	}
}