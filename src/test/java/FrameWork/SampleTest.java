package FrameWork;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SampleTest {

	@Test(invocationCount = 3)
	public void createContact() {
		
		
		System.out.println("COntact created");
	}

	@Test(dependsOnMethods = "createContact",priority = 1)
	public void modifyContact() {
		System.out.println("Contact Modified");
	}

	@Ignore
	@Test
	public void deleteContact() {
		System.out.println("Contact Deleted");
	}
}
