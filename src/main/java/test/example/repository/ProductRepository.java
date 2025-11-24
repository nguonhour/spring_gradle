package test.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.example.models.product;

@Repository
public interface ProductRepository extends JpaRepository<product, Integer> {


}