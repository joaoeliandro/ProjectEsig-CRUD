$(document).ready(() => {
    let table = $('#table').DataTable({
        "info": false,
        "paging": false
    });

    $('#table tbody').on('click', '#btnEdit', () => {
        if ($(this).hasClass('selected')) {
            $(this).removeClass('selected');
        }
        else {
            table.$('tr.selected').removeClass('selected');
            $(this).addClass('selected');
        }

        let data = table.row({ selected: true }).data();
        console.log(data)
        $('#itemNome').val(data[1]);
        $('#itemDest').val(data[2]);
        $('#itemRemet').val(data[3]);
        $('#itemEmailRemet').val(data[4]);
    });
});