fun main() {
    println("Olá mundo") // Comentário
    var nome: String
    nome = "Marcão"
    println(nome)

    // Solicitar ao usuário que insira o valor de numero1
    print("Digite o valor de numero1: ")
    var numero1 = readLine()?.toIntOrNull() ?: 0
    println(numero1)

    // Solicitar ao usuário que insira o valor de numero2
    print("Digite o valor de numero2: ")
    var numero2 = readLine()?.toIntOrNull() ?: 0
    println(numero2)

    var resultado: Int
    resultado = numero1 + numero2
    println(resultado)

    nome = "Marcos"
    println(nome)
    val nome2: String = "Ruan"

   

    println("A soma do n1 + n2 é: $resultado")
}

link: https://replit.com/@MarcosAndre35/kotlin3#main.kt
