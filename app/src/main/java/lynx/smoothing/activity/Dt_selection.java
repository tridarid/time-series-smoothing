package lynx.smoothing.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import lynx.smoothing.R;
import lynx.smoothing.data.Data;

public class Dt_selection extends AppCompatActivity {

    Data Data = new Data();

    RadioGroup rgdt;
    RadioButton rbdtManual;

    Button btnNext;
    Intent nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dt_selection);

        getDtMethod();

        btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextPage = new Intent(Dt_selection.this, N_selection.class);
                startActivity(nextPage);
            }
        });
    }

    private void getDtMethod(){
        rgdt = (RadioGroup)findViewById(R.id.rgdt);
        rbdtManual = (RadioButton)findViewById(R.id.rbdtManual);
        rgdt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        if(rbdtManual.isChecked()){
                            Data.setDtInsertMethod(0);
                        }else{
                            Data.setDtInsertMethod(1);
                        }
                    }
                }
        );
    }
}
