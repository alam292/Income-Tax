import java.util.*;

public class income_tax {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float tax;
        System.out.print("Enter your income : ");
        float income = sc.nextFloat();
        if(income<=500000){
            tax = 0;
        }
        else if (income>=500000 && income<1000000){
            tax = (float)(income*0.2);
        }
        else{
            tax = (float)(income*0.3);
        }
        System.out.println("Your Income tax " +tax);
    }
}
