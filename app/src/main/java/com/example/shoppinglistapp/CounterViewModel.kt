import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

open class ViewModel{


}
//derived class
class derivedClass: CounterViewModel() {
 private var _count by remember {
     mutableStateOf(0)
 }
    public  var count by remember { mutableStateOf(_count) }
    fun incremet(){

    }
    fun decrement(){

    }

}
fun main(args: Array<String>) {
    val derived = derivedClass()
    derived.A()         // inheriting the  base class function
    derived.B()         // calling derived class function
}