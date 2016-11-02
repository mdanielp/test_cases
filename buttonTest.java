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
public class buttonTest {
    private Mp3player mp3;
    private MediaPlayer media;
    private Button button;

    @Test
    public void button_isCorrect() throws Exception {
        assertEquals(button,mp3.getbuttonPlaystop());
    }

}