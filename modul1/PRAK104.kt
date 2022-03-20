class hewan (nama : String , kaki :Int, hidup : String){
    private var Nama : String = nama
    private var Kaki : Int  = kaki
    private var Habitat : String = hidup

    fun tampil(){
        println("Nama Hewan : $Nama")
        println("Kaki Hewan : $Kaki")
        println("Habitat Hewan : $Habitat\n")
    }
}
fun main(){
    print("Nama Hewan : ")
    val Nama = readLine()!!
    print("Kaki hewan : ")
    val Kaki = readLine()!!.toInt()
    print("Habitat Hewan : ")
    val Tempat = readLine()!!

    val Hewan1 = hewan(Nama,Kaki,Tempat)
    val Hewan2 = hewan("Buaya", 4 , "Darat dan Air")
    val Hewan3 = hewan("Ikan axoloti " ,4, "air")

    Hewan1.tampil()
    Hewan2.tampil()
    Hewan3.tampil()
}
