package shape;
import java.util.Scanner;

public class TestArea
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        AreaDefined obj=new AreaDefined();

        while(true)
        {
            System.out.println("1.Square of Area");
            System.out.println("2.Triangle of Area");
            System.out.println("3.Circle of Area");
            System.out.println("4.Exit");

            System.out.println("Enter Your choice=");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter sides of square=");
                    Double a=sc.nextDouble();
                    System.out.println("Square of Area="+obj.square(a));
                    break;
                case 2:
                    System.out.println("Enter Base=");
                    Double base=sc.nextDouble();
                    System.out.println("Enter Height=");
                    Double height=sc.nextDouble();
                   System.out.println("Triangle of Area="+obj.triangle(base,height));
                    break;
                case 3:
                    System.out.println("Enter Radius=");
                    Double radius=sc.nextDouble();
                    System.out.println("Circle of Area="+obj.circle(radius));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input please try again !!");
            }
        }
    }
}