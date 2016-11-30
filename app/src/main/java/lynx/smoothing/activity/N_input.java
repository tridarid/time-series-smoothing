package lynx.smoothing.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import lynx.smoothing.R;
import lynx.smoothing.data.Data;

public class N_input extends AppCompatActivity {

    Data Data = new Data();

    EditText inputN;

    Button btnNext;
    Intent nextPage;

    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_input);

        btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setN();

                nextPage = new Intent(N_input.this, Dt_input.class);
                startActivity(nextPage);
                //Toast.makeText(N_input.this, "data size : "+n, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setN(){
        inputN = (EditText)findViewById(R.id.inputN);
        n = Integer.parseInt(inputN.getText().toString());
        Data.setDataSize(n);
    }
}
