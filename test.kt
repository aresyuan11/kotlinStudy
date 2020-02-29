package com.igeek

import java.lang.Exception

class Person(val name:String,val age:Int)

public fun main(args:Array<String>){
    val p1 = Person("Tony",18)

    println(p1.name);
    println(p1.age)

//    p1 = Person("Jack",22)
//
//    println(p1.name);
//    println(p1.age)

    var a1:Int = 20;
    var a2 = 30;

    var englishScore = 95
    var chineseScore = 98
    //if控制结构表达式
    var res = if (englishScore < 60) "不及格" else "及格"
    println(res)

    fun sum(a:Int,b:Int):Int = a+b //表达式函数体

    var totalScore = sum(englishScore,chineseScore)
    println(totalScore)





    //try表达式
    var score = try {
        //
    }catch (e:Exception){
        return;
    }

}
