package org.iesvdm.programacion;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class ArrayListTest {
	
	@Test
	public void ArrayListTest1() {
		
		//Given:
		ArrayList<String> arrayList = new ArrayList<>();
		String str1 = "Cadena1";
		String str2 = "Cadena2";
		
		//When:
		arrayList.add(str1);
		arrayList.add(str2);
		
		//Elimino str2 que tiene index 1
		arrayList.remove(1);
		
		//Expect:
		Assert.assertEquals("[Cadena1]", arrayList.toString());
		Assert.assertEquals(1, arrayList.size());
		
		int posStr1 = arrayList.indexOf(str1);
		Assert.assertEquals(0, posStr1);
		
		String strPos1 = arrayList.get(0);
		Assert.assertEquals(str1,strPos1);
		
		try {
			String strPos = arrayList.get(1);
			
			
		}catch (IndexOutOfBoundsException e) {
			Assert.assertEquals("Index 1 out of bounds for length 1", e.getMessage());
		}
		
		
		
		
	}
	@Test
	public void removeByObejctInArrayListTest1() {
		
		//Given:
		ArrayList<String> arrayList = new ArrayList<>();
		String str1 = "Cadena1";
		String str2 = "Cadena2";
		
		//When:
		arrayList.add(str1);
		arrayList.add(str2);
		
		Assert.assertEquals(2, arrayList.size());

		//Elimino str2
		arrayList.remove(str2);
		
		//Expect:
		Assert.assertEquals("[Cadena1]", arrayList.toString());
		Assert.assertEquals(1, arrayList.size());
		
		int posStr1 = arrayList.indexOf(str1);
		Assert.assertEquals(0, posStr1);
		
		String strPos1 = arrayList.get(0);
		Assert.assertEquals(str1,strPos1);
		
		try {
			String strPos = arrayList.get(1);
			
			
		}catch (IndexOutOfBoundsException e) {
			Assert.assertEquals("Cadena1",strPos1);
		}
		
		
		
		
	}

}
