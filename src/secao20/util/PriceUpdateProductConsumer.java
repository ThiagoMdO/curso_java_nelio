package secao20.util;

import secao20.model.intities.Product;

import java.util.function.Consumer;

public class PriceUpdateProductConsumer implements Consumer<Product> {

    @Override
    public void accept(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }
}
