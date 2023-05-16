package com.italent.execption;

public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 5181780662832934205L;
	
	public UserNotFoundException(String msg) {
		super(msg);
	}

}
