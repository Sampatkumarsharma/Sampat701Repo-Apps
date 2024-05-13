package com.nt.service;
import static java.lang.System.*;
/**
 * Hello world!
 *
 */
public class App 
{
	public int sum(int x,int y) {
		return x+y;
	}
    public static void main( String[] args )
    {
    	App ap=new App();
    	int sum=ap.sum(15,30);
      out.println("Sum is ::"+ sum );
      out.println("welcome sam");
    }
}
