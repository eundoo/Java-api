package Collection.set;

import java.util.HashSet;

public class HashSetApp1 {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		
		System.out.println("### HashSet객체에 문자열 저장하기");
		names.add("방탄소년단");
		names.add("방탄소년");
		names.add("방탄소");
		names.add("방탄");
		names.add("방");
		names.add("방탄");		//저장되지 않음 (저장을 허용하지 않음)
		names.add("방탄소");		//저장되지 않음 (저장을 허용하지 않음)
		
		System.out.println("### HashSet객체에 저장된 문자열 출력하기");
		for(String name : names) {
			System.out.println(name);
		}

	}

}
