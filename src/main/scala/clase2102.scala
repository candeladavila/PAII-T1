object Clase2102 {
  def main(args: Array[String]) = {
    println("\nClase 21 Febrero 2024")

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
    REPASO CLASE ANTERIOR
    Las clases de definen en scala de la misma forma que en java:
    Class nameclass{atributos de la clase}

    - Los atributos cuando no se le da un valor defecto es público (las funciones igual)
      - cuando queramos que sea privado lo indicamos espeficamente
    - Crear una instancia de una clase
    - Cuando en el mismo fichero tengo un objeto que se llama igual que la clase es su acompañante, y
       todo lo que haya dentro (funciones o variables) serán lo que antes era estático en java
    - Desde el punto de vista sintáctico es igual que java -> nombre_clase.método -> es igual para objetos y clases
     */
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    println("CADENAS DE CARACTERES")

    print("Imprimir cadenas de caracteres y variables (formato java): ")
    val c = "8"
    println("El valor de la variable es " + c) //Estilo de java que también se admite
    print("Imprimir cadenas de caracteres y variables (formato scala): ")
    val cadena = "Hola"
    println(s"El saludo es $cadena y su longitud es ${cadena.size}")
    //si le pongo una s la cadena usa la interpolación
    //Dentro de los {} podríamos poner cualquier expresión: 3+2, ... -> todo lo que se puede convertir en una cadena
    print("Otras formas de imprimir ")
    println(raw"El saludo es $cadena \n y su longitud es ${cadena.size}") //imprime los caracteres

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    println("COMPARACIÓN DE OBJETOS")
    print("Método equals en scala: ")
    println("Usamos '==' para comprar referencias (salvo que sea el mismo objeto devuelve false)")
    //Hay que definir el método equals en scala
    //El == funciona para listas (tiene que estar en el mismo orden), conjuntos

    print("Comprar el contenido de dos conjuntos: ")
    val s1 = Set(1, 2, 3)
    val s2 = Set(3, 1, 2)
    println(s1 == s2)
    //si usamos s1.eq(s2) devolverá false porque no son el mismo objeto aunque tengan el mismo contenido

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    println("Clase Racional")
  }

}


