package t.e.bluetoothchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChooseAliasActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText alias;
    private String myAlias;
    private Button setAlias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_alias);
        alias = (EditText)findViewById(R.id.et_alias);
        setAlias = (Button)findViewById(R.id.button_startChat);
        setAlias.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("alias", alias.getText().toString());
        startActivity(intent);

    }
}
