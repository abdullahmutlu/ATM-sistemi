
package atm;
public class ATM {   
    public String type = "normal";
    
    public String name = "";
    
    private double balance = 0;
    
    ATM(String name, double initialBalance){
        this.name = name;
        this.balance = initialBalance;
    }
    void credit(double amount){
        this.balance = this.balance - amount;
    }
    void deposit(double amount){
        this.balance = this.balance + amount;
    }
    double getCurrent(){
        return this.balance;
    }
    void printInfo(){
        System.out.println("Type :" + this.type);
        System.out.println("Balance : " + this.balance);
    }

    boolean getCurrentBalance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
