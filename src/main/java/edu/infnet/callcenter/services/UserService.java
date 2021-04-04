package edu.infnet.callcenter.services;

import edu.infnet.callcenter.repository.UserRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.infnet.callcenter.dto.UserDTO;

@Service
public class UserService {
    
    @Autowired
    public UserRepository userRepository;

    public List<UserDTO> getAll() {
        return (List<UserDTO>) userRepository.findAll();
    }

    public UserDTO save(UserDTO user) {
        return userRepository.save(user);
    }

    public UserDTO update(UserDTO user, Long id) {
        user.setId(id);
        return userRepository.save(user);
    }

    public Optional<UserDTO> getById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<UserDTO> deleteById(Long id) {
        Optional<UserDTO> user = userRepository.findById(id);
        userRepository.deleteById(id);

        return user;
    }

    public Boolean exists(Long id) {
        return userRepository.existsById(id);
    }
}
