package interfaces.innerclass;

public class Main {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
//        GearBox.Gear first = mcLaren.new Gear(2,3.4); // Gear is private , so we cannot just access it ;
        mcLaren.addGear(1,5.3);
        mcLaren.addGear(2,10.6);
        mcLaren.addGear(3,15.9);
        mcLaren.opereateClutch(true);
    }
}
