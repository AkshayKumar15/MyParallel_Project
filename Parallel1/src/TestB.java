import org.testng.annotations.Test;

public class TestB {
	
	@Test
	public void testB() throws InterruptedException
	{
		System.out.println("Test B Start");
		Thread.sleep(3000);
		System.out.println("Test B End");
	}

}
