//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var cont = 0
    val atm = ATM(100_000)
    while(cont != 5){
    println("1--Levantar")
        println("2--Depositar")
            println("3--Transferir")
                println( "4--Consultar saldo/n")
            println("5--Sair")
        println("6--Continuar")
    var option: Int? = readLine()?.toInt()
        when(option){
            1->{
              atm.levantar()
            }
            2->{
                atm.depositar()
            }
            3->{
                atm.transferencia()
            }
            4->{
                atm.saldoDaConta()
            }
        }
        cont = option!!
    }
}
