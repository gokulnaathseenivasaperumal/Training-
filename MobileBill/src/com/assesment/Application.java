package com.assesment;
import com.assesment.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address= new Address("13/5/32","chettiar st","pvp"); 
MobileBill argum = new MobileBill("gokul",753997,"prepaid",address);
System.out.println(MobileBill.BRAND);
//MobileBill.BRAND= "abc";
System.out.println(argum.getCustomerName());
System.out.println(argum.getMobileNumber());
System.out.println(argum.getPlanName());
System.out.println(argum.getAddress());
System.out.print(argum.findAmount());
	}

}
