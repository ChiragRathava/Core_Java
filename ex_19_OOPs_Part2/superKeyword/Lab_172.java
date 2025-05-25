package ex_19_OOPs_Part2.superKeyword;

public class Lab_172 {
    public static void main(String[] args) {
        TestCase1 t1 = new TestCase1("chrome");
        t1.getBrowser();
        System.out.println("Test case T1 running.");
        t1.closeBrowser();
        System.out.println(t1.getBrowser());

        TestCase1 t2 = new TestCase1("edge");
        System.out.println(t2.getBrowser());
    }
}

class BaseClass{
    private String browser;

    public BaseClass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAdmin) {
        if(isAdmin){
            this.browser = browser;
        }
        else {
            System.out.println("Change browser Not allowed, Not a Admin");
        }

    }

    void openBrowser(){
        System.out.println("Opening Browser!!");
    }
    void openBrowser(String browserName){
        System.out.println("Opening browser! -> " + browserName);
    }
    void closeBrowser(){
        System.out.println("Close Browser!!");
    }

}

class TestCase1 extends BaseClass {

    public TestCase1(String browser) {
        super(browser); // Call to my Parent Constructor
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        System.out.println("Over rid the parent Set Browser.");
    }
}