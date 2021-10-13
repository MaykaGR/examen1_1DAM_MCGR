package examen1


// #####################################
// DEFINICIÓN DEL CUERPO DEL PROGRAMA
// #####################################

//Función para calcular las tablas de multiplicar
fun tablas (x:Int,num:Int)
{   var num=num
    repeat (x)
    {
    for (i in 1..10) {
        val product = num * i
        println("$num * $i = $product")
        }
        num+=2
        println ("\n")
    }
    return
}
fun main() {
    // Declaración de variables
    var entrada: String = ""
    var listaEntrada: List<String>
    var miNombre: String = "Mayka"
    var edad: Byte = 0
    var mes: Byte = 0
// Leo desde teclado la edad del alumno y el mes acutal
    println("Introduzca la configuración del programa en este formato: <edadDelAlumno>,  <mesActual>")
    entrada = readLine() ?: ""
    listaEntrada = entrada.split(",")
    //Asigno la edad y el mes
    edad = listaEntrada[0].toByte()
    mes = listaEntrada[1].toByte()

    // Linea Inicial de programa
    println("*".repeat(80))
    println("PROGRAMA DE GENERACIÓN DE TABLAS: $miNombre")

    // Linea inicio cabecera
    println("_".repeat(80))

    if (listaEntrada.size != 2) //Compruebo el tamaño de la lista, si es != 2, finaliza el programa
    {
        println("La entrada no es correcta")
        println("_".repeat(80))
    }
    else { // Sino, leo edad y mes. Asigno -1 si hay error en la lectura.
        edad = try {
            listaEntrada[0].trim().toByte()
        } catch (NumberFormatException: IllegalArgumentException) {
            -1
        }
        mes = try {
            listaEntrada[1].trim().toByte()
        } catch (NumberFormatException: IllegalArgumentException) {
            -1
        }
    }

        if ((edad <= 0) || (mes <= 0)) // Si alguno es menor que -1, finaliza el programa
        {
            println("La entrada no es correcta")
            println("_".repeat(80))
        }
        else //Sino, continúo
        {

            //Edad: 8. El alumno está dentro del rango [6-8]
            //Mes: 12. El mes es par, corresponden las tablas siguientes: {2,4}
            println("La edad es $edad y el mes es $mes")
            //Selector de las tablas a mostrar en función de la edad y el mes
            when (edad in 6..8) {
                mes % 2 == 0 -> tablas(2, 2)
                 else ->tablas(3, 1)
                }
            }
            when (edad in 9..10) {
                mes % 2 == 0 -> tablas(3, 6)
                else->    tablas(2, 7)
                }

            when (edad in 11..12) {
                mes % 2 == 0 ->tablas(3,11)
                else->tablas(3,11)

            }
            // Linea final cabecera
            println("_".repeat(80))






    // Linea final de programa
    println("*".repeat(80))

}