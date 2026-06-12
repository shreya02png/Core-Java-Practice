public class BasicTryCatch {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        try {
            System.out.println(10/0); 
            System.out.println(arr[5]); //error

        } catch (ArithmeticException e) {
            System.out.println("Handled Arithmetic Exception: Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Array Index Exception: Invalid index");
        } catch (Exception e) {
            System.out.println("Handled Generic Exception");
        }
        finally{
            System.out.println("Finish");
        }
    }
}