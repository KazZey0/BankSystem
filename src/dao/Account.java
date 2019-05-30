package dao;

import java.util.HashSet;
import java.util.Set;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */

public class Account implements java.io.Serializable {

	// Fields

	private Integer accountId;
	private Double accountBalance;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** minimal constructor */
	public Account(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	/** full constructor */
	public Account(Double accountBalance, Set users) {
		this.accountBalance = accountBalance;
		this.users = users;
	}

	// Property accessors

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Double getAccountBalance() {
		return this.accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}