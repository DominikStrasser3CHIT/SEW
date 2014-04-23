/**
 * Enthält Methoden um das secretAlphabet mit einem GeheimAlphabet zu besetzten
 * @author Dominik Strasser
 * @version 31.3.14
 */
public class SubstitutionCipher extends MonoAlphabeticCipher
{

    /**
     * Das Geheimalphabet wird in secretAlphabet eingesetzt
     */
    public SubstitutionCipher (String secretAlphabet) 
    {
        super();
        super.setSecretAlphabet(secretAlphabet);
    }
    public void setSecretAlphabet (String secretAlphabet)
    {
        super.setSecretAlphabet(secretAlphabet);
    }

}
