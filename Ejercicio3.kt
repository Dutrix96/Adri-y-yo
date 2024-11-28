
fun main() {
 //3º  Calcula el área y la circunferencia de un círculo cuyo radio se debe preguntar al usuario.
    println("necesito que me indiques el radio para calcular la circunferencia y el area")
    var radio= readln().toInt()
    var circ=2*Math.PI*radio
    var area=Math.PI*(radio*radio)
    println("el area es $area y la circunferencia $circ")





}

fun cuadrado(Int):Int{
    var lado= 4
    var area = lado * 4
    println("${area}")
}
}