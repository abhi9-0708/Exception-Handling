public class CheckedException{
    public static void main(String[] args) {
        int i ,j,k=0;
        //assigning a value to k is imp otherwise it gives error
        i=8;
        j=0;
        try{
            k=i/j;
        }
        catch(Exception e ){//(ArithmeticException e)
            System.out.println(e);
            System.out.println("can not divide by zero");
        }
        System.out.println(k);
    }
}