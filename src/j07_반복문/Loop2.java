package j07_반복문;
/*
 * for문: (초기문; 조건문;i++ , j++,;)
 * 초기문에는 여러개 선언 가능
 * 조건문이 참일 경우에만 반복이 된다.
 * 마지막은 j++ i++ k +=2 같은 것들을 넣을수있다
 * 
 * 실행 순서 : 초기문 -> 조건문 ->  실행문
 * 
 * 프로그램은 항상 0부터 시작, 조건문은 반복횟수 
 * 
 * 전역변수: 지역 밖에서도 쓸수있는것
 * 지역변수: 지역안에서만 쓸수잇는것 *기준은 {} 
 * 
 */
public class Loop2 {

	public static void main(String[] args) {
		int total = 0;
		
		for(int i = 0; i < 100; i ++) {
			total = total + i + 1;
		}
		
		System.out.println("총합: " + total);
		
	}
}
