import java.lang.NullPointerException

fun main(args: Array<String>){
    println("CALCULATOR")
    println("enter 2 integer values")
    try{
        print("value 1: ")
        var str1:String? = readLine()
        var num1:Int = str1!!.toInt()

        print("value 2: ")
        var str2:String? = readLine()
        var num2:Int = str2!!.toInt()

        var str3:String? = ""
        do {
            print("Please select an operator (+,-,*,/): ")
            str3 = readLine()
        } while(str3 != "+" && str3 != "-" && str3 != "*" && str3 != "/")

        var result:Double = when(str3){
            "+" -> (num1+num2).toDouble()
            "-" -> (num1-num2).toDouble()
            "*" -> (num1*num2).toDouble()
            "/" -> (num1/num2).toDouble()
            else -> 0.0
        }

        println("$result")
    }catch(e:NullPointerException) {
        println("Null Exception: ${e.message}")
    }catch(e:Exception){
        println("Exception: ${e.message}")
    }


}

