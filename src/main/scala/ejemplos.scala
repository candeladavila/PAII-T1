import scala.collection.mutable

object Contador { //Objeto acompañante de la clase contador
  // (va a corresponder a los métodos estáticos, métodos que puedo usar sin necesidad de una instancia)
  val mapa = mutable.Map.empty[String, Int]

  def calcula(s:String):Int = {
    if (mapa.contains(s)) mapa(s)
    else{
      val cont = new Contador
      for (c <- s){ //recorrer con c todos los elementos de la cadena s
        cont.inc(c.toInt) //usamos la funcion inc que hemos definido en contador
      }
      mapa += (s -> cont.valor)
      cont.valor
    }
  }

  def log  = mapa.mkString("\n") //imprimir el mapa
}

class Contador {
  var suma = 0 //la creo mutable para poder actualizar el valor de la variable
  //Si queremos que sea privada tenemos que especificarlo porque por defecto es publica
  // private var suma = 0

  def inc(v: Int) =
    suma += v

  def valor = suma //devuelve el valor de la suma
  //def valor = suma -> podemos quitar los paréntesis

  //En escala no existe el tipo estático por lo que tenemos que crear un objeto dentro de la clase para representar la clase estática

}

object Ejemplos extends App{
  val c = new Contador
  Contador.calcula("en escala todo es un objeto")
  print(Contador.log)
}
