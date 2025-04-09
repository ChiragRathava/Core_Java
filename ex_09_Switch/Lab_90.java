package ex_09_Switch;

import java.util.Scanner;

public class Lab_90 {
    public static void main(String[] args) {
        /*Interviewer Ask
        * Where it is use
        *
        * ans. Web Automation
        *
        * I will ask user which browser you want me to run the code.
        * chrome -> execute chrome
        * firefox -> execute of firefox
        * edge -> edge browser cases.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();

        switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC");
                break;

            case "firefox":
                System.out.println("Staring the firefox browser");
                // Futher code to start the Firefox
                // Webdriver driver = new Firefox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have not idea which browser is this");
        }
    }
}
