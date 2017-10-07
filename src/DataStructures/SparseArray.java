package DataStructures;

import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args)
	  {
	    Scanner c = new Scanner(System.in);
	    int N = c.nextInt();
	    String[] names = new String[N];
	    for(int i=0; i<N; i++){
	    String member = c.next();
	      names[i]= member;
	    }
	    
	    int answer =0;
	    int Q = c.nextInt();
	    for(int i=0; i<Q; i++){
	    String query = c.next();
	      for(String m: names){
	        if(m.equals(query)){
	          answer++;
	        }
	             }
	      System.out.println(answer);
	      answer=0;
	    }
	    
	  }
}
