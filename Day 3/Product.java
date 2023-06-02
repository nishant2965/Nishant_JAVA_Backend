public class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Product product = new Product(9.99);
        System.out.println("Price for single quantity: $" + product.getPrice());

        int quantity = 5;
        double totalPrice = product.getPrice(quantity);
        System.out.println("Total price for " + quantity + " quantities: $" + totalPrice);
    }
}