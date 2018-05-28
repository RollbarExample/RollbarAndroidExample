package rollbar.com.rollbarexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.rollbar.android.Rollbar;
import com.rollbar.notifier.config.ConfigProvider;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Rollbar rollbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.clickMe);

        Rollbar.init(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if (rollbar == null) {
                    Log.d("yo", "Rollbar is null, initialize before using");
                    return;
                }*/
               throwError();
            }
        });
    }

    private void throwError(){
        String test=null;
        test.toString();
    }
}
