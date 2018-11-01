package com.cqmaple.kotlin.demo.domain

import com.cqmaple.kotlin.demo.common.BaseEntity
import javax.persistence.Entity

@Entity
data class Customer(
        var firstName: String,
        var lastName: String):BaseEntity()