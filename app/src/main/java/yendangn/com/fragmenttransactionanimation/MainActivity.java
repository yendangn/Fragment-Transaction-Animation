package yendangn.com.fragmenttransactionanimation;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showFragmentOne();
    }


    private void showFragmentOne() {

        Fragment fragmentOne = new FragmentOne();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragmentOne)
                .commit();


    }
}
