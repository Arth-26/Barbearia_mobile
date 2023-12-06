package com.example.barbearia.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(){
    Scaffold(
        topBar = { AppBar()
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxHeight()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally)
            {
            LoginBox()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginBox(){
    Row ( verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ){
        var nomeValue by remember { mutableStateOf("") }

        TextField(value = nomeValue, onValueChange = {nomeValue = it},
            modifier = Modifier
                .weight(1f)  // Isso faz com que a caixa de texto ocupe o máximo de espaço disponível
                .padding(8.dp),
            placeholder = { Text("Nome: ") },
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            )
        )
    }

    Row ( verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ){
        var senhaValue by remember { mutableStateOf("") }

        TextField(value = senhaValue, onValueChange = {senhaValue = it},
            modifier = Modifier
                .weight(1f)  // Isso faz com que a caixa de texto ocupe o máximo de espaço disponível
                .padding(8.dp),
            placeholder = { Text("Senha: ") },
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            )
        )
    }
    Row ( verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ){
        Button(

            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFA500),
            ),
            onClick = {},
            modifier = Modifier.padding(end = 2.dp),

        ) {
            Text("Confirmar", fontSize = 16.sp)

        }
    }

}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun AppBar() {
    TopAppBar(
        title = {
            Text("BarberShop")
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = Color(0xFFFFA500),
            titleContentColor = Color.White,
        )
    )
}