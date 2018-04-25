package projet_one;

public class Customer {
private String lastName;
private String firstName;
private String ssn;
private Account account;

Customer(String firstName, String lastName, String ssn, Account account){
	this.firstName= firstName;
	this.lastName= lastName;
	this.ssn=ssn;
	this.account=account;
}
@Override
public String toString() {
	return "\nCustomer Information\n"+
"First Name "+ firstName+"\n"+
"Last Name "+ lastName+"\n"+
"SSN "+ ssn+"\n"+
"Account: " + account;
}
public String basicInfo() {
	return 
"First Name"+ firstName+"\n"+
"Last Name"+ lastName+"\n"+
"SSN"+ ssn+"\n"+
"Account:" +account.getAccountNumber();
}
Account getAccount() {
	return account;
}
}
