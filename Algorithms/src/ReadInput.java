import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array");
		String[] inps=sc.nextLine().split(" ");
		int[] inp=new int[inps.length];
		for(int i=0;i<inp.length;i++) 
			inp[i]=Integer.parseInt(inps[i]);

	}

}
