package AutomationTestCases.UsingPOM.TestCase2;

import AutomationTestCases.UsingPOM.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2ValidLogin extends BaseClass {

    @Test
    public void validLoginTest() {
        TestCase2Page page = new TestCase2Page(driver);

        page.clickLoginLink();

        Assert.assertEquals(page.getLoginText(), "Login to your account");

        page.login("preksha34@gmail.com", "preksha34");

        Assert.assertEquals(page.getLoggedText(), "Logged in as Preksha Neupane");
    }
}
