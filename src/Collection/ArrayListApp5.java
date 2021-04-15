package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListApp5 {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(10, "노트북", 12000 ,120));
		products.add(new Product(60, "이어폰", 12400 ,45));
		products.add(new Product(50, "휴대폰", 16000 ,60));
		products.add(new Product(30, "스피커", 17000 ,120));
		products.add(new Product(40, "텀블러", 18000 ,130));
		products.add(new Product(70, "마우스", 19000 ,150));
		
		//오름차순 정렬
		Collections.sort(products);
		//순서를 뒤집는다.
		//Collections.reverse(products);
		
		for(Product item : products) {
			System.out.println(item.getNo() + "\t" + item.getName() + "\t" + item.getPoint());
		}
	}

}
