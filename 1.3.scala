def isPowerOfTwo(n:Int): Boolean = {
	var m = n;
	if (n > 0) {
		if ( m % 2 == 0 & m / 2 > 1) {
			isPowerOfTwo( m / 2 )
		} else if ( m % 2 == 0 & m / 2 == 1 ) {
			true
		} else {
			false
		}
	} else {
		false
	}	
}

var res = isPowerOfTwo(-2)
println(res)