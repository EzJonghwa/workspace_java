package ch12_exception;

public class BizExcrption extends Exception {
	
	private String errCode ="";

	public BizExcrption(String errCode,String errMsg) {
		super();
		this.errCode = errCode;
	}
	public BizExcrption(String errMsg) {
		super(errMsg);
		
	}
	public BizExcrption() {
		
	}
	
	public BizExcrption(Exception e) {
		super(e);
	}
	public String getErrCode() {
		return errCode;
	}

}
