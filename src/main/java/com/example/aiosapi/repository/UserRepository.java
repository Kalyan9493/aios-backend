package com.example.aiosapi.repository;

import com.example.aiosapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Override
    User saveAndFlush(User user);
}
