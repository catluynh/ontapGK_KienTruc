package cau1.departerment.service;

import cau1.departerment.entity.Depaterment;

import java.util.List;

public interface DepatermentService {
    public List<Depaterment> findAll();
    public void saveDepaterment(Depaterment depaterment);
    public Depaterment findById(int id);
    public void deleteById(int id);
}
