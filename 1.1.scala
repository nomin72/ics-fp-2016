def printNumbers(n: Int) = {
	var i = 0;
	var m = n;
	if (n < 0) {
		m = -1*n;	
	}
	while (i <= m) {
		println(-1*i);
		i += 1
	}	
}

printNumbers(-4)