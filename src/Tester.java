import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		StudentRecord s = new StudentRecord();
		int breakpoint = 0;
		do{
			
			System.out.println("Enter 0 to Quit\nEnter 1 to Add a Record\nEnter 2 to Print the Records\nEnter 3 to Delete a Record\nEnter 4 to Edit a Record");

			
			int command = sc.nextInt();
			if (command == 0)
				breakpoint = 1;
			
			else if(command == 1)
				s.addRecord();
			
			else if(command == 2)
				s.printRecord();
			else if(command == 3)
				s.deleteRecord();
			else if(command == 4)
				s.editRecord();		
			
		}while(breakpoint == 0);
		
		
		
//		int [] a = {5,9,7,1,2,4,6};
//		
//			for (int i =0; i<a.length;i++){
//			
//			for (int j =i+1; j<a.length;j++){
//				
//				if(a[i]>a[j]){
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//			
//
//	}
//			
//			for(int i : a){
//				System.out.println(i);
//			}
	}
}
