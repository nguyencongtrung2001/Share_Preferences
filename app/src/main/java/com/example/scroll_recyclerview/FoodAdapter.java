package com.example.scroll_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private List<Food> mlistFood;

    // Constructor
    public FoodAdapter(List<Food> mlistFood) {
        this.mlistFood = mlistFood;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Mục đích: Phương thức này được gọi để tạo ra một đối tượng ViewHolder mới.
        // Mỗi lần RecyclerView cần một item mới, phương thức này sẽ được gọi.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    //  Phương thức này được gọi để liên kết dữ liệu với ViewHolder tại một vị trí nhất định trong danh sách.
    // Chức năng : Nhận ViewHolder đã được tạo từ onCreateViewHolder và vị trí của item trong dữ liệu.
    //             Gán dữ liệu (như hình ảnh và văn bản) vào các thành phần trong ViewHolder dựa trên vị trí của item.
    //             Phương thức này sẽ được gọi nhiều lần cho từng item trong danh sách khi RecyclerView được cuộn.
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food = mlistFood.get(position);
        if (food == null) {
            return;
        }
        holder.imgFood.setImageResource(food.getImage());
        holder.txtnamefood.setText(food.getName());
    }

    @Override
    // Mục đích: Phương thức này trả về tổng số item trong danh sách dữ liệu.
    public int getItemCount() {
        if (mlistFood != null) {
            return mlistFood.size();
        }
        return 0;
    }

    // ViewHolder để quản lý các thành phần giao diện của item
    static class FoodViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFood;
        TextView txtnamefood;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.img_food);
            txtnamefood = itemView.findViewById(R.id.txt_food);
        }
    }
}
