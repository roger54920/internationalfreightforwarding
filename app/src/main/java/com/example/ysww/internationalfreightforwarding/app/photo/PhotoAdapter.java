package com.example.ysww.internationalfreightforwarding.app.photo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.ysww.internationalfreightforwarding.R;
import com.jph.takephoto.model.TImage;

import java.util.ArrayList;
import java.util.List;

public class PhotoAdapter extends
        RecyclerView.Adapter<PhotoAdapter.ViewHolder> {

    private int selectMax = 3;
    public final int TYPE_CAMERA = 1;
    public final int TYPE_PICTURE = 2;

    private Context mContext;
    private LayoutInflater mInflater;
    private List<TImage> list = new ArrayList<>();


    //点击添加图片跳转
    private onAddPicListener mOnAddPicListener;

    public interface onAddPicListener {
        void onAddPicClick(int type, int position);
    }

    //点击图片放大
    private onPicClickListener mOnPicClickListener;

    public interface onPicClickListener {
        void onPicClick(View view, int position);
    }

    public PhotoAdapter(Context context, onAddPicListener mOnAddPicListener, onPicClickListener mOnPicClickListener) {
        mInflater = LayoutInflater.from(context);
        this.mContext = context;
        this.mOnAddPicListener = mOnAddPicListener;
        this.mOnPicClickListener = mOnPicClickListener;
    }

    public void setSelectMax(int selectMax) {
        this.selectMax = selectMax;
    }

    public void setList(List<TImage> list) {
        this.list = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView mPhoto_image;
        ImageView mPhoto_del;

        public ViewHolder(View view) {
            super(view);
            mPhoto_image = (ImageView) view.findViewById(R.id.photo_image);
            mPhoto_del = (ImageView) view.findViewById(R.id.photo_del);
        }
    }

    @Override
    public int getItemCount() {
        if (list.size() < selectMax) {
            return list.size() + 1;
        } else {
            return list.size();
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (isShowAddItem(position)) {
            return TYPE_CAMERA;
        } else {
            return TYPE_PICTURE;
        }
    }

    /**
     * 创建ViewHolder
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.activity_photo_item,
                viewGroup, false);
        final ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    private boolean isShowAddItem(int position) {
        int size = list.size() == 0 ? 0 : list.size();
        return position == size;
    }

    /**
     * 设置值
     */
    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
        //少于3张，显示继续添加的图标
        Log.d("...", "onBindViewHolder: " + position);
        if (getItemViewType(position) == TYPE_CAMERA) {
            viewHolder.mPhoto_image.setImageResource(R.mipmap.photo_order_picture);
            viewHolder.mPhoto_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnAddPicListener.onAddPicClick(0, viewHolder.getAdapterPosition());
                }
            });
            viewHolder.mPhoto_del.setVisibility(View.INVISIBLE);
        } else {
            viewHolder.mPhoto_del.setVisibility(View.VISIBLE);
            viewHolder.mPhoto_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mOnPicClickListener.onPicClick(view, viewHolder.getAdapterPosition());
                }
            });
            viewHolder.mPhoto_del.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mOnAddPicListener.onAddPicClick(1, viewHolder.getAdapterPosition());
                }
            });

            Glide.with(mContext)
                    .load(list.get(position).getCompressPath())
                    .crossFade()
                    .into(viewHolder.mPhoto_image);
        }
    }
}

