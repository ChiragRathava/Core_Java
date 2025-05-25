package ex_19_OOPs_Part2.single_Inheritance.real_ex;

public class TestCase2 extends CommonToAllTest{
    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("Running TC2");
        closeBrowser();
    }
}
