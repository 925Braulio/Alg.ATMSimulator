class ATM (var  saldoInicial: Int ){
        fun saldoDaConta(){
            println("O saldo da sua conta e: ${saldoInicial}")
        }
        fun depositar(){
            println("Valor a ser depositado e:")
            var deposito = readLine()?.toInt()
            if(deposito!! < 1){
                println("Valor a ser depositado nao pode ser negativo!")
            }
            saldoInicial = saldoInicial + deposito!!
            println("Valor depositado com sucesso!!")
        }
    fun levantar(){
        println("Valor a ser levantado: ")
        var valor = readLine()?.toInt()
        if(valor!! > saldoInicial){
            println("O valor a ser levantado e maior do que o seu saldo!")
            return
        }
        saldoInicial -= valor!!
        println("Levantamento feito com sucesso!!")
    }
    fun transferencia(){
        println("Insira o numero de conta:")
        var numberCount: Long? = readLine()?.toLong()
        if((numberCount.toString().length) > 11){
            println("Numero de digitos deve ser superior ou igual a 11")
            return
        }
        println("Insira o valor a ser transferido: ")
        var valorDeTransferencia = readLine()?.toInt()
        if(valorDeTransferencia!! > saldoInicial){
            println("Valor de transferencia acima do saldo da conta.")
            return
        }
        saldoInicial -= valorDeTransferencia!!

    }
}