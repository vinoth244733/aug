package org.sampe;

import java.util.LinkedList;
import java.util.List;

public class EncpData extends Encp {
	public static void main(String[] args) {
		List<Encp> c = new LinkedList<>();
		EncpData d = new EncpData();
		d.setName("Vinoth");
		d.setId(1);
		d.setPhoneNo(963852741);
		d.setAddress("VNR");
		EncpData d1 = new EncpData();
		d1.setName("Kumar");
		d1.setId(2);
		d1.setPhoneNo(78945612);
		d1.setAddress("APK");
		EncpData d2 = new EncpData();
		d2.setName("Bala");
		d2.setId(3);
		d2.setPhoneNo(1478852963);
		d2.setAddress("PVK");
		c.add(d);
		c.add(d1);
		c.add(d2);
		for (int i = 0; i <c.size() ; i++) {
			System.out.println("Employee name is :"+c.get(i).getName());
			System.out.println("Employee id is :"+c.get(i).getId());
			System.out.println("Employee PhoneNumber is :"+c.get(i).getPhoneNo());
			System.out.println("Employee Address is :"+c.get(i).getAddress());
			
		}
		
		
	}

}
