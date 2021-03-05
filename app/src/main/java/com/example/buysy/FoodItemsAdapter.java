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

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FoodItemsAdapter extends RecyclerView.Adapter<FoodItemsAdapter.ViewHolder>{
    ArrayList<String> foodItemsList;
    Context context;

    public FoodItemsAdapter(ArrayList<String> foodItemsList, Context context) {
        this.foodItemsList = foodItemsList;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item=foodItemsList.get(position);



    }

    @Override
    public int getItemCount() {
        return foodItemsList.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.food_item_card, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
       public TextView textViewItemName,textViewPrice;
       ImageView imageViewItem,heartFoodItem;


        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            super(itemView);
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            textViewItemName=itemView.findViewById(R.id.item_name);
            textViewPrice=itemView.findViewById(R.id.text_view_rupees);
            imageViewItem=itemView.findViewById(R.id.image_view_item);

            heartFoodItem=itemView.findViewById(R.id.heart_food_item);




        }
    }
}
