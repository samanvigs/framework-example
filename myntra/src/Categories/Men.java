package Categories;

import org.testng.annotations.Test;

import Annotations.Base_Class;

public class Men extends Base_Class
{
 @Test(groups = {"smoke","regression"})
 public void tshirts()
 {
	 System.out.println("tshirts collecns");
 }
 @Test(groups = {"smoke","regression"})
 public void pants()
 {
	 System.out.println("pants collecns");
 }
 @Test(groups = {"system","regression"})
 public void menwatches()
 {
	 System.out.println(" men watches collecns");
 }
}
