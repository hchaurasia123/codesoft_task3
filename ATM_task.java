import java.util.Scanner;
public class ATM_task {
    


    private int balance;
    public ATM_task(int amount){
        this.balance=amount;
    }
    public int balance(){
        return balance;
    }

    public void deposite(int amounts){
        if(amounts>0){
            balance+=amounts;
            System.out.println("deposite of Amount " + amounts + "Rs was succesfully" );
        }else{
            System.out.println("Invalid Entry");
        }

    }

    public void withdraw(int amounts){
        if(amounts>0 && amounts<=balance){
            
           balance-=amounts;
            System.out.println("Withdraw sucessfully" + amounts  + "Rs");
        }else{
            System.out.println("Inavlid ENtry Balance is Insufficient");
        }
    }
}
 class Atm{
    private ATM_task account;
    public Atm(ATM_task account){
        this.account=account;
    }

    public void display(){
        System.out.println("Select Options");
        System.out.println("1. Check Balance ");
        System.out.println("2. Deposite ");
        System.out.println("3. Withdraw");
        System.out.println("4. Leave");
    }

    public void run(){
        Scanner sc=new Scanner(System.in);
        int optional;
        do{
            display();
            System.out.println("please Chhose any One option\n");
            optional=sc.nextInt();
            switch (optional) {
                case 1:
                    
              System.out.println("Current Balance  " +   account.balance() );
              break;
            case 2:
              System.out.println("Enter the Amount Dposite");
              int deposite=sc.nextInt();
              account.deposite(deposite);
             
              break;
              case 3:
              System.out.println("Enter the Amount Withdraw");
              int withdrawAmount=sc.nextInt();
              account.withdraw(withdrawAmount);
              
              break;
              case 4:
              System.out.println("Thanks For Working with join Banks");
             break;
             default:
             System.out.println("Inavlid entry");
            }

        }
        while(optional!=4);
        sc.close();
    }


 }
    
class Atm_2{
public static void main(String[] args) {
    ATM_task useraccount=new ATM_task(890000);
    Atm atm=new Atm(useraccount);
    atm.run();
    
}
    }
 

