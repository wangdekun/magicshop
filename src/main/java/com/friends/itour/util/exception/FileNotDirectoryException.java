package com.friends.itour.util.exception;


import com.friends.itour.util.UtilsMsg;

public class FileNotDirectoryException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3560521340668863800L;

	public FileNotDirectoryException(){
		super(UtilsMsg.FILE_NOT_DIR);
	}
}
