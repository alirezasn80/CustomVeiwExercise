package alireza.sn.customviewexercise;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView2 extends View {
//    private int heightBar;
//    private int widthBar;
//    private int amount;
//    private int baseColor;
//    private int labelTextSize;
//    private String labelText = "this is a test";
//
//    private Paint circlePaint;  //  -----------------------O
//    private Paint baseBarPaint; // -------------------------
//    private Paint boldBarPaint; // ==================-------
//    private Paint labelTextPaint; // my value bar
//    private Paint maxAmountPaint;
//    private Paint amountPaint;
//
//    private Path basePath;
//    private Path boldPath;
//
    public CustomView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
      //  init(context, attrs);
    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//        drawBar(canvas);
//        drawLabel(canvas);
//        drawAmount(canvas);
//    }
//
//    private void drawAmount(Canvas canvas) {
//        int x = getWidth()-getPaddingRight();
//        int y = getHeight()-getPaddingBottom();
//        Rect bound = new Rect();
//        amountPaint.getTextBounds(String.valueOf(amount),0,String.valueOf(amount).length(),bound);
//        canvas.drawText(String.valueOf(amount),x,y,amountPaint);
//    }
//
//    private void drawLabel(Canvas canvas) {
//        Rect bound = new Rect();
//        float x = getPaddingLeft();
//        labelTextPaint.getTextBounds(labelText,0,labelText.length(),bound);
//        float y = bound.height()+getPaddingTop();
//        canvas.drawText(labelText,x,y,labelTextPaint);
//    }
//
//    private void drawBar(Canvas canvas) {
//        canvas.drawPath(basePath,baseBarPaint);
//        canvas.drawPath(boldPath,boldBarPaint);
//        canvas.drawCircle(getWidth()-getPaddingRight()-String.valueOf(amount).length(),getHeight()-getPaddingBottom(),20,circlePaint);
//    }
//
//    private void init(Context context, AttributeSet attrs) {
//        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.attr_custom_view_2, 0, 0);
//
//        //init about attrs =========================================================================
//        heightBar = typedArray.getDimensionPixelSize(R.styleable.attr_custom_view_2_height_bar,0);
//        widthBar = typedArray.getDimensionPixelSize(R.styleable.attr_custom_view_2_width_bar,0);
//        amount = typedArray.getDimensionPixelSize(R.styleable.attr_custom_view_2_amount,0);
//        baseColor = typedArray.getColor(R.styleable.attr_custom_view_2_baseColor,0);
//        labelTextSize = typedArray.getDimensionPixelSize(R.styleable.attr_custom_view_2_labelTextSize,30);
//        labelText = typedArray.getString(R.styleable.attr_custom_view_2_height_bar);
//        //==========================================================================================
//
//        typedArray.recycle();
//
//        //init about paint =========================================================================
//        circlePaint = new Paint();
//        circlePaint.setColor(baseColor);
//        circlePaint.setStyle(Paint.Style.FILL);
//
//        baseBarPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
//        baseBarPaint.setColor(Color.GRAY);
//        baseBarPaint.setStyle(Paint.Style.FILL);
//
//        boldBarPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
//        boldBarPaint.setColor(baseColor);
//        baseBarPaint.setStyle(Paint.Style.FILL);
//
//        labelTextPaint = new Paint();
//        labelTextPaint.setTextSize(labelTextSize);
//        labelTextPaint.setTypeface(Typeface.DEFAULT);
//        labelTextPaint.setTextAlign(Paint.Align.LEFT);
//
//        maxAmountPaint = new Paint();
//        maxAmountPaint.setTextSize(30);
//        maxAmountPaint.setTypeface(Typeface.DEFAULT);
//        maxAmountPaint.setTextAlign(Paint.Align.CENTER);
//
//        amountPaint = new Paint();
//        amountPaint.setTextSize(30);
//        amountPaint.setTypeface(Typeface.DEFAULT);
//        amountPaint.setTextAlign(Paint.Align.CENTER);
//        //==========================================================================================
//
//        //path
//        basePath = new Path();
//        Rect bound = new Rect();
//        labelTextPaint.getTextBounds(labelText,0,labelText.length(),bound);
//        float heightLabel = bound.height()+getPaddingTop();
//        basePath.moveTo(getPaddingLeft(),getPaddingTop()+heightLabel);
//        basePath.lineTo(getWidth()-getPaddingRight()-String.valueOf(amount).length(),getHeight()-getPaddingBottom());
//
//        boldPath = new Path();
//        boldPath.moveTo(getPaddingLeft(),getPaddingTop()+heightLabel);
//        boldPath.lineTo(getWidth()-getPaddingRight()-String.valueOf(amount).length()-20,getHeight()-getPaddingBottom());
//
//    }
//
////    @Override
////    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
////        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
////        setMeasuredDimension(widthBar,heightBar);
////    }
}
