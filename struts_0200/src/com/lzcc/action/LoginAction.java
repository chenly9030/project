package com.lzcc.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * 登陆控制器
 * @author LD
 *
 */
public class LoginAction implements Action{
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 自定义Login登陆方法
	 * @return
	 */
	public String login() {
		System.out.println("--------" + username);
		System.out.println("--------" + password);
		if ("admin".equals(username) && "123".equals(password)) {
			ActionContext.getContext().put("msg", "admin");
			// request.setAttribute("msg" , "admin");
			return SUCCESS;
		}
		return ERROR;
	}

}
