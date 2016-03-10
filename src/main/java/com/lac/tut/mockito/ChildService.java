package com.lac.tut.mockito;

public class ChildService extends BaseService{
	 public void load(){
		 System.out.println("In child class");
	 }

     public int save(){
        int testval=test();
        System.out.println("the testval is "+testval);
         load();
         
         return testval;
     }
     
    public int test1(){
    	return super.test();
    	
    }
     
}
