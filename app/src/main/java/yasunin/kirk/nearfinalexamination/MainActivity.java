package yasunin.kirk.nearfinalexamination;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import yasunin.kirk.nearfinalexamination.frangment.MainFrangment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFrangment,new MainFrangment()).commit();
        }
    }
}
