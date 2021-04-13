package string;

public class StringApp4 {

	public static void main(String[] args) {
		String src = "...!@BaT#*..Y.abcdefghijklm";
		
		//1단계, 대소문자를 소문자로 변경
		src = src.toLowerCase();
		System.out.println("1단계: " + src);
	
		//2단계, 특수문자 제거
		//[^]는 부정의 의미
		//[a-z] 소문자 전부 [0-9] 숫자전부
		//[^a-z0-9-_.]영어소문자, 숫자, -,_,. 아닌것
		src = src.replaceAll("[^a-z0-9-_.]", "");
		System.out.println("2단계: " + src);
		
		//3단계, 마침표가 2개 이상이면 하나로
		//[.]점
		//[.]{2,} 점이 두개 이상
		//[.]{2,5} 점이 2~5개 {min,max} min은 최소등장 횟수, max는 최대등장 횟수
		src.replace("[.]{2,}", ".");
		System.out.println("3단계: " + src);
		
		//4단계, 마침표가 처음이나 끝에 위치하면 제거
		// ^ -> 브라켓 안쪽에있으면 부정의의미, 브라켓 앞쪽에 있으면 시작이라는 의미
		//^[.] 시작문자가 점인것
		src = src.replaceAll("^[.]", "");
		//[.]$ 끝문자가 점인것
		src = src.replaceAll("[.]$", "");
		System.out.println("4단계: " + src);
		
		//5단계, 빈 문자열이라면, new_id에 "a"를 대입
		if (src.isEmpty()) {
			src = "a";
		}
		System.out.println("5단계: " + src);
		
		//6단계, 길이가 16이상이면, 15개를 제외한 나머지를 제거한다.
		if (src.length() >= 16) {
			src = src.substring(0, 15);
			src = src.replace("[.]$", "");
		}
		System.out.println("6단계: " + src);
		
		//7단계, 길이가 2이하면 맨 마지막 글자를 길이가 3이 될 때까지 채운다.
		if(src.length() <=2 ) {
			String lastChar = String.valueOf(src.charAt(src.length()-1));
			if (src.length() == 1) {
				src += lastChar;
			}
			src += lastChar;
		}
		System.out.println("7단계: " + src);
	}

}
