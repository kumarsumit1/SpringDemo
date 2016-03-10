package com.lac.tut.mockito;

public class BaseService {
	 public void validate(){
         System.out.println(" I must not be called");
     }

     public int save(){
         //Save method of super will still be called.
         validate();
         return 11;
     }
     public int test() {
    	 System.out.println("In test");
    	 return 1;
     }
}
