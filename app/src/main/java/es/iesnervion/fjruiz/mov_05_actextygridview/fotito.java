package es.iesnervion.fjruiz.mov_05_actextygridview;

import android.content.res.Resources;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class fotito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotito);

        Resources res=getResources();
        String[] nombres=res.getStringArray(R.array.sugerencias);

        Pelicula piedra=new Pelicula(nombres[0],R.drawable.piedra);
        Pelicula camara=new Pelicula(nombres[1],R.drawable.camara);
        Pelicula azkaban=new Pelicula(nombres[2],R.drawable.azkaban);
        Pelicula caliz=new Pelicula(nombres[3],R.drawable.caliz);
        Pelicula[] pelis={piedra,camara,azkaban,caliz};
        MyArrayAdapter aa=new MyArrayAdapter(this,R.layout.imagen,R.id.nombre,pelis);
        GridView grid=(GridView) findViewById(R.id.grid);
        /*Limita tod el grid a 300, por lo que la foto de la segunda fila no se ve */
        //grid.setLayoutParams(new RelativeLayout.LayoutParams(GridView.AUTO_FIT,300));
        grid.setAdapter(aa);
    }
}
