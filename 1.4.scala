def sum(n:Int): Int = {
	var result = 0
	var m = n
	if (m >= 1)
		m % 10 + sum(m / 10)
	else
		0
}

var res = sum(16)
println(res)