import java.util.*;

public class StudentRecord {
	ArrayList<Student> al = new ArrayList<Student>();
	Scanner sc = new Scanner (System.in);
	
	//add record method
	public void addRecord(){
		Student s = new Student();
		System.out.println("Eneter name:");		
		s.name = sc.nextLine();
		System.out.println("Eneter id:");
		s.id = sc.nextLine();
		System.out.println("Eneter address:");
		s.address = sc.nextLine();
		System.out.println("Eneter cgpa:");
		s.cgpa = sc.nextDouble();
		sc.nextLine();
		
		al.add(s);
		
	}
	
	
	
	//print record
	public void printRecord(){
		//caling the sort method
		Student [] s = (Student[])sort();
		for(int i = 0; i<s.length; i++){
			System.out.println(s[i].name+"\n"+s[i].id+"\n"+s[i].address+"\n"+s[i].cgpa);
			System.out.println("************");
		}
		
	}
	
	public Student []  sort(){
		Student [] studentArray = new Student[al.size()];
				studentArray =  al.toArray(studentArray);
		
		for (int i =0; i<studentArray.length;i++){
			
			for (int j =i+1; j<studentArray.length;j++){
				
				int compare = studentArray[i].name.compareToIgnoreCase(studentArray[j].name);
				
				if(compare>0){
					Student temp = studentArray[i];
					studentArray[i] = studentArray[j];
					studentArray[j] = temp;
				}
				else if(compare == 0){
					int compareId = studentArray[i].id.compareToIgnoreCase(studentArray[j].id);
					if(compareId<0){
						Student temp = studentArray[i];
						studentArray[i] = studentArray[j];
						studentArray[j] = temp;
					}
				}
				
//				int match = 0;
//				
//				while(studentArray[i].name.charAt(match)==studentArray[j].name.charAt(match)){
//					match++;
//					if (match == studentArray[i].name.length())
//						sortByID(studentArray[i],studentArray[j]);
//						break;
//				}
//				
//			
//				if(studentArray[i].name.charAt(match)>studentArray[j].name.charAt(match)){
//					Student temp = studentArray[i];
//					studentArray[i] = studentArray[j];
//					studentArray[j] = temp;
//				}
				
				
			}
		}
		return studentArray;
	}
	
	public void deleteRecord(){
		System.out.println("Enter the id to be deleted");
		
		String deleteId = sc.nextLine();
		int match=0;
		
		for (int i = 0; i < al.size(); i++) {
			Student iterator = al.get(i);
		
		
			if(iterator.id.compareToIgnoreCase(deleteId)==0){
				al.remove(iterator);
				System.out.println("**********Id Removed*************");
				match = 1;
				break;
			}
			
		}
		if(match == 0){
			System.out.println("Id does not exist");
		}
	}
	
	public void editRecord(){
System.out.println("Enter the id to be deleted");
		
		String editId = sc.nextLine();
		int match=0;
		
		for (int i = 0; i < al.size(); i++) {
			Student iterator = al.get(i);
		
		
			if(iterator.id.compareToIgnoreCase(editId)==0){
									
				System.out.println("Eneter new name:");
				iterator.name = sc.nextLine();	
				System.out.println("Eneter new address:");
				iterator.address = sc.nextLine();
				System.out.println("Eneter new cgpa:");
				iterator.cgpa = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("**********Id Edited*************");
				match = 1;
				break;
			}
			
		}
		if(match == 0){
			System.out.println("Id does not exist");
		}
		
	}
	
	
	
}
