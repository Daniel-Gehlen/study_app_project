
package com.example.studyapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Start the StudyActivity when user clicks the start button
        binding.startButton.setOnClickListener {
            val intent = Intent(this, StudyActivity::class.java)
            startActivity(intent)
        }
    }
}
                                        