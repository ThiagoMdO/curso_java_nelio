package secao20.util;

import secao20.model.intities.Product;

import java.util.function.Function;

public class UperCaseNameProductFunction implements Function<Product, String> {

    @Override
    public String apply(Product p){
        return p.getName().toUpperCase();
    }
}
