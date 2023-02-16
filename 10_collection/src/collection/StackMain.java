package collection;

import java.util.Stack;
import static java.lang.System.out;

public class StackMain {

	public static void main(String[] args) {
		String[] groupA = {"우즈베키스탄", "쿠웨이트", "사우디", "대한민국"};
		
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<groupA.length; i++) stack.push(groupA[i]);
		while( ! stack.isEmpty())	//stack 비어있나? 비어있으면 T, 아니면 F
			out.println(stack.pop());
		
	}
}
