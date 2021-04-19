package collection.set;

import java.util.TreeSet;

public class TreeSetApp1 {

	public static void main(String[] args) {
		
		TreeSet<Score> scores = new TreeSet<Score>();
		
		scores.add(new Score("오나나", 100, 100, 100));
		scores.add(new Score("임나나", 90, 80, 70));
		scores.add(new Score("김나나", 80, 100, 60));
		scores.add(new Score("박나나", 70, 90, 60));
		scores.add(new Score("이나나", 100, 70, 90));

		System.out.println("성적순으로 출력하기");
		for(Score score : scores) {
			System.out.println("총점: " + score.getTotal());
			System.out.println("이름: " + score.getName());
			System.out.println("국어: " + score.getKor());
			System.out.println("영어: " + score.getEng());
			System.out.println("수학: " + score.getMath());
			System.out.println();
		}
	}

}
