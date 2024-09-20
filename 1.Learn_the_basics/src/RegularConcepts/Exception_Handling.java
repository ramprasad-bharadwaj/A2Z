package RegularConcepts;// try...catch
// finally
// throw and throws

//used to stop abnormal termination


public class Exception_Handling {
    public static void main(String[] args) {
        int a[] = new int[2];
        int z = -1;
        Exception_Handling abc = new Exception_Handling();
        try{
            System.out.println(a[12]);
            int x = 5/0;
            abc.printElement(a);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException  e ){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Completed");
        }

        try{
            if(z == -1){
                throw new MyException("This is the custom message!");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static class MyException extends Exception{
        public MyException(String message){
            super(message);
        }
    }
    void printElement(int a[]) throws ArithmeticException{
        System.out.println(a[12]);
    }
}
