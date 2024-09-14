/*1 zadacha
Создать программу, выполняющую следующий функционал:
- запрашивается количество строк и столбцов для двумерного массива
- вводится необходимое количество трехзначных чисел (числа могут повторяться)
- подсчитывается количество различных цифр в полученном массиве
- на консоль выводится двумерный массив из введенных чисел и количество различных цифр используемых в данном массиве*/
fun main(args: Array<String>) {
    print("Введите количество строк: ")
    val string = readln().toInt()
    print("Введите количество столбцов: ")
    val logss = readln().toInt()

    val ArrayF: Array<Array<Int>> = Array(string){
        Array(logss){
            (100..999).random()
        }
    }
    var stringss:String =""
    for (i in 0 .. string-1) {
        for (j in 0..logss-1) {
            stringss += ArrayF[i][j].toString()
        }
    }

    for (i in 0 .. string-1) {
        println()
        for (j in 0..logss-1) {
            print(ArrayF[i][j].toString()+"\t")
        }
    }
    println()
    println("В массиве использовано ${stringss.toSet().size} различных цифр")
}
