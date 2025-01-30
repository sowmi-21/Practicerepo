package practice;
abstract class Account
{ double amt;
   abstract boolean withdraw(double amt);
}

class  SavingsAccount extends Account
{
	int accno;
	Customer cdetails;
	double bal;
	double MinBal;
	void withdraw()
	{
		return 
	}
	
	SavingsAccount(int accno, Customer cdetails, double bal, double Minbal)
	{
		this.accno=accno;
		this.cdetails=cdetails;
		this.bal=bal;
		this.MinBal=MinBal;
	}
	void getAcc() {
		System.out.println();
	}
	

	@Override
	boolean withdraw(double amt) {
		// TODO Auto-generated method stub
		if(balance-amt<min) {
			System.out.print("failed");
			return false;
		}
		else {
			System.out.println("sucessfull");
			return true;
		}
		
	}
	
}




import java.util.ArrayList;
import java.util.List;

public class SpamDetector {
    public static List<String> getspamEmails(String[] subjects, String[] spam_words) {
        List<String> results = new ArrayList<>();
        
        for (String subject : subjects) {
            boolean isSpam = false;
            for (String spam_word : spam_words) {
                if (subject.toLowerCase().contains(spam_word.toLowerCase())) {
                    isSpam = true;
                    break;
                }
            }
            if (isSpam) {
                results.add("spam");
            } else {
                results.add("not_spam");
            }
        }
        
        return results;
    }

    public static void main(String[] args) {
        String[] subjects = {"i paid him paid", "Summertime Sadness"};
        String[] spam_words = {"I", "Sadness", "paid"};
        
        List<String> results = getspamEmails(subjects, spam_words);
        for (String result : results) {
            System.out.println(result);
        }
    }
}













function description
complete the function getspamEmails in the editor below.
getspamEmails takes the following arguments:
	String subjects[n]:the subject of the email
	String spam_words[k]:the spam words
	returns
	String[n]:the results of spam detection
	sample input
	2
	i paid him paid
	Summertime Sadness
	3
	I
	Sadness
	paid
	sample output
	spam
	not_spam


class Customer
{
	
//	public int getCusid() {
//		return cusid;
//	}
//	public void setCusid(int cusid) {
//		this.cusid = cusid;
//	}
//	public String getCname() {
//		return cname;
//	}
//	public void setCname(String cname) {
//		this.cname = cname;
//	}
//	public String getEmailId() {
//		return emailId;
//	}
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
	int cusid;
	String cname;
	String emailId;


Customer(int cusid, String cname, String emailId)
{
	this.cusid=cusid;
	this.cname=cname;
	this.emailId=emailId;
}

//public String toString()
//{
//	return "
//}


}

public class DemoOops {
	public static void main(String[] args) {
		
		Customer c = new Customer(101,"sowmi","sowmi21sv@gmail.com");
		
		
		
	}

}



























