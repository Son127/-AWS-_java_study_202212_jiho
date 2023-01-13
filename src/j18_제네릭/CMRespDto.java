package j18_제네릭;


//Commit Message Response Data Transfer Object
/*
 * 공통응답객체
 * 클라이언트가 서버에게 요청을  날리면 동일한 형식으로 응답해주는 응답인터페이스
 */
public class CMRespDto<T> {

	private int Code;
	private String message;
	private T data;

	public CMRespDto(int code,String message, T data) {
		super();
		Code = code;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "CMRespDto [Code=" + Code + ", message=" + message + ", data=" + data + "]";
	}

}
