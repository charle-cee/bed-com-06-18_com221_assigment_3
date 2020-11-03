import java.util.*;
import java.util.Date;

public class TestAccount{

    public static void main(String args[]){
      Account[] account=new Account[10000];//CREATING ARRAY THAT WILL STORE 10000 BANK ACCOUNTS

      
        String user_name=null,type;
        type = null;
        int tmp=0;
        int withd=0,cb=0;
        String branch="";
        int balance=0;
        String reg_num="";
        int aNumber = 0; 
// to generate Random Account Number 
for(int i=0; i<account.length;i++){
          
      

aNumber = (int)((Math.random() * 90000)+10000); 
    }
        create_account user = new create_account("user", 0, 0,"Savings", branch); // initilaize -- name,acc_number,Balance,Type

            Scanner in = new Scanner(System.in);
            Scanner strng=new Scanner(System.in);
            java.util.Date date=new java.util.Date();
            int userChoice;
            boolean quit = false;
                    System.out.println("WELCOME TO NATIONAL BANK OF MALAWI");
            do {
                
                System.out.println("Main Menu");
                  System.out.println("1. Create Account");
                  System.out.println("2. Deposit money into account");
                  System.out.println("3. Withdraw money from account");
                  System.out.println("4. Check account balance");
                  System.out.println("5. Display Account Details");
                  System.out.println("0. Exit: \n");
                  System.out.print("Enter Your Choice : ");
                  userChoice = in.nextInt();
                  switch (userChoice) {
                      
                  case 1:
                                          

                         System.out.println("1. Student");
                        System.out.println("2. Executive");
                        int option=in.nextInt();
                        if(option==1){
                             balance=200;
                             user.Acc_Balance=200;
                               
                        System.out.println("Creating a new student bank account ");
                        System.out.println("\n\t NB use block/capital letters\n\t");
                        System.out.print("Enter your Name : ");
                        user_name=strng.nextLine(); 
                        System.out.print("Enter Accout Type : ");
                        type=in.next();
                         System.out.print("Enter the branch : ");
                        branch=strng.nextLine(); 
                         System.out.print("Enter your registration number : ");
                         
                        reg_num=strng.nextLine(); 
                        user.insert(user_name, aNumber, type, branch);  // inserted 
                        System.out.println("Your account has sucessfully been created ");
                        System.out.println("\n\tYour Account Details\n\t please!! Do not forget your  Account Number\n");
                        System.out.println("ACCOUNT NAME       ACCOUNT NUMBER            TYPE            BALANCE                BRANCH            DATE CREATED                    REG.NUMBER ");
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");                       
                        user.display_details();
                        System.out.print("     "+reg_num);
                        }
                        else{
                            balance=20000;
                            user.Acc_Balance=20000;
                         System.out.println("Creating a new executive bank account");
                           System.out.println("\n\t NB use block/capital letters\n\t");
                        System.out.print("Enter your Name : ");
                        user_name=strng.nextLine(); 
                        System.out.print("Enter Accout Type : ");
                        type=in.next();
                         System.out.print("Enter the branch : ");
                        branch=strng.nextLine(); 
                        user.insert(user_name, aNumber, type, branch);  // inserted
                        System.out.println("Your account has sucessfully been created "); 

                        System.out.println("  ACCOUNT NAME        ACCOUNT NUMBER       TYPE              BALANCE             BRANCH            DATE CREATED");
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");                       
                        user.display_details();
                          }
                     System.out.println("\n\t Caution!\n\t Do not forget your  Account Number\n");
                        break;
                        
                      
                case 2: // deposite
                   System.out.println("Depositing money into account");
                    System.out.print("Enter your account Number : ");
                    tmp=in.nextInt();
                 if(tmp==user.Acc_num){
                 System.out.print("Enter Amount Of Money to deposit : ");
                 balance=in.nextInt();
                 user.Acc_Balance=balance;
                 System.out.println("MWK"+balance+" is successfully Deposited.");
              }                
                     else
                    System.out.println("Wrong  bank Accoount Number.");          
                   break;
                    
                  case 3: // withdraw money   
                 System.out.println("Withdrawing money from account ");                   
                     System.out.print("Enter your account Number : ");
                      tmp=in.nextInt();
                      
                          if(tmp==user.Acc_num){                         
                             if(user.Acc_Balance==0)
                             System.out.print("Sorry! You cannot withdraw because your balance is MWK0.00");
                             
                             else{
                             System.out.print("Enter Amount Of Money to withdraw : ");   
                             withd=in.nextInt();  
                             
                             if(withd>user.Acc_Balance){
                             System.out.print("Enter Valid Amount of Money : ");
                             withd=in.nextInt();
                             }
                             else
                             cb= user.withdraw(withd);
                             System.out.println("Your Current Balance : "+cb);   
                             }
                          }
                             else
                             System.out.println("Wrong Accoount Number.");  
                        break;
     
                  case 4: // check balance 
                     System.out.println("Checking bank account balance ");

                      System.out.print("Enter your Account Number : ");
                      tmp=in.nextInt();
                      
                             if(tmp==user.Acc_num){
                             System.out.println("Your Current Balance : MWK"+user.Acc_Balance);
                             }
                             else
                             System.out.println("Wrong Accoount Number.");                         
                      break;
                      
                  case 5: // display all info 
                      System.out.println("Viewing bank account details");
                          
                      System.out.print("Enter your Account Number :");
                      tmp=in.nextInt();                     
                             if(tmp==user.Acc_num){ 
                        System.out.println("  ACCOUNT NAME        ACCOUNT NUMBER       TYPE              BALANCE                BRANCH            DATE CREATED");
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");                               
                             user.display_details();                             
                        }else
                             System.out.println("Wrong Accoount Number.");
                             
                      break;
                  case 0:
                        quit = true;
                        break;
                  default:
                        System.out.println("Wrong Choice.");
                        break;
                  }
                  System.out.println("\n");
            } while (!quit);
            System.out.println("Thank you for using our service!");
            System.out.println("bed-com-06-18@cc.ac.mw");
             
     } //  end main function 
    
} //  end mian class