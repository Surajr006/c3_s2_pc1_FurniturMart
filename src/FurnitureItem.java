public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    int gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;
    FurnitureItem(){
        furnitureCode=0;
        furnitureType="";
        gradeOfFurniture=0;
        color="";
        furnitureUsage="";
    }
    double calcDiscount()
    {
        return 0.05*price;
    }
}
