var id;

$(document).ready(() => {
    let table = $('#table').DataTable({
        "info": false,
        "paging": false
    });
});

$("#btnAtt").click(() => {
    $.ajax({
        url: "/item/" + id,
        type: "PUT",
        success: (response) => {
            console.log(response);
            alert("Atualizado");
            // $("#btnAtt").prop("disabled", true);
        }
    });
});

function editar(idClicked) {
    id = idClicked;
    console.log(id);
    $("#btnAtt").prop("disabled", false);
}
