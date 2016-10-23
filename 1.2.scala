def akkerman(m:Int, n:Int): Int = {
	if ( m >= 0 & n >= 0 ) {
		if ( m == 0 ) {
			n + 1
		}
		else if ( m > 0 & n == 0) {
			akkerman( m-1, 1 )
		}
		else {
			akkerman ( m - 1, akkerman (m, n - 1))
		}
	}
	else {
		println("Input params n and m should be more then 0")
		-1
	}
}

var res = akkerman (-9, 3) 
println(res)