package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

//@NoArgsConstructor //생성자에 매개변수가 없다 , 기본 생성자.
//@RequiredArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString

@AllArgsConstructor // 전체 생성자
@Data
public class Student {//어느 특정 변수위에 @Getter 읇 ㅜㅌ이면 그것만 겟터가 적용

	private  String name;// 이름
	private  int year;// 학년
//	private  final String address;
}
