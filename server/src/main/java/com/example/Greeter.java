package com.example;


public class Greeter {

  
  public Greeter() {

  }
  
  /**
  *@return greeting string
  *@param someone name of a person
  
  *
  */
  

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
