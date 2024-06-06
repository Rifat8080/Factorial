import java.util.Scanner;

class Factorial1{
    public int n, fact=1;
    Factorial1(){
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        input.close();
    }

    void check(){
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
public class Factorial {
    public static void main(String[] args){
        Factorial1 obj = new Factorial1();
        obj.check();
    }
}
