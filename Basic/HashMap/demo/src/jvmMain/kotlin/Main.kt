import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var showSnackbar by remember { mutableStateOf(false) }
    val scaffoldState = rememberScaffoldState()


Scaffold (scaffoldState=scaffoldState) {

 Column {

     Button(
         onClick = {
             showSnackbar=true
         }
     ){
         Text("SSS")
     }

     if (showSnackbar) {
showSnackbar(scaffoldState)     }
 }
}
}

fun main() = application {

    Window(onCloseRequest = ::exitApplication) {

        App()
    }
}
@Composable
fun showSnackbar(scaffoldState: ScaffoldState) {
    LaunchedEffect(scaffoldState.snackbarHostState) {
        scaffoldState.snackbarHostState.showSnackbar(
            message = "Snackbar Message",
            actionLabel = "Dismiss",
            duration = SnackbarDuration.Short
        )
    }
}