$(document).ready(function() {

    $(".jqueryDataTable").dataTable( {
        "bProcessing": false,
        "bServerSide": false,
        "sAjaxSource": "./listjobs.htm",
        "bJQueryUI": true,
        "aoColumns": [
            { "mData": "dni" },
            { "mData": "name" },
            { "mData": "lastName" },
            { "mData": "phone" },
            { "mData": "address" }, 
            { "mData": "show" } 
        ]
    } ); 
} );

