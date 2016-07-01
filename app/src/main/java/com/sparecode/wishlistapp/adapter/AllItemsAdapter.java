package com.sparecode.wishlistapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sparecode.wishlistapp.R;

/**
 * Created by master on 22-06-2016.
 */
public class AllItemsAdapter extends RecyclerView.Adapter<AllItemsAdapter.AllItemHolder> {


    @Override
    public AllItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_items, parent, false);

        return new AllItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AllItemHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class AllItemHolder extends RecyclerView.ViewHolder {

        public AllItemHolder(View itemView) {
            super(itemView);
        }
    }
}
