package com.example.git.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun FadedDivider(
    modifier: Modifier = Modifier,
    height: Dp = 1.dp,
    startEndAlpha: Float = 0.05f,
    centerAlpha: Float = 0.8f,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(height)
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.onPrimary.copy(alpha = startEndAlpha),
                        MaterialTheme.colorScheme.onPrimary.copy(alpha = centerAlpha),
                        MaterialTheme.colorScheme.onPrimary.copy(alpha = startEndAlpha)
                    ),
                )
            )
    )
}