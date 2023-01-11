package j13_상속.Casting;

public class MainView extends View {
	@Override
	public void show() {
		

		System.out.println("메인메뉴 출력");
		System.out.println("1. [메인] 메뉴 1번");
		System.out.println("2. [메인] 메뉴 2번");
		System.out.println("3. 수정 메뉴 3번");
		System.out.println("exit. 영역 종료");
		System.out.println("=======================");

	}

	@Override
	public boolean menu(String select) {

		if (select.equals("exit")) {
			System.out.println("해당 영역 종료");
			return false;
		}

		if (select.equals("1")) {
			System.out.println("메인메뉴에서 선택");
		} else if (select.equals("2")) {
			System.out.println("메인메뉴 2번 선택");

		} else if (select.equals("3")) {
			Controller updataController = new Controller(new UpdataView());
			updataController.run();
		} else {
			System.out.println("다시 입력 바람");
		}
		return true;
	}
}
