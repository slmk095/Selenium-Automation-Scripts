package newproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;



public class PG1 {

	public static void main(String[] args) {
	

		//System.setProperty("webdriver.gecko.driver","C:\\selenium webdriver\\geckodriver\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
			    	
				String baseUrl = "http://techclass.io/";
		        String expectedTitle = "TechClass";
		        
		        
		        // Open Chrome  and go to the Base URL 
		        driver.get(baseUrl);
		        // get the title of web page and save it into string variable 
		        String actualTitle = driver.getTitle();
		        /*
		         * compare the actual title to the expected one and print the result 
		         */
		        if (expectedTitle.equals(actualTitle)){
		            System.out.println("Test Passed!");
		            //System.out.println("Test Passed!");

		        } else {
		            System.out.println("Test Failed");
		           

		        }
		       //close the web browser
		        driver.close();

			  // terminate the program
		        System.exit(0);

		
	}

}
