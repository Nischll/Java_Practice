package practice;

public class ExceptionDemo {
    public void basicTryCatch () {
        try{
            int a = 5/0;
        } catch (ArithmeticException e){
            System.out.println("cannot divide by zero " + e.getMessage());
        }
    }

    public void withFinally () {
        try {
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[2]);
        } catch (Exception e) {
            System.out.println("sthg went wrong " + e.getMessage());
        } finally {
            System.out.println("always runs.");
        }
    }

    public void checkAge (int age) throws UnderAgeException{
        if( age < 18){
            throw  new UnderAgeException("Under age.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public void divide (int a, int b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero.");
        } else {
            System.out.println("Division done!!");
        }
    }

}
