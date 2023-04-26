package Payments;

import org.testng.annotations.Test;

import Annotations.Base_Class;

public class Upi extends Base_Class
{
 @Test(groups = {"regression"})
 public void paytm()
 {
	 System.out.println("paying via paytm");
 }
 @Test(groups = {"smoke","regression"})
 public void upiId()
 {
	 System.out.println("paying via upi id");
 }
 
 
}
