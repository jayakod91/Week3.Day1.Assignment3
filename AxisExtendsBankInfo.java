package week3.Day1;

public class AxisExtendsBankInfo {

		public void deposit()
		{
			System.out.println("deposit");

		}

		public static void main (String arg[])
		{
			BankInfo bank = new BankInfo();
			bank.saving();
			bank.deposit();
			bank.fixed();
			BankInfo bank2=new BankInfo();
			bank2.deposit();

	}

}
