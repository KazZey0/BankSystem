package dao;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Account account;
	private String userName;
	private String printName;
	private String userPass;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(Account account, String userName, String printName, String userPass) {
		this.account = account;
		this.userName = userName;
		this.printName = printName;
		this.userPass = userPass;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPrintName() {
		return this.printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

}