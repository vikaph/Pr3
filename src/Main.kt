fun main() {
    println("Введите натуральное число:")
    val input = readLine()

    // Проверка на корректный ввод
    val number = input?.toIntOrNull()

    if (number != null && number > 0) {
        // Преобразование в двоичную систему
        val binaryString = number.toString(2)
        println("Двоичное представление числа $number: $binaryString")
    } else {
        println("Пожалуйста, введите корректное натуральное число.")
    }
}