package utils;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictlyWait  {
	/**
	 * Reference Document:https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html
	 */
	
	/**
	 * This method used to wait for element to clickable.User can pass timeOut time
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it. 
	 * Parameters: WebElement locator - used to find the element 
	 * Returns: the WebElement once it is located and clickable (visible and enabled)
	 */
	public static WebElement elementToBeClickable(WebDriver driver, WebElement locator, Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver,timeOut ).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * This method used to wait for element to clickable.User can pass timeOut time
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it. 
	 * Parameters: WebElement locator - used to find the element 
	 * Returns: the WebElement once it is located and clickable (visible and enabled)
	 */
	public static WebElement elementToBeClickable(WebDriver driver, WebElement locator) throws Exception {
		try {
			return new WebDriverWait(driver, Duration.ofSeconds(20)).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * This method used to wait for element to clickable.User can pass timeOut time
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it. 
	 * Parameters: By locator - used to find the element 
	 * Returns: the WebElement once it is located and clickable (visible and enabled)
	 */
	public WebElement elementToBeClickable(WebDriver driver, By locator, Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * This method used to wait for the visibility of an element 
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height
	 * and width that is greater than 0. 
	 * Parameters: By locator - used to find the element
	 * Returns: the WebElement once it is located and visible
	 */
	public  WebElement visibilityOfElementLocated(WebDriver driver, By element,Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver,timeOut).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.visibilityOfElementLocated(element));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * An expectation for checking that an element, known to be present on the DOM
	 * of a page, is visible. Visibility means that the element is not only
	 * displayed but also has a height and width that is greater than 0. 
	 * Parameters: element - the WebElement 
	 * Returns: the (same) WebElement once it is visible
	 */
	public static  WebElement visibilityOf(WebDriver driver, WebElement element, Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}	  
	/**
	 * This method used to wait for the invisibility of an element 
	 * An expectation for checking that an element is either invisible or not present on the DOM.
	 * Parameters: By locator - used to find the element 
	 * Returns: Boolean true if the element is not displayed or the element doesn't exist or stale element
	 */
	public Boolean inVisibilityOfElement(WebDriver driver, By element, Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.invisibilityOfElementLocated(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * This method used to wait for the invisibility of an element 
	 * An expectation for checking that an element is either invisible or not present on the DOM.
	 * Parameters: WebElement locator - used to find the element 
	 * Returns: Boolean true if the element is not displayed or the element doesn't exist or stale element
	 */
	public Boolean invisibilityOf(WebDriver driver,WebElement element, Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.invisibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * This method used to wait for the visibility of an All element (List<WebElement>) 
	 * An expectation for checking that all elements present on
	 * the web page that match the locator are visible. Visibility means that the
	 * elements are not only displayed but also have a height and width that is
	 * greater than 0. 
	 * Parameters: elements - list of WebElements 
	 * Returns: the list of WebElements once they are located
	 */
	public List<WebElement> visibilityOfAllElements(WebDriver driver, List<WebElement> elements,Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.visibilityOfAllElements(elements));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public List<WebElement> visibilityOfAllElements(WebDriver driver,WebElement elements,Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.visibilityOfAllElements(elements));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * This method used to Wait An expectation for checking if the given element is
	 * selected. An expectation for checking if the given element is selected.
	 * Parameters: element - WebElement to be selected 
	 * Returns: Boolean true once the element is selected
	 */
	public  Boolean elementToBeSelected(WebDriver driver, WebElement element,Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver,timeOut).ignoring(StaleElementReferenceException.class)
			.until(ExpectedConditions.elementToBeSelected(element));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * This method used to Wait An expectation for checking if the given element is
	 * selected. An expectation for checking if the given element is selected.
	 * Parameters: element - By Locator to be selected 
	 * Returns: Boolean true once the element is selected
	 */
	public Boolean elementToBeSelected(WebDriver driver, By element, Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.elementToBeSelected(element));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * This method used to Wait An expectation for checking if the given element is
	 * selected. An expectation for checking if the given element is selected.
	 * Parameters: element - WebElement to be selected selected - boolean state of
	 * the selection state of the element 
	 * Returns: true once the element's selection stated is that of selected
	 */
	public Boolean elementSelectionStateToBe(WebDriver driver, WebElement element, boolean flag, Duration timeOut)
			throws Exception {
		try {
			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.elementSelectionStateToBe(element, flag));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * This method used to Wait An expectation for checking if the given element is
	 * selected. An expectation for checking if the given element is selected.
	 * Parameters: element - By to be selected selected - boolean state of
	 * the selection state of the element 
	 * Returns: true once the element's selection stated is that of selected
	 */
	public Boolean elementSelectionStateToBe(WebDriver driver, By element,boolean flag,Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver,timeOut).ignoring(StaleElementReferenceException.class)
			.until(ExpectedConditions.elementSelectionStateToBe(element,flag));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible. 
	 * Parameters: By locator - used to find the element 
	 * Returns: the WebElement once it is located
	 */
	public static  WebElement presenceOfElementLocated(WebDriver driver, By element,Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver,timeOut).ignoring(StaleElementReferenceException.class)
			.until(ExpectedConditions.presenceOfElementLocated(element));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Wait until an element is no longer attached to the DOM. 
	 * Parameters: element -The element to wait for. 
	 * Returns: false if the element is still attached to the DOM, true otherwise.
	 */
	public static Boolean stalenessOfOfElement(WebDriver driver, WebElement element, Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver, timeOut)
					.until(ExpectedConditions.stalenessOf(element));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Wrapper for a condition, which allows for elements to update by redrawing.
	 * This works around the problem of conditions which have two parts: find an
	 * element and then check for some condition on it. For these conditions it is
	 * possible that an element is located and then subsequently it is redrawn on
	 * the client. When this happens a StaleElementReferenceException is thrown when
	 * the second part of the condition is checked. Type Parameters: T - return type
	 * of the condition provided 
	 * Parameters: condition - ExpectedCondition to wrap
	 * Returns: the result of the provided condition
	 */
	public  Boolean refreshed(WebDriver driver, WebElement element,Duration timeOut) throws Exception {
		try {
			return new WebDriverWait(driver,timeOut)
			.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/*
	 * This method used to Wait For Visiblity And Clickability Element
	 */
	public WebElement WaitForVisiblityAndClickabilityElement(WebDriver driver, By locator ,Duration timeOut) throws Exception {
		try {
			WebElement element = visibilityOfElementLocated(driver, locator, timeOut);
			elementToBeClickable(driver,element,timeOut);	
			return element;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/*
	 * This method will be used to update implicit wait.
	 */
	public void UpdateImplicitWait(WebDriver driver,int timeOut) throws Exception {
		try {
			driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	/*
	 * This method wait if alert is present
	 */
	
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, number));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}public  void alertIsPresent​(WebDriver driver,int timeOut) throws Exception {
//		try {
//			WebDriverWait wait = new WebDriverWait(driver,timeOut);
//			wait.until(ExpectedConditions.alertIsPresent());
//		} catch (Exception e) {
//			throw new Exception(e.getMessage());
//		}
//	}
//	
//	/**
//	 * An expectation for checking whether the given frame is available to switch
//	 * to. If the frame is available it switches the given driver to the specified
//	 * frame.
//	 * Parameters: frameLocator - used to find the frame (id or name) 
//	 * Returns:WebDriver instance after frame has been switched
//	 */
//	public WebDriver frameToBeAvailableAndSwitchToIt​(WebDriver driver, WebElement frameLocator,int timeOut) throws Exception {
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, timeOut);
//			return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
//		} catch (Exception e) {
//			throw new Exception(e.getMessage());
//		}
//	}
//	/**
//	 * An expectation for checking whether the given frame is available to switch
//	 * to. If the frame is available it switches the given driver to the specified
//	 * frame.
//	 * Parameters: frameLocator - used to find the frame (id or name) 
//	 * Returns:WebDriver instance after frame has been switched
//	 */
//	public WebDriver frameToBeAvailableAndSwitchToIt​(WebDriver driver, By frameLocator,int timeOut) throws Exception {
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, timeOut);
//			return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
//		} catch (Exception e) {
//			throw new Exception(e.getMessage());
//		}
//	}
//	/**
//	 * An expectation for checking that all elements present on the web page that
//	 * match the locator are visible. Visibility means that the elements are not
//	 * only displayed but also have a height and width that is greater than 0.
//	 * Parameters: locator - used to find the element 
//	 * Returns: the list of WebElements once they are located
//	 */
//	public List<WebElement> visibilityOfAllElementsLocatedBy(WebDriver driver, By element , int timeOut) throws Exception {
//		try {
//			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
//		} catch (Exception e) {
//			throw new Exception(e.getMessage());
//		}
//	}
//	/**
//	 * An expectation for checking child WebElement as a part of parent element to
//	 * be visible 
//	 * Parameters: parent - used to check parent element. For example
//	 * table with locator By.id("fish") childLocator - used to find the ultimate
//	 * child element. 
//	 * Returns: visible nested element
//	 */
//	public List<WebElement> visibilityOfNestedElementsLocatedBy​(WebDriver driver, WebElement parentWebElement,By childLocator , int timeOut) throws Exception {
//		try {
//			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//			.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(parentWebElement, childLocator));
//		} catch (Exception e) {
//			throw new Exception(e.getMessage());
//		}
//	}
//	/**
//	 * An expectation for checking child WebElement as a part of parent element to
//	 * present 
//	 * Parameters: locator -WebElement used to check parent element. For example table
//	 * with locator By.xpath("//table") By childLocator - used to find child element.
//	 * For example td By.xpath("./tr/td") 
//	 * Returns: subelement
//	 */
//	public WebElement presenceOfNestedElementLocatedBy​(WebDriver driver, WebElement parentWebElement,By childLocator , int timeOut) throws Exception {
//		try {
//			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//			.until(ExpectedConditions.presenceOfNestedElementLocatedBy(parentWebElement, childLocator));
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new Exception(e.getMessage());
//		}
//	}
//	/**
//	 * An expectation for checking child WebElement as a part of parent element to
//	 * present 
//	 * Parameters: locator -By  used to check parent element. For example table
//	 * with locator By.xpath("//table") By childLocator - used to find child element.
//	 * For example td By.xpath("./tr/td") 
//	 * Returns: subelement
//	 */
//	public  WebElement presenceOfNestedElementLocatedBy​(WebDriver driver, By parentWebElement,By childLocator , int timeOut) throws Exception {
//		try {
//			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//			.until(ExpectedConditions.presenceOfNestedElementLocatedBy(parentWebElement, childLocator));
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new Exception(e.getMessage());
//		}
//	}
//	/**
//	 * An expectation for checking child WebElement as a part of parent element to
//	 * present 
//	 * Parameters: 
//	 * parent - used to check parent element. For example table
//	 * with locator By.xpath("//table") 
//	 * childLocator - used to find child element. For example td By.xpath("./tr/td") 
//	 * Returns: subelement
//	 */
//	public  List<WebElement> presenceOfNestedElementsLocatedBy​(WebDriver driver, By parent,By child , int timeOut) throws Exception {
//		try {
//			return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//			.until(ExpectedConditions.presenceOfNestedElementsLocatedBy(parent, child));
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new Exception(e.getMessage());
//		}
//	}
//	/**
//	 * An expectation for checking that there is at least one element present on a
//	 * web page. 
//	 * Parameters: locator - used to find the element 
//	 * Returns: the list of WebElements once they are located
//	 */
//		public List<WebElement> presenceOfAllElementsLocatedBy(WebDriver driver,By element, int timeOut)
//				throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
//			} catch (Exception e) {
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking WebElement with given locator has attribute which
//		 * contains specific value 
//		 * Parameters: By locator - used to define WebElement to
//		 * check its parameters 
//		 * attribute - used to define css or html attribute 
//		 * value - used as expected attribute value 
//		 * Returns: Boolean true when element has css or html attribute which contains the value
//		 */
//		public Boolean attributeContains​(WebDriver driver,By locator, String attribute, String value, int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.attributeContains(locator, attribute, value));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking WebElement with given locator has attribute which
//		 * contains specific value 
//		 * Parameters: WebElement locator - used to define WebElement to
//		 * check its parameters 
//		 * attribute - used to define css or html attribute 
//		 * value - used as expected attribute value 
//		 * Returns: Boolean true when element has css or html attribute which contains the value
//		 */
//		public Boolean attributeContains​(WebDriver driver,WebElement locator, String attribute, String value, int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.attributeContains(locator, attribute, value));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//
//		/**
//		 * An expectation for checking WebElement with given locator has attribute with
//		 * a specific value 
//		 * Parameters: By locator - used to find the element attribute -
//		 * used to define css or html attribute 
//		 * value - used as expected attribute value
//		 * Returns: Boolean true when element has css or html attribute with the value
//		 */
//		public Boolean attributeToBe​(WebDriver driver,By locator, String attribute, String value, int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.attributeToBe(locator, attribute, value));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking WebElement with given locator has attribute with
//		 * a specific value 
//		 * Parameters: WebElement locator - used to find the element attribute -
//		 * used to define css or html attribute 
//		 * value - used as expected attribute value
//		 * Returns: Boolean true when element has css or html attribute with the value
//		 */
//		public Boolean attributeToBe​(WebDriver driver,WebElement locator, String attribute, String value, int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.attributeToBe(locator, attribute, value));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking WebElement any non empty value for given
//		 * attribute 
//		 * Parameters: element - used to check its parameters 
//		 * attribute - used to define css or html attribute 
//		 * Returns: Boolean true when element has css or html attribute with non empty value
//		 */
//		public Boolean attributeToBeNotEmpty​(WebDriver driver,WebElement locator, String attribute,int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.attributeToBeNotEmpty(locator, attribute));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking all elements from given list to be invisible
//		 * Parameters: elements - used to check their invisibility 
//		 * Returns: Boolean true when all elements are not visible anymore
//		 */
//		public Boolean invisibilityOfAllElements​​(WebDriver driver,List<WebElement> elements,int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.invisibilityOfAllElements(elements));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking that an element is either invisible or not
//		 * present on the DOM. 
//		 * Parameters: locator - used to find the element 
//		 * Returns:true if the element is not displayed or the element doesn't exist or stale
//		 * element
//		 */
//		public Boolean invisibilityOfElementLocated​​​(WebDriver driver,By locator,int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.invisibilityOfElementLocated(locator));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking that an element with text is either invisible or
//		 * not present on the DOM. 
//		 * Parameters: locator - used to find the element 
//		 * text - of the element 
//		 * Returns: true if no such element, stale element or displayed text not equal that provided
//		 */
//		public Boolean invisibilityOfElementWithText(WebDriver driver,By locator,String text,int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.invisibilityOfElementWithText(locator,text));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation to check if js executable. Useful when you know that there
//		 * should be a Javascript value or something at the stage. 
//		 * Parameters: javaScript - used as executable script 
//		 * Returns: true once javaScript executed without errors
//		 */
//		public Boolean javaScriptThrowsNoExceptions(WebDriver driver,String javaScript,int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.javaScriptThrowsNoExceptions(javaScript));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for String value from javascript 
//		 * Parameters: javaScript - as executable js line 
//		 * Returns: object once javaScript executes without errors
//		 */
//		public Object jsReturnsValue(WebDriver driver,String javaScript,int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.jsReturnsValue(javaScript));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking number of WebElements with given locator
//		 * Parameters: locator - used to find the element 
//		 * number - used to define number of elements 
//		 * Returns: Boolean true when size of elements list is equal to defined
//		 */
//		public List<WebElement> numberOfElementsToBe(WebDriver driver,By locator,int number,int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.numberOfElementsToBe(locator, number));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking number of WebElements with given locator being
//		 * less than defined number 
//		 * Parameters: 
//		 * locator - used to find the element
//		 * number - used to define maximum number of elements 
//		 * Returns: Boolean true when size of elements list is less than defined
//		 */
//		public List<WebElement> numberOfElementsToBeLessThan(WebDriver driver,By locator,int number,int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.numberOfElementsToBeLessThan(locator, number));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking number of WebElements with given locator being
//		 * more than defined number 
//		 * Parameters: 
//		 * locator - used to find the element
//		 * number - used to define minimum number of elements 
//		 * Returns: Boolean true when size of elements list is more than defined
//		 */
//		public List<WebElement> numberOfElementsToBeMoreThan​(WebDriver driver,By locator,int number,int timeOut) throws Exception {
//			try {
		/**
		 * An expectation for checking number of windows
		 * Parameters: 
		 * expectedNumberOfWindows - No of window 
		 * Returns: Boolean
		 */
//		public Boolean numberOfWindowsToBe​(WebDriver driver,int expectedNumberOfWindows,int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.numberOfWindowsToBe(expectedNumberOfWindows));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking WebElement with given locator has text with a
//		 * value as a part of it 
//		 * Parameters: locator - used to find the element 
//		 * pattern- used as expected text matcher pattern 
//		 * Returns: Boolean true when element has text value containing @value
//		 */
//		public Boolean textMatches​​(WebDriver driver,By locator,Pattern pattern,int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.textMatches(locator, pattern));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking WebElement with given locator has specific text
//		 * Parameters: locator - used to find the element 
//		 * value - used as expected text
//		 * Returns: Boolean true when element has text value equal to @value
//		 */
//		public Boolean textToBe​​(WebDriver driver,By locator,String value,int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.textToBe(locator, value));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking if the given text is present in the specified element. 
//		 * Parameters: 
//		 * element - the WebElement 
//		 * text - to be present in the element 
//		 * Returns: true once the element contains the given text
//		 */
//		public Boolean textToBePresentInElement​​​(WebDriver driver, WebElement element, String text, int timeOut)
//				throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.textToBePresentInElement(element, text));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking if the given text is present in the element that
//		 * matches the given locator. 
//		 * Parameters: 
//		 * locator - used to find the element
//		 * text - to be present in the element found by the locator 
//		 * Returns: true once the first element located by locator contains the given text
//		 */
//		public Boolean textToBePresentInElementLocated​​​​(WebDriver driver, By locator, String text, int timeOut)
//				throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking if the given text is present in the specified
//		 * elements value attribute. 
//		 * Parameters: 
//		 * locator By - used to find the element 
//		 * text- to be present in the value attribute of the element found by the locator
//		 * Returns: true once the value attribute of the first element located by 
//		 * locator contains the given text
//		 */
//		public Boolean textToBePresentInElementValue​​​​(WebDriver driver, By locator, String text, int timeOut)
//				throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.textToBePresentInElementValue(locator, text));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking if the given text is present in the specified
//		 * elements value attribute. 
//		 * Parameters: 
//		 * locator WebElement- used to find the element 
//		 * text- to be present in the value attribute of the element found by the locator 
//		 * Returns: true once the value attribute of the first element
//		 * located by locator contains the given text
//		 */
//		public Boolean textToBePresentInElementValue​​​​(WebDriver driver, WebElement locator, String text, int timeOut)
//				throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.textToBePresentInElementValue(locator, text));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking that the title contains a case-sensitive substring 
//		 * Parameters: title - the fragment of title expected 
//		 * Returns: true when the title matches, false otherwise
//		 */
//		public Boolean titleContains​​​​(WebDriver driver,String title, int timeOut)
//				throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.titleContains(title));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for checking the title of a page. 
//		 * Parameters: title - the expected title, which must be an exact match 
//		 * Returns: true when the title matches, false otherwise
//		 */
//		public Boolean titleIs(WebDriver driver, String title, int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.titleIs(title));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for the URL of the current page to contain specific text.
//		 * Parameters: fraction - the fraction of the url that the page should be on
//		 * Returns: true when the URL contains the text
//		 */
//		public Boolean urlContains(WebDriver driver, String fraction, int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.urlContains(fraction));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * Expectation for the URL to match a specific regular expression 
//		 * Parameters: regex - the regular expression that the URL should match 
//		 * Returns: true if theURL matches the specified regular expression
//		 */
//		public Boolean urlMatches​(WebDriver driver, String regex, int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.urlMatches(regex));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
//		/**
//		 * An expectation for the URL of the current page to be a specific url.
//		 * Parameters: url - the url that the page should be on 
//		 * Returns: true when the URL is what it should be
//		 */
//		public Boolean urlToBe​(WebDriver driver, String url, int timeOut) throws Exception {
//			try {
//				return new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
//						.until(ExpectedConditions.urlToBe(url));
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new Exception(e.getMessage());
//			}
//		}
}