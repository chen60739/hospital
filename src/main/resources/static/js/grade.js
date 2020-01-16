$(document).ready(function () {
    var user = $("#gradeId").val();
    $.get("showPower",{"gradeId":user},function (result) {
        for (let i = 0; i <result.length ; i++) {
            $(".gradeMenu").append("<li><a href=\""+result[i].gradeUrl+"\">"+result[i].gradeName+"</a></li>");
        }
    })
})