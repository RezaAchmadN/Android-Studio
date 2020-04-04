package com.example.submission2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>{
    private ArrayList<Model> listMovie;
    private Context context;

    public ListAdapter(ArrayList<Model> listMovie , Context context) {
        this.listMovie = listMovie;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder , int position) {
        final Model model = listMovie.get(position);
        holder.imgPhoto.setImageResource ( model.getPhoto () );
        holder.tvName.setText( model.getName());
        holder.tvFrom.setText( model.getDescription ());

        holder.itemView.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Toast.makeText ( context, model.getName (), Toast.LENGTH_LONG).show ();
                Model parcel = new Model ( );
                parcel.setName ( model.getName () );
                parcel.setDescription ( model.getDescription () );
                parcel.setPhoto ( model.getPhoto () );

                Intent intent = new Intent ( context,DetailItem.class );
                intent.putExtra ( DetailItem.EXTRA_PERSON,parcel );
                context.startActivity ( intent );
            }
        } );
    }

    @Override
    public int getItemCount() {
        return listMovie.size ();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom;

        public ListViewHolder(@NonNull View itemView) {
            super ( itemView );
                imgPhoto = itemView.findViewById(R.id.img_photo);
                tvName = itemView.findViewById(R.id.txt_name);
                tvFrom = itemView.findViewById(R.id.txt_description);

        }
    }
}
