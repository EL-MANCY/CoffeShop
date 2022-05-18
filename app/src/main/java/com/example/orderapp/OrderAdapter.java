package com.example.orderapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.orderapp.MenuItems.BubbleTea;
import com.example.orderapp.MenuItems.Cappucino;
import com.example.orderapp.MenuItems.InfoActivity;
import com.example.orderapp.MenuItems.LatteActivity;
import com.example.orderapp.MenuItems.Matcha;
import com.example.orderapp.MenuItems.OrangeSmoothie;
import com.example.orderapp.MenuItems.OrangeVanilla;
import com.example.orderapp.MenuItems.Tea;
import com.example.orderapp.MenuItems.ThaiTea;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {

    List<Model> modelList;
    Context context;

    public OrderAdapter(Context context, List<Model> modelList) {
                this.context = context;
                this.modelList = modelList;
    }
//TO SHOW THE ITEMS IN THE RECYCLER VIEW
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.listitem, parent, false);
        return new ViewHolder(view);

    }
//To change data in each item of the recycler view
    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {

        // here we will find the position and start setting the output on our  Recyclerview
        // for each item in the list

        String nameofDrink = modelList.get(position).getmDrinkName();
        String descriptionofdrink = modelList.get(position).getmDrinkDetail();
        int images = modelList.get(position).getmDrinkPhoto();

        holder.mDrinkName.setText(nameofDrink);
        holder.mDrinkDescription.setText(descriptionofdrink);
        holder.imageView.setImageResource(images);

    }

    @Override
    public int getItemCount() {
        // to know how many times it will be shown
        return modelList.size();
        //return 3;
    }

    // in order to make our views responsive we can implement onclicklistener on our recyclerview
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // here we will find the views on which we will inflate our data

        TextView mDrinkName, mDrinkDescription;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            mDrinkName = itemView.findViewById(R.id.coffeeName);
            mDrinkDescription = itemView.findViewById(R.id.description);
            imageView = itemView.findViewById(R.id.coffeeImage);

            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {

            // lets get the position of the view in list and then work on it

            int position = getAdapterPosition();

            if (position == 0) {
                Intent intent = new Intent(context, InfoActivity.class);
                context.startActivity(intent);
            }

            if (position == 1) {
                Intent intent2 = new Intent(context, LatteActivity.class);
                context.startActivity(intent2);
            }
            if (position == 2) {
                Intent intent3 = new Intent(context, OrangeSmoothie.class);
                context.startActivity(intent3);
            }
            if (position == 3) {
                Intent intent4 = new Intent(context, OrangeVanilla.class);
                context.startActivity(intent4);
            }
            if (position == 4) {
                Intent intent5 = new Intent(context, Cappucino.class);
                context.startActivity(intent5);
            }
            if (position == 5) {
                Intent intent6 = new Intent(context, ThaiTea.class);
                context.startActivity(intent6);
            }
            if (position == 6) {
                Intent intent7 = new Intent(context, Tea.class);
                context.startActivity(intent7);
            }
            if (position == 7) {
                Intent intent8 = new Intent(context, BubbleTea.class);
                context.startActivity(intent8);
            }
            if (position == 8) {
                Intent intent9 = new Intent(context, Matcha.class);
                context.startActivity(intent9);
            }
        }
    }
}
