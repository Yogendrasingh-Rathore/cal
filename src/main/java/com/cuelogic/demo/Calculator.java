    package com.cuelogic.demo;

    import java.util.Scanner;

    public class Calculator {

    private static double first = 10;
    private static double second = 20;
            
    private static char operator = '+';
    
    public Calculator(){}
            
	public static void main(String[] args) {
        System.out.println(new Calculator().cal(operator,first,second));
	}
	
	private static double cal(char operator, double first, double second)
	{
	    double result;
            
            switch(operator)
            {
                case '+':
                    result = first + second;
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
