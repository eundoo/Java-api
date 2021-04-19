package collection.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapApp2 {

	public static void main(String[] args) {
		HashMap<String, User> users = new HashMap<>();
		users.put("hong", new User("hong", "z", "홍길동"));
		users.put("hong", new User("zong", "x", "김길동"));
		users.put("hong", new User("cong", "c", "이길동"));
		users.put("hong", new User("rong", "v", "임길동"));
		users.put("hong", new User("qong", "b", "장길동"));
		
		//Map객체에 저장된 데이터 (객체) 조회하기
		//User user = users.get("hong") //홍길동정보를 담고있는 User객체 획득
		
		//Map객체의 모든 key값 조회
		//Set<K> getSet() : Map객체의 모든 Key값을 중복 허용하지 Set객체에 담아서 반환한다.
		
		Set<String> keys = users.keySet();
		System.out.println("Map 객체의 key를: " + keys);
		
		//Set<String> keys(조회된 key값)로 Map에 저장된 데이터 조회하기
		//Set / ArrayList는 for문을 쓴다.
		for (String key : keys) {
			User savedUser = users.get(key);
			System.out.println("[" + key + "]" + savedUser.getName() + ", " + savedUser.getPwd());
		}
		
	}
	
	private static class User {
			
		String id;
		String pwd;
		String name;
		
		User(String id, String pwd, String name) {
			this.id = id;
			this.pwd = pwd;
			this.name = name;
		}
		public String getId() {
			return id;
		}

		public String getPwd() {
			return pwd;
		}

		public String getName() {
			return name;
		}
		
	}

}
