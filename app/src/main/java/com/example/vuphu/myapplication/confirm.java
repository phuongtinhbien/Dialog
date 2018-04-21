

package com.example.vuphu.myapplication;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class confirm {
    private Activity context;
    private Dialog dialog;
    private Button confirm;
    private Button cancel;
    private TextView text;
    private ImageView icon;

    public confirm(Activity context) {
        this.context = context;


    }

    public void setText(String text) {
        this.text.setText(text);
    }

    public void setIcon(int icon) {
        this.icon.setImageResource(icon);
    }

    @SuppressLint("ResourceAsColor")
    public void show() {
        dialog = new Dialog(this.context,R.style.translucentDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));
        dialog.setContentView(R.layout.confirm);
        confirm = dialog.findViewById(R.id.btn_confirm);
        text = dialog.findViewById(R.id.text_confirm);
        cancel = dialog.findViewById(R.id.btn_cancel);
        icon = dialog.findViewById(R.id.icon_confirm);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    public void onClick(View.OnClickListener onClickListener) {
        confirm.setOnClickListener(onClickListener);
    }


}


