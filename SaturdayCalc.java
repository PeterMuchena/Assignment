import java.util.*;

public class SaturdayCalc{
   static String errorMessage = null;
   
   public static void main(String [] args){ 
      int firstOperand, secondOperand, results;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter First Operand: ");
      firstOperand = input.nextInt();
      System.out.print("Enter Second Operand: ");
      secondOperand= input.nextInt();
      
      switch(make_a_choice(input)){
         case 1:findSum(firstOperand,secondOperand);
            results = firstOperand + secondOperand;
            System.out.println(results);
            break;
         case 2:findDifference(firstOperand,secondOperand);
            results = firstOperand - secondOperand;
            System.out.println(results);
            break;
         case 3:findProduct(firstOperand,secondOperand);
            results = firstOperand * secondOperand;
            System.out.println(results);
            break;
         case 4:
            if(errorMessage != null) {
               System.out.println(errorMessage);
            }else {
               System.out.println("The result is " +findDivision(firstOperand, secondOperand));
            }
                   
            break;
         default:System.out.println("Invalid operation");
            break;
      }
   }
   static int findSum(int num1, int num2){
      return (num1 + num2);
      
   }
        
   static int findDifference(int num1, int num2){
      return (num1 - num2);
   }
   
   static int findProduct(int num1, int num2){
      return (num1 * num2);
   }
       
   static double findDivision(int num1, int num2){
      double results = 0;
      if (num1 == 0 || num2 == 0){
         errorMessage = "You Cannot Devide By Zero";      
      }
      else{
         results = num1/num2;
      }
      return results;
   }
      
   public static int make_a_choice(Scanner sc){
      System.out.println("Choose the operation: ");
      System.out.println("1: for addition");
      System.out.println("2: for subtraction");
      System.out.println("3: for multiplication");
      System.out.println("4: for division");
      return sc.nextInt(); 
   }
}
   
