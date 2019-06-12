package com.mb;

import java.util.Comparator;

public class Idcom  implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) 
	{
		if(p2.id==p1.id)  //descending order
		
		return 0;
		else if(p2.id>p1.id)
			return 1;
		else return -1;
	}
//	public int compare(Product p1, Product p2) 
//	{
//		if(p1.id==p2.id)  //
//		
//		return 0;
//		else if(p1.id>p2.id)
//			return 1;
//		else return -1;
//	}

}
