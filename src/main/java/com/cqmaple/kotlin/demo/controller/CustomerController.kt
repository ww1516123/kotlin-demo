package com.cqmaple.kotlin.demo.controller

import com.cqmaple.kotlin.demo.domain.Customer
import com.cqmaple.kotlin.demo.repository.CustomerRepository
import com.cqmaple.kotlin.demo.service.CustomerService
import org.springframework.web.bind.annotation.*

@RestController
class CustomerController(private val customerService: CustomerService){

    @GetMapping("/customers")
    fun findAll()=customerService.findAll()

    @GetMapping("/customers/{lastName}")
    fun findByLastName(@PathVariable lastName:String)=customerService.findByLastName(lastName)

    @PostMapping("/customers")
    fun addCustomer(@RequestBody customer: Customer)=customerService.save(customer)

    @DeleteMapping("/customers/{id}")
    fun delete(@PathVariable id:Long):String{
        customerService.delete(id)
        return "删除成功"
    }
    @PutMapping("/customers")
    fun delete(@RequestBody customer: Customer)= customerService.update(customer)

}