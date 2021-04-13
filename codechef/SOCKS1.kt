import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val count = (((reader.readLine()).split(" ")).zipWithNext()).count{i -> i.first == i.second}
    if(count == 0)
        println("NO")
    else
        println("YES")
}
