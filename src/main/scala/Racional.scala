object Racional {
  def apply(num:Int, den:Int) =
    new Racional(num,den)

  def apply(num:Int) =
    new Racional(num)

  /*   DECLARACIÓN ESTATICA DEL METODO SUMA
  def +(r1:Racional, r2:Racional)={
  }
  */

}

/*
En caso de que quisieramos hacer la operacion 2*r como 2 no es de tipo racional y no tiene definida la operación con este
tipo de objeto podríamos hacer lo siguiente (NO EN LA CLASE DEL OBJETO, DONDE SE VAYA A USAR):

implicit def intToRacional(x:Int) :Racional = new Racional(x)
 */


class Racional(val num: Int, val den: Int) {
  //Si ponemos val o var en la declaración de las variables entonces son publicos y se pueden ver los atributos
  //Si no ponemos nada las variables son privadas e inmutables

  //println(s"$num/$den")

  //Comprobar que el dominador no sea cero
  require(den != 0) //también sirve:  assert(den!=0)

  /*
  Creamos esto para no tener que poner el new cuando creemos una nueva instancia del objeto
    Creación de una instancia = Racional(1,2) == Racional.apply(1,2) == new Racional(1,2)
   */
  def this(num: Int) = {
    this(num, 1)
  }
  /*
    Creación de una instancia = Racional(1,2) == Racional.apply(1,2) == new Racional(1,2)
   */

  //Cuando declaramos las variables dentro de la clase estas son públicas y por tanto se puede acceder a ellas desde fuera
  val n = num /mcd(num, den)
  val d = den /mcd(num, den)


  //Redefinir el toString
  override def toString: String = s"$num/$den"

  def +(otro: Racional) = { //devuelve un racional
    new Racional((n*otro.d + d*otro.n), d*otro.d)
  }

  private def mcd(x:Int, y:Int):Int = {
    if (y==0) x else mcd(y, x%y)
  }

  def *(otro:Racional) =
    new Racional(n*otro.n, d*otro.d)

  /*Definimos el producto de racional con enteros -> no es lo mismo hacer r*2 que 2*r porque significa que estamos asumiendo
    que para los enteros hay un operando con la clase racional que hemos creado.

    Para poder poner la operación 2*r lo que hace scala es transformar el 2 en un número de tipo Racional para poder hacer la operación de racionales
   */
  def *(ent:Int) =
    new Racional(ent * n, d)
}
//Cuando le doy a run se ejectua el código que he metido en la clase


object Principal extends App{
  val r = new Racional(1,2)
  println(s"${r+r}")
}
