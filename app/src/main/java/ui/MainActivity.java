package ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;


import com.psalon.psalon.R;

import controller.HairdresserSigninClickListener;

public class MainActivity extends AppCompatActivity {
    private Button btnHairdresserSignin;
    private Button btnUserSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //implementation
        btnHairdresserSignin = (Button) findViewById(R.id.btnHairDresserSignin);
        btnHairdresserSignin.setOnClickListener(new HairdresserSigninClickListener(this));
    }
}
