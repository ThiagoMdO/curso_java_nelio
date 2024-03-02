package secao20.util;

import secao20.model.intities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p){
        return p.getPrice() <= 100;
    }
}
