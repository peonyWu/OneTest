package com.example.administrator.gittestone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("dd","ff");
        Toast.makeText(this,"ddd",Toast.LENGTH_SHORT).show();
        Log.i("dd","吴牡丹删除了属性代码");

        Log.i("zh","张洪提交的代码1111");
        Log.i("zh","张洪提交的代码");
        Log.i("zh","吴牡丹提交的代码");
        Log.i("zh","吴牡丹提交的代码1111");

        Log.i("zh","zhanghong提交的代码2222");

        Log.i("zh","吴牡丹提交的代码3333");

        Log.i("zh","吴牡丹提交的代码333");

        Log.i("zh","吴牡丹提交的代码333");
        Log.i("zh","张洪星期一提交的代码");
    }
}
