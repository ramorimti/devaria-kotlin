fun main(argumentos : Array<String>) {

    // for subindo
    for(indice in 0..argumentos.indices){
        println("Percorrendo os argumentos posição: $indice e valor ${argumentos[indice]}")


    }
    // for descendo
    for(indice in 0..argumentos.size-1 downto 0){
        println("Percorrendo os argumentos de forma decrescente posição: $indiceDecrescente " +
                "e valor: ${argumentos[indiceDescrescnete]}")

    //for each
        for(argumento in argumentos){
            println("Percorremos os argumentos com foreach valor: $argumento")
        }

    //while
        var contadorArgumentosLidos = 0
        while (contadorArgumentosLidos < argumentos.size){
            println("Percorrendo os argumentos com while argumentos lidos: ${contadorArgumentosLidos++} " +
            "valor lido: ${argumentos[contadorArgumentosLidos-1]}")

        }

    //do while
        var contadorArgumentosLidos = 0
        do{
        while (contadorArgumentosLidos < argumentos.size) {
            println("Percorrendo os argumentos com while, total loops: $contadorLoopsEfetuados " +
                    "e valor lido: ${argumentos[contadorLoopsEfetuados}")
            contadorLoopsEfetuados++
        }while (contadorLoopsEfetuados < argumentos.size)

}