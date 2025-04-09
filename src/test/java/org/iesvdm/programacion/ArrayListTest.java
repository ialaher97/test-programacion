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
		
		//Expect:
		Assert.assertEquals("[cad1,cad2]", arrayList.toString());
		Assert.assertEquals(2, arrayList.size());
		
		int posStr1 = arrayList.indexOf(str1);
		Assert.assertEquals(0, posStr1);
		
		String strPos1 = arrayList.get(1);
		Assert.assertEquals(str2,strPos1);
	}

}
