package Day2;

public class Composition 
{
	String book;
	String author;
	public Composition(String book,String author)
	{
		this.book=book;
		this.author=author;
	}
	@Override
	public String toString() {
		return " book=" + book + ", author=" + author;
	}
	
    
}

