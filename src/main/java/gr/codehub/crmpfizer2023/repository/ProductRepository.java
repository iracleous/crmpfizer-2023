package gr.codehub.crmpfizer2023.repository;

import gr.codehub.crmpfizer2023.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements CrmRepository<Product, Integer>{
    private List<Product> products = new ArrayList<>();
    private int index;

    @Override
    public Product create(Product product) {
        products.add(product);
        product.setCode(++index);
        return product;
    }

    @Override
    public List<Product> readAll() {
        return products;
    }

    @Override
    public Product readByKey(Integer integer) {
        return products
                .stream()
                .filter(pr -> pr.getCode()==integer)
                .findFirst()
                .get();
    }


    // not implemented
    @Override
    public Product update(Product product, Integer key) {
        return null;
    }

    @Override
    public boolean delete(Integer key) {
        try {
            Product product = readByKey(key);
            products.remove(product);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    //CRUD
}
