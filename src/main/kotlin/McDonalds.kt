import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader
import java.util.HashMap

fun main() {
    var menu = HashMap<String, Item>()
    val file = File("mcdonalds.txt")
    val br = BufferedReader(InputStreamReader(FileInputStream(file)))
    var line = br.readLine()
    while (line != null){
        var tokens  = line.split(",")
        var item = Item(tokens[0],
            tokens[1],
            Integer.parseInt(tokens[2]),
            Integer.parseInt(tokens[3]))
        menu.put(item.id, item)
        line = br.readLine()
        }
        printMenu(menu)

    }



class Item(var id : String, var name : String, var calories : Int, var price : Int){
    override fun toString(): String {
        return id + "\t" + name + "\t" + calories + "\t" + price
    }

}

 fun printMenu( menu : HashMap<String, Item>){
     for (menu in menu) {
         println(menu.value)
     }
 }