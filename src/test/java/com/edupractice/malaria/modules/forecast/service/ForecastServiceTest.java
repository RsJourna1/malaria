package com.edupractice.malaria.modules.forecast.service;

import com.edupractice.malaria.modules.forecast.pojo.ForecastChart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ForecastServiceTest {

    @Autowired
    private RegressionService regressionService;

    @Test
    public void forecastTest() throws Exception {
        ForecastChart forecastChart = new ForecastChart();
        double[][][] dataSet = regressionService.regressionEChartsDataSet("云南");
        double[][] theta = regressionService.OLS(dataSet);
        double[][][] forecastDataSet = regressionService.forecastDataSet(theta);
        forecastChart.setDataSet(dataSet);
        forecastChart.setTheta(theta);
        forecastChart.setForecastDataSet(forecastDataSet);
    }
}
