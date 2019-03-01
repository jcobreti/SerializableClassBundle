package android.edu.serializableclassbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {
    private Persona p2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

     //Pintamos la flechita para atras
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    //Obtenemos los Extras
        Bundle b= getIntent().getExtras();
        p2=(Persona)b.getSerializable("PERSONA");
        Toast.makeText(this,"Persona: ("+p2.getNombre()+","+p2.getEdad()+")",Toast.LENGTH_LONG).show();

    }
    //Recibimos evento para la flecha estandar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        { case android.R.id.home:
                super.onBackPressed();
                break;
        }
        return true;
    }
}
