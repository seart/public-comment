/**
 *
 * Created by dell-pc on 2017/7/27.
 */

//全局变量 命名空间
var common = window.common || {};

/**
 * 展示指定的消息内容。
 */
common.showMessage = function (msg) {
    if (msg) {
        alert(msg);
    }
};

/**
 *对jQuery的ajax方法的二次封装
 */
common.ajax = function (param) {
    var mergeParam = $.extend({
        timeout: 10000
    }, param, {
        complete: function (respose) {
            var url = respose.getResponseHeader("url");
            if (url) {
                location.href = url;
            } else {
                if (param.complete && typeof param.complete == "function") {
                    param.complete();
                }
            }
        }
    });
    $.ajax(mergeParam);
};

