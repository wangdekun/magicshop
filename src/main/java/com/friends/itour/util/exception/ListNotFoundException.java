package com.friends.itour.util.exception;

/**
 * 工具包异常
 * 传入的list为空
 * @author andy.niu
 *
 */
public class ListNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3986296688156294712L;

	public ListNotFoundException(String message){
		super(message);
	}
}
