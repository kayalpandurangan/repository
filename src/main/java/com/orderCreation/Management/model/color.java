package com.orderCreation.Management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="color")
public class color {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="colorname")
	private String colorName;
	@Column(name="colorid")
private Integer colorId;
	@Column(name="modelid")
private Integer modelId;
	@Column(name="colorprice")
	private Integer colorprice;
	
public Integer getColorprice() {
		return colorprice;
	}
	public void setColorprice(Integer colorprice) {
		this.colorprice = colorprice;
	}
public Integer getColorId() {
	return colorId;
}
public void setColorId(Integer colorId) {
	this.colorId = colorId;
}
public Integer getModelId() {
	return modelId;
}
public void setModelId(Integer modelId) {
	this.modelId = modelId;
}
public String getColorName() {
	return colorName;
}
public void setColorName(String colorName) {
	this.colorName = colorName;
}
public color(Integer colorId,String colorName,Integer modelId,Integer colorprice)
{
	super();
	this.colorId=colorId;
	this.colorName=colorName;
	this.modelId=modelId;
	this.colorprice=colorprice;
}

public color()
{
super();

}
}
