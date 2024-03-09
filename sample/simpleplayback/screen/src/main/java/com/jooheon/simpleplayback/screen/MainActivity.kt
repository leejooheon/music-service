package com.jooheon.simpleplayback.screen

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jooheon.simpleplayback.screen.theme.SimplePlaybackTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

//    @Inject
//    lateinit var playerController: PlayerController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SimplePlaybackTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    screen()
                }
            }
        }
    }

    @Composable
    private fun screen() {
        Column {
            Button(onClick = {
//                            playerController.play(PlaybackService.testMediaItem())
            }) {
                Text(text = "Play")
            }
            Button(onClick = {
//                            playerController.stop()
            }) {
                Text(text = "Stop")
            }
        }
    }

    override fun onStart() {
        super.onStart()
//        playerController.connect(this)
    }

    override fun onStop() {
//        playerController.disConnect()
        super.onStop()
    }
}