

public class Book {
    private String title;
    private int numOfPages;
    private double price;
    private int quantity;

    public Book(String thetitle, int pages, double cost, int num){
        title = thetitle;
        numOfPages = pages;
        price = cost;
        quantity = num;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    @Override
    public String toString(){
        String stringTitle = title;
        String stringNumOfPages = Integer.toString(numOfPages);
        String stringPrice = Double.toString(price);
        String stringQuantity = Integer.toString(quantity);
        return "Title: " + stringTitle + "\nNum of Pages: " + stringNumOfPages + "\nPrice: $" + stringPrice + "\nQuantity: " + stringQuantity;
    }

    public void subtractQuantity(int amount){
        quantity = quantity - amount;
    }

    public void addQuantity(int amount){
        quantity = quantity + amount;
    }
}
