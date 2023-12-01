package com.cursoandroid.navigationdrawer.ui.principal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.cursoandroid.navigationdrawer.R;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    private List<Item> itemList;

    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void setFilteredList(List<Item>filteredList) {
        this.itemList = filteredList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_adm, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.itemNameTv.setText(item.getItemName());
        holder.itemRegistro.setText(item.getRegistro());
        holder.itemImageView.setImageResource(item.getItemImage());
        holder.cardView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.anim_item_list));
    }

    @Override
    public int getItemCount() {
        if (itemList == null){
            return 0;
        } else {
            return itemList.size();
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView itemNameTv;
        private TextView itemRegistro;
        private ImageView itemImageView;
        private CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.eachCardView);
            itemNameTv = itemView.findViewById(R.id.eachItemTextView);
            itemImageView = itemView.findViewById(R.id.eachItemImageView);
            itemRegistro = itemView.findViewById(R.id.itemRegistro);
        }
    }
}