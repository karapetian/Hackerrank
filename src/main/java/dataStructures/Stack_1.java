package dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class Stack_1 {

	public static void main(String[] args) {
		Stack<Integer> element = new Stack<>();
		Stack<Integer> second = new Stack<>();
		Scanner c = new Scanner(System.in);
		int quontity = c.nextInt();
 		while (quontity>0) {
			 int query = c.nextInt();
			if (query == 1) {
				int a = element.push(c.nextInt());
				if(second.isEmpty()){
					second.push(a);
				} else if (a>second.peek()){
					second.push(a);
				} else {
					second.push(second.peek());
				}
			}

			if (query == 2) {
				element.pop();
				second.pop();
			}

			if (query == 3) {
					System.out.println(second.peek());
			}
 		}
		c.close();
	}

}
