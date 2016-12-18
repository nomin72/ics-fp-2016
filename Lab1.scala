object Akkerman { 
def akkerman(n: Int,m: Int): Int = 

if (n==0)return m+1 
else if (m== 0)return akkerman(n-1,1) 
else return akkerman(n-1,akkerman(n,m-1)) 

def main(args: Array[String]) { 

for {i <- List.range(1, 4)} 
for {j <- List.range(1, 4)} 
yield { print(akkerman(i, j) + ", ") } 

} 


}