package collection.map.message;

public class SmsMessageSender implements MessageSender{

	@Override
	//MessegeSender에 from to title content있지만 
	//title은 안할꺼니까 매개변수에는 interface메게변수 그대로 쓰고
	//구현부에서는 title을 뺀다.
	public void sendMessage(String from, String to, String title, String content) {
		System.out.println("SMS 문자 메세지 발송");
		System.out.println("보내는 사람: " + from);
		System.out.println("받는사람: " + to);
		System.out.println("내용: " + content);
	} 
}
