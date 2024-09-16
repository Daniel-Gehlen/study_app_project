
package com.example.studyapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studyapp.databinding.ActivityQuestionBinding

class QuestionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionBinding
    private val questionList = listOf("Question 1", "Question 2", "Question 3")
    private var currentQuestionIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadQuestion()

        binding.nextButton.setOnClickListener {
            checkAnswer()
            loadNextQuestion()
        }
    }

    private fun loadQuestion() {
        binding.questionTextView.text = questionList[currentQuestionIndex]
    }

    private fun checkAnswer() {
        // Check the user's answer logic
    }

    private fun loadNextQuestion() {
        if (currentQuestionIndex < questionList.size - 1) {
            currentQuestionIndex++
            loadQuestion()
        } else {
            // Logic for completing the quiz
        }
    }
}
                                        