package com.search.beans.bizs;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 周 浩
 * @email zhou_eric90@163.com
 * @date 2018年5月14日 下午5:55:28
 * @描述
 */
@Entity
@Table(name = "IDCARDLOATION")
public class IDCardLoation implements Serializable {

	private static final long serialVersionUID = -3332007151715110793L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "idcard")
	private String idcard;

	@Column(name = "province")
	private String province;

	@Column(name = "address")
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "IDCardLoation [id=" + id + ", idcard=" + idcard + ", province=" + province + ", address=" + address + "]";
	}

}
