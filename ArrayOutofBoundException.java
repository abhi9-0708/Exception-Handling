public class ArrayOutofBoundException {
    public static void main(String[] args) {
        int i,j,k=0;
        int a[]=new int[4];
        i=8;
        j=2;
        try{
            k=i/j;
            
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
        //note multiple catch in  single try
        catch(Exception e){
            System.out.println("maximum no of index value is 4");
        }

    }
}
