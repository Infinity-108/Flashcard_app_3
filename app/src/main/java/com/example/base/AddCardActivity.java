package com.example.base;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.cancel_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        EditText question_edit = findViewById(R.id.question_edittext);
        EditText answer_edit = findViewById(R.id.answer_edittext);


        findViewById(R.id.save_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data  = new Intent();
                data.putExtra("the_question",question_edit.getText().toString());
                data.putExtra("the_answer",answer_edit.getText().toString());
                setResult(RESULT_OK, data);
                finish();
            }
        });

    }


}