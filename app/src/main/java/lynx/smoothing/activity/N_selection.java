package lynx.smoothing.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import lynx.smoothing.R;
import lynx.smoothing.data.Data;

public class N_selection extends AppCompatActivity {

    Data Data = new Data();

    RadioGroup rgn;
    RadioButton rbnManual;

    Button btnNext;
    Intent nextPage;

    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_selection);

        getNMethod();

        btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextPage = new Intent(N_selection.this,N_input.class);
                startActivity(nextPage);
            }
        });
    }

    private void getNMethod(){
        rgn = (RadioGroup)findViewById(R.id.rgn);
        rbnManual = (RadioButton)findViewById(R.id.rbnManual);
        rgn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(rbnManual.isChecked()){
                    Data.setnInsertMethod(0);
                }else{
                    Data.setnInsertMethod(1);
                }
            }
        });
    }
}
