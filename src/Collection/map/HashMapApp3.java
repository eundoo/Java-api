package collection.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapApp3 {

	public static void main(String[] args) {
		HashMap<String, User> users = new HashMap<>();
		users.put("hong", new User("hong", "z", "홍길동"));
		users.put("hong", new User("zong", "x", "김길동"));
		users.put("hong", new User("cong", "c", "이길동"));
		users.put("hong", new User("rong", "v", "임길동"));
		users.put("hong", new User("qong", "b", "장길동"));
		
		//Map에 저장된 Entry(key,value 쌍)를 모두 조회하기
		//Set<Entry<String, User>> entrySet =  users.entrySet();
		Set<Entry<String, User>> entrySet =  users.entrySet();
		for (Entry<String, User> entry : entrySet) {
			String key = entry.getKey();
			User user = entry.getValue();
			System.out.println("[" + key + "]" + user.getName() + ", " + user.getPwd());
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
