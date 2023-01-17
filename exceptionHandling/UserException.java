public class UserException extends Exception{
    UserException(){
        super();
    }

    UserException(String message){
        super(message);
    }

    void inException() throws UserException{
        UserException userException = new UserException("in message");

        throw userException;
    }
    public static void main(String args[]) {
        UserException userException = new UserException("in message");
        try{
            throw userException;
        }catch(UserException userException2){
            System.out.println("in exception "+userException2.getMessage());
        }

        
        try{
            userException.inException();
        }catch(UserException userException2){
            System.out.println("in exception second "+userException2.getMessage());
        }

    }   
    
}
