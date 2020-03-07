package junit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WordCount 
{
	ArrayList<String> words;
	public List<String> addElements()
	{
		words=new ArrayList<>();
		words.add("onkar");
		words.add("onkar1");
		words.add("onkar1");
		words.add("onkar2");
		words.add("onkar2");
		words.add("onkar2");
		return words;
	}
	
	public Map<String,Integer> countWords()
	{
		HashMap<String,Integer> count=new HashMap<>();
		
		for(String word:words) 
		{
				if(count.containsKey(word))
				{
					count.put(word, count.get(word)+1);
				}
				else
				{
					count.put(word, 1);
				}	
		}
		return count;
	}
	
}
