package com.sample.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws Exception {

		// serialization();
		readDes();

	}

	private static void readDes() throws Exception {

		FileInputStream fileInputStream = new FileInputStream("dog.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Dog dogdes = (Dog) objectInputStream.readObject();
		System.out.println(dogdes.getName());
		objectInputStream.close();

	}

	private static void serialization() throws Exception {
		Dog dog = new Dog();
		dog.setName("danny");
		dog.setPrice(8000);

		FileOutputStream fileOutputStream;
		fileOutputStream = new FileOutputStream("dog.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(dog);

		System.out.println("Dog written to byte !! Serialization is done !");
		objectOutputStream.close();

	}
}
