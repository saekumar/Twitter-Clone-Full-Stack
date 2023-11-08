package com.zosh.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Varification {
	
	private boolean status=false;
	private LocalDateTime startedAt;
	private LocalDateTime endsAt;
	private String planType;
	
	public Varification()
	{
		
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDateTime getStartedAt() {
		return startedAt;
	}
	public void setStartedAt(LocalDateTime startedAt) {
		this.startedAt = startedAt;
	}
	public LocalDateTime getEndsAt() {
		return endsAt;
	}
	public void setEndsAt(LocalDateTime endsAt) {
		this.endsAt = endsAt;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public Varification(boolean status, LocalDateTime startedAt, LocalDateTime endsAt, String planType) {
		super();
		this.status = status;
		this.startedAt = startedAt;
		this.endsAt = endsAt;
		this.planType = planType;
	}
	
	

}
