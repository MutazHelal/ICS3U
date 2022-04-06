package carpet;

/*
 *Created by M.Helal
 *On September 30
 *to find the cost of a carpet with specified dimensions and price per square meter
 */
public class Carpet {

    public static void main(String[] args) {
        double RoomSide1, PricePerSqm, TotalCost;
        int RoomSide2;
        RoomSide1 = 8.5;
        RoomSide2 = 6;
        PricePerSqm = 19.95;
        TotalCost = (RoomSide1 * RoomSide2) * (PricePerSqm); //Finding area of the room then multiplying by price per square meter
        System.out.println("The total cost to carpet the room is: $" + TotalCost);
    }

}
