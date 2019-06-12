package com.mb;

import java.util.Collections;
import java.util.LinkedList;

public class TestMain {

	public static void main(String[] args) {
		Product p1=new Product(13, "pen", 10.5);
		Product p2=new Product(10, "book", 1.5);
		Product p3=new Product(15, "eraser", 101.5);
      LinkedList<Product> p=new LinkedList<Product>();
      p.add(p1);
      p.add(p2);
      p.add(p3);
      
      Collections.sort(p, new Idcom());
     // Collections.sort(p, new NameComp());
      
      for(Product pp:p)
      {
    	  System.out.println(pp.id+" "+pp.name+" "+pp.cost);
      }
	}

}
