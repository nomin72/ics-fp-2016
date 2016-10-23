def fact(n:Int): Int = {
	var m:Int = n;
	if ( m > 1 ) {
		m * fact ( m - 1 )
	} 
	else {
		1
	}
}

val res = fact(4)
println(res)