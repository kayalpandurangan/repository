package com.orderCreation.Management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="accessory")
public class accessory {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="accessoryid")
private Integer accessoryId;
	@Column(name="modelid")
private Integer modelId;
	@Column(name="accessoryname")
private String accessoryName;
	@Column(name="accprice")
	private Integer accprice;
public Integer getAccprice() {
		return accprice;
	}
	public void setAccprice(Integer accprice) {
		this.accprice = accprice;
	}
public Integer getAccessoryId() {
	return accessoryId;
}
public void setAccessoryId(Integer accessoryId) {
	this.accessoryId = accessoryId;
}
public Integer getModelId() {
	return modelId;
}
public void setModelId(Integer modelId) {
	this.modelId = modelId;
}
public String getAccessoryName() {
	return accessoryName;
}
public void setAccessoryName(String accessoryName) {
	this.accessoryName = accessoryName;
}


public accessory(Integer accessoryId,String accessoryName,Integer modelId,Integer accprice)
{
	super();
	this.accessoryId=accessoryId;
	this.accessoryName=accessoryName;
	this.modelId=modelId;
	this.accprice=accprice;
}

public accessory()
{
super();
}

}
