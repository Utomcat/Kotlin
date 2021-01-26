package com.ranyk.www.hello

/**
 * CLASS_NAME: HelloWorld
 * Description: Kotlin HelloWorld
 *
 * @author ranYk
 * @since 1.0
 */
class HelloWorld {

    /**
     * name属性的定义
     */
    private var name: String = ""

    fun  helloWorld(){
        this.name  = "张三"
    }

    fun helloWorld(name:String){
        this.name = name
    }


    /**
     * 获取name属性值
     *
     * @return 返回对象的name属性值
     */
    fun getName():String {
        return this.name
    }


    /**
     * 设置name属性值
     */
    fun setName(name:String){
        this.name = name
    }
}

fun main(args: Array<String>) {
    println("Hello World")
}