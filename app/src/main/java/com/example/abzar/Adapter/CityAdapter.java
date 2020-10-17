package com.example.abzar.Adapter;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import com.example.abzar.R;

import java.util.ArrayList;

public class CityAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<ClipData.Item> mItem;

    public CityAdapter (Context mContext,ArrayList<ClipData.Item> mItem){
        this.mContext=mContext;
        this.mItem=mItem;
    }
// tedad item ra barmighardanad
    @Override
    public int getCount() {
        return mItem.size();
    }
// makan & shomare item ra midahad
    @Override
    public Object getItem(int i) {
        return mItem.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(mContext).inflate(R.layout.list_city,viewGroup,false);
        }
        ClipData.Item currentItem = (ClipData.Item) getItem();

        ImageView imgItemCall=view.findViewById(R.id.img_call);
        TextView txtItemName=view.findViewById(R.id.txt_name);
        TextView txtItemCode=view.findViewById(R.id.txt_cod);

        txtItemName.setText(currentItem.getTxt_name());
        txtItemCode.setText(currentItem.getTxt_code());

        String mUri = "@dawabele/" + currentItem.getImg_call();
        int imageSource = mContext.getResources().getIdentifier(mUri,null,mContext.getPackageName());
        imgItemCall.setImageDrawable(ResourcesCompat.getDrawable(mContext.getResources(),imageSource,null));

        return view;



    }
}
