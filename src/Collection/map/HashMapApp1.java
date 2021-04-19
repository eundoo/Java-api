package collection.map;

import java.util.HashMap;

public class HashMapApp1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		System.out.println("Map 객체에 key, value 저장하기");
		//key는 아이디로 value는 사용자명으로 저장함
		map.put("hong", "홍길동");
		map.put("kimys", "김유신");
		map.put("yang", "양다일");
		map.put("yu", "유재석");
		map.put("mu", "무야호");
		map.put("oh", "오나나");	//key 값 이 같으면 맨 마지막에 저장된 값이 해당 key의 값이다.

		System.out.println("Map객체에 저장된 Entry(key와 value의 쌍) 삭제하기");
		map.remove("yu");
		
		System.out.println("Map객체에 저장된 값 출력해보기");
		String value1 = map.get("hong");
		String value2 = map.get("mu");
		String value3 = map.get("oh");
	
		System.out.println("hong -> " + value1);
		System.out.println("mu -> " + value2);
		System.out.println("oh -> " + value3);
	}

}
