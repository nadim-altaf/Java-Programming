
class CustomException extends Exception{
  public CustomException(String message){
    super(message);
  }
}


public class throwexception {
  public static void main(String[] args) {
    int i = 20;
    int j = 0;

    try {
      j = 18 / i;
      if(j==0)
      {
        throw new CustomException("dont print zero");
      }
    } 

    catch (CustomException e) {
      j = 18/1;
      System.out.println("default value " + e);
    } 
    
    catch (Exception e) {
      System.out.println("something went wrong!" + e);
    }

    System.out.println(j);
  }
}
