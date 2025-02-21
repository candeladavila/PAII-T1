class Racional(val num: Int, val den: Int) {
  //Si ponemos val o var en la declaración de las variables entonces son publicos y se pueden ver los atributos
  //Si no ponemos nada las variables son privadas e inmutables

  //println(s"$num/$den")

  //Cuando declaramos las variables dentro de la clase estas son públicas y por tanto se puede acceder a ellas desde fuera
  val n = num
  val d = den

  //Comprobar que el dominador no sea cero
  assert(den!=0)

  //Redefinir el toString
  override def toString: String = s"$num/$den"

  def suma(otro: Racional): Racional = { //devuelve un racional
    new Racional((n*otro.d + d*otro.n), d*otro.d)
  }
}
//Cuando le doy a run se ejectua el código que he metido en la clase


object Principal extends App{
  val r = new Racional(1,2)
  println(s"$")
}
