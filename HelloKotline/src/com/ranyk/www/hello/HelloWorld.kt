package com.ranyk.www.hello

/**
 * CLASS_NAME: HelloWorld<br/>
 * Description: Kotlin HelloWorld<br/>
 *
 * @author ranYk <br/>
 * @version 1.0
 */
class HelloWorld {

    private val name: String ="张三"


    fun getName():String {
        return this.name
    }



}

fun main(args: Array<String>) {
    println("Hello World")
}