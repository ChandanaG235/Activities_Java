package w2;

public class Book 
{
	private String title;
	private String author;
	public Book() 
	{
		this.title = "";
	    this.author = "";
	}

	    
	 public void setTitle(String title) 
	 {
	     this.title = title;
	 }

	   
	 public String getTitle() 
	 {
	        
	     return this.title;
	  }

	    
	  public void setAuthor(String author) 
	  {
	        
	      this.author = author;
	  }

	    
	  public String getAuthor()
	  {
		  return this.author;
	  }

	  public static void main(String[] args) 
	  {
	        
	        Book myBook = new Book();
	        String publishedDate="18th of September";
	        int publishedYear=1997;

	       
	        myBook.setTitle("Data Structures");
	        myBook.setAuthor("David Brown");
	     
	        System.out.println("Tilte:"+myBook.getTitle());
	        System.out.println("Author:"+myBook.getAuthor());

	        
	        System.out.println("The book named " + myBook.getTitle()+" was wriiten by "+myBook.getAuthor()+" and published on "+ publishedDate + publishedYear);
	     
	    }
}



