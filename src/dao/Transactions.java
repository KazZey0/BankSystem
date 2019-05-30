package dao;

/**
 * Transactions entity. @author MyEclipse Persistence Tools
 */

public class Transactions implements java.io.Serializable {

	// Fields

	private Integer transId;
	private Integer transUserId;
	private String transAction;
	private Double transValue;

	// Constructors

	/** default constructor */
	public Transactions() {
	}

	/** full constructor */
	public Transactions(Integer transUserId, String transAction, Double transValue) {
		this.transUserId = transUserId;
		this.transAction = transAction;
		this.transValue = transValue;
	}

	// Property accessors

	public Integer getTransId() {
		return this.transId;
	}

	public void setTransId(Integer transId) {
		this.transId = transId;
	}

	public Integer getTransUserId() {
		return this.transUserId;
	}

	public void setTransUserId(Integer transUserId) {
		this.transUserId = transUserId;
	}

	public String getTransAction() {
		return this.transAction;
	}

	public void setTransAction(String transAction) {
		this.transAction = transAction;
	}

	public Double getTransValue() {
		return this.transValue;
	}

	public void setTransValue(Double transValue) {
		this.transValue = transValue;
	}

}