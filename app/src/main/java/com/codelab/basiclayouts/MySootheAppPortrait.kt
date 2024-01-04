package com.codelab.basiclayouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.codelab.basiclayouts.ui.theme.MySootheTheme


@Composable
fun MySootheAppPortrait() {
    MySootheTheme {
        Scaffold(
            bottomBar = { SootheBottomNavigation()}
        ) { padding ->
            HomeScreen(Modifier.padding(padding))

        }
    }
}
