def sum(k:Int): Int = {
	var n = k
	if (n >= 1)
		n % 10 + sum(n / 10)
	else
		0
}

println(sum(14455)) //19
