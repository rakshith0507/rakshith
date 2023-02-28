package Practice;

public class suggestionBox {
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Navigate to Google
        driver.get("https://www.google.com/");

        // Find the search box element and enter "selenium"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");

        // Wait for suggestions to load
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // Find the suggestion elements and print them
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
        for (WebElement suggestion : suggestions) {
            System.out.println(suggestion.getText());
        }

        // Close the browser
        driver.quit();
    }
}
This program uses the Firefox driver to open the browser, navigates to Google, finds the search box element by its name attribute, enters "selenium" into it, waits for the suggestions to load (using driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS)), finds the suggestion elements by their XPath, and prints their text. Finally, the program closes the browser using driver.quit().

Note that the XPath used to find the suggestion elements (//ul[@class='erkvQe']/li) may need to be adjusted if Google changes its search results page layout. Also, make sure you have the Selenium WebDriver library for Java set up in your project.





	}

}
