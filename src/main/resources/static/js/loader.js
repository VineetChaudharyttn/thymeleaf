$(document).on('click', '#btn', function () {
    $('.loaderImage').css('display','block')
    loader();
});
var loader = function () {

    var loaded=$.ajax({
        url: "/loaded",
        method:"POST",
        success: function () {
            $('.loaderImage').css('display','none');
        },
        error: function () {

        }
    });
    loaded.done(function (data) {
        $('.loaderImage').css('display','none');
        confirm(data);
    });

};

$(document).ready(function () {
   $('.loaderImage').css('display', 'none');
   console.log("log on ready");

});