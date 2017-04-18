package nefersky.sherlock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;

public class ChooseActivity extends Activity {

    public static final String THIEF = "nefersky.sherlock.THIEF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        ConstraintLayout constraintLayout = (ConstraintLayout)findViewById(R.id.constraintLayout);
        constraintLayout.setContentDescription("desc");
    }

    public void OnRadioClick(View view) {
        Intent answerIntent = new Intent();

        switch (view.getId()) {
            case R.id.radioButtonDog:
                answerIntent.putExtra(THIEF, "Сраный песик");
                break;
            case R.id.radioButtonCrow:
                answerIntent.putExtra(THIEF, "Ворона");
                break;
            case R.id.radioButtonCat:
                answerIntent.putExtra(THIEF, "Никто");
                break;

            default:
                break;
        }

        setResult(RESULT_OK, answerIntent);
        finish();
    }
}
