package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var myButton: Button
    lateinit var displayMessage : TextView
    lateinit var editInput: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton = findViewById<Button>(R.id.clickButton)
        displayMessage = findViewById<TextView>(R.id.textHello)
        editInput = findViewById<EditText>(R.id.editName)

        myButton.setOnClickListener {
            if (!editInput.text.isEmpty()){
                displayMessage.text = "Hello, ${editInput.text}"
                editInput.text.clear()
            }
            else{
                displayMessage.text = "Please enter something"
            }
            }
        }

    }