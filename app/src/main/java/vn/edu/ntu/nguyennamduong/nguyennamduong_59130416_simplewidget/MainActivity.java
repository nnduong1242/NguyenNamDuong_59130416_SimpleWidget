package vn.edu.ntu.nguyennamduong.nguyennamduong_59130416_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editTen, editNgSinh, editSoThichKhac;
    RadioGroup rdgGioiTinh;
    Button  btnXacNhan;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }
    private void addViews(){
        editTen = findViewById(R.id.editTen);
        editNgSinh = findViewById(R.id.editNgSinh);
        editSoThichKhac = findViewById(R.id.editSoThichKhac);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        btnXacNhan = findViewById(R.id.btnXacNhan);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
    }

    private void addEvents(){
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InThongTin();
            }
        });
    }

    private void InThongTin() {
        String ten, ngSinh, inTT;
        String sothich = "Sở thích: ";
        String gt="Giới tính: ";
        switch (rdgGioiTinh.getCheckedRadioButtonId()) {
            case R.id.GTNam:
                gt = gt + "Nam"; break;
            case R.id.GTNu:
                gt = gt + "Nữ"; break;
        }

        if (checkBox1.isChecked()) sothich = sothich + "Xem phim; ";
        if (checkBox2.isChecked()) sothich = sothich + "Nghe nhạc; ";
        if (checkBox3.isChecked()) sothich = sothich + "Đi cafe với bạn bè; ";
        if (checkBox4.isChecked()) sothich = sothich + "Ở nhà một mình; ";
        if (checkBox5.isChecked()) sothich = sothich + "Vào bếp nấu ăn; ";

        ten = editTen.getText().toString();
        ngSinh = editNgSinh.getText().toString();
        sothich = sothich + editSoThichKhac.getText().toString();

        inTT = ten+"\nNgày sinh: "+ngSinh+"\n"+gt+"\n"+sothich;
        Toast.makeText(getApplicationContext(), inTT, Toast.LENGTH_SHORT).show();
    }
}