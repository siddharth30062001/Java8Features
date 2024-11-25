package product;

public class Sale {

    int productID;
    int quantity;
    double price;

    Sale(int productID,int quantity,double price){
        this.productID=productID;
        this.quantity=quantity;
        this.price=price;
    }

    public int getProductID(){
        return productID;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return "ProductID: "+productID+" Quantity: "+quantity+" Price: "+price;
    }


    
}
