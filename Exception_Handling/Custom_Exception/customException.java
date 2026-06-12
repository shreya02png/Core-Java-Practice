class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class customException {
    static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
        throw new InvalidAgeException("Age must be 18+");}
    }

    public static void main(String[] args) {
        try{
            checkAge(17);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}

