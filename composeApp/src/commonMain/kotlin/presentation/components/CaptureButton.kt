package presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import presentation.theme.OffWhite
import presentation.theme.Shapes

@Composable
fun CaptureButton(
    modifier: Modifier = Modifier,
    text: @Composable () -> Unit,
    content: @Composable RowScope.() -> Unit = {},
    onClick: () -> Unit
) {

    Button(
        onClick = {
            onClick.invoke()
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = OffWhite),
        shape = Shapes.large,
        modifier = modifier
            .widthIn(max = 300.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            text()
            content()
        }
    }
}