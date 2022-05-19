package com.willyrisqifazla.recyclerviewb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class MahasiswaViewHolder extends RecyclerView.ViewHolder
{
   public ImageView _jkImageView;
   public TextView _jkTextview;
   public TextView _jpTextview;
   public TextView _namaTextView;
   public TextView _nimTextView;

    public MahasiswaViewHolder(View itemView) {
        super(itemView);
        _jkImageView = (ImageView) itemView.findViewById(R.id.jkImageView);
        _jkTextview = (TextView) itemView.findViewById(R.id.jkTextView);
        _jpTextview = (TextView) itemView.findViewById(R.id.jpTextView);
        _namaTextView = (TextView) itemView.findViewById(R.id.namaTextView);
        _nimTextView = (TextView) itemView.findViewById(R.id.nimTextView);

    }
}
