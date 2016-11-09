package es.iesnervion.fjruiz.mov_05_actextygridview;

import android.content.res.Resources;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class fotito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotito);

        Resources res=getResources();
        String[] nombres=res.getStringArray(R.array.sugerencias);

        Pelicula piedra=new Pelicula(nombres[0],R.drawable.piedra);
        Pelicula[] pelis={piedra};
        MyArrayAdapter aa=new MyArrayAdapter(this,R.layout.imagen,R.id.nombre,pelis);
        GridView grid=(GridView) findViewById(R.id.grid);
        grid.setAdapter(aa);
    }
}
