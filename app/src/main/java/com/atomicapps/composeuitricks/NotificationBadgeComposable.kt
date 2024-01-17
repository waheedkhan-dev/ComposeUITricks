package com.atomicapps.composeuitricks

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)

@Preview
@Composable
fun NotificationBadgeComposable() {
    Box(modifier = Modifier.padding(12.dp)) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                modifier = Modifier.size(42.dp),
                imageVector = Icons.Filled.Notifications,
                contentDescription = "NotificationIcon"
            )
        }
        Badge(
            modifier = Modifier
                .border(1.dp, color = Color.White, shape = CircleShape)
                .align(Alignment.TopEnd)
                .clip(CircleShape)
        ) {
            Text(text = "5")
        }
    }
}
