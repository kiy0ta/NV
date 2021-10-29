package com.example.nvsample

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopRunnerDetailScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.ic_full),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.fillMaxSize()) {
            TopRunnerInfo()
            PostItems()
        }
    }
}

@Composable
fun TopRunnerInfo() {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(200.dp))
        Text(
            text = stringResource(id = R.string.category),
            color = colorResource(id = R.color.white),
            fontSize = 10.sp
        )
        Text(
            text = stringResource(id = R.string.name),
            color = colorResource(id = R.color.white),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.profile),
            color = colorResource(id = R.color.red),
            fontSize = 10.sp
        )
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            ButtonItem(stringResource(id = R.string.follow))
            ButtonItem(stringResource(id = R.string.request))
        }
    }
}

@Composable
fun ButtonItem(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .padding(16.dp)
            .border(
                width = 0.5.dp,
                color = colorResource(id = R.color.red),
                shape = RoundedCornerShape(50)
            )
            .background(
                color = Color.Transparent,
                shape = RoundedCornerShape(50)
            )
            .padding(vertical = 8.dp, horizontal = 16.dp),
        color = colorResource(id = R.color.red),
        fontSize = 12.sp
    )
}

@Composable
fun PostItems() {
    LazyColumn {
        items(10) { index ->
            PostItem(index = index)
        }
    }
}

@Composable
fun PostItem(index: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_face),
            contentDescription = null,
            modifier = Modifier
                .weight(1f)
                .clip(CircleShape)
        )
        Column(
            modifier = Modifier
                .weight(6f)
                .fillMaxHeight()
        ) {
            // 1段目
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Text(
                    text = stringResource(id = R.string.name),
                    color = colorResource(id = R.color.white),
                    fontSize = 10.sp
                )
                Text(
                    text = stringResource(id = R.string.category),
                    color = colorResource(id = R.color.white),
                    fontSize = 10.sp
                )
                Text(
                    text = "4時間前",
                    color = colorResource(id = R.color.white),
                    fontSize = 10.sp,
                    textAlign = TextAlign.End
                )
            }
            // 2段目
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Text(
                    text = "タイトルが入ります",
                    color = colorResource(id = R.color.white),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1
                )
            }
            // 3段目
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Text(
                    text = "04:44",
                    modifier = Modifier
                        .background(
                            color = colorResource(id = R.color.red_60),
                            shape = RoundedCornerShape(50)
                        )
                        .padding(vertical = 2.dp, horizontal = 4.dp),
                    color = colorResource(id = R.color.white),
                    fontSize = 12.sp
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_comment),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .clip(CircleShape)
                        .padding(2.dp),
                    colorFilter = ColorFilter.tint(colorResource(id = R.color.red))
                )
                Text(
                    text = "999",
                    color = colorResource(id = R.color.white),
                    fontSize = 10.sp
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_like),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .clip(CircleShape)
                        .padding(2.dp),
                    colorFilter = ColorFilter.tint(colorResource(id = R.color.red))
                )
                Text(
                    text = "99,999",
                    color = colorResource(id = R.color.white),
                    fontSize = 10.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewTopRunnerDetailScreen() {
    TopRunnerDetailScreen()
}
