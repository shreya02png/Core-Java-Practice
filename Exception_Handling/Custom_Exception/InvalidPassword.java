class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String msg){
        super(msg);
    }
}
public class InvalidPassword {
    static void checkPassword(String password) throws InvalidPasswordException{
        if(password.length()<6){
        throw new InvalidPasswordException("password length < 6");}
    }

    public static void main(String[] args) {
        try{
            checkPassword("84hj");
        } catch(InvalidPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}