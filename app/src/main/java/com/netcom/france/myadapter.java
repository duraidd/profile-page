package com.netcom.france;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class myadapter extends RecyclerView.Adapter<myadapter.ViewHolder> {
    private List<model> listItems;
    Context context;

    public myadapter(List<model> listItems,Context context) {
        this.listItems = listItems;
        this.context=context;
    }
    @NonNull
    @Override
    public myadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_content,parent,false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull myadapter.ViewHolder holder, int position) {
        model temp=listItems.get(position);
        model listItem=listItems.get(position);
        holder.img.setImageResource(listItem.getLogo());
        holder.txt1.setText(listItem.getAbout());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,second.class);
                i.putExtra("Account",temp.getLogo());
                i.putExtra("Account",temp.getAbout());
//                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
               // context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txt1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.about);
            img=itemView.findViewById(R.id.imageView);
        }
    }
}
