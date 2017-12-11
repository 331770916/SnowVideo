package com.example.fanlinlin.demo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 17/11/14.
 */

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<String> mDatas;

    public CustomAdapter(Context context) {
        mContext = context;
    }

    public void setDatas(List<String> datas) {
        mDatas = datas;
        notifyDataSetChanged();
    }



    @Override
    public int getItemCount() {
        if (mDatas != null && mDatas.size() > 0) {
            return mDatas.size();
        }
        return 0;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CustomViewHodler customViewHodler =(CustomViewHodler) holder;

        customViewHodler.textView.setText(mDatas.get(position));
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_item, parent, false);
        CustomViewHodler viewHodler = new CustomViewHodler(view);
        return viewHodler;
    }

    class CustomViewHodler extends RecyclerView.ViewHolder {
        private TextView textView;
        public CustomViewHodler(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.textItem);
        }
    }
}