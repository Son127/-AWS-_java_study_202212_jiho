package usermanagrment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class RequestDto<T> {
	
	private String resource;
	private T body;



}
