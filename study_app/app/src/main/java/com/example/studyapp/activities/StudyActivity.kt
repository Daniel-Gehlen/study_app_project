
package com.example.studyapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studyapp.databinding.ActivityStudyBinding
import android.speech.tts.TextToSpeech
import android.widget.Toast
import java.util.Locale

class StudyActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private lateinit var binding: ActivityStudyBinding
    private lateinit var tts: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tts = TextToSpeech(this, this)

        // Button to read text aloud
        binding.readButton.setOnClickListener {
            val paragraph = binding.paragraphTextView.text.toString()
            if (paragraph.isNotEmpty()) {
                readText(paragraph)
            } else {
                Toast.makeText(this, "No text to read", Toast.LENGTH_SHORT).show()
            }
        }

        // Button to move to next topic
        binding.nextButton.setOnClickListener {
            // Logic to load next topic
        }
    }

    private fun readText(text: String) {
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            tts.language = Locale.US
        } else {
            Toast.makeText(this, "Text-to-Speech initialization failed", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroy() {
        if (tts != null) {
            tts.stop()
            tts.shutdown()
        }
        super.onDestroy()
    }
}
                                        