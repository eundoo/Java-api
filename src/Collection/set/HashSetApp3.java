package collection.set;

import java.util.HashSet;

public class HashSetApp3 {

	public static void main(String[] args) {
		
		HashSet<Contact> contacts = new HashSet<Contact>();
		contacts.add(new Contact("홍길동", "010-1111-1111", "hong@gmail.com"));
		contacts.add(new Contact("홍길동", "010-1111-1111", "hong@gmail.com"));
		contacts.add(new Contact("홍길동", "010-1111-1111", "hong@gmail.com"));
		contacts.add(new Contact("홍길동", "010-1111-1111", "hong@gmail.com"));
		
		System.out.println("### 연락처 정보 출력하기");
		for (Contact contact : contacts) {
			System.out.println("이름:" + contact.getName());
			System.out.println("전화:" + contact.getTel());
			System.out.println("메일:" + contact.getEmail());
		}
	}

}
