package stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> numbers = new Stack<>();
		
		numbers.push(5);
		numbers.push(6);
		numbers.push(7);
		numbers.push(8);
		System.out.println(numbers);
		
		Stack<Integer> numbersOne = new Stack<>();
		
		while(!numbers.isEmpty()) {
			numbersOne.push(numbers.pop());
		}
		System.out.println(numbersOne);
	}
}
