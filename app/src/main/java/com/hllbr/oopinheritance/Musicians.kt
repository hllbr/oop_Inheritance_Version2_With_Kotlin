package com.hllbr.oopinheritance

open class Musicians(name: String, instrument: String, age: Int) {
    /*
    verilerime ulaşılsın istediğim zaman yaptığım tanımlamalar

    var name :String? = name
    var instrument : String? = instrument
    var age : Int? = age

    Eğer verilerim değiştirilmesin fakat okunsun istiyorsam = (Encapsulation) kapsülleme işlemi gerçekleştiriyorum

    private var name :String? = name
    private var instrument : String? = instrument
    private var age : Int? = age

    En Kolay Kapsülleme yöntemi private yapmak hiçbir yerden erişim yok sınıfın içi hariç

    **Javada Getter & Setter yapıları ile veriyi okunabilir kılıyordum fakat Kotlin böyle bir imkan sunmuyor

    Getter & Setter Javada bir ifadenin değerini değiştirebileceğimiz yada değerini okuyabileceğimiz yardımcı metodlar olarak kullanılıyor.

    Kotlinde bu yapıalar yok çünkü otomatik olarak bu yapılar kotlin tarafından oluşturuluyor.

     */
     var name :String? = name
        private set
        get

    private var instrument : String? = instrument

     var age : Int? = age
        private set
        get

    private val bandName :String = "Metallica"

    fun returnBandName(password : String) : String{
        if (password == "hllbr85"){
            return bandName
        }else{
            return "Wrong Password!!"
        }
    }


}
//Üst Satırda bulunan işlem User içerisinde yaptığım işlemle birebir aynı görevi görüyor

