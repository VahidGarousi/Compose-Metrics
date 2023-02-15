package garousi.dev.trader

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay

@Composable
fun Sample4() {
    var dataPointOne by remember {
        mutableStateOf(
            listOf(
                "ascsaca", "dvadvad", "svdvsvs", "svdsvds"
            )
        )
    }
    var dataPointFour = "sdvsdvs"
    LaunchedEffect(Unit) {
        for (i in IntRange(0, 100)) {
            delay(500L)
            dataPointOne = listOf("sds ${dataPointOne.size}") + dataPointOne
            dataPointFour += "dsvssd  + ${dataPointFour.length}"
        }
    }
    Greeting(
        dataPointOne = dataPointOne,
        dataPointFour = dataPointFour
    )
}
@Composable
private fun Greeting(
    dataPointOne: List<String>,
    dataPointFour: String
) {
    CustomText(text = dataPointOne)
    Text(text = dataPointFour)
}


@Composable
private fun CustomText(text: List<String>) {
    Text(text = text.toString())
}