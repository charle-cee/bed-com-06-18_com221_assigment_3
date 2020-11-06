//bed-com-06-18
//bank management system.
import java.util.Date;

public class Test_bank_account{

    public static void main(String args[]){
      
      Detail detail=new Detail();

        String user_name=null,type;
        type = null;
        int tmp=0;
        double withd=0,current_balance=0;
        double bookbalance=200;
        String branch="";
        int balance=0;
        int generated_number=0, option=0;
        String reg_num=""; 
        int [] list={generated_number};
        Bank_account[] account=new Bank_account[list.length];//CREATING ARRAY THAT WILL STORE ANK ACCOUNTS
        create_account user = new create_account("", 0, 0, "",""); // initilaize -- name,acc_number,Balance,Type

            //CRATING SCANNER OBJECTS
            java.util.Scanner Charle = new java.util.Scanner(System.in);
            
            java.util.Scanner Chidule = new java.util.Scanner(System.in);
            
            java.util.Date date=new java.util.Date();
            int userChoice;
            boolean quit = false;
                    System.out.println("WELCOME TO NATIONAL BANK OF MALAWI");
                    
            do {
                
                System.out.println("MAIN MENU");
                System.out.println("Select an operation below");
                  System.out.println("1. Create Bank Account");
                  System.out.println("2. Deposit money into account");
                  System.out.println("3. Withdraw money from account");
                  System.out.println("4. Check account balance");
                  System.out.println("5. Display Account Details");
                  System.out.println("6. List all accounts and their balances");
                  System.out.println("0. Exit: \n");
                  System.out.print("Enter Your Choice : ");
                  userChoice = Charle.nextInt();
                  switch (userChoice) {
                      
                  case 1:
                                          
do{
                         System.out.println("1. Student");
                        System.out.println("2. Executive");
                        option=Charle.nextInt();
                        if(option==1){
                               
                        System.out.println("Creating a new student bank account ");
                        System.out.println("\n\t NB use block/capital letters\n\t");
                        System.out.print("Enter your Name : ");
                        user_name=Chidule.nextLine(); 
                        System.out.print("Enter Accout Type : ");
                        type=Charle.next();
                         System.out.print("Enter the branch : ");
                        branch=Chidule.nextLine(); 
                         System.out.print("Enter your registration number : ");
                         
                        reg_num=Chidule.nextLine(); 
                        

                        // to generate Random Account Number 
                        for(int i=0; i<account.length;i++){
                        generated_number = (int)((Math.random() * 90000)+10000);
                 
                        generated_number++; 
                              }
                        user.insert(user_name, generated_number, type, branch, bookbalance);  // inserted 
                        System.out.println("Your account has sucessfully been created ");
                         bookbalance=200;
                        System.out.println("\n\tYour Account Details\n\t please!! Do not forget your  Account Number\n");
                        System.out.println(" ACCOUNT NAME       ACCOUNT NUMBER            TYPE            BALANCE        BOOK BALANCE               BRANCH                DATE CREATED                REG.NUMBER ");
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");                       
                        user.display_details();
                        System.out.print("     "+reg_num);
                        }
                        else{
                            
                         System.out.println("Creating a new executive bank account");
                           System.out.println("\n\t NB use block/capital letters\n\t");
                        System.out.print("Enter your Name : ");
                        user_name=Chidule.nextLine(); 
                        System.out.print("Enter Accout Type : ");
                        type=Charle.next();
                         System.out.print("Enter the branch : ");
                        branch=Chidule.nextLine(); 
                        // to generate Random Account Number 
                        int count=0;
                        for(int i=0; i<account.length;i++){
                        generated_number = (int)((Math.random() * 90000)+10000);
                        count++;
                            
                        }
                        
                        user.insert(user_name, generated_number, type, branch, 20000);  // inserted
                        System.out.println("Your account has sucessfully been created "); 

                        System.out.println("  ACCOUNT NAME        ACCOUNT NUMBER       TYPE              BALANCE          BOOK BALANCE            BRANCH            DATE CREATED");
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");                       
                        user.display_details();
                          }
                     System.out.println("\n\t Caution!\n\t Do not forget your  Account Number\n");
}
while(quit);                  
   break;
                        
                      
                case 2: // deposite
                   System.out.println("Depositing money into account");
                    System.out.print("Enter your account Number : ");
                    tmp=Charle.nextInt();
                 if(tmp==user.Acc_num){
                 System.out.print("Enter Amount Of Money to deposit : ");
                 balance=Charle.nextInt();
                 user.Acc_Balance=balance;
                 System.out.println("MWK"+balance+" is successfully Deposited.");
              }                
                     else
                    System.out.println("Wrong  bank Accoount Number.");          
                   break;
                    
                  case 3: // withdraw money   
                 System.out.println("Withdrawing money from account ");                   
                     System.out.print("Enter your account Number : ");
                      tmp=Charle.nextInt();
                      
                          if(tmp==generated_number){
                              if(option==1)                         
                             if(user.Acc_Balance==0|| user.Acc_Balance==200)
                             System.out.print("Sorry! You cannot withdraw book balance");
                             
                             else{
                             System.out.print("Enter Amount Of Money to withdraw : ");   
                             withd=Charle.nextDouble();  
                             
                             if(withd>user.Acc_Balance){
                             System.out.print("Enter Valid Amount of Money : ");
                             withd=Charle.nextDouble();
                             }
                             else
                             current_balance= user.withdraw(withd);
                             System.out.println("Your Current Balance : "+current_balance);   
                             }
                          }
                             else
                             System.out.println("Wrong Accoount Number.");  
                        break;
     
                  case 4: // check balance 
                     System.out.println("Checking bank account balance ");

                      System.out.print("Enter your Account Number : ");
                      tmp=Charle.nextInt();
                      
                             if(tmp==user.Acc_num){
                             System.out.println("Your Current Balance : MWK"+user.Acc_Balance);
                             }
                             else
                             System.out.println("Wrong Accoount Number.");                         
                      break;
                      
                  case 5: // display all info 
                      System.out.println("Viewing bank account details");
                          
                      System.out.print("Enter your Account Number :");
                      tmp=Charle.nextInt();                     
                             if(tmp==user.Acc_num){ 
                        System.out.println("  ACCOUNT NAME        ACCOUNT NUMBER       TYPE                BALANCE      BOOK BALANCE                BRANCH            DATE CREATED");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");                               
                             
                             user.display_details();                             
                        }
                      
                          else{   System.out.println("Wrong Accoount Number.");
                          }
                      break;
                       case 6: // list all accounts and thier balance 
                     System.out.println("\n");  
                                          System.out.println("Below are bank accounts and their balances");
                      System.out.println("ACCOUNT NAME     ACCOUNT NUMBER       TYPE               BALANCE            BOOK BALANCE               BRANCH            DATE CREATED");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");                               
                          
                            for (int i=0; i<list.length; i++){
                                detail.Search(list, generated_number);
                                 user.display_details();
                            }
                              if (tmp==generated_number){
                                System.out.println("\n");                               
                             user.display_details();      
                        }

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