package junitTest;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.WordCount;

public class WordCountTest 
{
	static WordCount wd;
	HashMap<String,Integer> word1;
	HashMap<String,Integer> word2;
	@BeforeClass
	public static void initializer()
	{
		System.out.println("I am in initializer Method.");
		wd=new WordCount();
	}
	@Before
	public void AddElementsTest()
	{
		System.out.println("I am in AddElements Test Method.");
		wd.addElements();
		word2=new HashMap<>();
		word2.put("onkar", 1);
		word2.put("onkar2", 3);
		word2.put("onkar1", 2);
	}
	@Test
	public void wordcountTest() 
	{
		System.out.println("I am in WordCount Test Method.");
		word1=(HashMap<String, Integer>) wd.countWords();
		assertEquals(word2, word1);
	}
	@After
	public void printElementsTest()
	{
		System.out.println("Actual result >> "+word1);
		System.out.println("Expected result >> "+word2);
	}
	
}
