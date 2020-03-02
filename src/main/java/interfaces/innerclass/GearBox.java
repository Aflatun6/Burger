package interfaces.innerclass;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public GearBox(int macGears) {
        this.maxGears = macGears;
        this.gears = new ArrayList<>();
        Gear neural = new Gear(1, 6.4);
        this.gears.add(neural);
    }

    public void opereateClutch(boolean in){
        this.clutchIsIn = in;
    }
    public void addGear(int number , double ratio){
        if(number>=0&& number<6){
            gears.add(new Gear(number,ratio));
        }
    }
    public void changeGear(int newGear){
        if(newGear>0&& newGear<gears.size() && clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear "+newGear+" was selected");
        }
        else{
            System.out.println("Grind!");
            this.currentGear= 0;
        }
    }
    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Screem!");
            return 0.0;
        }
        return revs* (gears.get(currentGear).getRatio());
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        public double getRatio(){
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (ratio);
        }
    }

}
