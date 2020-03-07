package junitTest;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import junit.JunitCode;

public class JunitCodeTest 
{
	static JunitCode sum;
	static Logger log;
	
	@BeforeClass
	public static void intializer()
	{
		PropertyConfigurator.configure("JunitCodeTest.properties");
		log=Logger.getLogger("JunitCodeTest.class");
		log.info("I am in Initializer annotation Before Class block...");
		sum=JunitCode.createInstance();
	}
	@Before
	public void before()
	{
		log.info("I am in before annotation Before block..");
	}
	@AfterClass
	public static void end() 
	{
		log.info("I am in end method annotation after class block....");
		sum=null;
	}
	@After
	public void after()
	{
		log.info("I am in after annotation after block");
	}
	@Test
	public void sumTest()
	{
		log.info("I am in sumTest Block...");
		int sumtest=sum.sum(30, 20);
		assertEquals(50, sumtest);
		log.info("I am exiting sumtest block");
	}
	@Test
	public void subTest()
	{
		log.info("I am in subTest Block...");
		int subtest=sum.sub(30, 20);
		assertEquals(10, subtest);
		log.info("I am exiting subtest block");
	}
	@Test
	public void createInstanceTest()
	{
		log.info("I am in create Instance Block...");
		JunitCode sum1=JunitCode.createInstance();
		JunitCode sum2=JunitCode.createInstance();
		assertEquals(sum1, sum2);
		log.info("I am exiting createInstance block");
	}
	@Test
	public void mulTest()
	{
		log.info("I am in mulTest Block...");
		int multest=sum.mul(30, 10);
		assertEquals(300, multest);
		log.info("I am exiting multest block");
	}
	@Test
	public void divTest()
	{
		log.info("I am in divTest Block...");
		log.warn("Diveiser should not be 0 or negative..");
		int divtest=sum.div(30, 2);
		assertEquals(15, divtest);
		log.info("I am exiting divtest block");
	}

}
