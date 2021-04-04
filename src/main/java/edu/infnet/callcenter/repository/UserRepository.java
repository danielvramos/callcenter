package edu.infnet.callcenter.repository;

import edu.infnet.callcenter.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDTO, Long> {
    
}
