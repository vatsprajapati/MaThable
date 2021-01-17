package com.bce.mathable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mNumber;
    Button mGenerateTable;
    TextView mTextView;
    int ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNumber = findViewById(R.id.tableNumberEditText);
        mGenerateTable = findViewById(R.id.generateTableButton);
        mTextView = findViewById(R.id.tableRow);

        mGenerateTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.generateTableButton:
                        StringBuffer buffer = new StringBuffer();

                        String fs = mNumber.getText().toString();
                        int n = Integer.parseInt(fs);

                        for (int i = 1; i <= 10; i++) {
                            ans = (i * n);
                            buffer.append(n + " X " + i + " = " + ans + "\n");
                        }
                        mTextView.setText(buffer);
                        break;

                }
            }
        });
    }

}
