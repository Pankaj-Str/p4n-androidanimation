package in.p4n.androidanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {

    private static final String TAG = AnimationActivity.class.getSimpleName();

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        mImageView = (ImageView)findViewById(R.id.imageView);
        mImageView.setImageResource(R.drawable.ic_launcher_background);
    }

    public void zoom(View view) {
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        mImageView.startAnimation(animation1);
    }

    public void move(View view) {
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        mImageView.startAnimation(animation1);
    }

    public void blink(View view) {
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        mImageView.startAnimation(animation1);
    }

    public void slideUp(View view) {
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        mImageView.startAnimation(animation1);
    }

    public void fade(View view) {
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        mImageView.startAnimation(animation1);
    }

    public void slideDown(View view) {
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        mImageView.startAnimation(animation1);
    }
}
