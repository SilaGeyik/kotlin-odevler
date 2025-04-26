package com.example.ders1

import java.util.Scanner

//Parametre olarak girilen dereceyi fahrenhiet'a
// dönüştürdükten sonra geri döndüren bir metod yazınız
//F = C * 1.8  + 32
fun main() {
    println("Dereceyi Giriniz:")
    val input = readln()
    val derece = input?.toDoubleOrNull()

      if (derece != null) {
        val fahrenhiet = derece * 1.8 + 32
        println("Fahrenhiet karşılığı $fahrenhiet F")
    } else {
        println("Geçerli Bir Sayı Girilmedi")} }



        //Kenarları parametre olarak girilen ve dikdörtgenin
// çevresini hesaplayan bir methot yazınız
       fun main() {
            println("Kısa Kenar Uzunluğunu Giriniz:")
            val kisaKenarInput = readln()
            val kisaKenar = kisaKenarInput.toIntOrNull()

          println("Uzun Kenar Uzunluğunu Giriniz:")
            val uzunKenarInput = readln()
            val uzunKenar = uzunKenarInput.toIntOrNull()

            if (kisaKenar != null && uzunKenar != null) {
                val cevre = 2 * (kisaKenar + uzunKenar)
                println("Dikdörtgenin Çevresi: $cevre")
            } else {
                println("Geçersiz Değer Girildi")
            }
        }
//Parametre olarak girilen sayının faktöriyel değerini hesaplayıp geri döndüren metodu yazınız.
fun faktoriyel(sayi: Int): Int {
    return if (sayi == 0) 1 else sayi * faktoriyel(sayi - 1)
}

fun main() {
    println("Bir sayı giriniz:")
    val input = readln()
    val sayi = input.toIntOrNull()

    if (sayi != null && sayi >= 0) {
        println("$sayi sayısının faktöriyeli: ${faktoriyel(sayi)}")
    } else {
        println("Geçerli bir pozitif tam sayı giriniz.")
    }
}
//Parametre olarak girilen değerde kaç adet a harfi
// olduğunu gösteren bir metot yazınız
fun aHarfiniSay(metin:String): Int{
    var sayac = 0
    for (karakter in metin){
        if(karakter == "a" || karakter == "A"){
            sayac++
        }
    }
    return sayac
}
fun main(){
    println("Bir metin giriniz:")
    val girilenMetin = readln()

    val adet = aHarfiniSay(girilenMetin)
    println("Girdiğiniz metinde $adet adet 'a' harfi vardır." )
}
//Parametre olarak girilen kenar sayısına göre iç açılar
// toplamını hesaplayıp sonucu geri döndüren bir metod yazınız.
//iç açılar top = (kenar sayısı - 2 ) * 180
fun icAciToplami(kenarSayisi: Int): Int{
    return (kenarSayisi - 2) * 180
}
fun main(){
    println("Kenar sayısını giriniz:")
    val input = readln()
    val kenarSayisi = input.toIntOrNull()
    if (kenarSayisi != null && kenarSayisi >=3){
        val toplam = icAciToplami(kenarSayisi)
        println("$kenarSayisi kenarlı şeklin iç açılar toplamı: $toplam")
    }else{
        println("Geçerli bir kenar sayısı giriniz(3 veya daha fazla olmalı)")
    }
}

//Parametre olarak girilen gün sayısına göre maaş hesabi yapan
//ve elde edilen değeri döndüren bir metot yazınız
//1 günde 8 saat çalışılabilir
//çalışma saat ücreti 10 tl
//mesai saat ücreti 20 tl
//160 saat üzeri mesai sayılır
fun maasHesapla(gunSayisi: Int): Int {
    val saatlikUcret = 10
    val mesaiSaatlikUcret = 20
    val birGunCalismaSaati = 8

    val toplamCalismaSaati = gunSayisi * birGunCalismaSaati

    return if (toplamCalismaSaati <= 160) {
        toplamCalismaSaati * saatlikUcret
    } else {
        val normalSaat = 160
        val mesaiSaat = toplamCalismaSaati - 160
        (normalSaat * saatlikUcret) + (mesaiSaat * mesaiSaatlikUcret)
    }
}

fun main() {
    println("Çalışılan gün sayısını giriniz:")
    val input = readln()
    val gunSayisi = input.toIntOrNull()

    if (gunSayisi != null && gunSayisi > 0) {
        val maas = maasHesapla(gunSayisi)
        println("Toplam maaş: $maas TL")
    } else {
        println("Geçerli bir gün sayısı giriniz.")
    }
}
//Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren metodu yazınız
//50GB 100tl
//kota aşımından sonra her 1GB 4tl'dir
fun kotaUcretiHesapla(kullanilanGb: Int): Int {
    val sinirKota = 50
    val sabitUcret = 100
    val asimUcreti = 4

    return if (kullanilanGb <= sinirKota) {
        sabitUcret
    } else {
        val asimMiktari = kullanilanGb - sinirKota
        sabitUcret + (asimMiktari * asimUcreti)
    }
}

fun main() {
    println("Kullandığınız veri miktarını (GB) giriniz:")
    val input = readln()
    val kullanilanGb = input.toIntOrNull()

    if (kullanilanGb != null && kullanilanGb >= 0) {
        val ucret = kotaUcretiHesapla(kullanilanGb)
        println("Toplam internet kullanım ücreti: $ucret TL")
    } else {
        println("Geçerli bir kota miktarı giriniz.")
    }
}
