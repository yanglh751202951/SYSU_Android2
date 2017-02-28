package com.example.yanglh6.myapplication1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radio = null;
    private RadioButton radioStu = null;
    private RadioButton radioTeacher = null;
    private RadioButton radioCorporation = null;
    private RadioButton radioManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        Button buttonLogin = (Button) findViewById(R.id.login);
        Button buttonRegister = (Button) findViewById(R.id.register);
        final EditText editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        final EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        radio = (RadioGroup) findViewById(R.id.radio);
        radioStu = (RadioButton) findViewById(R.id.radioStu);
        radioTeacher = (RadioButton) findViewById(R.id.radioTeacher);
        radioCorporation = (RadioButton) findViewById(R.id.radioCorporation);
        radioManager = (RadioButton) findViewById(R.id.radioManager);

        buttonLogin.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(editTextUsername.getText().toString())) {
                    Toast.makeText(MainActivity.this, "用户名不能为空", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(editTextPassword.getText().toString())) {
                    Toast.makeText(MainActivity.this, "密码不能为空", Toast.LENGTH_SHORT).show();
                } else if (editTextUsername.getText().toString().equals("Android") && editTextPassword.getText().toString().equals("123456")) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("提示")
                            .setMessage("登录成功")
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(MainActivity.this, "对话框\"确定\"按钮被点击", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(MainActivity.this, "对话框\"取消\"按钮被点击", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .create()
                            .show();

                } else {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("提示")
                            .setMessage("登录失败")
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(MainActivity.this, "对话框\"确定\"按钮被点击", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(MainActivity.this, "对话框\"取消\"按钮被点击", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .create()
                            .show();
                }
            }

        });

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radioStu.getId()) {
                    Toast.makeText(MainActivity.this, "学生身份被选中", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == radioTeacher.getId()) {
                    Toast.makeText(MainActivity.this, "教师身份被选中", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == radioCorporation.getId()) {
                    Toast.makeText(MainActivity.this, "社团身份被选中", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == radioManager.getId()) {
                    Toast.makeText(MainActivity.this, "管理者身份被选中", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio);
                int checkedId = radioGroup.getCheckedRadioButtonId();
                if (checkedId == R.id.radioStu) {
                    Toast.makeText(MainActivity.this, "学生身份注册功能尚未开启", Toast.LENGTH_SHORT).show();
                } else if (checkedId == radioTeacher.getId()) {
                    Toast.makeText(MainActivity.this, "教师身份注册功能尚未开启", Toast.LENGTH_SHORT).show();
                } else if (checkedId == radioTeacher.getId()) {
                    Toast.makeText(MainActivity.this, "社团身份注册功能尚未开启", Toast.LENGTH_SHORT).show();
                } else if (checkedId == radioCorporation.getId()) {
                    Toast.makeText(MainActivity.this, "管理者身份注册功能尚未开启", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
