package usermanagrment.entity;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class RoleDtl {
	
	private int roledtlId;
	private int roleId;
	private int userId;
	
	private RoleMst roleMst; //roleId와 같은 
	

}
