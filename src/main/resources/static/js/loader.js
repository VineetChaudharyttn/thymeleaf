function showDetail(formData) {

    $.ajax({
        url: "/loaded",
        method:"POST",
        data:formData,
        success: function (data) {
            $('#loaderImage').hide();
            $('#response').append(data);
            console.log("Successfully Registration");
        },
        error: function () {
            alert("error fetching data");
        }
    });
};
