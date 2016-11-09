package es.iesnervion.fjruiz.mov_05_actextygridview;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fjruiz on 9/11/16.
 */

public class Pelicula implements Parcelable {
    private String name;
    private int foto;

    public Pelicula(){
        name="Defecto";
        foto=R.drawable.defecto;
    }

    public Pelicula(String name, int foto) {
        this.name = name;
        this.foto = foto;
    }

    protected Pelicula(Parcel in) {
        name = in.readString();
        foto = in.readInt();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public static final Creator<Pelicula> CREATOR = new Creator<Pelicula>() {
        @Override
        public Pelicula createFromParcel(Parcel in) {
            return new Pelicula(in);
        }

        @Override
        public Pelicula[] newArray(int size) {
            return new Pelicula[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(foto);
    }
}
