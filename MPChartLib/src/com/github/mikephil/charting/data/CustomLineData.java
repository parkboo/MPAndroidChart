
package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Data object that encapsulates all data associated with a LineChart.
 * 
 * @author Philipp Jahoda
 */
public class CustomLineData extends BarLineScatterCandleBubbleData<CustomLineDataSet> {

    public CustomLineData() {
        super();
    }

    public CustomLineData(List<String> xVals) {
        super(xVals);
    }

    public CustomLineData(String[] xVals) {
        super(xVals);
    }

    public CustomLineData(List<String> xVals, List<CustomLineDataSet> dataSets) {
        super(xVals, dataSets);
    }

    public CustomLineData(String[] xVals, List<CustomLineDataSet> dataSets) {
        super(xVals, dataSets);
    }

    public CustomLineData(List<String> xVals, CustomLineDataSet dataSet) {
        super(xVals, toList(dataSet));
    }

    public CustomLineData(String[] xVals, CustomLineDataSet dataSet) {
        super(xVals, toList(dataSet));
    }

    private static List<CustomLineDataSet> toList(CustomLineDataSet dataSet) {
        List<CustomLineDataSet> sets = new ArrayList<CustomLineDataSet>();
        sets.add(dataSet);
        return sets;
    }
}
