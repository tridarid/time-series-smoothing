package lynx.smoothing.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import lynx.smoothing.R;
import lynx.smoothing.data.Data;
import lynx.smoothing.data.Names;
import lynx.smoothing.data.Ids;

public class Dt_input extends AppCompatActivity {

    Data Data = new Data();
    Names Names = new Names();
    Ids Ids = new Ids();

    Button btnNext;
    Intent nextPage;

    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dt_input);

        n = Data.getDataSize();
        Toast.makeText(this, "data size : " + Data.getDataSize(), Toast.LENGTH_SHORT).show();
        createEditTexts(n);
    }

    private void createEditTexts(int n){

    }
}
