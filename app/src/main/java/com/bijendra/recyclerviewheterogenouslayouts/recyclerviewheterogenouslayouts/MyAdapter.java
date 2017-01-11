package com.bijendra.recyclerviewheterogenouslayouts.recyclerviewheterogenouslayouts;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Newdream on 11-Jan-17.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
   private List<Object> data;
    private final int STUDENT = 0, IMAGE = 1;

   public  MyAdapter(List<Object> data)
   {
     this.data=data;
   }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder=null;
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        switch (viewType)
        {
            case STUDENT:
                View sView=inflater.inflate(R.layout.layout_viewholder_student,parent,false);
                viewHolder=new StudentViewHolder(sView);
                break;
            case IMAGE:
                View iView=inflater.inflate(R.layout.layout_viewholder_image,parent,false);
                viewHolder=new ImageViewHolder(iView);
                break;

        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType())
        {
            case STUDENT:
                CStudent student= (CStudent) this.data.get(position);
                StudentViewHolder svh= (StudentViewHolder) holder;
                svh.mTvName.setText(student.getName());
                svh.mTvAge.setText(student.getAge());
                svh.mTvCourse.setText(student.getCourse());
                break;
            case IMAGE:
                CImage cImage= (CImage) this.data.get(position);
                ImageViewHolder ivh= (ImageViewHolder) holder;
                Picasso.with(ivh.mIvImage.getContext()).load(cImage.getUrl()).into(ivh.mIvImage);

                break;
        }

    }

    @Override
    public int getItemViewType(int position) {
        if( this.data.get(position) instanceof CStudent)
            return STUDENT;
        else if( this.data.get(position) instanceof CImage)
            return IMAGE;

        return -1;
    }

    @Override
    public int getItemCount() {
        return this.data.size();
    }
}
