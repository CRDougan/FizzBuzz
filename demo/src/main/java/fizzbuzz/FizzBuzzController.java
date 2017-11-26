package fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.TypeMismatchException;
import org.springframework.web.bind.annotation.ExceptionHandler;


//This class is a FizzBuzz Controller class following the Spring MVC design Pattern. 
//I decided on this pattern because MVC it separates out the domain and presentation 
//objects such that the back-end is complete without the front end. 
//The MVC pattern is an easy to understand way to support multiple view technologies.
@RestController
public class FizzBuzzController {
    @RequestMapping("/FizzBuzz/{fizzBuzzValue}")
    public FizzBuzz doFizzBuzz(@PathVariable("fizzBuzzValue") Integer fizzBuzzValue) {
    	return new FizzBuzz(fizzBuzzValue);
    }
    
    @ExceptionHandler(TypeMismatchException.class)
    public String handleIOException(TypeMismatchException e) {
		return "Please enter a valid Positive Integer for FizzBuzz (ex: .../FizzBuzz/15)";
    }
} 
