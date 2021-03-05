package com.example.buysy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lid.lib.LabelButtonView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CircleCategoryAdapter extends RecyclerView.Adapter<CircleCategoryAdapter.ViewHolder>{
    ArrayList<String> categoriesItemsList;
    Context context;

    public CircleCategoryAdapter(ArrayList<String> categoriesItemsList, Context context) {
        this.categoriesItemsList = categoriesItemsList;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String category=categoriesItemsList.get(position);

    }

    @Override
    public int getItemCount() {
        return categoriesItemsList.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.rv_items_home, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public CircleImageView circleImageView;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            circleImageView = itemView.findViewById(R.id.circle_image);
        }
    }
}
