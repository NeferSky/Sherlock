package nefersky.sherlock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    public static final int CHOOSE_THIEF = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, ChooseActivity.class);
        startActivityForResult(intent, CHOOSE_THIEF);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView infoTextView = (TextView)findViewById(R.id.textViewThief);

        if (requestCode == CHOOSE_THIEF) {
            if (resultCode == RESULT_OK) {
                String thiefName = data.getStringExtra(ChooseActivity.THIEF);
                infoTextView.setText(thiefName);
            } else {
                infoTextView.setText("");
            }
        }
    }
}
