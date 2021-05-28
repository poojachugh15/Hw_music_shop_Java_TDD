package musicShop;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private String guitar;
    private int noOfStrings;
    private int boughtPrice;
    private int sellPrice;

    public Guitar(String colour, String guitar, int noOfStrings, int boughtPrice, int sellPrice) {
        super(colour, "String");
        this.guitar = guitar;
        this.noOfStrings = noOfStrings;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }


    public String play() {
        return "Sa Re Ga Ma";
    }

    public String getGuitar() {
        return guitar;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public int getBoughtPrice() {
        return boughtPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }


    public int calculateMarkup() {
        return this.sellPrice- this.boughtPrice;
    }
}
