package shoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String names;
    private double price;

    public Product(String name, double price) {
        this.names = name;
        this.price = price;
    }

    public String getName() {
        return names;
    }

    public double getPrice() {
        return price;
    }
}

class Cart {
    private List<Product> items;
    public Cart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product)
    {
        items.add(product);
    }

    public void seeCart() {
        if (items.isEmpty()) {
            System.out.println("Your Cart is empty.");
        } else {
            for (Product product : items) {
                System.out.println(product.getName() + ": ₹" + product.getPrice());
            }
        }
    }

    public double calculateTotalExp() {
        double total = 0;
        for(Product product : items) {
            total += product.getPrice();
        }
        return total;
    }

    public void clearCart() {
        items.clear();
        System.out.println("Your cart has been cleared!");
    }

    public void placeOrder() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty. Please add some items to proceed further for checkout...");
        } else {
            System.out.println("Your order for the following items has been placed successfully...");
            for (Product product : items) {
                System.out.println(product.getName() + ": ₹" + product.getPrice());
            }
            System.out.println("Thank you for shooping with us!");
            clearCart();
        }
    }
}


public class shoppingcart {

    public static void showMenu() {
        System.out.println("\n*****Welcome to Cart Manager*****");
        System.out.println("1. Add items to your cart");
        System.out.println("2. View cart");
        System.out.println("3. Calculate total");
        System.out.println("4. Clear cart");
        System.out.println("5. Place order");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cart cart = new Cart();

        Product apple = new Product("Apple", 65);
        Product banana = new Product("Banana", 35);
        Product orange = new Product("Orange", 45);

        while (true) {
            showMenu();
            int newChoice = scan.nextInt();
            scan.nextLine();

            switch (newChoice) {
                case 1:
                    System.out.println("Enter product name (Apple, Banana, Orange): ");
                    String name = scan.nextLine();
                    Product product = null;
                    if (name.equalsIgnoreCase("Apple")) {
                        product = apple;
                    } else if (name.equalsIgnoreCase("Banana")) {
                        product = banana;
                    } else if (name.equalsIgnoreCase("Orange")) {
                        product = orange;
                    } if (product != null) {
                        cart.addProduct(product);

                    System.out.println(product.getName() + " added to cart.");
                    } else {
                        System.out.println("Invalid product.");
                    }
                    break;

                case 2:
                cart.seeCart();
                break;

                case 3:
                double total = cart.calculateTotalExp();
                System.out.println("Total Price: ₹" + total);
                break;

                case 4:
                cart.clearCart();
                break;

                case 5:
                cart.placeOrder();
                break;

                case 6:
                System.out.println("Exiting...");
                scan.close();
                return;
            
                default:
                System.out.println("Invalid choice");
                    break;
            }

        }
    }
}