package me.yokeyword.itemtouchhelperdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import me.yokeyword.itemtouchhelperdemo.demochannel.ChannelActivity;
import me.yokeyword.itemtouchhelperdemo.demodrag.DragActivity;

/**
 * Created by YoKeyword on 16/1/4.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mBtnDrag = (Button) findViewById(R.id.btn_drag);
        Button mBtnChannel = (Button) findViewById(R.id.btn_channl);
        mBtnDrag.setOnClickListener(this);
        mBtnChannel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_drag:
                startActivity(new Intent(MainActivity.this, DragActivity.class));
                break;
            case R.id.btn_channl:
                startActivity(new Intent(MainActivity.this, ChannelActivity.class));
                break;
        }
    }
}
