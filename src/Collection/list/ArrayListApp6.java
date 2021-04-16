package Collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListApp6 {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(10, "노트북", 12000 ,120));
		products.add(new Product(60, "이어폰", 12400 ,45));
		products.add(new Product(50, "휴대폰", 16000 ,60));
		products.add(new Product(30, "스피커", 17000 ,120));
		products.add(new Product(40, "텀블러", 18000 ,130));
		products.add(new Product(70, "마우스", 19000 ,150));

		//이미 Product에 @Override해놔서 이렇게 쓴거다.
		//그래서 상품번호순으로는 이렇게 출력가능한데 
		//앞에 없는 이름순이나 가격순으로 출력하고 싶으면 
		//Comparator를 써야한다.
		System.out.println("### 상품번호순으로 정렬하기");
		Collections.sort(products);
		for (Product item : products) {
			System.out.println(item.getNo() + "\t" + item.getName() + "\t" + item.getPoint());
		}
		
		//Product에 @Override안해놨을때는 기존에있는걸 따라가기때문에
		//여기서 comparator객체를 만들어 놔야함
		System.out.println("### 이름으로 정렬하기");
		// Comparator<E> 인터페이스 int compare(T t1,T t2);
		Comparator<Product> nameComparator = new Comparator<Product>() {
			//객체생성과 동시에 없어지는..
			@Override
			public int compare(Product o1, Product o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(products, nameComparator);
		for (Product item : products) {
			System.out.println(item.getNo() + "\t" + item.getName() + "\t" + item.getPoint());
		}
		
		System.out.println("### 가격순으로 정렬하기");
		Comparator<Product> priceComparator = new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				
				return o1.getPrice() - o2.getPrice();
			}
		};
		Collections.sort(products, priceComparator);
		for (Product item : products) {
			System.out.println(item.getNo() + "\t" + item.getName() + "\t" + item.getPoint());
		}
		System.out.println();
		
		
		System.out.println("### 적립포인트 순으로 정렬하기");
		//Comparator<Product> pointComparator = (o1, o2) -> o1.getPoint() - o2.getPoint();
		//Collections.sort(products, pointComparator);
		Collections.sort(products, (o1, o2) -> o1.getPoint() - o1.getPoint());
		for (Product item : products) {
			System.out.println(item.getNo() + "\t" + item.getName() + "\t" + item.getPoint());
		}
		System.out.println();
	}

}
