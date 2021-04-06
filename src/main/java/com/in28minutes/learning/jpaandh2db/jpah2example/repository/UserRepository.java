package com.in28minutes.learning.jpaandh2db.jpah2example.repository;

import com.in28minutes.learning.jpaandh2db.jpah2example.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
