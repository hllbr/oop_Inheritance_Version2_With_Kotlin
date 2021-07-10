package com.hllbr.oopinheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        /*
        Inheritance == Miras alma / Kalıtım almak

        bir sınıf oluşturulduğunda başka bir sınıfta oluşturulan bu sınıfın kaltımını  alabilir.Tüm metodları,değişkenleri,property ler kullanılabilir hale gelebilirim.
        10 sınıf yazsak 10 sınıf içerisinde 10 farklı metod olacaksa bu 10 fonksiyonun 7 tanesi ortak yani bütün sınıflarda kullanılacak 100 fonksiyon yazmak yerine
        1 sınıf oluşturup bütün fonksiyonları bu sınıf içerisinde tanımlayıp bütün sınıflarında bu sınıftan kalıtım alıp tüm özelliklere erişmesini sağlamak daha akılcı bir yoldur.

         */

        var lars = SuperMusicians("Lars","Drums",65)//Drums = batery
        println(lars.name)
        println(lars.returnBandName("hllbr85"))
        lars.sing()

        var james = Musicians("james","Guitar",60)
        println(james.name)
        //james.sign() Bu yapı üst sınıfa ait olduğu için lars kullanabilirken jmaes bu sınıfın kapsamı dışında kalıyor

    }
}