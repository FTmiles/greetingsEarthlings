package com.example.demo.greetingAndMySQL.greetingAndMySQL;

import com.example.demo.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepo extends JpaRepository<Greeting, Integer>  {
}
