package com.coo.lucenesearch;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.yanzhenjie.permission.AndPermission;
import com.yanzhenjie.permission.runtime.Permission;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        applyPermission();
    }

    private void applyPermission() {

        AndPermission.with(this)
                .runtime()
                .permission(Permission.WRITE_EXTERNAL_STORAGE)
                .onGranted(permissions -> {
                    // Storage permission are allowed.
                    findViewById(R.id.btn_search).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mergeAndSearch();
                            new Thread(new Runnable() {
                                @Override
                                public void run() {

                                }
                            }).start();
                        }
                    });
                })
                .onDenied(permissions -> {
                    Toast.makeText(this, "请授予sdcard权限", Toast.LENGTH_SHORT).show();
                })
                .start();
    }

    private void mergeAndSearch() {
        FileSearchDemo demo = new FileSearchDemo();

        String path1 = "mnt/sdcard/lucene/content1";
        String index1 = "mnt/sdcard/lucene/lucene1";
        FileUtil.createDir(path1);
        FileUtil.createDir(index1);

        String path2 = "mnt/sdcard/lucene/content2";
        String index2 = "mnt/sdcard/lucene/lucene2";
        FileUtil.createDir(path2);
        FileUtil.createDir(index2);

        demo.creatIndex("mnt/sdcard/lucene/lucene1", "mnt/sdcard/lucene/content1");
        demo.creatIndex("mnt/sdcard/lucene/lucene2", "mnt/sdcard/lucene/content2");
        demo.mergeIndexFiles("mnt/sdcard/lucene/lucene2", "mnt/sdcard/lucene/lucene1");
        demo.search("一个个", "mnt/sdcard/lucene/lucene1");
    }


}
