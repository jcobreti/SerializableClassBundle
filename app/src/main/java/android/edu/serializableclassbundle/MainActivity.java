package android.edu.serializableclassbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText t1, t2;
    private int edad;
    private String nombre, edadTxt;
    private Persona p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.et1);
        t2=findViewById(R.id.et2);
   }

    public void siguiente(View view) {

        nombre=t1.getText().toString();
        edadTxt=t2.getText().toString();
        edad=Integer.parseInt(edadTxt);
        p1=new Persona(nombre,edad);

        //Construimos el INTENT
        Intent intent=new Intent(this,Actividad2.class);
        intent.putExtra("PERSONA",p1);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        t1.setText("");
        t2.setText("");
        super.onStart();
    }
}
