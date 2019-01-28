public class Fibonacci{

	public int fibonacci (int n, String type){ 
		if (type.equals("recursive")){
			return(fibonacci_recursive(n));
		}
		else if (type.equals("iterative")){
			return(fibonacci_iteration(n));
		}
		return n;

	}

	public int fibonacci_recursive(int n){
		//recursive
		if (n <= 1){ // n<0?
			return n;
			}
		return fibonacci_recursive(n-1)+fibonacci_recursive(n-2);
	}

	public int fibonacci_iteration(int n) {
		//iteration
		int x = 0, y = 1, z = 1;
		for (int i = 0; i < n; i++) {
			x = y;
			y = z;
			z = x + y;
		}
		return x;
	}


}