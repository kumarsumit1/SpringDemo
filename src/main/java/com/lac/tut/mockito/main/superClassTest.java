package com.lac.tut.mockito.main;

import org.junit.Test;
import org.mockito.Mockito;

import com.lac.tut.mockito.BaseService;
import com.lac.tut.mockito.ChildService;

public class superClassTest {
@Test
public void testSave() {
    ChildService cs = Mockito.mock(ChildService.class);
   // ChildService cs = Mockito.spy(new ChildService());
  //  BaseService bs = Mockito.spy(new BaseService());

    // Prevent/stub logic in super.save()
   // Mockito.doReturn(99999).when(cs).test();
   // Mockito.doReturn(99999).when(cs.test());
  //  Mockito.when(cs.test()).thenReturn(99999);
    Mockito.when(cs.save()).thenCallRealMethod();
    
    //Mockito.doReturn(99999).when(bs).test();
    //spy.validate();
    
 // save() will be called:
  //  Mockito.when(spy.save()).thenReturn(5555);
    
	//save() will not be called:
	//Mockito.doReturn(333).when(spy).save();
    System.out.println(cs.save());
    // When
    int tes=cs.test();
    System.out.println("the direct val "+tes);

    // Then
   // Mockito.verify(spy).load();
}

}