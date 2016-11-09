package es.iesnervion.fjruiz.mov_05_actextygridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Documentación TODO
 */

public class MyArrayAdapter extends ArrayAdapter {
    public MyArrayAdapter(Context context, int resource,int textViewResourceID, Object[] objects) {
        super(context, resource,textViewResourceID, objects);
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent){

        View v=convertView;
        ViewHolder holder;

        Pelicula peli=(Pelicula) getItem(position);

        if(v==null) {

            v=super.getView(position,convertView,parent);
            ImageView caratula=(ImageView) v.findViewById(R.id.caratula);

            holder=new ViewHolder(v,R.id.nombre,R.id.caratula);
            v.setTag(holder);
        }else {
            holder=(ViewHolder) v.getTag();
        }
        holder.getLab().setText(peli.getName());
        holder.getImg().setImageResource(peli.getFoto());
        return v;
    }

}
