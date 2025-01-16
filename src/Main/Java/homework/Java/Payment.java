package Main.Java.homework.Java;

public class Payment {
    private String customerName;
    private double totalAmount;

    public Payment(String customerName) {
        this.customerName = customerName;
        this.totalAmount = 0;
    }

    public void addItem(String itemName, double price, int quantity) {
        Item item = new Item(itemName, price, quantity);
        totalAmount += item.getTotalPrice();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    private class Item {
        private String name;
        private double price;
        private int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double getTotalPrice() {
            return price * quantity;
        }
    }
}