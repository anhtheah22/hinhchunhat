package com.example.hinhchunhat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt1, edt2;
    private TextView result1, result2;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        result1 = (TextView) findViewById(R.id.result1);
        result2 = (TextView) findViewById(R.id.result2);
        calculateButton = (Button) findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kiểm tra xem các trường nhập liệu có được điền đầy đủ hay không
                if(edt1.getText().toString().isEmpty() || edt2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Không điền đủ thông tin thì sao tính?", Toast.LENGTH_SHORT).show();
                    return;
                }
                // Lấy chiều dài và chiều rộng từ các trường nhập liệu
                double length=Double.parseDouble(edt1.getText().toString());
                double width=Double.parseDouble(edt2.getText().toString());
                // Tính diện tích và chu vi
                double area=length*width;
                double perimeter=2*(length+width);
                // Hiển thị kết quả
                result1.setText(String.valueOf(area));
                result2.setText(String.valueOf(perimeter));
            }

        });
    }

}