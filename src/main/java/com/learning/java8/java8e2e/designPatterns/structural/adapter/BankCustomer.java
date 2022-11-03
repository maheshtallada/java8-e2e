package com.learning.java8.java8e2e.designPatterns.structural.adapter;

public class BankCustomer extends BankDetails implements CreditCard {
	// This is the adapter class  
	
	public void giveBankDetails() {
		
		try {

			String customername = "Adapter person";
			long accno = 201l;
			String bankname = "Java8-e2e";

			setAccHolderName(customername);
			setAccNumber(accno);
			setBankName(bankname);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getCreditCard() {
		
		long accno = getAccNumber();
		String accholdername = getAccHolderName();
		String bname = getBankName();

		return ("The Account number " + accno + " of " + accholdername + " in " + bname
				+ " bank is valid and authenticated for issuing the credit card. ");
	}
}