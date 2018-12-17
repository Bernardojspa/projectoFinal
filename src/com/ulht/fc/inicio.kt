package com.ulht.fc
//nahhaasdaadsads
import java.io.File
class voos{
    var nvoo:String
    var origem:String
    var destino:String
    var dia :Short

    constructor(nvoo:String, origem:String, destino:String, dia:Short) {
        this.nvoo = nvoo
        this.origem = origem
        this.destino = destino
        this.dia =dia
    }
}
class Reservas{
    var numCc:String
    var nome:String
    var nVoo:String
    var dia :Short

    constructor(numCc:String, nome:String,nVoo:String, dia:Short) {
        this.numCc = numCc
        this.nome = nome
        this.nVoo = nVoo
        this.dia =dia
    }
}
fun readFileVoo(fileNameInput: String) :ArrayList<voos> {
    val voos : ArrayList<voos> = ArrayList()
    val lines = File( fileNameInput).readLines ()

    for (line in lines){
        val parts = line.split(':')
        val nvoo = parts[ 0 ]
        val origem = parts[ 1 ]
        val destino = parts[ 2 ]
        val dia = parts[ 3 ].toShort()

        val voo = voos(nvoo, origem, destino,dia)
        voos.add(voo)
    }
    return voos
}
fun readFileReservas(fileNameInput: String) :ArrayList<Reservas> {
    val Reservas : ArrayList<Reservas> = ArrayList()
    val lines = File( fileNameInput).readLines ()

    for (line in lines){
        val parts = line.split(':')
        val numCc = parts[ 0 ]
        val nome = parts[ 1 ]
        val nVoo = parts[ 2 ]
        val dia = parts[ 3 ].toShort()

        val Reserva = Reservas(numCc, nome, nVoo,dia)
        Reservas.add(Reserva)
    }
    return Reservas
}



fun main(arg: Array<String>){
/*  val mae = Person("Maria",50)
    val pai = Person("Joao" ,50)

    val family= arrayListOf(mae,pai)//   println(mae.name+": " + mae.age)
    println(message = pai.name+": " + pai.age)
*/
    val voos = readFileVoo(fileNameInput = "voos.txt")
    val Reservas = readFileReservas(fileNameInput = "reservas.txt")

    println( voos[1].nvoo)
    println (voos[1].origem)
    println (voos[1].destino)
    println (voos[1].dia)

    println( Reservas[0].numCc)
    println (Reservas[1].nome)
    println (Reservas[1].nVoo)
    println (Reservas[1].dia)
}