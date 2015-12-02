package com.github.mikephil.charting.interfaces;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CustomLineData;

public interface CustomLineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CustomLineData getCustomLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
