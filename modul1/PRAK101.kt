fun main(){
    print("Waktu sekarang : ")
    val waktu = readLine()
    print("Nama Anda :  ")
    val Nama  = readLine()
    print("Umur anda : ")
    val umur  = readLine()
    print("Suhu Tubuh Anda: ")
    val suhu  = readLine()

    val text ="""
        Selamat $waktu , $Nama.
        Umur anda $umur Tahun.
        Suhu Tubuh anda $suhu derajat 
        Celcius.
    """.trimIndent()
    println(text)
}
