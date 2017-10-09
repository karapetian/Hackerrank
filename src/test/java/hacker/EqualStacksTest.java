package hacker;

import java.util.Stack;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import dataStructures.EqualStacks_2;

public class EqualStacksTest {
	
	
 @Test
public void checkingEqualityTest(){
	 int sum1= 8;
	 int sum2= 9;
	 int sum3= 7;
	 Stack<Integer> s1 = new Stack<>();
	 Stack<Integer> s2 = new Stack<>();
	 Stack<Integer> s3 = new Stack<>();
	 s1.push(1);
	 s1.push(1);
	 s1.push(1);
	 s1.push(2);
	 s1.push(3);
	 s2.push(2);
	 s2.push(3);
	 s2.push(4);
	 s3.push(1);
	 s3.push(4);
	 s3.push(1);
	 s3.push(1);
	 
	 int answer = EqualStacks_2.checkingEquality(s1, sum1, s2, sum2, s3, sum3);
//	 if(answer!=5) Assert.fail();
	 Assert.assertEquals(answer, 5);
}

}
