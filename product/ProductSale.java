package product;

public class ProductSale {

    int productID;
    double revenue;

    ProductSale(int productID, double revenue){
        this.productID=productID;
        this.revenue=revenue;
    }
    
    public int getProductID(){
        return productID;
    }

    public double getRevenue(){
        return revenue;
    }

    public String toString(){
        return "ProductID: "+productID+" Revenue: "+revenue;
    }
}
