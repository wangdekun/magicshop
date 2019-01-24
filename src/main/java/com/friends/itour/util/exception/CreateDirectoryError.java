package com.friends.itour.util.exception;

import com.friends.itour.util.UtilsMsg;

public class CreateDirectoryError extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5233049288474274511L;

	public CreateDirectoryError(){
		super(UtilsMsg.CRATE_DIR_ERROR);
	}
}
