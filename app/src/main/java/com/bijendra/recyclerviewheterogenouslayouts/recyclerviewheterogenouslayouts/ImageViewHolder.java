package com.bijendra.recyclerviewheterogenouslayouts.recyclerviewheterogenouslayouts;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Newdream on 11-Jan-17.
 */

public class ImageViewHolder extends RecyclerView.ViewHolder {
    public ImageView mIvImage;
    public ImageViewHolder(View itemView) {
        super(itemView);
        mIvImage= (ImageView) itemView.findViewById(R.id.ivImage);
    }
}
