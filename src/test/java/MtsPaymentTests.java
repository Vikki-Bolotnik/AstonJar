import org.testng.annotations.*;

public class MtsPaymentTests extends BaseTest {

    private MtsHomePage mtsHomePage;

    @BeforeMethod
    public void setUpTest() {
        setUp();
        mtsHomePage = new MtsHomePage(driver);
        mtsHomePage.handleCookiePopup();
    }

    @Test
    public void verifyPaymentBlockTitleTest() {
        mtsHomePage.verifyPaymentBlockTitle();
    }

    @Test
    public void verifyPaymentSystemsLogosTest() {
        mtsHomePage.verifyPaymentSystemsLogos();
    }

    @Test
    public void verifyDetailsLinkTest() {
        mtsHomePage.verifyDetailsLink();
    }

    @Test
    public void testPaymentFormTest() {
        mtsHomePage.testPaymentForm();
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}