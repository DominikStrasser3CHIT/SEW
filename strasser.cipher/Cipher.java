/**
 * Interface für Cipher, encrypt und decrypt
 * 
 * @author Dominik Strasser
 * @version 31.3.14
 */
public interface Cipher 
{
    public String encrypt (String text);
    public String decrypt (String text);
}
