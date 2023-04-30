package collections;

public class Banking implements Comparable<Banking> {
	String BankName;
	int accno;
	double bal;
	Banking(String BankName, int accno,double bal)
	{
		this.BankName=BankName;
		this.accno=accno;
		this.bal=bal;
	}
	
	public String toString()
	{
		return BankName+"   "+accno+"   "+bal;
	}
	public int compareTo(Banking b)
	{
		return this.BankName.compareTo(b.BankName);
	}
//	public int compareTo(Banking b)
//	{
//		return this.accno-b.accno;
//	}

}
