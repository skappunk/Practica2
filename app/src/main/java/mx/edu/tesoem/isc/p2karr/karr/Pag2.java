package mx.edu.tesoem.isc.p2karr.karr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pag2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag2);
    }
    public void mainactivity(View v){
        Intent principal= new Intent(this,MainActivity.class);
        startActivity(principal);
        finish();
    }
}
