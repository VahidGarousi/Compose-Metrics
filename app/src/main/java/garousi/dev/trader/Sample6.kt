package garousi.dev.trader

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay

// Before
/*@Composable
fun Sample6() {
    val dataPointOne = listOf(SomeData(emptyList(), ""), SomeData(emptyList(), ""))
    var dataPointFour by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        for (i in IntRange(0, 100)) {
            delay(500L)
            dataPointFour += "ojiop  + ${dataPointFour.length}"
        }
    }
    Greeting(
        dataPointOne = dataPointOne,
        dataPointFour = dataPointFour
    )
}

@Composable
private fun Greeting(
    dataPointOne: List<SomeData>,
    dataPointFour: String
) {
    CustomText(text = dataPointOne[0])
    Text(text = dataPointFour)
}

data class SomeData(
    val itemOne: List<String>,
    val itemTwo: String
)


@Composable
private fun CustomText(text: SomeData) {
    Text(text = text.toString())
}*/


// After
/*
@Composable
fun Sample6() {
    val dataPointOne   = listOf(SomeData(persistentListOf(), ""), SomeData(persistentListOf(), ""))
    var dataPointFour by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        for (i in IntRange(0, 100)) {
            delay(500L)
            dataPointFour += "ojiop  + ${dataPointFour.length}"
        }
    }
    Greeting(
        dataPointOne = dataPointOne.toPersistentList(),
        dataPointFour = dataPointFour
    )
}

@Composable
private fun Greeting(
    dataPointOne: ImmutableList<SomeData>,
    dataPointFour: String
) {
    CustomText(text = dataPointOne[0])
    Text(text = dataPointFour)
}

data class SomeData(
    val itemOne: ImmutableList<String>,
    val itemTwo: String
)


@Composable
private fun CustomText(text: SomeData) {
    Text(text = text.toString())
}
*/
