package shixun.online.project;

public class AjaxAction {

	private String message;
	
	public String ajaxAction(){
		
		return "success";
	}

	public String getMessage() {
		message="获取成功";
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
