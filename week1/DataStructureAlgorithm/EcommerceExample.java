package week1.DataStructureAlgorithm;

class Product {
    int ProductId;
    String productName;
    String Category;

    Product(int ProductId, String productName, String Category) {
        this.ProductId = ProductId;
        this.productName = productName;
        this.Category = Category;
    }

    void display() {
        System.out.println("ID: " + ProductId);
        System.out.println("Name: " + productName);
        System.out.println("Category: " + Category);
    }

    public static int linearSearch(Product[] products, int ProductId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].ProductId == ProductId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, int ProductId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].ProductId == ProductId) {
                return mid;
            } else if (products[mid].ProductId < ProductId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

public class EcommerceExample {

    public static void main(String[] args) {

        Product[] products = new Product[5];

        products[0] = new Product(1, "Laptop", "Electronics");
        products[1] = new Product(2, "TShirt", "Clothing");
        products[2] = new Product(3, "FancyStory books", "Books");
        products[3] = new Product(4, "Mobiles", "Electronics");
        products[4] = new Product(5, "Shoes", "Footwear");

        int ProductId = 3;

        int index = Product.linearSearch(products, ProductId);
        if (index != -1) {
            System.out.println("Linear Search - Product found at index: " + index);
            products[index].display();
        } else {
            System.out.println("Product not found.");
        }

        index = Product.binarySearch(products, ProductId);
        if (index != -1) {
            System.out.println("Binary Search - Product found at index: " + index);
            products[index].display();
        } else {
            System.out.println("Product not found.");
        }
    }
}