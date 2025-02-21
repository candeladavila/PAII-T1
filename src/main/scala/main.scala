object Main {
  def max(x: Int, y: Int) =
    if (x > y) x else y

  def main(args: Array[String]) =
    println("Hola Mundo\n")
    val array = new Array[String](3) //declaración de un array de tamaño 3
    array(0) = "Hola"
    array(1) = ","
    array(2) = "Mundo"

    println(array(0))
    println(array.apply(0))
    array(0) = "Adiós"
    println(array(0))

    val vector = Array(1,2,3,4) //declaración de un array con valores iniciales
    vector(0) = 88

    var i = 0
    while(i<vector.length){ //bucle while para iterar en los elementos de un array
      if (i!=0) print(" ")
      println(vector(i))
      i += 1
    }

    for (i<-0 until vector.length)
      print(s"$i")

    for (v<-vector) print(s"$v ")

    vector.foreach((n:Int) => print(s"$n "))
    //dado un elemento entero que es cada componente del vector lo imprimo
    //Primer parámetro es lo que quiero ir iterando y segundo parámetro lo que quiero hacer

    vector.foreach(println) //versión reducida del foreach

}


