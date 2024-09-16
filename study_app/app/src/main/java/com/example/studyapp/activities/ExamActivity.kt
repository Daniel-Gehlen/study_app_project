
package com.example.studyapp.activities

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.studyapp.databinding.ActivityExamBinding

class ExamActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExamBinding
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startTimer()

        // Logic to load and display questions
    }

    private fun startTimer() {
        object : CountDownTimer(60000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                binding.timerTextView.text = "Time remaining: ${millisUntilFinished / 1000}"
            }

            override fun onFinish() {
                // Submit exam when timer finishes
            }
        }.start()
    }

    private fun submitExam() {
        // Logic to calculate score and show results
    }
}
                                        