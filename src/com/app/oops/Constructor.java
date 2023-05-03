package com.app.oops;

/*Java Constructor */

public class Constructor {    // class name
	
	int a; String name;
	
	Constructor()     //Constructor name
	{
	a=0; name=null;	
	}
      void show() 
      {
    	  System.out.println(a+  " "+name);
      }
      public static void main(String[] args) {
		Constructor ref = new Constructor();
		ref.show();
	}
}












