package com.example.retrofitexamplesapp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.retrofitexamplesapp.Model.User;
import com.example.retrofitexamplesapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    Context context;
    List<User> data;
    ImageView profilepic;
    TextView username;

    public UserAdapter(List<User> data, Context context) {
        this.context = context;
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final User geter1 = data.get(position);
        String login, image;
        login = geter1.getLogin();
        image = geter1.getAvatarUrl();

        username.setText(login);
        Picasso.get().load(image).into(profilepic);


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);

            profilepic = (ImageView) itemView.findViewById(R.id.profilepic);
            username = (TextView) itemView.findViewById(R.id.username);


        }
    }
}
