class hewan (nama : String , kaki :Int, hidup : String){
    var Nama : String = nama
    var Kaki : Int  = kaki
    var Habitat : String = hidup

    fun tampil(){
        println("Nama Hewan : $Nama")
        println("Kaki Hewan : $Kaki")
        println("Habitat Hewan : $Habitat")
    }
}
fun main(){
    val Hewan1 = hewan("Gajah",4,"Darat")
    val Hewan2 = hewan("Buaya", 4 , "Darat dan Air")
    val Hewan3 = hewan("Ikan axoloti " ,4, "air")

    Hewan1.tampil()
    Hewan2.tampil()
    Hewan3.tampil()
}
