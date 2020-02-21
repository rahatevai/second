package com.jbk;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeStudent {
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("D:\\state.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			Student s = (Student)o;
			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(s.loc);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		}

	}

