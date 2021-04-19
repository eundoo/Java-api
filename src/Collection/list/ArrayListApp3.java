package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListApp3 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("방탄소년단");
		names.add("방탄소년");
		names.add("방탄소");
		names.add("방탄");
		names.add("방");
		names.add("방탄");
		names.add("소탄방");	

		System.out.println("### 이름에 '방'이 포함되어 있는 이름을 삭제하기");
		//향상된 for문 내부에서 ArrayList에 저장된 객체를 순서대로 조회중일 때
		//조회중인 그 객체를 삭제할 수 없다. 
		//for(String name : names) {
		//	if (name.startsWith("방")) {
		//		names.remove(name);
		//	}
		//}
		
		Iterator<String> iter = names.iterator();
		//inter.hasNext()는 있냐, 없냐를 출력 
		//inter.next()는 값을 출력하고 다음 값을 출력하고...
		//아래 요 반복적인 작업을 그 아래 while문이나 for문으로 바꿀 수 있다.
//		System.out.println(iter.hasNext() + ", " + iter.next());
//		System.out.println(iter.hasNext() + ", " + iter.next());
//		System.out.println(iter.hasNext() + ", " + iter.next());
//		System.out.println(iter.hasNext() + ", " + iter.next());
//		System.out.println(iter.hasNext() + ", " + iter.next());
//		System.out.println(iter.hasNext() + ", " + iter.next());
//		System.out.println(iter.hasNext() + ", " + iter.next());
		
		//hasNext는 boolean을 반환할게있으면 true, 반환할게 없으면 그때 false
		//true(여기선 7개까지 true인거지,그 다음은 false) 꺼낼게 있을 때 까지 true...
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
			if(name.startsWith("방")) {
				iter.remove();
			}
		}
		
		//Iterator는 일회용이라서 한번 끝까지 가면 다 쓴거임 그래서 두번x 소모성...
		//그래서 while문이 안됨...
		System.out.println("Iterator로 사람이름 출력하기");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//이렇게 한번 더 획득하게 해줘야 2번반복 가능함
		//Iterator<String> iter = names.iterator();
		//이렇게 생성자 또 안써줘도 덮어쓰기 하는거니까 아래처럼 작성해도 된대
		iter = names.iterator();
		System.out.println("Iterator로 사람이름 출력하기");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("향상된 for문으로 사람이름 출력하기");
		for (String name : names) {
			System.out.println(name);
		}
	}

}
