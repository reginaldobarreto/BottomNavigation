package br.com.barrsoft.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getName();

    @BindView(R.id.bottomNavigation)
    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.finger:
                        Toast.makeText(getApplicationContext(),getResources().getString(R.string.mnu_finger),Toast.LENGTH_LONG).show();
                        break;
                    case R.id.lock:
                        Toast.makeText(getApplicationContext(),getResources().getString(R.string.mnu_lock),Toast.LENGTH_LONG).show();
                        break;
                    case R.id.power:
                        Toast.makeText(getApplicationContext(),getResources().getString(R.string.mnu_power),Toast.LENGTH_LONG).show();
                        break;
                }

                return false;
            }
        });
    }
}
