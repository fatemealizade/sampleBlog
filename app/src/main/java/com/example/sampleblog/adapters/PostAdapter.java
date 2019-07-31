package com.example.sampleblog.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

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
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            convertView = inflater.inflate(R.layout.post_item, container, false);
        }

        ((TextView) convertView.findViewById(R.id.post_id))
                .setText(String.valueOf(getItem(position).id));
        ((TextView) convertView.findViewById(R.id.post_title))
                .setText(getItem(position).title);
        ((TextView) convertView.findViewById(R.id.post_body))
                .setText(getItem(position).body);

        convertView.findViewById(R.id.post_btn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(mContext, String.valueOf(getItem(position).id), Toast.LENGTH_SHORT).show();
                    }
                });

        return convertView;
    }

}
