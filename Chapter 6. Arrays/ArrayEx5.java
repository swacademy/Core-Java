/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.196.
*/

public class ArrayEx5 {
	public static void main(String[] args) {
		int sum =0;				// 총점을 저장하기 위한 변수
		float average = 0f;		// 평균을 저장하기 위한 변수

		int[] score = {100, 88, 100, 100, 90};

		for (int i=0; i < score.length ; i++ ) {
			sum += score[i];
		}

		average = sum / (float)score.length ; // 계산결과를 float로 얻기 위함.

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}
}
