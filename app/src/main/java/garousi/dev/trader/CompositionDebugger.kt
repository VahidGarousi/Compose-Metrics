package garousi.dev.trader

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay

private const val TAG = "CompositionDebugger"

@Composable
fun CompositionDebugger() {
    Log.i(TAG, "Root: recomposed")
    Column {
        Log.i(TAG, "Column: recomposed")
        BoxWithConstraints {
            Log.i(TAG, "BoxWithConstraints: recomposed")
            Box {
                Log.i(TAG, "Box: recomposed")
                Row {
                    Log.i(TAG, "Row: recomposed")
                    LazyColumn {
                        Log.i(TAG, "LazyColumn: recomposed")
                        item {
                            Log.i(TAG, "LazyColumn item: recomposed")
                            var selected by remember { mutableStateOf(false) }
                            LaunchedEffect(Unit) {
                                delay(5000L)
                                selected = true
                            }
                            Text(text = selected.toString())
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CompositionDebugger2() {
    var selected by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        delay(5000L)
        selected = true
    }
    Log.i(TAG, "Root: recomposed")
    Column {
        Log.i(TAG, "Column: recomposed")
        BoxWithConstraints {
            Log.i(TAG, "BoxWithConstraints: recomposed")
            Box {
                Log.i(TAG, "Box: recomposed")
                Row {
                    Log.i(TAG, "Row: recomposed")
                    LazyColumn {
                        Log.i(TAG, "LazyColumn: recomposed")
                        item {
                            Log.i(TAG, "LazyColumn item: recomposed")
                            Text(text = selected.toString())
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun CompositionDebugger3() {
    var selected by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        delay(5000L)
        selected = true
    }
    Log.i(TAG, "Root: recomposed")
    Column {
        Log.i(TAG, "Column: recomposed")
        BoxWithConstraints {
            Log.i(TAG, "BoxWithConstraints: recomposed")
            Box {
                Log.i(TAG, "Box: recomposed")
                Row {
                    Log.i(TAG, "Row: recomposed")
                    Text(text = selected.toString())
                    LazyColumn {
                        Log.i(TAG, "LazyColumn: recomposed")
                        item {
                            Log.i(TAG, "LazyColumn item: recomposed")
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun Greeting1(
) {
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
            dataPointOne = dataPointOne + listOf("sds ${dataPointOne.size}")
            dataPointFour += "dsvssd  + ${dataPointFour.length}"
        }
    }
    Greeting2(
        dataPointOne = dataPointOne,
        dataPointFour = dataPointFour
    )
}

@Composable
fun Greeting2(
    dataPointOne: List<String>,
    dataPointFour: String
) {
    CustomText(text = dataPointOne)
    Text(text = dataPointFour)
}


@Composable
fun CustomText(text: List<String>) {
    Text(text = text.toString())
}