package com.cqmaple.kotlin.demo.common

import java.util.*
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass
import javax.persistence.Version

@MappedSuperclass
open abstract class BaseEntity{

    @Id
    @GeneratedValue
    val id: Long = -1
    @Version
    val version:Long = 0
    /**
     * 创建时间
     */
    val ceateTime: Date = Date()
    /**
     * 修改时间
     */
    var updateTime:Date? = null
}