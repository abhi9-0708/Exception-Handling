public class OutofBoundException {
    public static void main(String[] args) {
        int i,j,k=0;
        int a[]=new int[4];
        i=8;
        j=0;
        try{
            k=i/j;
            //when an error occur in try then it directly jump to catch statement
            //so below lines are not getting executed
            for(int c=0;c<5;c++){
                a[c]=c+1;
            }
            for(int value:a){
                System.out.println(value);
            }
        }
        catch(ArithmeticException e){
            System.out.println("can not divide by zero");
        }


    }
}
