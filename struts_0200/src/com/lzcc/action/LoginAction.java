package com.lzcc.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * ��½������
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
	 * �Զ���Login��½����
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
