public class bankaccount{
    //static variables belongs to the class
    static String bankName = "bank of baroda";
    static int totalAccounts = 0;
    //non static variables belongs to the object
    String accountHolder;
    double balance;

    public bankaccount(String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }
    //static method 
    public static void Showbankinfo(){
        System.out.println("bankname is " + bankName);
        System.out.println("total account is " + totalAccounts);
       
       //got error as non static variables cant be accesed
       // System.out.println("account holder is " + accountHolder);
       // System.out.println("balance is " + balance);
    }
   //instance method
    void viewindividualinfo(){
        // we can access the static variables in the instance methods
        // non static variables we can acces in the instance methods
        System.out.println("bank name is " + bankName);
        System.out.println("accountholder name is " + accountHolder);
        System.out.println("balance of the user is" + balance);
    }

    public static void main(String[] args) {
        bankaccount b1 = new bankaccount("mahesh", 7000);
        bankaccount b2 = new bankaccount("mahesh", 7000);
        b1.viewindividualinfo();
        b2.viewindividualinfo();
        
        bankaccount.Showbankinfo();

    }




}