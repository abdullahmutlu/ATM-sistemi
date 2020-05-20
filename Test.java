
package atm;
public class Test {
    Test(){
       // ATM atmSession = new ATM("abdullah",5000);
        
       // atmSession.credit(1000);
       // atmSession.deposit(1500);
        
       // System.out.println(atmSession.getCurrentBalance());
        
       IntelATM intel = new IntelATM("john",4000);
       OldATM old = new OldATM("Doe",3000);
        
        intel.credit(500);
        old.deposit(1000);
        
        //-------play
        ATM unknownATM = intel;
        unknownATM.printInfo();
    }
    
}
