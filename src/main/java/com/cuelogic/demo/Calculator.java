    package com.cuelogic.demo;

    import java.util.*;
    import java.io.*;

    public class Calculator {
    
    public Calculator(){}
            
	public static void main(String[] args) {
		try{
			java.io.InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("my.properties");
			java.util.Properties properties = new Properties();
			properties.load(inputStream);
			double first = Double.parseDouble(properties.getProperty("First_Number"));
			double second = Double.parseDouble(properties.getProperty("Second_Number"));
			String operator_input = properties.getProperty("Operation");
			char operator = operator_input.charAt(0);

			//double first = Double.parseDouble(args[0]);
			//double second = Double.parseDouble(args[1]);
			//char operator = args[2].charAt(0);
			System.out.println("****************************************");
			System.out.println("The Result is : "+ new Calculator().cal(operator,first,second));
			System.out.println("****************************************");
		}
		catch(IOException e) {
  			e.printStackTrace();
		}
	}
	
	private static double cal(char operator, double first, double second)
	{
	    double result;
            
            switch(operator)
            {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;			   
                case '*':
                    result = first * second;
                    break;
                case '/':
                    result = first / second;
                    break;
                // operator doesn't match any case constant (+, -, *, /)
                default:
                    System.out.printf("Error! operator is not correct");
                    return 0;
            }
            return result;
            //System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	}
    }
