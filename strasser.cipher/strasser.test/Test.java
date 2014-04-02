import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import strasser.cipher.SubstitutionCipher;
/**
 * Enthält Methoden um die einzelnen Methoden für die Cipher Applikation zu testen
 * 
 * @author Dominik Strasser
 * @version 31.3.14
 */
public class Test {

    /**
     * Um das Objekt zu deklarieren
     */
    @Before
    public void setUp() throws Exception {
        new SubstitutionCipher("tzuqwernmßiopüasöäyxcdfghlvbjk");
    }

    /**
     * Hier wird die Verschlüsselung getestet
     */
    @Test
    public void testSubstitutionCipher() {
        String text = "Das ist ein Test";
        String verschl = test.encrypt(text);
        String entschl = test.decrypt(verschl);
        System.out.println(text+", "+verschl+", "+entschl);
    }

}