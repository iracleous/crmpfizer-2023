package gr.codehub.crmpfizer2023.service;

import gr.codehub.crmpfizer2023.model.Product;

import java.util.List;

public interface CrmServices {
      Product getProduct(int k);

      Product createProduct(String productName);


      List<Product> getProducts();
      String ping();
 }
