package dataprovider;

import java.util.Locale;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class Fakerdemo {
   
	@Test
	public void fake() {
	
		Faker faker=new Faker(new Locale("en-IND"));
					
		String name = faker.name().fullName(); 
		String firstName = faker.name().firstName(); 
		String lastName = faker.name().lastName(); 

		String streetAddress = faker.address().streetAddress();
		String name1 = faker.name().fullName(); 
		String firstName1 = faker.name().firstName(); 
		String lastName1 = faker.name().lastName(); 

		String streetAddress1 = faker.address().streetAddress();

		System.out.println("name " + name + " firstName " + firstName + " lastName " + lastName + "  streetAddress " + streetAddress);
		System.out.println("name " + name1 + " firstName " + firstName1 + " lastName " + lastName1 + "  streetAddress " + streetAddress1);
	}

}
