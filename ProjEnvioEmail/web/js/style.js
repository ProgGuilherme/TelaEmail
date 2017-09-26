/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $('#characterLeft').text('140 characters left');
    $('#message').keydown(function () {
        var max = 140;
        var len = $(this).val().length;
        if (len >= max) {
            $('#characterLeft').text('You have reached the limit');
            $('#characterLeft').addClass('red');
            $('#btnSubmit').addClass('disabled');
        } else {
            var ch = max - len;
            $('#characterLeft').text(ch + ' characters left');
            $('#btnSubmit').removeClass('disabled');
            $('#characterLeft').removeClass('red');
        }
    });
    
    $("#mobile").mask("(99)99999-9999");

    $("#form-email").validate({
        highlight: function (element) {
            $(element).parent().parent().addClass('has-error');
        },
        unhighlight: function (element) {
            $(element).parent().parent().removeClass('has-error');
        },
        focusCleanup: false,
        errorLabelContainer: "input .labell",
        errorElement: "div",
        debug: false,
        rules: {
            name: {
                required: true,
                rangelenght: [3.4]
            },
            email: {
                required: true,
                email: true
            },
            mobile: {
                required: true,
            },
            subject: {
                required: true,
                maxlenght: 50
            },
            message: {
                required: true
            }
        }, messages: {
            name: {
                required: "Favor informar o nome.",
                rangelenght: "Nome Inválido."
            },
            email: {
                required: "Favor informar o e-mail.",
                email: "E-mail com erros."
            },
            mobile: {
                required: "Favor informar o telefone para contato."
            },
            subject: {
                required: "Favor informar o assunto",
                maxlenght: "Maximo de caracteres disitados."
            },
            message: {
                required: "Favor digitar uma mensagem"
            }
        } 
    
    });

});

