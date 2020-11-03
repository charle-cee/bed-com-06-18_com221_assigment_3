
import java.util.*;
import java.util.Date;

class Account{
    String name,acc_type, branch;
    int Acc_num,Acc_Balance, balance=0;
    java.util.Date date;
    String reg_num="";

    Account(){
      
    }
        Account(String n,int acc_num,int b,String a_t){
            name=n;
            Acc_num=acc_num;
            Acc_Balance=b;
            acc_type=a_t;
        }
} // end class

class create_account extends Account{
    create_account(String n, int acc_num,int b, String a_t, String a){ // pass name and account type 
            name=n;
            Acc_num=acc_num;
            Acc_Balance=b;
            acc_type=a_t;
            branch=a;
            date=new java.util.Date();
    }
    create_account(){
        super();//bed-com-06-18
    }
        
    void insert(String n,int acc_num,String a_t, String c){ // input user name, account number and type 
        name=n;
        acc_type=a_t;
        Acc_num=acc_num; // generate random number 
        Acc_Balance=0;
        branch=c;
    

    }
    class student extends create_account{
        student(String r){
            reg_num=r;

        }
void sudent_detail(){
    System.out.print("     "+reg_num);
}


    }

    
    
    void display_details(){
        System.out.print(name);
        System.out.print("       "+Acc_num);
        System.out.print("               "+acc_type);
        System.out.print("            MWK"+(Acc_Balance+balance));
        System.out.print("                "+branch);
        System.out.print("            "+date);
    }
 
        void deposite(int acc_num,int money){                 
                Acc_Balance+=money;    
        }
        
        int withdraw(int withd){
                Acc_Balance=Acc_Balance-withd;
                return Acc_Balance;
        }
  
} // end class 

      
