package com.example.submission2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailItem extends AppCompatActivity {

    public static final String EXTRA_PERSON = "extra_person" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_detail_item );

        ImageView imgPhotoDetail = findViewById ( R.id.img_photo_detail );
        TextView tvNameDetail = findViewById ( R.id.txt_name_detail );
        TextView tvDescriptionDetail = findViewById ( R.id.txt_description_detail );

        Model model = getIntent ().getParcelableExtra ( EXTRA_PERSON );
        imgPhotoDetail.setImageResource ( model.getPhoto () );
        tvNameDetail.setText ( model.getName () );
        tvDescriptionDetail.setText ( model.getDescription () );
    }
}
