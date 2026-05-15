class NestedTry {

    public static void main(String args[]) 
{
        try {
            int a[] = {1, 2, 3, 4,5};
            System.out.println(a[10]);

            try {
                int x = a[2]/0;
            } 
            catch (ArithmeticException e)
 {
                System.out.println("Divide by zero");
            }
        } 
        catch (ArrayIndexOutOfBoundsException e)
 {
            System.out.println("Out of bounds");
        }
    }
}