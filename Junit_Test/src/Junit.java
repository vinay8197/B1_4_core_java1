import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Junit {
	Basic obj=new Basic();
	@Test
	public void testAdd() {
		obj.add("vinay");
		obj.add("vijay");
		obj.add("raju");
		assertEquals("Adding 3 student to list",3,obj.sizeOf());
	}
	@Test
	public void testSize(){
		obj.add("vinay");
		obj.add("vijay");
		obj.add("raju");
		
		assertEquals("checking size",3,obj.sizeOf());

		
	}
	@Test
	public void testRemove() {
		obj.remove("vinay");
		obj.remove("raju");
		assertEquals("checking size",0,obj.sizeOf());
	}
	@Test
	public void removeAll() {
		obj.removeAll();
	
	}
	

}
