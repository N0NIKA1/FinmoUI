package utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.testng.Assert;
import org.testng.Assert.ThrowingRunnable;
import com.aventstack.extentreports.Status;

import baseClass.TestBaseClass;


public class AssertionUtils extends TestBaseClass {
	/**
	 * Reference Document::https://www.javadoc.io/doc/org.testng/testng/7.4.0/org/testng/Assert.html
	 */
	
	/**
	 *Asserts that a condition is true. If it isn't, an AssertionError is thrown.
	 * Parameters: 
	 * 1-Boolean Condition - the condition to evaluate
	 * 2-String-Failed Message
	 * 3-String-Passed Message
	 */
	public void assertTrue(boolean trueFlag, String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertTrue(trueFlag,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + trueFlag);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that a condition is false. If it isn't, an AssertionError is thrown.
	 * Parameters: 
	 * 1-Boolean Condition - the condition to evaluate
	 * 2-String-Failed Message
	 * 3-String-Passed Message
	 */
	public void assertFalse(boolean falseFlag, String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertFalse(falseFlag, "|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + falseFlag);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two Strings are equal. If they are not, an AssertionError is thrown. 
	 * Parameters: 
	 * 1-String actual - the actual value 
	 * 2-String expected - the expected value
	 * 3-String-Failed Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(String actual,String expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two ints are equal. If they are not, an AssertionError is thrown. 
	 * Parameters: 
	 * 1-int actual - the actual value 
	 * 2-int expected - the expected value
	 * 3-String-Failed Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(int actual,int expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two boolean conditions are equal. If they are not, an AssertionError is thrown. 
	 * Parameters: 
	 * 1-Boolean actual - the actual value 
	 * 2-Boolean expected - the expected value
	 * 3-String-Failed Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(boolean actual,boolean expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two Objects are equal. If they are not, an AssertionError is thrown. 
	 * Parameters: 
	 * 1-Object actual - the actual value 
	 * 2-Object expected - the expected value
	 * 3-String-Failed Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(Object actual,Object expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two arrays contain the same elements in the same order. If they do not, an AssertionError, with the given message, is thrown. 
	 * Parameters: 
	 * 1-byte[] actual - the actual value 
	 * 2-byte[] expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(byte[] actual, byte[] expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two arrays contain the same elements in the same order. If they do not, an AssertionError, with the given message, is thrown. 
	 * Parameters: 
	 * 1-short[] actual - the actual value 
	 * 2-short[] expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(short[] actual, short[] expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two arrays contain the same elements in the same order. If they do not, an AssertionError, with the given message, is thrown. 
	 * Parameters: 
	 * 1-int[] actual - the actual value 
	 * 2-int[] expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(int[] actual,int[] expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two arrays contain the same elements in the same order. If they do not, an AssertionError, with the given message, is thrown. 
	 * Parameters: 
	 * 1-boolean[] actual - the actual value 
	 * 2-boolean[] expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(boolean[] actual,boolean[] expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two arrays contain the same elements in the same order. If they do not, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-char[] actual - the actual value 
	 * 2-char[] expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(char[] actual,char[] expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two arrays contain the same elements in the same order. If they do not, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-float[] actual - the actual value 
	 * 2-float[] expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(float[] actual,float[] expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two arrays contain the equal elements concerning a delta in the same order. If they do not, an AssertionError is thrown.
	 * Parameters: 
	 * 1-float[] actual - the actual value 
	 * 2-float[] expected - the expected value
	 * 3-float delta - the absolute tolerable difference between the actual and expected values
	 * 4-String-Assertion Failed Error Message
	 * 5-String-Passed Message
	 */
	public void assertEquals(float[] actual,float[] expected,float delta,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,delta,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two arrays contain the same elements in the same order. If they do not, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-double[] actual - the actual value 
	 * 2-double[] expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(double[] actual,double[] expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two arrays contain the equal elements concerning a delta in the same order. If they do not, an AssertionError is thrown.
	 * Parameters: 
	 * 1-double[] actual - the actual value 
	 * 2-double[] expected - the expected value
	 * 3-double delta - the absolute tolerable difference between the actual and expected values
	 * 4-String-Assertion Failed Error Message
	 * 5-String-Passed Message
	 */
	public void assertEquals(double[] actual,double[] expected,double delta,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,delta,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two arrays contain the same elements in the same order. If they do not, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-long[] actual - the actual value 
	 * 2-long[] expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(long[] actual,long[] expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two doubles are equal concerning a delta. If they are not, an AssertionError, with the given message, is thrown. If the expected value is infinity then the delta value is ignored.
	 * Parameters: 
	 * 1-double actual - the actual value 
	 * 2-double expected - the expected value
	 * 3-double delta - the absolute tolerable difference between the actual and expected values
	 * 4-String-Assertion Failed Error Message
	 * 5-String-Passed Message
	 */
	public void assertEquals(double actual,double expected,double delta,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,delta,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two doubles are equal. If they are not, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-double actual - the actual value 
	 * 2-double expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(double actual,double expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two floats are equal concerning a delta. If they are not, an AssertionError, with the given message, is thrown. If the expected value is infinity then the delta value is ignored.
	 * Parameters: 
	 * 1-float actual - the actual value 
	 * 2-float expected - the expected value
	 * 3-float delta - the absolute tolerable difference between the actual and expected values
	 * 4-String-Assertion Failed Error Message
	 * 5-String-Passed Message
	 */
	public void assertEquals(float actual,float expected,float delta,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,delta,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two floats are equal. If they are not, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-float actual - the actual value 
	 * 2-float expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(float actual,float expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two longs are equal. If they are not, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-long actual - the actual value 
	 * 2-long expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(long actual,long expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two bytes are equal. If they are not, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-byte actual - the actual value 
	 * 2-byte expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(byte actual,byte expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two chars are equal. If they are not, an AssertionFailedError, with the given message, is thrown.
	 * Parameters: 
	 * 1-char actual - the actual value 
	 * 2-char expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(char actual,char expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two shorts are equal. If they are not, an AssertionFailedError, with the given message, is thrown.
	 * Parameters: 
	 * 1-short actual - the actual value 
	 * 2-short expected - the expected value
	 * 3-String-Assertion Failed Error Message
	 * 4-String-Passed Message
	 */
	public void assertEquals(short actual,short expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::" + expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that an object isn't null. If it is, an AssertionFailedError, with the given message, is thrown.
	 * Parameters: 
	 * 1-object - the assertion object
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertNotNull(Object object,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertNotNull(object,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that an object is null. If it is not, an AssertionFailedError, with the given message, is thrown.
	 * Parameters: 
	 * 1-object - the assertion object
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertNull(Object object,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertNull(object,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two objects refer to the same object. If they do not, an AssertionFailedError, with the given message, is thrown.
	 * Parameters: 
	 * 1-Object actual - the actual value
     * 2-Object expected - the expected value
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertSame(Object actual,Object expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertSame(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::"+expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two objects do not refer to the same objects. If they do, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-Object actual - the actual value
     * 2-Object expected - the expected value
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertNotSame(Object actual,Object expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertNotSame(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::"+expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two collections contain the same elements in the same order. If they do not, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-Collection actual - the actual value
     * 2-Collection expected - the expected value
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertEquals(Collection actual,Collection expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::"+expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two iterators return the same elements in the same order. If they do not, an AssertionError, with the given message, is thrown. Please note that this assert iterates over the elements and modifies the state of the iterators.
	 * Parameters: 
	 * 1-Iterator actual - the actual value
     * 2-Iterator expected - the expected value
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertEquals(Iterator actual,Iterator expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::"+expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two iterables return iterators with the same elements in the same order. If they do not, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-Iterable actual - the actual value
     * 2-Iterable expected - the expected value
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertEquals(Iterable actual,Iterable expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::"+expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two arrays contain the same elements in the same order. If they do not, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-Object[] actual - the actual value
     * 2-Object[] expected - the expected value
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertEquals(Object[] actual,Object[] expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::"+expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two arrays contain the same elements in no particular order. If they do not, an AssertionError, with the given message, is thrown.
	 * Parameters: 
	 * 1-Object[] actual - the actual value
     * 2-Object[] expected - the expected value
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertEqualsNoOrder(Object[] actual,Object[] expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEqualsNoOrder(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::"+expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Assert set equals
	 * Parameters: 
	 * 1-Set actual - the actual value
     * 2-Set expected - the expected value
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertEquals(Set actual,Set expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::"+expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two maps are equal.
	 * Parameters: 
	 * 1-Map actual - the actual value
     * 2-Map expected - the expected value
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertEquals(Map actual,Map expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::"+expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two objects are not equals.
	 * Parameters: 
	 * 1-Object actual - the actual value
     * 2-Object expected - the expected value
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertNotEquals(Object actual,Object expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertNotEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::"+expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that two maps are not equal.
	 * Parameters: 
	 * 1-Map actual - the actual value
     * 2-Map expected - the expected value
	 * 2-String-Assertion Failed Error Message
	 * 3-String-Passed Message
	 */
	public void assertNotEquals(Map actual,Map expected,String failMsg, String passMsg) throws Exception {
		try {
			Assert.assertNotEquals(actual,expected,"|Failed|::" + failMsg + "");
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "::"+expected);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that runnable throws an exception when invoked. If it does not, an
	 * AssertionError is thrown. 
	 * Parameters: 
	 * 1-runnable - A function that is expected to throw an exception when invoked 
	 * 2-String-Passed Message
	 * Since: TestNG version 6.9.5 
	 */
	public void assertThrows(ThrowingRunnable runnable,String passMsg) throws Exception {
		try {
			Assert.assertThrows(runnable);
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that runnable throws an exception of type throwableClass when executed. If it does not throw an exception, an AssertionError is thrown. If it throws the wrong type of exception, an AssertionError is thrown describing the mismatch; the exception that was actually thrown can be obtained by calling Throwable.getCause(). 
	 * Parameters: 
	 * 1-throwableClass - the expected type of the exception 
	 * 2-runnable - A function that is expected to throw an exception when invoked
	 * 3-String-Passed Message
	 * Since: TestNG version 6.9.5 
	 */
	public void assertThrows(Class throwableClass,ThrowingRunnable runnable,String passMsg) throws Exception {
		try {
			Assert.assertThrows(throwableClass,runnable);
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * Asserts that runnable throws an exception of type throwableClass when executed and returns the exception. If runnable does not throw an exception, an AssertionError is thrown. If it throws the wrong type of exception, an AssertionError is thrown describing the mismatch; the exception that was actually thrown can be obtained by calling Throwable.getCause(). 
	 * Parameters: 
	 * 1-throwableClass - the expected type of the exception 
	 * 2-runnable - A function that is expected to throw an exception when invoked
	 * 3-String-Passed Message
	 * Since: TestNG version 6.9.5 
	 */
	public void expectThrows(Class throwableClass,ThrowingRunnable runnable,String passMsg) throws Exception {
		try {
			Assert.expectThrows(throwableClass,runnable);
			extentTest.get().log(Status.PASS, "|Passed|::Validated::Expected::" + passMsg + "");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
}
