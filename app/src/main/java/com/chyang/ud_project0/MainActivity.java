package com.chyang.ud_project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        if(view instanceof Button) {
            Button bt = (Button) view;
            showToast( "This button will launch my " + bt.getText().toString().toLowerCase() + " apps! ");
        }
    }

    private void showToast(String text) {
        if(mToast == null) {
            mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
        }
        mToast.setText(text);
        mToast.show();
    }
}
