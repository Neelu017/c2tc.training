public class ValidateAge {
    public static void validateAge(int age)
throws MyException , ArithmeticException {
    if(age<0) {
        throw new MyException("The Entered age is not valid");

    }
    else {
        System.out.println("The age is valid");
    }

}
    
}
