package com.bijendra.recyclerviewheterogenouslayouts.recyclerviewheterogenouslayouts;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Newdream on 11-Jan-17.
 */

public class StudentViewHolder  extends RecyclerView.ViewHolder
{
   public TextView mTvName,mTvAge,mTvCourse;
    public StudentViewHolder(View itemView) {
        super(itemView);
        mTvName= (TextView) itemView.findViewById(R.id.tv_name);
        mTvAge= (TextView) itemView.findViewById(R.id.tv_age);
        mTvCourse= (TextView) itemView.findViewById(R.id.tv_course);
    }


}
