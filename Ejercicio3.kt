
fun main() {
 //3º  Calcula el área y la circunferencia de un círculo cuyo radio se debe preguntar al usuario.
    println("necesito que me indiques el radio para calcular la circunferencia y el area")
    var radio= readln().toInt()
    var circ=2*Math.PI*radio
    var area=Math.PI*(radio*radio)
    println("el area es $area y la circunferencia $circ")





}
fun conflicto(){
    var altura=3
    var base=7
    var areaT=(base*altura)/2
    println("esto es un conflicto")
}