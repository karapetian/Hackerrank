package dataStructures;

public class Fibonachi {

	public static void main(String[] args) {
		
		System.out.println(Fib(50));   //arag e aveli
		System.out.println(Fibonachi(50));
	}
	static int Fibonachi(int n){
		Integer result = null;
		if(n==1){
			return 0;
		}
		if(n==2){
			return 1;
		} 
			result=Fibonachi(n-1)+Fibonachi(n-2);
		return result;
	}
	
	// aveli arag e
	static long Fib(int n){
		long result = 0;
		long first = 0;
		long second = 1;
		if(n==1){
			return first;
		}
		if(n==2){
			return second;
		} 
		
		while(n!=2){
			result = first+second;
			first = second;
			second=result;
			n--;
		}
				return result;
	}
}
