/**
 * Enthält als Parameter
 *              secretAlphabet ... Geheimalphabet zur verschlüsselung
 *              standardAlphabet ... Standard Alphabet
 * 
 * Und als Methoden
 *              Konstruktor
 *              getSecretAlphabet ... besetzt secretAlphabet mit einem Geheimalphabet
 *              setSecretAlphabet ... gibt das Geheimalphabet zurück
 *              encrypt ... verschlüsselt den eingelesenen Text
 *              decrypt ... entschlüsselt den eingelesenen Text
 *              
 *              
 * @author Dominik Strasser
 * @version 31.3.14
 */
public class MonoAlphabeticCipher implements Cipher
{
    private String secretAlphabet;
    private char[] standardAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß".toCharArray(); //Standard Alphabet für encrypt und decrypt
    
    /**
     * Konstruktor
     */
    public MonoAlphabeticCipher () 
    {
        
    }

    /**
     * Gibt SecretAlphabet zurück
     */
    public String getSecretAlphabet ()
    {
        return secretAlphabet;
    }

    /**
     * Setzt SecretAlphabet mit einem Geheimalphabet
     */
    protected void setSecretAlphabet (String secretAlphabet)
    {
        this.secretAlphabet = secretAlphabet;
    }
    
    /**
     * Verschlüsselt den eingelesenen Text und gibt ihn verschlüsselt zurück
     */
    public String encrypt (String text)
    {
        text = text.toLowerCase();
        String verschl = "";
        for(int i = 0; i < text.length(); i++) 
        {
            int stelle = new String(standardAlphabet).indexOf(text.charAt(i));
            if(stelle < 0)
            {
                verschl = verschl + text.charAt(i);
            }
            else 
            {
                verschl = verschl + secretAlphabet.charAt(stelle);
            }
        }
        return verschl;
    }
    
    /**
     * Entschlüsselt den eingelesenen Text und gibt ihn entschlüsselt zurück
     */
    public String decrypt (String text)
    {
        text = text.toLowerCase();
        String entschl = "";
        for(int i = 0; i < text.length(); i++) 
        {
            int stelle = new String(secretAlphabet).indexOf(text.charAt(i));
            if(stelle < 0) 
            {
                entschl = entschl + text.charAt(i);
            }
            else 
            {
                entschl = entschl + standardAlphabet[stelle];
            }
        }
        return entschl;
    }
}   
