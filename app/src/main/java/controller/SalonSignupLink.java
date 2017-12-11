package controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.psalon.psalon.R;

import ui.SignupActivity;


/**
 * Created by afowowe olalekan on 12/11/2017.
 */

public class SalonSignupLink implements View.OnClickListener {
    private Context mContext;

    public SalonSignupLink(Context context) {
        this.mContext = context;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(mContext, SignupActivity.class);
        mContext.startActivity(intent);
        Activity activity = (Activity) mContext;
        activity.finish();
        activity.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }
}
