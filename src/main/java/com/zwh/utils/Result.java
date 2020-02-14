package com.zwh.utils;

public class Result<T> {
	
	private int code;
	private String msg;
	private T data;
	
	/**
	 *  成功时候的调用
	 * */
	public static  <T> Result<T> success(T data){
		return new Result<T>(data);
	}
	
	/**
	 *  失败时候的调用
	 * */
	public static  <T> Result<T> error(String codeMsg){
		return new Result<T>(codeMsg);
	}
	
	private Result(T data) {
		this.code = 0;
		this.msg = "请求成功！";
		this.data = data;
	}
	
	private Result(String codeMsg) {
		this.code = 1;
		this.msg = codeMsg;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
