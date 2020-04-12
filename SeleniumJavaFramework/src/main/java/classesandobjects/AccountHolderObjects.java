package classesandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
		AccountHolder sonila = new AccountHolder();
		AccountHolder monila = new AccountHolder();
		AccountHolder deepak = new AccountHolder();
		
		sonila.firstName = "Sonil";
		sonila.lastName = "Parajuli";
		sonila.age = 27;
		sonila.accountBalance = 10000;
		sonila.testEligibilityForCreditCard();
		System.out.println("Is Sonila Eligible for CrediCard: "+sonila.eligibleForCreditCard);
		
		monila.firstName = "Monil";
		monila.lastName = "Parajuli";
		monila.age = 26;
		monila.accountBalance = 20000;
		monila.testEligibilityForCreditCard();
		System.out.println("Is Monila Eligible for CrediCard: "+monila.eligibleForCreditCard);
		
		deepak.firstName = "Deepak";
		deepak.lastName = "Gautam";
		deepak.age = 30;
		deepak.accountBalance = 30000;
		deepak.testEligibilityForCreditCard();
		System.out.println("Is Deepak Eligible for CrediCard: "+deepak.eligibleForCreditCard);
	}
	
}
