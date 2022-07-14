# FlipKart WebSite Automation Suite Information:
##### To run the FlipKart Automation Suite from command line in the project folder
mvn clean test

## GitHub Repository link 
*  https://github.com/preeti-git2302/ExitTest-Flipkart-.git

#### TestNG files description
* testng.xml: define the tests related to different pages across the site

#### Packages description
* com.ExitTest.Pages- Defining all the pages with find Elements.
* com.ExitTest.utiles- Defining all the utilities needed for the tests.
* com.ExitTest.BaseClass- Defining all the base methods.
* com.ExitTest.Excel- Defining Excel Code.
* com.ExitTest.ReuseableMethod- Defining the common methods.
* com.ExitTest.Tests- Defining all the tests scripts and assertions.

#### Tests.java files description

**BaseTest** : The main class which defines-
* @BeforeMethod- to open the browser, to open url and get the name of the test
* @AfterMethd- to attach screenshot and to quit the browser
* @BeforeSuite- to set Extent
* @AfterSuite- to end the report

**ReuseableMethods** : it contains method use mutiples time in this project it includes:
* Method for SwitchWindow.
* Method to navigate to main page.
* Method To scroll down.

**AddToCartTest** : Check AddToCart Functionality of FlipKart 

**ApplyFilterTest** : Check Filter Function Of FilpKart By Applying Various Filter. 

**BeautyandToysTest** : Check Beauty and Toys option and search for soft toys.

**BecomeAseller** : Checks the Functionality of Become A seller in FilpKart.

**ElectronicsItemTest** : Check the Function of Electronic items.

**FlipKartFunctionButtonsTest** : Check the Functions Of FilpKart Buttons includes:
* check About Us Button. 
* check Contact Us Option. 
* check Cancellation And Refund option. 
* check Social media Twitter page.
* check Policy of FlipKart


**HomeFurnitureTest** : Check the Option Of Home Furniture.

**LoginTest** : Check the Login Functionality of FilpKart it Includes:
* check login with valid login credentials. 
* check login with Invalid Email. 
* check login with Invalid Password. 
* check login with Blank Email.
* check login with Blank Password.

**RemoveItemFromCartTest** : Check the Functionality to remove items from cart it includes:
* check for item not exist in cart.

**searchTest** : Check the Function of search it includes:
* check for valid search 
* check for invalid search

**TopOffersTest** : Check the Top Offers Option.

#### Drivers Folder description:

* chromedriver.exe : drivers for Chrome
* geckodriver.exe : drivers for firefox
* msedgedriver.exe: drivers for microsoft edge


#### Other files description

* **ScreenShot.java** : defines functions to take screenshots.

* **Listeners.java** : defines the code for enables and disables of test scripts

* **config.properties** : placed under Resources folder. By changing the value of "chooseDriver" and "mode" you can run the project on different browsers:

** For firefox with headless mode** : chooseDriver= "FireFoxDriver"  and headless="headless"

**For chrome in headless mode** : chooseDriver= "ChromeDriver"  and headless=" Headless"

** For chrome without headless mode** : chooseDriver= "ChromeDriver"  and headless="non - headlesss"

** For Microsoft Edge without headless mode** : chooseDriver="MicrosoftEdge" and there is no option for headless mode


* **ExcelFile** *

* Contains the Data and by marking yes or no in front of test script to run accordingly.

#### Reports 

* Extent report gets generated after the run under ./Reports/ExtentReports.html.

#### FailedScreenshots

* Failed Screenshots gets placed under FailedScreenshots

#### Logs

* Contains the logger implementations.
 
 
## Implemented features

-	Create at least 20 automated Test Case across different flows and screens. - **done**
-	Implement POM (Page factory)  - **done**
-	Test data should be read from excel. User has the ability to selective run the test cases by marking yes in the "Execution Required" field in excel. - **done**
-	Use config files for Global Parameters usage. - **done**
-	Use proper waits i.e., implicit wait and explicit wait wherever necessary. - **done**
-	The test should run on following browsers IE, Chrome, FF. - **done**
-	There should be an option to run the test cases in headless mode. - **done**
-	Use Grouping, Priority, and enable/disable when creating the TestNG Test Cases. - **done**
-	Assertions should be used properly throughout the suite. - **done**
-	Put proper assertions and error screenshot in the extent report. - **done**
-	Create a ReadMe document which has the steps to install and run the code. - **done**
-	Integrate your test suite with GitHub for CI/CD part. - **done**
-	Test Suite should be executable from command line using maven. - **done**
-	Use Logger to implement logging in your test cases. - **done**
