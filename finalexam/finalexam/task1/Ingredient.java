package finalexam.task1;

public class Ingredient {
    private String name;
    private double quantity;
    private String unit;

    public Ingredient(String name, double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Ingredient flour = new Ingredient("Flour", 500, "grams");
        Ingredient sugar = new Ingredient("Sugar", 200, "grams");
        Ingredient butter = new Ingredient("Butter", 250, "grams");

        System.out.println(flour);
        System.out.println(sugar);
        System.out.println(butter);

        // Modify some values
        flour.setQuantity(550);
        sugar.setUnit("cups");

        System.out.println("\nUpdated Ingredients:");
        System.out.println(flour);
        System.out.println(sugar);
    }
}
