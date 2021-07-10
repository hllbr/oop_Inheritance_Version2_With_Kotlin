package com.hllbr.oopinheritance

class SuperMusicians(name: String, instrument: String, age: Int) : Musicians(name, instrument, age) {
    /*Super class-masterclass to use to inherit
    Super muscians sınıfındaki muzisyenler musician sınıfındaki özelliklere sahip olacak fakat bunların dışındada özelliklere sahip olabilecekler
   */
    fun sing(){
        println("nothing else matters")
    }
    /*
    Bizim inheritance aldığımız yerde bir constructor bulunuyor bunuda almam gerekiyor şeklinde bir hata ile karşılaşıyorum
    inheritance alınan yer eğer final kelimesi ile bağlanmışsa benim için bu durum geçerli olduğu içni inheritance alamayacağımı ifade ediyor derleyici

     */
}