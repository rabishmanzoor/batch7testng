package batch7TestNGProject1.B7NGProject1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTestdp extends baseclass {
  @Test(dataProvider = "dp")
  public void f(String email, String pass) throws InterruptedException {
	  HomePOM ob = new HomePOM(driver);
	  ob.enterEmail(email);
	  Thread.sleep(5000);
	  ob.enterPass(pass);
	 //extra code 
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "aaaaaaa" },
      new Object[] { "def@yahoo.com", "bbbbbbb" },
      new Object[] { "ghi@yahoo.com", "bbbbbbb" },
      new Object[] { "jkl@yahoo.com", "bbbbbbb" },
      new Object[] { "mno@yahoo.com", "bbbbbbb" },
    };
  }
}
