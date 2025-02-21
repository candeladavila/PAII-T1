class Racional(val num: Int, val den: Int) {
  //Si ponemos val o var en la declaración de las variables entonces son publicos y se pueden ver los atributos
  //Si no ponemos nada las variables son privadas e inmutables
  println(s"$num/$den")
}
//Cuando le doy a run se ejectua el código que he metido en la clase

object Principal extends App{
  val r = new Racional(1,2)
  print(s"Numerador: $r.den")
  print(s"Denominador: $r.num")
}
