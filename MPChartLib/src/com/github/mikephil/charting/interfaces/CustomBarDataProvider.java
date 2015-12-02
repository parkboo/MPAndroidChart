package com.github.mikephil.charting.interfaces;

import com.github.mikephil.charting.data.CustomBarData;

public interface CustomBarDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CustomBarData getCustomBarData();
    boolean isDrawBarShadowEnabled();
    boolean isDrawValueAboveBarEnabled();
    boolean isDrawHighlightArrowEnabled();
}
