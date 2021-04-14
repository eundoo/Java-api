package wrapper;

public class WrapperApp2 {

	public static void main(String[] args) {
		
		//오토박싱이 지원되기 때문에
		//기본자료형 타입의 변수에 값을 대입하는 것과 Wrapper타입의 변수에 값을 대입하는 것을
		//구분없이 사용할 수 있다.
		String name = "오나나";
		int age = 28;
		Double height = 158.0;	//Double height = new Double(180.4)
		double weight = 47.5;
		Boolean isMarried = false;
		Integer savedpoint = 10000;
		
		//오토박싱이 지원되기 때문에
		//Wrapper타입의 배열에 기본자료형 값만 적어도 된다.
		Integer[] scores = {100,100,80,100,50,60,70,80,50,60};
		// Integer[] scores = {new Integer(100), new Integer(100), new Integer(80), ... }
		
		//total1 total2 두가지 방법 똑같다.
		
		int total1 = 0;
		for (Integer score : scores) {
			//오토언박싱이 지원되기 때문에
			//Wrapper타입의 참조변수가 사칙연산자를 만나면 Wrapper객체에 저장된 값만 가져와서 
			//사칙연산에 사용된다.
			total1 += score;
		}
		System.out.println("합계: " + total1);
		
		int total2 = 0;
		//오토언박싱이 지원되기 때문에
		//배열에서 순서대로 조회되는 것이 Wrapper타입의 객체라면 
		//그 타입과 대응되는 기본자료형 타입의 변수를 선언해서 값만 사용할 수 있다.
		for (int score : scores) {
			total2 += score;
		}
		System.out.println("합계: " + total1);
		
	}

}
