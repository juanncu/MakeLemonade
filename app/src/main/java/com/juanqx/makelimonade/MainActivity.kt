package com.juanqx.makelimonade

import android.os.Bundle
import android.service.autofill.OnClickAction
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
/*import androidx.compose.foundation.layout.FlowRowScopeInstance.align*/
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.juanqx.makelimonade.ui.theme.MakeLimonadeTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      MakeLimonadeTheme {
        LemonadaApp()
      }
    }
  }
}

@Composable
fun TapTree(modifier: Modifier = Modifier) {
  Column(
    modifier,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Button(
      onClick = {

      },
      colors = ButtonDefaults.buttonColors(Color.LightGray)
    ) {
      Image(
        painter = painterResource(R.drawable.lemon_tree),
        contentDescription = null,
      )
    }
    Spacer(
      modifier = Modifier.height(16.dp)
    )
    Text(
      text = stringResource(R.string.select_limon),
      fontSize = 18.sp
    )
  }
}

@Composable
fun TapLemon(modifier: Modifier = Modifier) {
  Column(
    modifier,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Button(
      onClick = { /*TODO*/ },
      colors = ButtonDefaults.buttonColors(Color.LightGray)
    ) {
      Image(
        painter = painterResource(R.drawable.lemon_squeeze),
        contentDescription = null,
      )
    }
    Spacer(
      modifier = Modifier.height(16.dp)
    )
    Text(
      text = stringResource(R.string.tap_limon),
      fontSize = 18.sp
    )
  }
}


@Composable
fun DrinkLemon(modifier: Modifier = Modifier) {
  Column(
    modifier,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Button(
      onClick = { /*TODO*/ },
      colors = ButtonDefaults.buttonColors(Color.LightGray)
    ) {
      Image(
        painter = painterResource(R.drawable.lemon_drink),
        contentDescription = null,
      )
    }
    Spacer(
      modifier = Modifier.height(16.dp)
    )
    Text(
      text = stringResource(R.string.drink_limon),
      fontSize = 18.sp
    )
  }
}

@Composable
fun RestartLemon(modifier: Modifier = Modifier) {
  Column(
    modifier,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Button(
      onClick = { /*TODO*/ },
      colors = ButtonDefaults.buttonColors(Color.LightGray)
    ) {
      Image(
        painter = painterResource(R.drawable.lemon_restart),
        contentDescription = null,
      )
    }
    Spacer(
      modifier = Modifier.height(16.dp)
    )
    Text(
      text = stringResource(R.string.restart_lemon),
      fontSize = 18.sp
    )
  }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LemonadaApp() {
  TapTree(
    modifier = Modifier
      .fillMaxSize()
      .wrapContentSize(Alignment.Center)
  )
}


/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  MakeLimonadeTheme {
    Greeting("Android")
  }
}*/
