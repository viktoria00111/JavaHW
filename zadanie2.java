//2.К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class zadanie2 {
private static Logger logger = Logger.getLogger(zadanie1.class.getName());
 private static SimpleFormatter sFormat = new SimpleFormatter();

    /**
     * @param args
     */
    public static void main(String[] args) {
 try {
        // FileHandler fh = new FileHandler("log_zadanie2.txt");
        FileHandler fh = new FileHandler("log_zadanie2.log");
        fh.setFormatter(sFormat);
        logger.addHandler(fh);
        } catch (Exception e) {
            e.printStackTrace();
        }

         double num1;
      double num2;
      double ans;
      char op;
      try (Scanner reader = new Scanner(System.in)) {
        System.out.print("Enter two numbers: ");
          num1 = reader.nextDouble();
          num2 = reader.nextDouble();
          System.out.print("\nEnter an operator (+, -, *, /): ");
          op = reader.next().charAt(0);
    }


        StringBuilder strbld = new StringBuilder();

      switch(op) {
         case '+': ans = num1 + num2; 
         logger.info(strbld.toString());  
         break;
          
         case '-': ans = num1 - num2; 
         logger.info(strbld.toString());  
            break;
         case '*': ans = num1 * num2; 
         logger.info(strbld.toString());  
            break;
         case '/': ans = num1 / num2;
          logger.info(strbld.toString());  
            break;
             
         default:  System.out.printf("Error! Enter correct operator");
     
            return;  
      
      }
      logger.log(Level.WARNING, "Тестовое логирование 2"); 

      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}