package com.rig.prodecttest;

import org.testng.annotations.Test;

import com.prodon.Commonutilities.Baseclass;
import com.prodon.pomrepo.Home_page;
import com.prodon.pomrepo.Productspage;

public class createproduct extends Baseclass {
@Test
public void createproducttest()
{
	Home_page hp = new Home_page(driver);
	hp.getProductlink().click();
	
	Productspage pr = new Productspage(driver);
	pr.getAddimg().click();
	
	
			
}
}
