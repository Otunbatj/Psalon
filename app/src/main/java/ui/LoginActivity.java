package ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.psalon.psalon.R;

import controller.LoginWidgetValidation;
import controller.SalonSignupLink;

public class LoginActivity extends AppCompatActivity {
    private TextView tvSignupLink;
    private EditText etEmailAddress;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //edit texts
        etEmailAddress = (EditText) findViewById(R.id.input_email);
        etPassword = (EditText) findViewById(R.id.input_password);

        //button
        btnLogin = (Button) findViewById(R.id.btn_login);

        tvSignupLink = (TextView) findViewById(R.id.link_signup);
        //implementation of link to sign up
        tvSignupLink.setOnClickListener(new SalonSignupLink(this));

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });


    }

    public void login() {
        if (!LoginWidgetValidation.validate(etEmailAddress, etPassword)) {
            onLoginFailed();
            return;
        }
        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
        progressDialog.show();

        String email = etEmailAddress.getText().toString();
        String password = etPassword.getText().toString();

    }

    public void onLoginFailed() {
        Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show();
        btnLogin.setEnabled(true);
    }
}
