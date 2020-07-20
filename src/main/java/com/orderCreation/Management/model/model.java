package com.orderCreation.Management.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="model")
public class model {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="modelname")
	private String modelName;
	@Column(name="seriesid")
	
	private Integer seriesId;
	@Column(name="modelid")
	private Integer modelId;
	@Column(name="price")
	private Integer price;
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getSeriesId() {
		return seriesId;
	}
	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public model(Integer seriesId,String modelName,Integer modelId,Integer price)
	{
		super();
		this.seriesId=seriesId;
		this.modelName=modelName;
		this.modelId=modelId;
		this.price=price;
	}
	
public model()
{
	super();
}
}
