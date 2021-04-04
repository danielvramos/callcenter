package edu.infnet.callcenter.repository;
import org.springframework.data.repository.CrudRepository;

import edu.infnet.callcenter.dto.ProductDTO;

public interface ProductRepository extends CrudRepository<ProductDTO,Long> {

}
