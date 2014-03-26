import  javax.crypto.*;
public class MonoAlphabeticCipher implements Cipher
{
    private String secretAlphabet;
    
    public MonoAlphabeticCipher () 
    {
        secretAlphabet = "abcöüßdefyzäghivwxjklstumnopqr";
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
        text = text.toLowerCase();
        for(int i = 0; text.length; i++)
        {
            
        }
    }
    
    public String decrypt (String text)
    {
        text = text.toLowerCase();
        
    }
}   
