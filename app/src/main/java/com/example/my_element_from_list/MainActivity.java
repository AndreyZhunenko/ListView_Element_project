package com.example.my_element_from_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView tovarImage = findViewById(R.id.itemImage);
        TextView tovarName = findViewById(R.id.itemName);
        TextView tovarPNT = findViewById(R.id.itemPNT);
        TextView tovarPrice = findViewById(R.id.itemPrice);
        Product myProduct = new Product("Немецкий нож", "100001", 1950);

        tovarImage.setImageResource(R.drawable.knife);
        tovarName.setText(myProduct.name);
        tovarPNT.setText(myProduct.PNT);
        tovarPrice.setText(Integer.toString(myProduct.price));

    }
}