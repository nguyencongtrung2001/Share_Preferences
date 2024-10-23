package com.example.scroll_recyclerview;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodViewActivity extends AppCompatActivity {

    private RecyclerView rcvFood;
    private Button btncafe, btntrasua, btnsuachua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_view);

        btncafe = findViewById(R.id.btn_cafe);
        btntrasua = findViewById(R.id.btn_trasua);
        btnsuachua = findViewById(R.id.btn_suachua);

        rcvFood = findViewById(R.id.rcv_food);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rcvFood.setLayoutManager(gridLayoutManager);

        FoodAdapter adapter = new FoodAdapter(getListFood()); // Sử dụng danh sách trả về từ getListFood
        rcvFood.setAdapter(adapter);
    }

    private List<Food> getListFood() {
        List<Food> list = new ArrayList<>();
        list.add(new Food("Xiaomi", R.drawable.xiaomi, Food.TYPE_CAFE));
        list.add(new Food("Xiaomi", R.drawable.xiaomi, Food.TYPE_CAFE));
        list.add(new Food("Xiaomi", R.drawable.xiaomi, Food.TYPE_CAFE));
        list.add(new Food("Xiaomi", R.drawable.xiaomi, Food.TYPE_CAFE));
        list.add(new Food("Xiaomi", R.drawable.xiaomi, Food.TYPE_CAFE));

        list.add(new Food("Reamel", R.drawable.reamel, Food.TYPE_TRASUA));
        list.add(new Food("Reamel", R.drawable.reamel, Food.TYPE_TRASUA));
        list.add(new Food("Reamel", R.drawable.reamel, Food.TYPE_TRASUA));
        list.add(new Food("Reamel", R.drawable.reamel, Food.TYPE_TRASUA));
        list.add(new Food("Reamel", R.drawable.reamel, Food.TYPE_TRASUA));

        list.add(new Food("Sam Sung", R.drawable.samsung, Food.TYPE_SUACHUA));
        list.add(new Food("Sam Sung", R.drawable.samsung, Food.TYPE_SUACHUA));
        list.add(new Food("Sam Sung", R.drawable.samsung, Food.TYPE_SUACHUA));
        list.add(new Food("Sam Sung", R.drawable.samsung, Food.TYPE_SUACHUA));
        list.add(new Food("Sam Sung", R.drawable.samsung, Food.TYPE_SUACHUA));

        return list; // Trả về danh sách
    }
}
