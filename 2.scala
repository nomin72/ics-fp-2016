def length(list: List[Char]): Int = {
	list.foldRight(0) { (list_item: Char, count: Int) => count + 1 }
}

val my_list = List('a', 'b', 'c')
println(length(my_list))