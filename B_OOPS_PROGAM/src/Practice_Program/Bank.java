package Practice_Program;

public class Bank {
	public static void main(String[] args){
        // create an instance(object) of BankAccount
        
        BankAccount acc1 = new BankAccount(1001,"HK",10000);
        
         // Pass dynamic values to static fields using the instance method
         acc1.setStaticFields("HDFC","Ameerpet","HDFC0001627");
         
         System.out.println(BankAccount.bankName + " " + BankAccount.branchName + " " + BankAccount.ifscCode + " " + acc1.accNum + " " + acc1.accHName + " "+ acc1.accBalance);
    }

}

class BankAccount {
	
	    static String bankName;
	    static String branchName;
	    static String ifscCode;
	    
	    long accNum;
	    String accHName;
	    double accBalance;
	    
	    public static void setStaticFields(String bankName,String branchName,String ifscCode){
	        BankAccount.bankName = bankName;
	        BankAccount.branchName = branchName;
	        BankAccount.ifscCode = ifscCode;
	    }
	    
	    public BankAccount(long accNum,String accHName,double accBalance){
	        this.accNum = accNum;
	        this.accHName = accHName;
	        this.accBalance = accBalance;
	    }
	}
	

	