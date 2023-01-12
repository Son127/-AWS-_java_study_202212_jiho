package j01_출력;

import j17_스태틱.싱글톤.KIA;

public class Hellojava {
	// 한 줄 주석
	//주석 : 코드 내부에 메모를 할 때 사용함. 컴파일 시에 무시됨
	// tab 들여쓰기
	/*
	 * 여러줄 주석
	 */
	/**
	 * 클래스, 메소드 등의 정보를 설명하기 위한 주석
	 */
	// 프로그램의 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, Java!!"); // println: 한줄의 문자열을 출력후 끝에 줄바꿈을 해라.
		System.out.println("이름: 손지호");
		System.out.println("주소: 부산진구");
		System.out.println("연락처: 010-5016-7504");
		System.out.println("수업: aws기반 공공빅데이터 활용 웹개발자 양성");
		// system out : 표준출력
		System.out.println();
		KIA.getInstance().printCompanyName();
	}

}
