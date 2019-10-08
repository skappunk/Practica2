package mx.edu.tesoem.isc.p2karr.karr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Pag2(View v){
        Intent framep= new Intent(this,Pag2.class);
        startActivity(framep);
        finish();
    }
}
