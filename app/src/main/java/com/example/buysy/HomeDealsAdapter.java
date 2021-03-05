package com.example.buysy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lid.lib.LabelButtonView;

import java.util.ArrayList;

public class HomeDealsAdapter extends RecyclerView.Adapter<HomeDealsAdapter.ViewHolder>{
    ArrayList<String> homeDealsList;
    Context context;

    public HomeDealsAdapter(ArrayList<String> homeDealsList, Context context) {
        this.homeDealsList = homeDealsList;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item=homeDealsList.get(position);



    }

    @Override
    public int getItemCount() {
        return homeDealsList.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.home_products_card, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public ImageView imageViewProduct;
        public LabelButtonView labelButtonView;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            imageViewProduct = (ImageView) itemView.findViewById(R.id.image_view_card);
            labelButtonView = itemView.findViewById(R.id.image_label);
        }
    }
}
