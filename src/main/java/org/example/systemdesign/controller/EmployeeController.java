//package org.example.systemdesign.controller;
//
//import org.example.systemdesign.model.Employee;
//import org.example.systemdesign.repository.EmployeeRepository;
//import org.example.systemdesign.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//@RestController
//@RequestMapping("/employee/v1")
//public class EmployeeController {
//    @Autowired
//    private EmployeeService employeeService;
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//
//// Add your code here
////    @GetMapping("/getById/{id}")
////    public Mono<ResponseEntity<Employee>> getEmployee(@PathVariable Long id) {
////        return employeeService.getEmployee(id)
////                .map(employee -> ResponseEntity.ok(employee))
////                .defaultIfEmpty(ResponseEntity.notFound().build());
////    }
//
////
////    @GetMapping("/getAll")
////    public Flux<Employee> getAllEmployees() {
////        return employeeRepository.findAll();
////    }
//
//
//}
