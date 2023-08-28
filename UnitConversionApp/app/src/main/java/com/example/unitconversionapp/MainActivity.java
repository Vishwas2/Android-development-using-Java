package com.example.unitconversionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.ETC1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*
    The R.Java file :
    Android R.java file contains resource IDs for all the resources. We can use it to access views from
    from our java file.
    button = findViewById(R.id.mybutton);
    // findViewById -> function to get views.
    // R.id.mybutton -> button in xml has an id of "mybutton"
     */
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button); // button object
        textView = findViewById(R.id.textView3); // textView object
        editText = findViewById(R.id.editText); // editText object
        // OnClickListener is an interface in Java.
        button.setOnClickListener(new View.OnClickListener() {
            // .setOnClickListener tells the program what will happen after the button is clicked.
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Hi click listener worked!", Toast.LENGTH_SHORT).show();
                // Toast refers to a small notification message that pops up on the screen to provide
                // information or feedback to the user.
                String s = editText.getText().toString(); // get the value of editText as string.
                int kg = Integer.parseInt(s);
                // parseInt method is used to convert a string representation of an integer into an actual integer value.
                // This is particularly useful when you have user input in the form of a string that needs to be processed as a numeric value.
                double pound = kg * 2.205;
                textView.setText("The corresponding value in Pounds is : " + pound);
                // Now we will add an image in our app
            }
        });
    }
}