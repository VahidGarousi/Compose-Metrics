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

private const val TAG = "Sample2"
@Composable
fun Sample2() {

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