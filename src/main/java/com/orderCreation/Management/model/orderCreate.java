package com.orderCreation.Management.model;

import org.springframework.stereotype.Component;

@Component
public class orderCreate {
private String seriesName;
private String modelName;
private String accessoryName;
private String colorName;
private Integer orderId;
public Integer getOrderId() {
	return orderId;
}
public void setOrderId(Integer orderId) {
	this.orderId = orderId;
}
public String getSeriesName() {
	return seriesName;
}
public void setSeriesName(String seriesName) {
	this.seriesName = seriesName;
}
public String getModelName() {
	return modelName;
}
public void setModelName(String modelName) {
	this.modelName = modelName;
}
public String getAccessoryName() {
	return accessoryName;
}
public void setAccessoryName(String accessoryName) {
	this.accessoryName = accessoryName;
}
public String getColorName() {
	return colorName;
}
public void setColorName(String colorName) {
	this.colorName = colorName;
}

}
