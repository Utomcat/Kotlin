package com.ranyk.www.basic.grammar

/**
 * CLASS_NAME: Function<br/>
 * Description: 基本语法 -- 函数<br/>
 *
 * @author ranYk <br/>
 * @version 1.0
 */


/**
 * 声明一个求两个 Int 类型数据,且带返回值类型的求和的方法
 *
 * @param a Int 类型参数 a
 * @param b Int 类型参数 b
 * @return 返回 Int 类型值
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}


/**
 * 声明一个求两个 Int 类型数据,且带返回值类型通过自动推断得出,将表达式作为函数体的方法
 *
 * @param a Int 类型参数 a
 * @param b Int 类型参数 b
 * @return 返回值类型通过自动推断得出
 */
fun sum1(a: Int, b: Int) = a + b


/**
 * 声明返回值为无意义类型的两个 Int 类型数据求和方法
 *
 * @param a Int 类型参数 a
 * @param b Int 类型参数 b
 * @return 返回无意义类型 Unit
 */
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}


/**
 * 声明返回值为无意义类型的两个 Int 类型数据求和方法
 *
 * @param a Int 类型参数 a
 * @param b Int 类型参数 b
 * @return 返回无意义类型 Unit
 */
fun printSum1(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}


fun main() {
    println("sum of 3 and 5 is " + sum(3, 5))
    println("sum of 19 and 23 is ${sum1(19, 23)}")
    printSum(-1, 8)
    printSum1(-1, 8)
}