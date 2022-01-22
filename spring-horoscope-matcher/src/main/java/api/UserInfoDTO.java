package api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

public class UserInfoDTO 
{
	@NotBlank(message = "hola hu")
	@Getter @Setter 	private String userName;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@NotBlank(message = "hola hu2")
	private String partnerName;
	
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	
	
	@AssertTrue(message = "Please accept term and condition")
	private boolean tickbox;
	public boolean getTickbox() {
		return tickbox;
	}
	public void setTickbox(boolean tickbox) {
		this.tickbox = tickbox;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", partnerName=" + partnerName + "]";
	}

}
