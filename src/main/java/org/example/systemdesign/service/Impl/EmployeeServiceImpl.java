//package org.example.systemdesign.service.Impl;
//
//import org.example.systemdesign.model.Employee;
//import org.example.systemdesign.repository.EmployeeRepository;
//import org.example.systemdesign.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Override
//    public Mono<Employee> getEmployee(Long id) {
//        return employeeRepository.findById(id);
//    }
//
//    @Override
//    public Flux<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//}
