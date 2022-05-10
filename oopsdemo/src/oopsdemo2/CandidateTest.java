package oopsdemo2;

public class CandidateTest {

	public static void main(String[] args) {
		
		System.out.println("......Candidate Details......");
		
		JavaCandidate jc1= new JavaCandidate(1111, "GavinKing", 5000, "Hibernate");
		jc1.display();
		jc1.getPerks();
		
		AccountsCandidate ac1=new AccountsCandidate(2222,"mike",3000);
		ac1.display();
		ac1.getPerks();
		

	}

}
