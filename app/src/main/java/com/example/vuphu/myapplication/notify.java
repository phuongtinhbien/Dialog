package com.example.vuphu.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class notify {

    private Activity context;
    private final Dialog dialog;
    private Button dialogButton;
    private TextView text;
    private ImageView icon;
    final LinearLayout.LayoutParams lp = new
            LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT);

    @SuppressLint("ResourceAsColor")
    public notify(Activity context) {
        this.context = context;
        dialog = new Dialog(this.context,R.style.translucentDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
  dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));
        dialog.setContentView(R.layout.notify);
        dialogButton = dialog.findViewById(R.id.btn_ok);
        icon = dialog.findViewById(R.id.icon_notify);
        text = dialog.findViewById(R.id.text_notify);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }

    public void setIcon(int icon) {
        this.icon.setImageResource(icon);
    }

    public void setText(String text) {
        this.text.setText(text);
    }

    public void show() {
        dialog.show();
    }

}