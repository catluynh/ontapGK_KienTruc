package cau1.departerment.controller;

import cau1.departerment.entity.Depaterment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cau1.departerment.service.DepatermentService;

import java.util.List;

@RestController
@RequestMapping("/depaterment")
public class DepatermentController {
    @Autowired
    private DepatermentService depatermentService;

    @GetMapping("")
    public List<Depaterment> findAll(){
        return depatermentService.findAll();
    }

    @GetMapping("{id}")
    public Depaterment findAll(@PathVariable int id){
        return depatermentService.findById(id);
    }

    @PostMapping("")
    public void saveDepaterment(@RequestBody Depaterment depaterment) {
        depatermentService.saveDepaterment(depaterment);
    }

    @PutMapping("")
    public void updateDepaterment(@RequestBody Depaterment depaterment) {
        depatermentService.saveDepaterment(depaterment);
    }

    @DeleteMapping("{id}")
    public void deleteDepaterment(@PathVariable int id) {
        depatermentService.deleteById(id);
    }
}
