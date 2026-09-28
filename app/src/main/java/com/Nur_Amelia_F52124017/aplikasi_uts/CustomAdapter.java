package com.Nur_Amelia_F52124017.aplikasi_uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] nama;
    private String[] nim;
    private String[] prodi;
    private String[] ttl;
    private int[] foto;

    public CustomAdapter(Context context, String[] nama, String[] nim,
                         String[] prodi, String[] ttl, int[] foto) {
        this.context = context;
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.ttl = ttl;
        this.foto = foto;
    }

    @Override
    public int getCount() {
        return nama.length;
    }

    @Override
    public Object getItem(int position) {
        return nama[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.item_list, parent, false);
        }

        ImageView imgProfile = convertView.findViewById(R.id.imgProfile);
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvNim = convertView.findViewById(R.id.tvNim);
        TextView tvProdi = convertView.findViewById(R.id.tvProdi);
        TextView tvTtl = convertView.findViewById(R.id.tvTtl);

        imgProfile.setImageResource(foto[position]);
        tvName.setText(nama[position]);
        tvNim.setText("NIM: " + nim[position]);
        tvProdi.setText("Prodi: " + prodi[position]);
        tvTtl.setText("TTL: " + ttl[position]);

        return convertView;
    }
}