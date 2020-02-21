package com.jbk;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Vishu";
		s.age = 21;
		s.loc = "Amravati";
	
	try{
		FileOutputStream fos = new FileOutputStream ("D:\\state.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		System.out.println("Serialization is done.......");
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}

}
