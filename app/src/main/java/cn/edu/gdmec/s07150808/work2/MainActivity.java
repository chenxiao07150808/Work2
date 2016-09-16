package cn.edu.gdmec.s07150808.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Work2","onStar()运行");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Work2","onResume()运行了");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d("work2","onPause()运行了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Work2","onStop()运行了");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Work2","onPostResume()运行了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Work2","onDestroy()运行了");
    }
}
