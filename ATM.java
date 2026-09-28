import java.util.Scanner;
public class ATM {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  BankAccount acc = new BankAccount("ARUN509", 5000);
  System.out.print("Enter PIN (1234): ");
  if(!sc.nextLine().equals("1234")){ System.out.println("Wrong PIN!"); return; }
  while(true){
   System.out.println("\n1.Balance 2.Deposit 3.Withdraw 4.Exit");
   System.out.print("Choice: ");
   int ch=sc.nextInt();
   if(ch==1) System.out.println("Balance: "+acc.getBalance());
   else if(ch==2){ System.out.print("Amount: "); acc.deposit(sc.nextDouble());}
   else if(ch==3){ System.out.print("Amount: "); acc.withdraw(sc.nextDouble());}
   else break;
  }
  sc.close();
 }
}