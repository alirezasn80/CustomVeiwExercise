package alireza.sn.customviewexercise;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class CustomView extends LinearLayout implements View.OnTouchListener, View.OnClickListener, View.OnLongClickListener {
    View rootView;
    ImageView minus, plus;
    TextView number;
    int currentNumber;
    boolean flag = false;
    Handler handler;


    public CustomView(Context context) {
        super(context);
        init(context);

    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        rootView = inflate(context, R.layout.view_custom, this);
        minus = rootView.findViewById(R.id.min);
        plus = rootView.findViewById(R.id.max);
        number = rootView.findViewById(R.id.number);

        handler = new Handler();


        currentNumber = Integer.parseInt(number.getText().toString());

        minus.setOnClickListener(this);
        plus.setOnClickListener(this);

        minus.setOnLongClickListener(this);
        plus.setOnLongClickListener(this);

        minus.setOnTouchListener(this);
        plus.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        if (flag) {
            if (event.getAction() == MotionEvent.ACTION_UP)
                flag = false;
        }

        return false;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.max) {
            increaseValue();
        }

        if (v.getId() == R.id.min) {
            decreaseValue();
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (v.getId() == R.id.max) {
            flag = true;
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    if (flag) {
                        increaseValue();
                        postDelayed(this, 75);
                    }
                }
            }, 75);
        }

        if (v.getId() == R.id.min) {
            flag = true;
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    if (flag) {
                        decreaseValue();
                        postDelayed(this, 75);
                    }
                }
            }, 75);

        }
        return false;
    }

    private void increaseValue() {
        number.setText(String.valueOf(++currentNumber));
    }

    private void decreaseValue() {
        number.setText(String.valueOf(--currentNumber));
    }
}
