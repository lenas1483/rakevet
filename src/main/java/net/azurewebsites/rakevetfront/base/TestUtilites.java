package net.azurewebsites.rakevetfront.base;

public class TestUtilites extends BaseTest {

	protected void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
