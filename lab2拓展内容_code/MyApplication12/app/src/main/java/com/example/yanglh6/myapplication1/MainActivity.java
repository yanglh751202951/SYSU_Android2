package com.example.yanglh6.myapplication1;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
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
    private TextInputLayout usernameText;
    private TextInputLayout passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        usernameText = (TextInputLayout) findViewById(R.id.more_username);
        passwordText = (TextInputLayout) findViewById(R.id.more_password);
        Button buttonLogin = (Button) findViewById(R.id.login);
        final Button buttonRegister = (Button) findViewById(R.id.register);
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
                String usernameEdit = usernameText.getEditText().getText().toString().trim();
                String passwordEdit = passwordText.getEditText().getText().toString().trim();
                if (TextUtils.isEmpty(editTextUsername.getText().toString())) {
                    usernameText.setErrorEnabled(true);
                    usernameText.setError("用户名不能为空");
                    return;
                } else {
                    usernameText.setErrorEnabled(false);
                }
                if (TextUtils.isEmpty(editTextPassword.getText().toString())) {
                    passwordText.setErrorEnabled(true);
                    passwordText.setError("密码不能为空");
                    return;
                } else {
                    passwordText.setErrorEnabled(false);
                }
                if (editTextUsername.getText().toString().equals("Android") && editTextPassword.getText().toString().equals("123456")) {
                    Snackbar.make(getWindow().getDecorView(), "登录成功", Snackbar.LENGTH_SHORT)
                            .setAction("按钮", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Snackbar的按钮被点击了", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                } else {
                    Snackbar.make(getWindow().getDecorView(), "登录失败", Snackbar.LENGTH_SHORT)
                            .setAction("按钮", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Snackbar的按钮被点击了", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();

                }
            }
        });

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radioStu.getId()) {
                    Snackbar.make(getWindow().getDecorView(), "学生身份被选中", Snackbar.LENGTH_SHORT)
                            .setAction("按钮", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Snackbar的按钮被点击了", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setDuration(5000)
                            .show();
                }
                if (checkedId == radioTeacher.getId()) {
                    Snackbar.make(getWindow().getDecorView(), "教师身份被选中", Snackbar.LENGTH_SHORT)
                            .setAction("按钮", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Snackbar的按钮被点击了", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setDuration(5000)
                            .show();
                }
                if (checkedId == radioCorporation.getId()) {
                    Snackbar.make(getWindow().getDecorView(), "社团身份被选中", Snackbar.LENGTH_SHORT)
                            .setAction("按钮", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Snackbar的按钮被点击了", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setDuration(5000)
                            .show();
                }
                if (checkedId == radioManager.getId()) {
                    Snackbar.make(getWindow().getDecorView(), "管理者身份被选中", Snackbar.LENGTH_SHORT)
                            .setAction("按钮", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Snackbar的按钮被点击了", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setDuration(5000)
                            .show();
                }
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio);
                int checkedId = radioGroup.getCheckedRadioButtonId();
                if (checkedId == R.id.radioStu) {
                    Snackbar.make(getWindow().getDecorView(), "学生身份注册功能尚未开启", Snackbar.LENGTH_SHORT)
                            .setAction("按钮", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Snackbar的按钮被点击了", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setDuration(5000)
                            .show();
                } else if (checkedId == radioTeacher.getId()) {
                    Snackbar.make(getWindow().getDecorView(), "教师身份注册功能尚未开启", Snackbar.LENGTH_SHORT)
                            .setAction("按钮", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Snackbar的按钮被点击了", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setDuration(5000)
                            .show();
                } else if (checkedId == radioCorporation.getId()) {
                    Snackbar.make(getWindow().getDecorView(), "社团身份注册功能尚未开启", Snackbar.LENGTH_SHORT)
                            .setAction("按钮", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Snackbar的按钮被点击了", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setDuration(5000)
                            .show();
                } else if (checkedId == radioManager.getId()) {
                    Snackbar.make(getWindow().getDecorView(), "管理者身份注册功能尚未开启", Snackbar.LENGTH_SHORT)
                            .setAction("按钮", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Snackbar的按钮被点击了", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setDuration(5000)
                            .show();
                }
            }
        });
    }
}