package com.kamak.listviewfragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kamak.listviewfragment.R;



public class adapter extends BaseAdapter {

    private Context context;

    private final String[] txtnm;
    private final int [] thumbnail;

    public adapter(Context context, String[] txtnm, int[] thumbnail){
        //super(context, R.layout.single_list_app_item, utilsArrayList);
        this.context = context;

        this.txtnm = txtnm;
        this.thumbnail = thumbnail;
    }

    @Override
    public int getCount() {
        return txtnm.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list, parent, false);
            viewHolder.textnama = convertView.findViewById(R.id.txtnm);
            viewHolder.imgprofil = convertView.findViewById(R.id.profile_image);
            viewHolder.thumb = convertView.findViewById(R.id.thumbnail);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textnama.setText(txtnm[position]);

        viewHolder.thumb.setImageResource(thumbnail[position]);

        return convertView;
    }

    private static class ViewHolder {

        TextView textnama;
        ImageView thumb;

        ImageView imgprofil;

    }
}
