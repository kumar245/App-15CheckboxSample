package com.kumar.user.app_15checkboxsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBoxdog;
    private CheckBox checkBoxcat;
    private CheckBox checkBoxdragon;
    private TextView tvShow;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxdog= (CheckBox) findViewById(R.id.dogCheckBox);
        checkBoxcat= (CheckBox) findViewById(R.id.catCheckBox);
        checkBoxdragon= (CheckBox) findViewById(R.id.dragonCheckBox);
        tvShow= (TextView) findViewById(R.id.status);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder=new StringBuilder();
                stringBuilder.append(checkBoxdog.getText().toString() + " Status is : "
                                     + checkBoxdog.isChecked() + "\n");
                stringBuilder.append(checkBoxcat.getText().toString() + " Status is : "
                                    + checkBoxcat.isChecked()+ "\n");
                stringBuilder.append(checkBoxdragon.getText().toString()+" Status is : " +
                                        checkBoxdragon.isChecked() + "\n");
                tvShow.setText(stringBuilder);

            }
        });
    }
}
