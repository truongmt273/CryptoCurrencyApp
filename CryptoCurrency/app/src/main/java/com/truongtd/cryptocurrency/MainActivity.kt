package com.truongtd.cryptocurrency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.truongtd.cryptocurrency.presentation.ui.theme.CryptocurrencyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptocurrencyAppTheme() {
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}