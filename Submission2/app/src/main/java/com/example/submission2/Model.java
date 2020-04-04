package com.example.submission2;

import android.os.Parcel;
import android.os.Parcelable;

public class Model implements Parcelable {
    private String name;
    private String description;
    private int photo;

    public Model() {
    }


    protected Model(Parcel in) {
        name = in.readString ();
        description = in.readString ();
        photo = in.readInt ();
    }

    public static final Creator<Model> CREATOR = new Creator<Model> () {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model ( in );
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel , int i) {

        parcel.writeString ( name );
        parcel.writeString ( description );
        parcel.writeInt ( photo );
    }
}
