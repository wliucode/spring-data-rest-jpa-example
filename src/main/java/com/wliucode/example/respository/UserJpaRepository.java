package com.wliucode.example.respository;

import com.wliucode.example.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component

public interface UserJpaRepository extends JpaRepository<Users, Long> {

    Users findByName(String Name);
}
