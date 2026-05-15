public class NestedCatchExample {
    public static void main(String[] args) {
        try {
            String str = "Engineering";
            
            
            try {
                char ch = str.charAt(50); 
                System.out.println("Character: " + ch);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("String Exception: " + e.getMessage());
            }

            int[] data = {1, 2, 3};
            System.out.println(data[5]); 

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception: " + e.getMessage());
        }

        System.out.println("finished ");
    }
}