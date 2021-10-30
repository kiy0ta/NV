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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
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

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.linearGradient(
                        colors = listOf(Color.Transparent, Color.Black),
                        start = Offset.Zero, end = Offset.Infinite
                    )
                )
        ) {
            TopRunnerInfo()
            Spacer(
                modifier = Modifier
                    .height(6.dp)
                    .fillMaxWidth()
            )
            PostItems()
        }
    }
}

@Composable
fun TopRunnerInfo() {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(300.dp))
        Text(
            text = stringResource(id = R.string.category),
            color = colorResource(id = R.color.white),
            fontSize = 10.sp
        )
        Text(
            text = stringResource(id = R.string.name),
            modifier = Modifier.padding(top = 2.dp),
            color = colorResource(id = R.color.white),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.profile),
            modifier = Modifier.padding(top = 6.dp),
            color = colorResource(id = R.color.red),
            fontSize = 10.sp
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp),
            horizontalArrangement = Arrangement.Center
        ) {
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
            .padding(6.dp)
            .border(
                width = 2.dp,
                color = colorResource(id = R.color.red),
                shape = RoundedCornerShape(50)
            )
            .background(
                color = Color.Transparent,
                shape = RoundedCornerShape(50)
            )
            .padding(vertical = 8.dp, horizontal = 16.dp),
        color = colorResource(id = R.color.red),
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun PostItems() {
    LazyColumn {
        items(10) { _ ->
            PostItem()
            Spacer(
                modifier = Modifier
                    .height(0.5.dp)
                    .fillMaxWidth()
                    .background(
                        color = colorResource(
                            id = R.color.gray
                        )
                    )
            )
        }
    }
}

@Composable
fun PostItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(96.dp)
            .padding(start = 8.dp, end = 16.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_face),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
            )
        }
        Spacer(modifier = Modifier
            .fillMaxHeight()
            .width(8.dp))
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
                    .padding(bottom = 6.dp),
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = stringResource(id = R.string.name),
                    color = colorResource(id = R.color.white),
                    fontSize = 11.sp
                )
                Text(
                    text = stringResource(id = R.string.category),
                    modifier = Modifier.padding(start = 8.dp),
                    color = colorResource(id = R.color.white),
                    fontSize = 9.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "4時間前",
                    modifier = Modifier.padding(start = 200.dp),
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
                    text = "Androidの学習方法について",
                    color = colorResource(id = R.color.white),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1
                )
            }
            // 3段目
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                verticalAlignment = Alignment.Top
            ) {
                Text(
                    text = "04:44",
                    modifier = Modifier
                        .background(
                            color = colorResource(id = R.color.red_60),
                            shape = RoundedCornerShape(50)
                        )
                        .padding(vertical = 4.dp, horizontal = 8.dp),
                    color = colorResource(id = R.color.white),
                    fontSize = 10.sp
                )
                Spacer(modifier = Modifier.width(60.dp))
                Image(
                    painter = painterResource(id = R.drawable.ic_comment),
                    contentDescription = null,
                    modifier = Modifier.padding(
                        start = 5.dp,
                        top = 2.dp,
                        end = 5.dp,
                        bottom = 10.dp
                    ),
                    colorFilter = ColorFilter.tint(colorResource(id = R.color.red))
                )
                Text(
                    text = "999",
                    modifier = Modifier.padding(start = 4.dp, top = 4.dp),
                    color = colorResource(id = R.color.white),
                    fontSize = 10.sp
                )
                Spacer(modifier = Modifier.width(32.dp))
                Image(
                    painter = painterResource(id = R.drawable.ic_like),
                    contentDescription = null,
                    modifier = Modifier.padding(
                        start = 5.dp,
                        top = 2.dp,
                        end = 5.dp,
                        bottom = 12.dp
                    ),
                    colorFilter = ColorFilter.tint(colorResource(id = R.color.red))
                )
                Text(
                    text = "99,999",
                    modifier = Modifier.padding(start = 4.dp, top = 4.dp),
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
