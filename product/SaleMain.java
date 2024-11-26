package product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SaleMain {

    public static void main(String[] args) {
        
        List<Sale> elist=new ArrayList<>();
        elist.add(new Sale(101, 5, 100));
        elist.add(new Sale(102, 20, 80));
        elist.add(new Sale(103, 10, 60));
        elist.add(new Sale(104, 30, 200));
        elist.add(new Sale(105, 40, 100));

        List<Sale> list1=
          elist.stream().filter(p->p.getQuantity()>10).collect(Collectors.toList());
          System.out.println("Product sale "+ list1);

        System.out.println("*******************");

        List<ProductSale> list2=
          elist.stream().map(sale-> new ProductSale(sale.getProductID(), sale.getQuantity()*sale.getPrice()))
          .collect(Collectors.toList());
          System.out.println("ProductID with revenue: "+list2);

        System.out.println("*******************");

        List<ProductSale> list3=
          elist.stream().map(sale-> new ProductSale(sale.getProductID(), sale.getQuantity()*sale.getPrice()))
          .sorted(Comparator.comparingDouble(ProductSale::getRevenue).reversed())
          .limit(5)
          .collect(Collectors.toList());
          System.out.println("sorted on the basis of revenue"+list3);

       
          
        
    }
    
}
