package bot

//import java.util.* //if we use java functions(scanner)


//val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Jarvis", "2022") // change it as you need
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}, by my master to help everyone.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = readln()
    println("What a great name you have,${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = readln().toInt()
    val rem5 = readln().toInt()
    val rem7 = readln().toInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = readln().toInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("Who developed Kotlin?")
    println("1. IBM")
    println("2. Google")
    println("3. JetBrains")
    println("4. Microsoft")
    while(true){
        val ans = readln().toInt()
        if(ans == 3){
            break
        }
        else {
            println("Please, try again.")
        }
    }
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}