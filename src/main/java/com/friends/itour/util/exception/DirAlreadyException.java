package com.friends.itour.util.exception;

import com.friends.itour.util.UtilsMsg;

public class DirAlreadyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2153242852628885313L;

	public DirAlreadyException(){
		super(UtilsMsg.DIR_ALREADY);
	}
}
