package javaSE;

public class Book {
	private String title ;
	private String subtitle;
	private static int bookCount=0;
	
	
	public Book(String title){
		this.title = title;
		bookCount++;
	}
	
	public Book(String title,String subtile){
		this.title = title;
		this.subtitle = subtile;
		bookCount++;
	}
	
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getSubstitle(){
		return subtitle;
	}
	public void  setSubstitle(String subtitle){
		this.subtitle = subtitle;
	}
	public  void display(){
		if(subtitle!=null){
		System.out.println("Title :"+this.title);
		System.out.println("Subtitle :"+this.subtitle+"\n");
		
		}
		else {
			System.out.println("Title :"+this.title+"\n");
			}
		
		
	}
	public static int gettotalNumOfBook(){
		return bookCount;
	}

}
