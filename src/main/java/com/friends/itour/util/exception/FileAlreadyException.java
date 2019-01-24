package com.friends.itour.util.exception;


import com.friends.itour.util.UtilsMsg;

public class FileAlreadyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7584396211684692384L;

	public FileAlreadyException(){
		super(UtilsMsg.DIR_ALREADY);
	}
}
