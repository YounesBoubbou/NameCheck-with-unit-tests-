import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*Unit tests for the namechecking function. We are using
the JUnit framework to test our method*/ 
public class NamecheckingTest {
    
    public NamecheckingTest() {
        /*We initialize a boolean variable that will take the expected result
        in our test case. Then, we initialize another boolean variable that
        will hold the actual value returned from our returned function. 
        If the expecteed and actual value match (we can verify that using
        the assertEquals method in JUnit), the test passes. Otherwise, the 
        test fails.*/
        boolean expected = true;
        boolean actual = true;
        assertEquals(expected, actual);
    }
    public void test_alphaname() {
        
        String str = "SommerVille";
        boolean expected = true;
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    public void test_doublequote(){
        String str = "\"Thisis'maliciouscode'\"";
        boolean expected = false;
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    public void test_namestartswithhyphen(){
        String str = "-SommerVille";
        boolean expected = false;
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    public void test_namestartswithquote(){
        String str = "'Reilly";
        boolean expected = false;
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    public void test_nametoolong(){
        String str = "Thisisalongstringwithmorethan40charactersfrombeginningtoend";
        boolean expected = false;
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    public void test_nametooshort(){
        String str = "s";
        boolean expected = false;
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    public void test_namewithdigit(){
        String str = "C-3PO";
        boolean expected = false;
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    public void test_namewithdoublehyphen(){
        String str = "--badcode";
        boolean expected = false; 
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    public void test_namewithhyphen(){
        String str = "Washington-Wilson";
        boolean expected = true;
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    public void test_namewithinvalidchar(){
        String str = "Sommer_Ville";
        boolean expected = false;
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    public void test_namewithquote(){
        String str = "O'Reilly";
        boolean expected = true;
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    public void test_namewithspaces(){
        String str = "Washington Wilson";
        boolean expected = false; 
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    public void test_shortname(){
        String str = "Sx";
        boolean expected = true;
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    public void test_thiswillfail(){
        String str = "Younes";
        boolean expected = false;
        boolean actual = namecheck(str);
        assertEquals(expected, actual);
    }
    
    private boolean namecheck(String s) {
        if(Pattern.matches("[a-zA-Z][a-zA-Z-']{1,39}", s) == true){
        return true;
    }
    else return false;    }
    
}
