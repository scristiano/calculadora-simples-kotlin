import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    println("*** CALCULADORA EM KOTLIN ***")
        
    println("Digite um número: ")
    val valorUm = reader.nextDouble()
    
    println("Digite outro número: ")
    val valorDois = reader.nextDouble()

    print("Escolha o operador (+, -, *, /): ")
    val operador = reader.next()[0]

    val resultado: Double

    when (operador) {
        '+' -> resultado = valorUm + valorDois
        '-' -> resultado = valorUm - valorDois
        '*' -> resultado = valorUm * valorDois
        '/' -> resultado = valorUm / valorDois
        // operador não corresponde a nenhuma constante de maiúsculas e minúsculas (+, -, *, /)
        else -> {
            System.out.printf("Erro! Operador incorreto")
            return
        }
    }

    System.out.printf("%.1f %c %.1f = %.1f"+"\n", valorUm, operador, valorDois, resultado)
}
