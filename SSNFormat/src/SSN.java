import java.util.Scanner;

public class SSN {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kindly enter the Social security number(For example:123-45-6789) : ");
		String num = scan.nextLine();
		
		if(num.length()==11){
		
			for(int i=0;i<=10;i++){
				if(i==3 || i==6){
					String atr = num.charAt(i)+"";
					if(!atr.contains("-"))
					{
						System.out.println((i+1) + " place must contain - ");
						System.exit(0);
					}
				}
				else{
					if(!Character.isDigit(num.charAt(i))){
						System.out.println("Format is wrong");
						System.exit(0);
					}
				}
			}
		}else{
			System.out.println("The length of SSN must be 11 ");
			System.exit(0);
		}
		System.out.println("The format is absolutely correct");
	}
}
