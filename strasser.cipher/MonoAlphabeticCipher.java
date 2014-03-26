
public class MonoAlphabeticCipher implements Cipher
{
    private String secretAlphabet;
    
    public MonoAlphabeticCipher () 
    {
        secretAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
    }

    public String getSecretAlphabet ()
    {
        return secretAlphabet;
    }

    private void setSecretAlphabet (String secretAlphabet)
    {
        this.secretAlphabet = secretAlphabet;
    }
    
    public String encrypt (String text)
    {
        
    }
    
    public String decrypt (String text)
    {
        
    }
}   
