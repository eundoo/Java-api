package generic;

public class BoxApp {

	public static void main(String[] args) {
		//문자열을 저장하는 NormalBox와 GenericBox만들기
		
		//박스 객체 생성하기
		//NormalBox객체에는 어떤 객체가 저장될 예정인지 정보가 전혀 없음
		//GenerixBox객체에는 어떤 객체가 저장될것인지 미리 알 수 있음
		NormalBox box1 = new NormalBox();
		GenericBox<String> box2 = new GenericBox<String>();
		
		//box1.setItem("홍길동님 안녕하세요, 오늘은 어디에 계시나요");
		box1.setItem(new BoxApp());		//오류확인 안됨, 원래의 의도와는 다른 객체를 저장해도 에러발생하지 않음
		//box1.setItem(100);				//오류확인 안됨, 원래의 의도와는 다른 객체를 저장해도 에러발생하지 않음
		String text1 = (String)box1.getItem();
		System.out.println("### 첫번째 박스의 내용 출력");
		System.out.println("메세지: " + text1);
		System.out.println("글자수: " + text1.length() + "글자수");
		
		box2.setItem("오나나 정말 정말 기분이 좋아요");
		//box2.setItem(new BoxApp());		//오류발생, String객체 외의 다른 객체는 절대로 저장되지 않음
		//box2.setItem(100);				//오류발생, String객체 외의 다른 객체는 절대로 저장되지 않음
		String text = box2.getItem();
		System.out.println("### 두번째 박스의 내용 출력");
		System.out.println("메세지: " + text);
		System.out.println("글자수: " + text.length() + "글자");
	}
	
}
