package j12_배열;

import java.util.Random;

public class Array3 {

	public static void main(String[] args) {
		Random random = new Random();

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			while (true) {
				boolean findFlag = true;

				int randomNum = random.nextInt(nums.length) + 1;

				for (int j = 0; j < nums.length; j++) {
					if (nums[j] == randomNum) { //nums 인덱스 번호 j = 0 이면 nums 0번째 인덱스
						findFlag = false;//nums j번째 인덱스에 같은 숫자가 있으면 false를 주고 break 24번째 if문에 false가 들어간다 if문은 true일때만 작동하니 다시 위로 올라가서 반복.
						break; // 안에 for문을 멈춰주는 break
					}
				}// if문은 true,false로 동작된다. 
				if (findFlag) {
					nums[i] = randomNum;
					break;
				}

			}

		}
//		System.out.println(random.nextInt(10));
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
