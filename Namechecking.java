import java.util.regex.*;


public class Namechecking{
   public boolean namecheck(String s){
       /*Java method that checks that a name only includes alphabetic characters,
       -, or a single quote. Names must be between 2 and 40 characters long. 
       Quoted strings and -- are disallowed
       */
    if(Pattern.matches("[a-zA-Z][a-zA-Z-']{1,39}", s) == true){
      return true;
    }
    else return false;
  }
}


