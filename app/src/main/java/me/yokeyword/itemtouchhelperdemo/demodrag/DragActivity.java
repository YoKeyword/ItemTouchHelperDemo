package me.yokeyword.itemtouchhelperdemo.demodrag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.List;

import me.yokeyword.itemtouchhelperdemo.R;
import me.yokeyword.itemtouchhelperdemo.helper.ItemDragHelperCallback;

/**
 * 拖拽
 * Created by YoKeyword on 16/1/4.
 */
public class DragActivity extends AppCompatActivity {
    private RecyclerView mRecy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        mRecy = (RecyclerView) findViewById(R.id.recy);
        init();
    }

    private void init() {
        final List<String> items = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            items.add("Index " + i);
        }

        GridLayoutManager manager = new GridLayoutManager(this, 2);
        mRecy.setLayoutManager(manager);

        ItemDragHelperCallback callback = new ItemDragHelperCallback(){
            @Override
            public boolean isLongPressDragEnabled() {
                // 长按拖拽打开
                return true;
            }
        };
        ItemTouchHelper helper = new ItemTouchHelper(callback);
        helper.attachToRecyclerView(mRecy);

        DragAdapter adapter = new DragAdapter(this, items);
        mRecy.setAdapter(adapter);
    }
}