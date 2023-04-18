package info.fekri.jetapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// from `developer.android`
@Composable
fun BirthdayGreetingWithText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = message,
            fontSize = 36.sp,
            modifier = modifier.padding(top = 16.dp),
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(
            text = from,
            fontSize = 24.sp,
            modifier = modifier.padding(top = 16.dp),
            style = TextStyle(color = Color.White)
        )
    }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.img_cake)
    Box {
        Image(
            image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }
    BirthdayGreetingWithText(message = message, from = from)
}

// ==============================================================================

/**
 * [Compose article](https://developer.android.com/codelabs/basic-android-kotlin-compose-composables-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-composables-practice-problems#1)
 * */
@Composable
fun ComposeArticle(
    sub: String,
    desc1: String,
    desc2: String,
    modifier: Modifier = Modifier
) {
    Column {

        Image(painterResource(id = R.drawable.bg_compose_background), contentDescription = null)

        Text(
            text = sub,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )

        Text(
            text = desc1,
            modifier = modifier.padding(end = 16.dp, start = 16.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = desc2,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )

    }
}

// ==============================================================================================

/**
 * [Task manager](https://developer.android.com/codelabs/basic-android-kotlin-compose-composables-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-composables-practice-problems#2)
 * */
@Composable
fun TaskManagerUi(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp
        )
    }
}

// =========================================================================================

/**
 * [Compose quadrant](https://developer.android.com/codelabs/basic-android-kotlin-compose-composables-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-composables-practice-problems#3)
 * */
@Composable
fun ComposeQuadrantUi() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = "Text composable",
                description = "Displays text and follows Material Design guidelines.",
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color.LightGray,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            modifier = modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            modifier = Modifier.weight(1f)
        )
    }
}

// ======================================================================================

/**
 * [Business Card](https://developer.android.com/codelabs/basic-android-kotlin-compose-business-card?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-business-card)
 * */

@Composable
fun BusinessCardUi() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF272C42)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            TopUiDesign()
        }

        Spacer(modifier = Modifier.height(32.dp))

        Column {
            BottomUiDesign()
        }
    }
}

@Composable
fun TopUiDesign(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(
                id = R.drawable.android_logo
            ),
            contentDescription = "android icon",
            modifier = modifier.size(120.dp, 120.dp)
        )
        Text(
            text = "Mohammad Reza Fikri",
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            color = Color.White
        )
        Text(
            text = "Android Developer",
            color = Color(0xFF3ddc84),
            fontSize = 24.sp
        )
    }
}

@Composable
fun BottomUiDesign(modifier: Modifier = Modifier) {

    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(bottom = 32.dp)
    ) {

        PersonInfoItem(R.drawable.ic_phone, "+98 914 703 1237")
        PersonInfoItem(R.drawable.ic_share, "@mohammadreza.felri86")
        PersonInfoItem(R.drawable.ic_email, "fekri8614@gmail.com")
    }

}

@Composable
fun PersonInfoItem(imgRes: Int, desc: String, modifier: Modifier = Modifier) {

    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(8.dp)
    ) {
        Icon(
            painterResource(id = imgRes),
            contentDescription = null,
            tint = Color(0xFF3ddc84)
        )

        Spacer(modifier = modifier.width(8.dp))

        Text(
            text = desc,
            color = Color.White,
            fontSize = 20.sp
        )
    }

}
