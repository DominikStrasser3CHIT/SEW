
public interface Cipher 
{
	public String encrypt (String text)
	{
		text = text.toLowerCase();
		return text;
	}
	
	public String decrypt (String text)
	{
		text = text.toLowerCase();
		return text;
	}
}
