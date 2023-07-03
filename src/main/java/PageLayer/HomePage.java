package PageLayer;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	public String validateURL()
	{
		return driver.getCurrentUrl();
	}

}
