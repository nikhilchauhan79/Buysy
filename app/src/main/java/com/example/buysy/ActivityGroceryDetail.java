package com.example.buysy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

public class ActivityGroceryDetail extends AppCompatActivity {
    ImageView imageViewDetail,imageViewHeart;
    TextView textViewpriceDetail,textViewRupees,textViewDetails,textViewNutrients,textViewReviews;
    Button buttonAddtoCart;
    NumberPicker numberPicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery_detail);

        imageViewDetail=findViewById(R.id.image_view_gro_detail);
        textViewpriceDetail=findViewById(R.id.text_view_price_detail);
        textViewRupees=findViewById(R.id.text_view_rupees);
        numberPicker=findViewById(R.id.number_picker);
        textViewDetails=findViewById(R.id.details);
        imageViewDetail=findViewById(R.id.image_view_gro_detail);

        buttonAddtoCart=findViewById(R.id.add_to_cart);
        imageViewHeart=findViewById(R.id.image_view_heart);
        textViewReviews=findViewById(R.id.reviews);
        textViewNutrients=findViewById(R.id.nutrients);

    }
}