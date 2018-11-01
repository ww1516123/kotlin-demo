package com.cqmaple.kotlin.demo.test

fun demo1(){
    var a=1
    val s1="a is $a"
    val s2="relpace:${s1.replace("is","was")}"
    println(s1)
    println(s2)
}

fun maxOf(a:Int,b:Int)=if(a>b) a else b
fun describe(obj:Any):String= when(obj){
    1 -> "One"
    "hello"->"Greeting"
    is Long->"Long"
    !is String ->"Not a String"
    else ->"Unknown"
}
fun demo2(){
    println(maxOf(3,5))
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
    println(parseInt("123"))
    println(getStringLength("123123"))
}
fun parseInt(str:String)=str.toIntOrNull()

fun getStringLength(obj: Any)= (obj as? String)?.length

fun forDemo(){
    println("--------------for------------------")
    val items= listOf("apple","banana","kiwi")
    for (item in items){
        println(item)
    }
    for(index in items.indices){
        println("item at $index  is ${items[index]}")
    }
    var index=0
    while (index<items.size){
        println("item at $index  is ${items[index]}")
        index++
    }
}
fun demoIn(){
    val x=3
    val y=5
    if(x in 1..y+1){
        println("$x is in range")
    }
    if(0 !in 1..y+1){
        println("0 is not in range")
    }
    for (x in 1..3) {
        print(x)
    }
    println("***")
    for (x in 1..5 step 2) {
        println(x)
    }
    println("***")
    for (x in 5 downTo 1 step 2) {
        println(x)
    }
}
fun String.lastOne()= this.substring(this.length-1,this.length)

fun demo3(){
    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text)
}
fun main(args:Array<String>){
    demo1()
    demo2()
    forDemo()
    demoIn()
    println("test is my key".lastOne())
    demo3()
}
