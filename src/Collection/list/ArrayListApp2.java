package Collection.list;

import java.util.ArrayList;

public class ArrayListApp2 {
	
	public static void printOut(Product product) {
		System.out.println("--------------------------------------");
		System.out.println("상품번호: " + product.getNo());
		System.out.println("상품이름: " + product.getName());
		System.out.println("상품가격: " + product.getPrice());
		System.out.println("상품포인트: " + product.getPoint());
		System.out.println();
	}
	
	public static void main(String[] args) {
	
		System.out.println("### Product객체를 여러 개 저장할 수 있는 ArrayList객체 생성하기");
		ArrayList<Product> products = new ArrayList<Product>();
		
		System.out.println("### ArrayList객체에 Product객체 저장하기");
		Product p1 = new Product(10, "노트북", 1000000, 100);
		products.add(p1);
		
		products.add(new Product(20, "핸드폰", 1200000, 120));
		products.add(new Product(30, "태블릿", 1100000, 120));
		products.add(new Product(40, "에어팟", 1000000, 70));
		products.add(new Product(50, "아이팟", 900000, 70));
		
		System.out.println("### Array객체에 저장된 Product객체의 갯수 조회하기");
		int size = products.size();
		System.out.println("저장된 Product객체의 갯수: " + size);
		
		System.out.println("### ArrayList객체에 저장된 Product객체의 정보 출력하기");
		for (Product item : products) {
			ArrayListApp2.printOut(item);

		}
		
		System.out.println("특정한 객체를 저장하고 있는지 확인하기");
		Product p = new Product(20, "핸드폰", 1200000, 120);
		boolean isExist = products.contains(p);
		System.out.println("일치하는 객체가 존재하는가?" + isExist);
		
		System.out.println("### ArrayList 객체에 저장된 모든 객체 삭제하기");
		products.clear();
		
		System.out.println("### ArrayList 객체에 저장된 Product의 갯수");
		System.out.println("저장된 객체 수: " + products.size());

	}

}
