package com.tns.api;
import java.util.*;
import java.util.stream.Collectors;

public class Exxample1 {
public static void main(String[] args) {
		
		List<Integer>values=Arrays.asList(11,22,33);
		List<Integer>var=values.stream().map(i->i).collect(Collectors.toList());
		System.out.println(var);

	}

}
