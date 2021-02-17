package com.oauth.oauthjdbc.repository;

import com.oauth.oauthjdbc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
