package com.translationexchange.android.utils;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

public class ViewUtils {

    public static void findViews(View v) {
//        try {
//            if (v instanceof ViewGroup) {
//                ViewGroup vg = (ViewGroup) v;
//                for (int i = 0; i < vg.getChildCount(); i++) {
//                    View child = vg.getChildAt(i);
//                    findViews(child);
//                }
//            } else if (v instanceof TextView) {
//                v.setOnLongClickListener(new View.OnLongClickListener() {
//                    @Override
//                    public boolean onLongClick(View view) {
//                        if (Tml.getAuth() != null && Tml.getAuth().isInlineMode() && Tml.getAndroidApplication() != null && Tml.getAndroidApplication().getTools() != null) {
//                            String text = ((TextView) view).getText().toString();
//                            Tools tools = Tml.getAndroidApplication().getTools();
//                            Auth auth = Tml.getAuth();
//                            String keyHash = TranslationKey.generateKey(text);
//                            String url = tools.getMobileTranslationCenterKey().replace("{translation_key}", keyHash).replace("{access_token}", auth.getAccessToken()).replace("{locale}", PreferenceUtil.getCurrentLocation(view.getContext()).getLanguage());
//                            MobileTranslationCenterActivity.tr(view.getContext(), url);
//                            return true;
//                        }
//                        return false;
//                    }
//                });
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }


    public static int convertPixelsToSp(Context context, float px) {
        float scaledDensity = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (px * scaledDensity);
    }

    public static int convertDpToPixels(float dp, Context context) {
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
        return px;
    }

    public static int convertSpToPixels(float sp, Context context) {
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, context.getResources().getDisplayMetrics());
        return px;
    }

    public static int convertDpToSp(float dp, Context context) {
        int sp = (int) (convertDpToPixels(dp, context) / (float) convertSpToPixels(dp, context));
        return sp;
    }
}
