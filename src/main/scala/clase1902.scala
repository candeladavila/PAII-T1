 object Clase1902 {
   def main(args: Array[String]) = {
     val l = List (1,2,3)
     val l1 = List(4,5,6)

     print("Unir dos listas: ")
     println(l ::: l1)

     //////////////////////////////FALTA EL PRINCIPIO DE LA CLASE(NOTION)
     val lista = List(2,4,7,3,8,9,1,0)
     print("Ordenar una lista: ")
     println(lista.sortWith((x:Int, y:Int) => x<y))

     print("Ejercicio crear una lista con los multiplos de 3 invertida: ")
     val l2 = List(1,3,4,6,8,9)
     println(l2.filter(_%3==0).reverse)

     print("Ejercicio coger el numero par mayor de una lista: ")
     println(l2.filter(_%2==0).sortWith((x:Int, y:Int) => x>y).head)

     print("Elemento tipo tupla: ")
     var par =(99,"burbuja")
     println(par)

     print("Primer elemento de una tupla: ")
     println(par._1)

     print("Segundo elemento de una tupla: ")
     println(par._2)

     print("Creación de un conjunto: ")
     //Conjunto = no hay elementos repetidos y no hay un orden
     val c = Set(1,2,3)
     val c1 = Set(2,3,1)
     //c y c1 son iguales
     println(c)

     print("Añadir elementos a un conjunto: ")
     println(c + 4)
     //no ponemos con el igual, el igual implica que le añade a la misma colección un elemento, como es inmutable no podemos hacerlo

     print("Crear un conjunto mutable: ")
     val cmutable = scala.collection.mutable.Set(1,2,3)
     println(cmutable)

     print("Añadir elementos a un conjunto mutable: ")
     println(cmutable += 5)

     print("Comprobar que contenga un elemento un conjunto inmutable: ")
     println(c.contains(5))

     print("Interseccion dos conjuntos: ")
     val c2 = Set(3,5,6)
     println(c&c2)

     print("Union de dos conjuntos: ")
     val c3 = Set(4,5,6)
     println(c++c3)

     print("Creacion de un mapa inmutable: ")
     val mapa = Map("i" -> 1, "ii" -> 2)
     println(mapa)
     //Almacena pares clave, valor

     print("Añadir elementos a un mapa inmutable: ")
     println(mapa + ("iii" -> 3))

     print("Dado un mapa y una clave devolver el valor: ")
     println(mapa("ii"))

     //Clases y objetos en scala -> fichero Ejemplos_19_02.scala

   }

 }