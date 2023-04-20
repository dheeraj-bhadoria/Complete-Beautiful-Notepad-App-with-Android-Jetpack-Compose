package com.dheeraj.notepad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreen(onSplashScreenFinished = { navigateToLoginScreen() })
        }
    }

    private fun navigateToLoginScreen() {
        setContent {
            LoginActivity(onLoginClicked = { username, password ->
                if (username == "DEMO" && password == "123456") {
                    navigateToDashboardScreen()
                }
            })
        }
    }

    private fun navigateToDashboardScreen() {
        setContent {
            DashboardActivity()
        }
    }
}











@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(onSplashScreenFinished = {})
}

@Preview(showBackground = true)
@Composable
fun LoginActivityPreview() {
    LoginActivity(onLoginClicked = { _, _ -> })
}


