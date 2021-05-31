package com.nt.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<>();
		al.add("ankuj");
		al.add("kumar");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			String obj=itr.next();
			System.out.println(obj.toString());
		}

	}

}
