package com.shixun;
// Generated 2017-9-19 11:08:25 by Hibernate Tools 4.3.1.Final

/**
 * HtDbUserId generated by hbm2java
 */
public class HtDbUserId implements java.io.Serializable {

	private int id;
	private String hibSessId;

	public HtDbUserId() {
	}

	public HtDbUserId(int id) {
		this.id = id;
	}

	public HtDbUserId(int id, String hibSessId) {
		this.id = id;
		this.hibSessId = hibSessId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHibSessId() {
		return this.hibSessId;
	}

	public void setHibSessId(String hibSessId) {
		this.hibSessId = hibSessId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HtDbUserId))
			return false;
		HtDbUserId castOther = (HtDbUserId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getHibSessId() == castOther.getHibSessId()) || (this.getHibSessId() != null
						&& castOther.getHibSessId() != null && this.getHibSessId().equals(castOther.getHibSessId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getHibSessId() == null ? 0 : this.getHibSessId().hashCode());
		return result;
	}

}
