package com.orderCreation.Management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="series")
public class series {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="seriesid")
	private Integer seriesId;
	@Column(name="seriesname")
	private String seriesName;
	public Integer getSeriesId() {
		return seriesId;
	}
	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	public series(Integer seriesId,String seriesName)
	{
		super();
		this.seriesId=seriesId;
		this.seriesName=seriesName;
	}
	
public series()
{
	super();
}
}
