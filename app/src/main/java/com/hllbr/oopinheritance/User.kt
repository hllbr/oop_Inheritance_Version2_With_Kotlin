package com.hllbr.oopinheritance

class User {
    var name : String? = null
    var age : Int? = null

    constructor(nameInput : String,ageInput : Int){
        this.age = ageInput
        this.name = nameInput
    }
    init {

    }
    /*
    property'lerimi her zaman ve her yerden erişerek değiştrmek istemediğim durumlarda capsulleme işlemi yaptım
    private-public-protected key words ilr bu işlemlerimi gerçekleştirmiştim Javada
    getter & setter olarak ifade edilen bazı metodlardan faydalandık
     */
}