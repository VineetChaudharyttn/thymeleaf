$(document).ready(function () {
    var time=$.ajax({
            url:"/time",
            method:"POST"
        });

    time.done(function (data) {
        $("#setTime").append(data)
    });

    time.fail(function () {
        console.log("time is not fetched");
    });
});