
// Parent class
class Product {
    int productId;

    Product(int productId) {
        this.productId = productId;
    }

    void showDetails() {
        System.out.println("Product ID: " + productId);
    }
}

// Child class
class Electronics extends Product {
    int warranty; // in years

    Electronics(int productId, int warranty) {
        super(productId);  // calling parent constructor
        this.warranty = warranty;
    }

    @Override
    void showDetails() {
        super.showDetails(); // calling parent method
        System.out.println("Warranty: " + warranty + " years");
    }
}

// Main class to run
public class question2 {
    public static void main(String[] args) {
        Electronics e = new Electronics(101, 2);
        e.showDetails();
    }
}
