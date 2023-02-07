package gr.codehub.crmpfizer2023.repository;

import gr.codehub.crmpfizer2023.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository implements CrmRepository<Product, Integer>{
    private List<Product> products;

    @Override
    public Product create(Product product) {
        return null;
    }

    @Override
    public List<Product> readAll() {
        return null;
    }

    @Override
    public Product readByKey(Integer integer) {
        return null;
    }

    @Override
    public Product update(Product product, Integer key) {
        return null;
    }

    @Override
    public boolean delete(Integer key) {
        return false;
    }

    //CRUD
}
