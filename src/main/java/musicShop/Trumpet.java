package musicShop;

import behaviours.IPlay;
import behaviours.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {
    private String trumpet;
    private int noOfValves;
    private int boughtPrice;
    private int sellPrice;

    public Trumpet(String colour, String trumpet, int noOfValves, int boughtPrice, int sellPrice) {
        super(colour, "Valve");
        this.trumpet = trumpet;
        this.noOfValves = noOfValves;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getTrumpet() {
        return trumpet;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public int getBoughtPrice() {
        return boughtPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public String play() {
        return "Peee Pooo";
    }
}
