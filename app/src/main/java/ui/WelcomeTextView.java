package ui;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by afowowe olalekan on 12/11/2017.
 */

public class WelcomeTextView extends android.support.v7.widget.AppCompatTextView {
    public WelcomeTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Pacifico.ttf"));
    }
}
