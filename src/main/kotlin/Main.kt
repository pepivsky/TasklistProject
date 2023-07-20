/*
stage 1
https://hyperskill.org/projects/237/stages/1188/implement
 */


val tasks = mutableListOf<String>()
fun main() {
    // write your code here

    var input: String

    println("Input the tasks (enter a blank line to end):")
    do {
        input = readln()
        if (tasks.isEmpty() && input.isBlank()) {
            println("No tasks have been input")
            return
        }
        tasks.add(input.trim())
    } while (input.isNotBlank())

    if (tasks.isNotEmpty()) {
        printList()
    }
}

fun printList() {
    tasks.forEachIndexed { index, task ->
        if (index <= 8) {
            println("${index + 1}  $task")
        } else {
            println("${index + 1} $task")
        }

    }
}
