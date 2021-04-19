package collection.map.message;

public class Customer {

	private String name;
	private String[] message;
	
	public Customer() {}

	public Customer(String name, String[] message) {
		this.name = name;			//고객명
		this.message = message;		//메세지수신동의 종류, sms, katalk, email
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getMessages() {
		return message;
	}

	public void setMessage(String[] message) {
		this.message = message;
	}
	
	
}
