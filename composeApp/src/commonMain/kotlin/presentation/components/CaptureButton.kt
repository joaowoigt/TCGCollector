package presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import presentation.theme.Blue
import presentation.theme.OffWhite
import presentation.theme.Shapes

@Composable
fun CaptureButton(
    onClick: () -> Unit,
) {

    Button(
        onClick = {
            onClick.invoke()
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = OffWhite),
        shape = Shapes.large,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "Catch this Pokemon!"
        )
    }

}