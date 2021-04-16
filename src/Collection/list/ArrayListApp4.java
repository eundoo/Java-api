package Collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListApp4 {

	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(10, "밤식빵", 2600, 5));
		products.add(new Product(10, "소라빵", 2000, 8));
		products.add(new Product(10, "크로와상", 2300, 6));
		products.add(new Product(10, "소보로빵", 1800, 12));
		
		System.out.println("### Iterator를 사용해서 ArrayList객체에 저장된 Product객체 조회하기");
		Iterator<Product> iter = products.iterator();
		while(iter.hasNext()) {
			Product p = iter.next();
			System.out.println("번호: " + p.getNo());
			System.out.println("이름: " + p.getName());
			System.out.println("가격: " + p.getPrice());
			System.out.println("포인트: " + p.getPoint());
			System.out.println();
		}
		
	}

}
