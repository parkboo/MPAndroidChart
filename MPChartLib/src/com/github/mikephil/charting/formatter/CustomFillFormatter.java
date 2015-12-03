package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.CustomLineDataSet;
import com.github.mikephil.charting.interfaces.CustomLineDataProvider;

/**
 * Interface for providing a custom logic to where the filling line of a LineDataSet
 * should end. This of course only works if setFillEnabled(...) is set to true.
 * 
 * @author Philipp Jahoda
 */
public interface CustomFillFormatter {

    /**
     * Returns the vertical (y-axis) position where the filled-line of the
     * LineDataSet should end.
     * 
     * @param dataSet the LineDataSet that is currently drawn
     * @param dataProvider
     * @return
     */
    float getFillLinePosition(CustomLineDataSet dataSet, CustomLineDataProvider dataProvider);
}
