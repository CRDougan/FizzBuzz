package fizzbuzz;

import java.util.ArrayList;
import java.util.List;


// This class is a FizzBuzz Model class following the Spring MVC design Pattern. 
//I decided on this pattern because MVC it separates out the domain and presentation 
//objects such that the back-end is complete without the front end. 
//The MVC pattern is an easy to understand way to support multiple view technologies.
public class FizzBuzz {
	private static final Integer FIZZ_VALUE = 3;
	private static final Integer BUZZ_VALUE = 5;
	private static final Integer FIZZ_BUZZ_VALUE = FIZZ_VALUE*BUZZ_VALUE;
	
    private List<Integer> fizz_list = new ArrayList<>();
    private List<Integer> buzz_list = new ArrayList<>();
    private List<Integer> fizz_buzz_list = new ArrayList<>();
    
    
    
    public FizzBuzz(Integer givenValue) {
    	Integer minimumMeaningfulValue = Math.min(FIZZ_VALUE, BUZZ_VALUE);
    	for (int value = minimumMeaningfulValue; value<=givenValue; value++) {
    		if(value%FIZZ_BUZZ_VALUE == 0) {
    			fizz_buzz_list.add(value);
    		}
    		else if(value%FIZZ_VALUE == 0) {
    			fizz_list.add(value);
    		}
    		else if(value%BUZZ_VALUE == 0) {
    			buzz_list.add(value);
    		}
    	}
    }
    
    public List<Integer> getFizz() {
    	return fizz_list;
    }

    public List<Integer> getBuzz() {
    	return buzz_list;
    }

    public List<Integer> getFizzBuzz() {
    	return fizz_buzz_list;
    }
    
}
