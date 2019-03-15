/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.project;



/**
 *
 * @author mayar abu zeid
 */
public class Client {
     private double balance;
     String[] arr=new String[5];
             int i=0;
    public Client(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    } 
         public void deposit(double add)
         {this.balance+=add;
         setData("You have deposited: " +add);
             i++;
         }
        public void withdraw(double subtract)
         {this.balance-=subtract;
         setData("You have withdrawed: " +subtract);
         i++;
         }
        public  void setData(String type){
            int count=4;
            while(count>0){
            arr[count]=arr[count-1];
            count--;
            }
            arr[0]=type;
        }
        public String history(int index){
            if(index>4||index>=i)
            {return "No previous transactions";}
            else
                return arr[index];
        }

}

