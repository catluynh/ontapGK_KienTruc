package cau1.departerment.service;

import cau1.departerment.entity.Depaterment;
import cau1.departerment.repository.DepatermentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepatermentServiceImpl implements  DepatermentService{
    @Autowired
    private DepatermentRepository depatermentRepository;

    @Override
    public List<Depaterment> findAll() {
        return depatermentRepository.findAll();
    }

    @Override
    public void saveDepaterment(Depaterment depaterment) {
        depatermentRepository.save(depaterment);
    }

    @Override
    public Depaterment findById(int id) {
        Optional<Depaterment> rs= depatermentRepository.findById(id);
        Depaterment depaterment = null;
        if(rs.isPresent()) {
            depaterment = rs.get();
        }
        return depaterment;
    }

    @Override
    public void deleteById(int id) {
        depatermentRepository.deleteById(id);
    }
}
