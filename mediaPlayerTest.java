package com.example.dmoney.mp3player;

import android.media.MediaPlayer;

import org.junit.Test;

import static org.junit.Assert.*;
import com.example.dmoney.mp3player.Mp3player;
import android.media.MediaPlayer;
import android.widget.Button;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class mediaPlayerTest {
    private Mp3player mp3;
    private MediaPlayer media;
    private Button button;

    @Test
    public void media_isCorrect() throws Exception {
        assertEquals(media,mp3.getMediaPlayer());
    }



}