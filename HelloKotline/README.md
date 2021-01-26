# Kotlin 基本语法

[TOC]

> `Kotlin` 的官方指南, [参考链接 Kotlin语言中文站](https://www.kotlincn.net/docs/reference/basic-syntax.html)

## 一、包的定义与导入
> `Kotlin` 的官方指南,[参考链接 Kotlin语言中文站-包与导入](https://www.kotlincn.net/docs/reference/packages.html)
> 在 `Kotlin` 中的包定义和引入和 `Java` 类似,区别在于 `Kotlin` 中可以不用分号结尾,而 `Java` 中必须用分号结尾

```kotlin
// 包定义
package com.ranyk.www

//包的引入
import com.ranyk.www.hello.*


class A {

}
```

- 示例参见 `ImportPackage.kt`

## 二、程序入口点

> `Kotlin` 同 `Java` 类似,程序的入口点是 `main()` 函数
- 示例参见 `Entrance.kt`

## 三、函数
> `Kotlin` 的官方指南,[参考链接 Kotlin语言中文站-函数](https://www.kotlincn.net/docs/reference/functions.html)
> 在 `Kotlin` 中函数的基本定义格式如下:

```kotlin
class A {
    fun functionName(parameter1: type, parameter2: type, ...): returnType {
        //To do Something
    }
}
```

### 1）、常规函数定义

> 定义一个: 入参为两个 `Int` 类型,返回 `Int` 类型的函数

```kotlin
class A {
    fun sum(a: Int, b: Int) Int
    {
        return a + b
    }
}

fun main() {
    print("sum of 3 and 5 is ")
    println(sum(3, 5)
}
```

- 执行结果:

> sum of 3 and 5 is 8

### 2）、将表达式作为函数体,函数的返回值类型由自动推断得出

> 定义一个: 入参为两个 `Int` 类型,返回 `Int` 类型的函数

```kotlin
class A {
    fun sum(a: Int, b: Int) = a + b
}

fun main() {
    println("sum of 19 and 23 is ${sum(19, 23)}")
}
```

- 执行结果:

> sum of 19 and 23 is 42

### 3）、定义一个无意义的返回类型的函数

> 定义一个: 入参为两个 `Int` 类型,返回 `Int` 类型的函数

```kotlin
class A {
    fun sum(a: Int, b: Int) Unit
    {
        println("sum of $a and $b is ${a + b}")
    }
}

fun main() {
    sum(-1, 8)
}
```

- 执行结果:

> sum of -1 and 8 is 7

> 其中类型 `Unit` 可以忽略不写,即上述 `sum` 方法可以改写为如下格式:

```kotlin
fun sum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}
```

- 执行结果:

> sum of -1 and 8 is 7

- 示例参见: `Function.kt`

## 四、变量
> `Kotlin` 的官方指南, [参考链接 Kotlin语言中文站-属性与字段](https://www.kotlincn.net/docs/reference/properties.html) <br/>
> 定义变量使用关键字 `val` 和 `var` ,其中两个的差异如下:
> - `val` : 声明的变量只能被赋值一次,如常量...
> - `var` : 声明的变量能被重新赋值,如全局变量...

### 1）、`val` 变量的声明和赋值

```kotlin
val a: Int = 1 //声明 Int 类型变量,且立即赋值,之后对变量 a 只能使用,不能修改或再次赋值
val b = 2 //声明变量 b ,且立即赋值,其数据类型由自动推断得来 Int 类型
val c: Int //声明变量 c,不立即赋值,故此处不能省略数据类型 
c = 3 // 对变量进行赋值
```

### 2）、`var` 变量的声明和赋值

```kotlin
var x = 5 // 自动推断出 `Int` 类型
x += 1
```

## 五、注释
> `Kotlin` 的官方指南, [参考链接 Kotlin语言中文站-编写 Kotlin 代码文档](https://www.kotlincn.net/docs/reference/kotlin-doc.html)

- 同 `Java` 一样,有单行注释、多行注释、文档注释.. 
    - 单行注释: `// 这是一个单行注释`
    - 多行注释: `/* 这是一个多行注释*/`
    - 注释嵌套: 
```kotlin
/* 这是多行注释
/*嵌套注释*/
。。。
*/
```
      


## 六、字符串模板
