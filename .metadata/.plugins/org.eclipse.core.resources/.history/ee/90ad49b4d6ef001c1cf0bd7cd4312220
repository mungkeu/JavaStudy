package ch01;

import java.util.Arrays;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

public class Ex003 {

	public static void main(String[] args) {
		Person per1 = Person.builder().no(1).build();

	}

}

//@RequiredArgsConstructor
class Person{
	private final int no;
	private String name;
	private String phone;
	
	@Builder
	public Person(int no, String name, String phone) {
		this.no = no;
		this.name = name;
		this.phone = phone;
	}
}
