package com.tns.map;
import java.util.Map;
import java.util.HashMap;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,String> map=new HashMap<Character,String>();

				map.put('a',"Anil");

				map.put('b',"Babu");

				map.put('c',"Charan");

				map.put('d',"Dharani");

				map.put('e',"Eniyan");

				System.out.println(map);

				map.remove('b');

				for(Map.Entry m:map.entrySet())

				{

				System.out.println(m.getKey()+" "+m.getValue());

				}

	}

}
