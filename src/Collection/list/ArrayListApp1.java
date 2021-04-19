package collection.list;

import java.util.ArrayList;

public class ArrayListApp1 {

	public static void main(String[] args) {
	
		ArrayList<String> names = new ArrayList<String>();

		//ArrayList객체에 데이터(문자열 데이터) 저장하기
		names.add("지민");
		names.add("정국");
		names.add("진");
		names.add("뷔");
		names.add("뷔");

		//ArrayList객체에 저장된 데이터 갯수 조회하기
		int size = names.size();
		System.out.println("저장된 데이터 갯수: " + size);
		
		//ArrayList객체에 저장된 데이터 전부 출력하기
		System.out.println("### Array에 저장된 데이터 출력하기");
		for(String item : names) {
			System.out.println(item);
			//null체크가 필요가 없는게 저장되어 있는 순서대로 까지만 순서대로 출력됨
		}
		
		//ArrayList객체에 "지민" 데이터가 존재하는지 확인하기
		System.out.println("### 지민 데이터가 존재하는지 확인하기");
		boolean isSaved = names.contains("지민");
		System.out.println("지민이 저장되어 있는가?" + isSaved);
		
		//ArrayList객체에서 "뷔" 데이터 삭제하기
		System.out.println("### 뷔 데이터 삭제하기");
		names.remove("뷔");
		System.out.println(names);
		
		System.out.println("### ArrayList에 저장된 데이터 출력하기");
		for(String item : names) {
			System.out.println(item);
		}
		
		//ArrayList객체에 저장된모든 데이터 삭제하기
		System.out.println("### ArrayList에 저장된 데이터 전부 삭제");
		names.clear();
		
		System.out.println("### ArrayList에 저장된 데이터 출력하기");
		for(String item : names) {
			System.out.println(item);
		}
		
		System.out.println("ArrayList가 비어있는가?" + names.isEmpty());
	
	}
}
