package com.zosh.response;

import lombok.Data;

@Data
public class PaymentLinkResponse {
	
	private String paymentLink;
   public PaymentLinkResponse()
   {
	   
   }
	public String getPaymentLink() {
		return paymentLink;
	}

	public void setPaymentLink(String paymentLink) {
		this.paymentLink = paymentLink;
	}

	public PaymentLinkResponse(String paymentLink) {
		super();
		this.paymentLink = paymentLink;
	}

	

}
