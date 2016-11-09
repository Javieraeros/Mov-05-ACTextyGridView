package es.iesnervion.fjruiz.mov_05_actextygridview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayAdapter<String> autoCompleteAdapter;
    AutoCompleteTextView act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res=getResources();
        String[] pelis=res.getStringArray(R.array.sugerencias);
        autoCompleteAdapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,pelis);
        act=(AutoCompleteTextView) findViewById(R.id.autoComplete);
        act.setAdapter(autoCompleteAdapter);
        Button siguiente=(Button) findViewById(R.id.siguiente);
        siguiente.setOnClickListener(this);
    }

    @Override
    protected void onPause(){
        super.onPause();

    }

    @Override
    protected void onResume(){
        super.onResume();
    }


    @Override
    public void onClick(View v) {
        Intent fotito=new Intent(this,fotito.class);
        /*No funciona en la API 14
        Bundle info=new Bundle();
        info.putString("Pelicula",act.getText().toString());*/
        startActivity(fotito);
    }

    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data){

    }
}
