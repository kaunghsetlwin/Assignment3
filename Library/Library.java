package javaSE;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException; 

public class Library {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Book [] bookArray = new Book [100];
	static int bookCount=0;


	
	public static void addBook()throws IOException{
		String flag;
		
		do{
		System.out.print ("Enter details for a new book:Title:");
		String title = br.readLine();
		System.out.print("Subtitle(or press Enter to skip):");
		String subtitle = br.readLine();
		if (subtitle.isEmpty()){
			Book book = new Book(title);
			bookArray[bookCount] = book;
			bookCount++;
			
		}
		else{
			Book book = new Book(title,subtitle);
			bookArray [bookCount] = book;
			bookCount++;
			
			}
		
		System.out.print("Do you want to enter another book?(yes/no):");
		flag = br.readLine();
		System.out.println();
		
	}
		while(flag.equalsIgnoreCase("yes"));
		
	
		
	}	
		
  public static void dispalyAllBook(){
		System.out.println("Libray Inventory:");
		for (int i =0;i<bookCount;i++){
			bookArray[i].display();
			
			
		}
		
		
	}	
  public static void main(String args[])throws IOException{
	addBook();
	dispalyAllBook();
	System.out.println("Total number of books created :"+Book.gettotalNumOfBook());
	
  }



}
