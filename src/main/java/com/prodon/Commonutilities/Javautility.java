package com.prodon.Commonutilities;


import java.util.Date;
import java.util.Random;
/**
 * which is used to get randomnum and getsystemdate
 * @author Praveen
 *
 */

public class Javautility {
	/**
	 * used to generate random number
	 * @return
	 */
public String getrandomnum()
{
	
	Random rannum = new Random();
	rannum.nextInt(100);
	return ""+rannum;
}
/**
 * used to getsystemdate
 * @return
 */

public String getsystemdate()
{
	Date date = new Date();
 	  String currentdate = date.toString();
 	  return currentdate;
	
}
}
