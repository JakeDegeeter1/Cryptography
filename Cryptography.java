public class Cryptography
{
    private int rotations = 13;  // used in the second part

    public Cryptography()
    {

  // no need to put anything here for now.
    }

    public int convertToNumbers(char letter)
    {
        // fill in this method!
char thisChar = letter;
System.out.println( (int) thisChar );
        return (int) thisChar;
    }
public char applyRotation(int rotation){
   rotation = rotation-64;
   rotation = rotation+13;
  if(rotation > 26){
  rotation = rotation-26;
 
  }
  rotation = rotation+64;
   return (char) rotation;
   
  
}
    // create a similar method for the ROT13 portion.
    // This method will return a character instead.
  
    
}
