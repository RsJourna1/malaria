package com.edupractice.malaria.modules.forecast.service;

import com.edupractice.malaria.modules.forecast.pojo.ForecastRe;

import java.util.List;

public interface RegressionService {
    List<Double> linearRegression(List<Integer> xAxis, List<Integer> yAxis);

    List<List<Integer>> regressionDataSet(String dataSource) throws Exception;
}
