package com.example.miprimeraplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validaredad(21)
        multimplos(5)
        multdes(5)
        listadoOrden()
        vehiculo()
        cedula()


    }
    //Validar si una persona es mayor o menor de edad
    fun validaredad(edad:Int){
        if (edad>18){
            println("Es mayor de edad con "+ edad)

        }else{
            println("Es menor de edad con "+ edad)

        }
    }
    //Presentar la tabla de multiplicar de n numero de forma ascendente y descendente.

    fun multimplos (n:Int){
        println("asendente")
        for (x in 0..10){
            var multi= n*x
            println(""+n + "*"+x+"="+multi)

        }
    }
    fun multdes(n: Int){
        println("desendente")
        var y=10
        while (y>=0){
            var multi= n*y
            println(""+n +"*"+y+"="+multi)
            y--

        }
    }
    //Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por
    // proyectos (Mostrar los resultados ordenados).


    private fun listadoOrden(){
        val listas = listOf<String>("Rommel ojeda","Diego leiba","Erick Cuenca","Mateo Martines")
        val ordenar = listas.sorted()
        println("Listado de Estudiantes")
        for (listas in ordenar){
            println(listas)
        }
        val grupos = mutableMapOf("Rommel ojeda" to "Mascotas","Diego leiba" to "Registro UTPL"
            ,"Erick Cuenca" to "Mascotas","Mateo Martines" to "Registro UTPL")

        val ordenGrupo = grupos.toSortedMap()
        println("Listado de Estudiantes por Proyectos")
        for (i in ordenGrupo ){
            println("${i.key} - ${i.value}")
        }
    }
    //Presentar las propiedades de un vehículo utilizando clases, como tracción, motor, tipo de vehículo, capacidad

    class traccion(val traccion: Array<trac>,val motor: String, val tipo: String, val capacidad:String) {
        enum class trac{
            Delantera,
            Trasera
        }
        fun vehi(){
            for(traction in traccion){
                println("La tracción del vehiculo es: "+traction)
            }
        }
    }
    fun vehiculo(){
        val car = traccion(arrayOf(traccion.trac.Trasera),motor = "V16",tipo="Sport",
        capacidad="2 pasajeros")
        car.vehi()
        println("El motor es "+car.motor)
        println("El tipo del vehiculo es "+car.tipo)
        println("Tiene capacidad para  "+car.capacidad)
    }
    fun cedula(){
        var c=0
        var total =0
        val cedula = arrayListOf<Int>(1,1,0,5,6,3,6,8,9,6)
        val nFin = cedula.last()
        for(x in cedula.indices){
            c=cedula[x]
            if(x%2==0){
                c=(cedula[x]*2)
                if (c>9){
                    c = c-9
                }
                total = total+c
            }else{
                total = total+c
            }
        }
        total = total - nFin
        val pNumero = total.toString().substring(0,1)
        val dece = (pNumero.toInt()+1)*10
        if (dece-total==nFin||dece-total==10){
            println("La cedula -/ $cedula -/ si es Correcta.")
        }else{
            println("La cedula -/ $cedula -/ no es Incorrecta.")
        }
    }


}