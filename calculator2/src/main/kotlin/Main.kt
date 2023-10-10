import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Введите первое число: ")
    val num1 = reader.nextDouble()

    print("Введите второе число: ")
    val num2 = reader.nextDouble()

    println("Выберите действие:")
    println("1. Сложение")
    println("2. Вычитание")
    println("3. Умножение")
    println("4. Деление")

    val choice = reader.nextInt()

    when (choice) {
        1 -> println("Результат: ${num1 + num2}")
        2 -> println("Результат: ${num1 - num2}")
        3 -> println("Результат: ${num1 * num2}")
        4 -> println("Результат: ${num1 / num2}")
        else -> println("Неверный выбор")
    }
}