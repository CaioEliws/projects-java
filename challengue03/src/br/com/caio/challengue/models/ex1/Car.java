package br.com.caio.challengue.models.ex1;

public class Car extends ModelCar{
    private double totalPrice;
    private double lowestPrice;
    private double highestPrice;
    private boolean firstPrice = true;

    public void setPrice(double price) {
        totalPrice += price;

        if (firstPrice) {
            lowestPrice = price;
            highestPrice = price;
            firstPrice = false;
        } else {
            if (price < lowestPrice) {
                lowestPrice = price;
            }
            if (price > highestPrice) {
                highestPrice = price;
            }
        }
    }

    public double averagePrice() {
        return totalPrice / 3;
    }

    public String getHighAndLowerPrice() {
        return "Menor preço: " + lowestPrice +
                " | Maior preço: " + highestPrice;
    }
}