fun main() {
    val secretPassword = "котлин2024"

    var userPassword: String

    do {
        print("Введите пароль: ")
        userPassword = readln()

        if (userPassword != secretPassword) {
            println("Неверный пароль! Попробуйте снова.")
        }

    } while (userPassword != secretPassword)

    println("Доступ разрешен!")
}