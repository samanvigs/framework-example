package Payments;

import org.testng.annotations.Test;

import Annotations.Base_Class;

public class NetBanking extends Base_Class
{
	@Test(groups = {"system","regression"})
	public void axisBank()
	{
		System.out.println("axis bank net banking");
	}
	@Test(groups = {"smoke","regression"})
	public void hdfcBank()
	{
		System.out.println("hdfc bank net banking");
	}
}
