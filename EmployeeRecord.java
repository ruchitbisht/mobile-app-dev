import java.util.Date;
import java.util.Scanner;

class EmployeeRecord
 {
   public static void main(String ar[])
    {
	String emname,emdep,emdes,emstatus;
	int emid;
	Date emdoj,emdob,emdom;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your EmployeeID");
	emid=sc.nextInt();
	System.out.println("Enter your EmployeeName");
	emname=sc.next();
	System.out.println("Enter your Department");
	emdep=sc.next();
	System.out.println("Enter your Designation");
	emdes=sc.nextLine();
	System.out.println("Enter your Date of Joining");
	emdoj=sc.nextInt();
	System.out.println("Enter your Date of Birth");
	emdob=sc.nextInt();
	System.out.println("Enter your Marital Status");
	emstatus=sc.nextLine();
	System.out.println("Enter your Date of Marriage");
	emdom=sc.nextInt();
    }
}