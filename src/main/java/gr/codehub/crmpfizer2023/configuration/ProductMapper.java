package gr.codehub.crmpfizer2023.configuration;

import gr.codehub.crmpfizer2023.dto.ProductDto;
import gr.codehub.crmpfizer2023.model.Employee;
import gr.codehub.crmpfizer2023.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ProductMapper {

    ProductDto asProductDto(Product entity);


    Product asProduct(ProductDto dto);

}
