package Model;

public class Tomato implements Vegetable {
    private final double weight_in_kg, price;

    Tomato(double weight_in_kg, double price) {
        this.weight_in_kg = weight_in_kg;
        this.price = price;
    }

    public double get_weight() {
        return this.weight_in_kg;
    }

    public double get_price() {
        return this.price;
    }

    public boolean is_heavy() {
        return this.weight_in_kg > 0.2;
    }
}
