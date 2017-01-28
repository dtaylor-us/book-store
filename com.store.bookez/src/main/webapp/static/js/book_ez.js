$(document).ready(function () {
    $('table tr td').attr('class', 'text-grey-867A6E');
    $('table tr td:nth-child(2n)').attr('class', 'text-primary');
});

function populateModal(id) {
    $.getJSON("/book/info/" + id, {
            ajax: 'true'
        }, function (data) {
            console.log(data)
            $("#modalBookTitle").text(data.title);
            $("#modalBookDate").text(data.pubDate);
            $("#modalBookAuthor").text(data.author);
            $("#modalBookPrice").text("$" + data.price);
            $("#modalBookImage").attr("src", data.imageURLFull);
        }
    )
}
function openModal(id) {
    populateModal(id);
    $('#myModal').modal();
}

function addToCart(id) {
    var cartId;
    $.getJSON("/cart/add/" + id, {
            ajax: 'true'
        }, function (data) {
            console.log(data);
            cartId = data.id;
            $('#cartTotal').text(data.totalBooks);
        }
    )
}
function addCustomer() {
//TODO: FORM VALIDATION
    var name = $('#addCustomerName').val();
    var address = $('#addCustomerAddress').val();
    var email = $('#addCustomerEmail').val();
    var phoneNumber = $('#addCustomerPhoneNumber').val();
    var version = $('#addCustomerVersion').val();
    var id = $('#addCustomerId').val();

    $('#addCustomerName').val("");
    $('#addCustomerAddress').val("");
    $('#addCustomerEmail').val("");
    $('#addCustomerPhoneNumber').val("");

    var newCustomer;

    if (id == "") {
        newCustomer = {"name": name, "address": address, "email": email, "phoneNumber": phoneNumber}
    } else {
        newCustomer = {
            "id": id,
            "version": version,
            "name": name,
            "address": address,
            "email": email,
            "phoneNumber": phoneNumber
        }

    }


    console.log(newCustomer);

    $.ajax({
        type: "post",
        data: newCustomer,
        url: "/customer/add",
        async: true,
        dataType: "json",
        success: function () {
            window.location.reload();
        }
    });

}

function getCustomer(customerId) {
    $.getJSON("/customer/get/" + customerId, {
        ajax: 'true'
    }, function (data) {
        console.log(data);
        return data;
    });
}
function deleteCustomer(customerId) {
    $.getJSON("/customer/delete/" + customerId, {
        ajax: 'true'
    }, function (data) {
    });
    location.reload(true);

}
function editCustomer(customerId) {
    var updateCustomer;
    $.getJSON("/customer/get/" + customerId, {
        ajax: 'true'
    }, function (data) {
        console.log(data);
        var version = $('#addCustomerVersion').val(data.version);
        var id = $('#addCustomerId').val(data.id);
        var name = $('#addCustomerName').val(data.name);
        var address = $('#addCustomerAddress').val(data.address);
        var email = $('#addCustomerEmail').val(data.email);
        var phoneNumber = $('#addCustomerPhoneNumber').val(data.phoneNumber);

        updateCustomer = {
            "id": id,
            "version": version,
            "name": name,
            "address": address,
            "email": email,
            "phoneNumber": phoneNumber
        }
    });

    console.log(updateCustomer);

}