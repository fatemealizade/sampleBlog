package com.example.sampleblog.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sampleblog.MainActivity;
import com.example.sampleblog.NextPage;
import com.example.sampleblog.R;
import com.example.sampleblog.models.Post;

public class PostAdapter extends BaseAdapter {

    private Context mContext;
    private Post[] mPosts;

    public PostAdapter(Context context, Post[] posts) {
        mContext = context;
        mPosts = posts;
    }

    // override other abstract methods here

    @Override
    public int getCount() {
        return mPosts.length;
    }

    @Override
    public Post getItem(int i) {
        return mPosts[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup container) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            int item_layout = R.layout.post_item;
            long id = getItem(position).id;
//            if (id % 2 == 0) {
//                item_layout = R.layout.post_item2;
//            }
            convertView = inflater.inflate(R.layout.post_item, container, false);
        }

        ((TextView) convertView.findViewById(R.id.post_id))
                .setText(String.valueOf(getItem(position).id));
        ((TextView) convertView.findViewById(R.id.post_title))
                .setText(getItem(position).title);
        if (getItem(position).id %  2 == 0) {
            ((TextView) convertView.findViewById(R.id.post_title))
                    .setBackgroundColor(Color.BLUE);
        }
        ((TextView) convertView.findViewById(R.id.post_body))
                .setText(getItem(position).body);

        convertView.findViewById(R.id.post_btn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(mContext, String.valueOf(getItem(position).userId), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(mContext, NextPage.class);
                        intent.putExtra("userId", getItem(position).userId);
                        mContext.startActivity(intent);


                    }
                });

        return convertView;
    }

}
