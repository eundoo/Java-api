package Collection.stack;

import java.util.Stack;

public class StackApp {

	public static void main(String[] args) {
		Stack<String> history = new Stack<String>();
		
		System.out.println("### Stack객체에 값 저장하기");
		history.push("홈페이지");
		history.push("로그인홈페이지");
		history.push("로그인완료페이지");
		history.push("메일리스트2페이지");
		history.push("메일리스트3페이지");
		history.push("메일리스트4페이지");
		
		System.out.println("### Stack객체에서 값 꺼내기");
		
		System.out.println("Stack객체엣 값 꺼내기");
		while (!history.isEmpty() ) {
			
			//pop은 꺼내고 지워버림
			System.out.println(history.pop());
		}
	}

}
