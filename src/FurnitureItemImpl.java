import java.util.Scanner;

public class FurnitureItemImpl {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        FurnitureItem fItem= new FurnitureItem();
        //fItem.price=20;

        //System.out.println("amount = " + amount);
        //Getting user input
        System.out.println("Enter furniture type:Chair,Tables,Cupboards or Stools");
        fItem.furnitureType=sc.nextLine();
        System.out.println("Enter furniture grade:Grade 1,2 or 3");
        fItem.gradeOfFurniture= sc.nextInt();
        System.out.println("Enter furniture usage indoor or outdoor");
        fItem.furnitureUsage= sc.next();
        System.out.println("Enter Price");
        fItem.price= sc.nextInt();
        double amount=fItem.calcDiscount();
        //Display Details
        System.out.println("Furniture type = " + fItem.furnitureType);
        System.out.println("Furniture grade = " + fItem.gradeOfFurniture);
        System.out.println("Furniture usage = " + fItem.furnitureUsage);
        System.out.println("Price = " + amount);

    }
}
