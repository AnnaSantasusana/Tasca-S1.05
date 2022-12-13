package javaUtils.n1Ex5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class App {

	public static void main(String[] args) {
		
		Person[] persons = new Person[3];
		persons[0] = new Person("Joana", 24);
		persons[1] = new Person("Maria", 30);
		persons[2] = new Person("Albert", 19);
		
		serializeAnObject(persons);
		deserializeAnObject();
		
	}
	
	public static void serializeAnObject(Person[] persons) {
		
		try {
			FileOutputStream fos = new FileOutputStream("/Users/annasantasusanaberch/Eclipse/eclipse-workspace/Curs_pont/S1.05.n1.exercici5_AnnaSantasusana/src/javaUtils/file.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(persons);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deserializeAnObject() {
		
		try {
			FileInputStream fis = new FileInputStream("/Users/annasantasusanaberch/Eclipse/eclipse-workspace/Curs_pont/S1.05.n1.exercici5_AnnaSantasusana/src/javaUtils/file.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person[] personsRecovered = (Person[]) ois.readObject();
			ois.close();
			for (Person person : personsRecovered) {
				System.out.println(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name= " + name + ", age= " + age;
	}
	
	
}
