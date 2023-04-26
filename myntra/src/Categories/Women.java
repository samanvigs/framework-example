package Categories;

import org.testng.annotations.Test;

import Annotations.Base_Class;

public class Women extends Base_Class
{
	@Test(groups = {"smoke","regression"})
	public void dersses()
	{
		System.out.println("dress collecns");
	}

	@Test(groups = {"smoke","regression"})
	public void jeans()
	{
		System.out.println("jeans collecns");
	}

	@Test(groups = {"system","regression"})
	public void sarees()
	{
		System.out.println("sarees collecns");
	}

}
