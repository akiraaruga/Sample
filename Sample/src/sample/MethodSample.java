package sample;

public class MethodSample {
    
    public static void main(String[]args) {
        int number1=100;
        int number2=10;
        
        summethod1(number1,number2);
        
        int result2=summethod2(number1,number2);
        System.out.println("summethod2の結果は"+result2);
        
    }
    
    private static void summethod1(int num1,int num2) {
        int result=num1+num2;
        System.out.println("summethod1の結果は"+result);
    }
    
    public static int summethod2(int num1,int num2) {
        int result=num1+num2;
        return result;
        
        
    }
        
    
    }


