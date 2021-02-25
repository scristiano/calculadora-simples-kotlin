# Calculadora simples em Kotlin

Dado dois valores, o algorítimo executa as operações de soma, subtração, multiplicação e divisão e imprime o resultado no terminal.

## Pré-Requisitos

### Instalação do Kotlin

Uma maneira mais fácil de instalar o Kotlin em sistemas baseados em UNIX, como OS X, Linux, Cygwin, FreeBSD e Solaris, é através da ferramenta SDKMAN !. Ele também funciona em shells Bash e ZSH.

Para instalar o SDKMAN !, execute o seguinte comando em um terminal e siga as instruções:

```sh
curl -s https://get.sdkman.io | bash
```

Lista as versões de Kotlin disponíveis para instalação

```sh
sdk list kotlin
```

Instala a versão selecionada

```sh
sdk install kotlin 1.4.21
```

## Compilando e executando o algorítimo

Comando para compilação

```sh
kotlinc calculadora.kt -include-runtime -d calculadora.jar
```

Comando para execução

```sh
java -jar calculadora.jar
```

**Demais Referências:**

[Página Oficial Kotlin](https://kotlinlang.org/)

[Página Oficial SDKMAN](https://sdkman.io/)

[Tutorial Instalação SDKMAN](https://www.youtube.com/watch?v=7oh5e1wx5J0)
