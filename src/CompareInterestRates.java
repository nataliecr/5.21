import java.util.Scanner;

public class CompareInterestRates {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Loan Amount: ");
    double loan = input.nextDouble();
    System.out.print("Number of Years: ");
    double years = input.nextDouble();
    double interest = 5;
    
    System.out.println("Interest Rate    Monthly Payment    Total Payment");
    while(interest <= 8){
      double m_interest = interest / 1200;  
      double monthly = (m_interest*loan)/(1-(1/Math.pow
        (1+m_interest, years*12)));
      double total = monthly * years * 12;
      System.out.printf("%.3f %17.2f %20.2f \n", interest, monthly, total);
      interest += 0.125;    
    } // while
  } // main 
} // CompareInterestRates
