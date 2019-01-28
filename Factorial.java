public class Factorial{

	public int factorial (int n, String type){
		if (type.equals("recursive")){
			return(factorial_recursive(n));
		}
		else if (type.equals("iterative")){
			return(factorial_iteration(n));
		}
		return n;
	}

	public int factorial_recursive(int n) {
		//recursive
    	if (n == 0) {
        	return 1;
    	}
    	else {
        	return(n*factorial_recursive(n-1));
    	}

	}

	public int factorial_iteration(int n) {
		//iteration
    	int product = 1;
    	for(int i=1; i<=n; i++) {
        	product *= i;
    	}
    	return product;

	}
}