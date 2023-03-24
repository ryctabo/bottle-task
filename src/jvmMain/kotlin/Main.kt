import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun app() {
    MaterialTheme {
        Button(onClick = {
            println("Nothing")
        }) {
            Text("Hi! :)")
        }
    }
}

fun main() = application {
    Window(
        title = "Bottle Desktop Manager",
        onCloseRequest = ::exitApplication
    ) {
        app()
    }
}
