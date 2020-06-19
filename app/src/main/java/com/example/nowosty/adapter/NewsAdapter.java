package com.example.nowosty.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nowosty.R;
import com.example.nowosty.items.News;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter <NewsAdapter.NewsHolder>    {
    ArrayList<News> news;
    Context context;

    public NewsAdapter(ArrayList<News> news, Context context) {
        this.news = news;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()). inflate(R.layout.news_item, parent, false);
        NewsHolder newsHolder = new NewsHolder(view);
        return null;
    }


    @Override
    public void onBindViewHolder(@NonNull NewsHolder holder, int position) {
        News newsItem = news.get(position);

        String image = newsItem.getImage();
        String data = newsItem.getImage();
        String author = newsItem.getImage();
        String content = newsItem.getImage();

       // holder.image.setImageResource(newsItem.getImage());
        holder.data.setText(newsItem.getData());
        holder.author.setText(newsItem.getAuthor());
        holder.content.setText(newsItem.getContent());

    }


    @Override
    public int getItemCount() {
        return news.size();
    }


    class NewsHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView author;
        public TextView data;
        public TextView content;


        public NewsHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            author = itemView.findViewById(R.id.autor);
            data = itemView.findViewById(R.id.data);
            content = itemView.findViewById(R.id.content);




        }
    }
}
