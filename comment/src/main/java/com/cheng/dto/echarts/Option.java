package com.cheng.dto.echarts;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

/**
 * 前端echarts接口需要的参数
 * Created by cheng on 2017/7/22.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Option {

    private Legend legend;

    private XAxis xAxis;

    private List<Serie> series;

    public Option() {
        this.legend = new Legend();
        this.xAxis = new XAxis();
        this.series = new ArrayList<>();
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public XAxis getxAxis() {
        return xAxis;
    }

    public void setxAxis(XAxis xAxis) {
        this.xAxis = xAxis;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }
}
