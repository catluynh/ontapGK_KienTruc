package cau1.departerment.repository;

import cau1.departerment.entity.Depaterment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepatermentRepository extends JpaRepository<Depaterment, Integer> {
}
