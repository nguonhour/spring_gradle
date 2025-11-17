package test.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface product extends JpaRepository<product, Integer> {

}