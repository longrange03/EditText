package g620apps.edittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextMainActivity extends AppCompatActivity {

    EditText firstName, lastName;
    TextView displayname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_main);

        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        displayname = (TextView) findViewById(R.id.displayName);
    }

    public void display(View view) {
        String getFirstName = firstName.getText().toString();
        String getLastName = lastName.getText().toString();
        displayname.setText("My Name is " + getFirstName + " " + getLastName);
    }
}