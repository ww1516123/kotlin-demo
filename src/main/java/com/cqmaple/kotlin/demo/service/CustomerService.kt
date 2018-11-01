package com.cqmaple.kotlin.demo.service

import com.cqmaple.kotlin.demo.domain.Customer
import com.cqmaple.kotlin.demo.repository.CustomerRepository
import org.springframework.stereotype.Service
import java.util.*
import javax.transaction.Transactional

@Service
class CustomerService(private val customerRepostiory:CustomerRepository){

    fun findAll()=customerRepostiory.findAll()
    fun findByLastName(lastName:String)=customerRepostiory.findByLastName(lastName)
    fun save(customer: Customer)=customerRepostiory.save(customer)
    fun delete(id:Long)=customerRepostiory.delete(id)
    @Transactional
    fun update(customer: Customer): Customer? {
        var old=customerRepostiory.findOne(customer.id)
        old.updateTime= Date()
        old.lastName=customer.lastName
        old.firstName=customer.firstName
        return customerRepostiory.save(old)
    }
}