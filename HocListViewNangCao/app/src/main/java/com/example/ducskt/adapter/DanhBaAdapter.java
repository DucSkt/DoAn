package com.example.ducskt.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ducskt.hoclistviewnangcao.MainActivity;
import com.example.ducskt.hoclistviewnangcao.R;
import com.example.ducskt.model.DanhBa;

import java.util.List;

/**
 * Created by DUC SKT on 11-Oct-17.
 */

public class DanhBaAdapter extends ArrayAdapter<DanhBa>{

     Activity context; //màn hình sử dụng cái giao diện này
      int resource;  // giao diện cho từng dòng muốn hiển thị,layout làm theo khách hàng
    List<DanhBa> objects;  //danh sách nguồn dữ liệu muốn hiển thị len giao diện

    public DanhBaAdapter( Activity context,  int resource, List<DanhBa> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }


    public View getView(int position,  View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();  //LayoutInflater là 1 lớp để xây dựng thành 1 code java mak androi có thể sử dụng được, như bộ chuyển đổi thôi.mã hóa.
        View duc=inflater.inflate(this.resource,null); // item trong layout = this.resource
       // inflate build, biên dịch file XML(item) trong resource thành lớp trong bộ nhớ.

        TextView txtTen= (TextView) duc.findViewById(R.id.txtTen);
        TextView txtPhone= (TextView) duc.findViewById(R.id.txtPhone);
        ImageButton btnCall= (ImageButton) duc.findViewById(R.id.btnCall);
        ImageButton btnSms= (ImageButton) duc.findViewById(R.id.btnSms);
        ImageButton btnChiTiet= (ImageButton) duc.findViewById(R.id.btnChiTiet);


        final DanhBa danhBa=this.objects.get(position); // trả về danh bạ hiện tại muốn vẽ
        txtTen.setText(danhBa.getTen());
        txtPhone.setText(danhBa.getPhone());

        btnChiTiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLy(danhBa);
            }
        });

        return duc;
    }

    private void xuLy(DanhBa danhBa) {
        Toast.makeText(this.context,"ban chọn"+danhBa.getTen(),Toast.LENGTH_SHORT).show();
    }
}
