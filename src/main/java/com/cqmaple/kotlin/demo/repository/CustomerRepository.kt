package com.cqmaple.kotlin.demo.repository

import com.cqmaple.kotlin.demo.domain.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer,Long>{
    fun findByLastName(lastName:String):Iterable<Customer>
}