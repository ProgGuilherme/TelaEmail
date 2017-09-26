<div class="container">
    <div class = "panel panel-primary">
        <div class = "panel-heading">
            <h3 class = "panel-title">Projeto envio de e-mail</h3>
        </div>
        <div class = "panel-body">
            <div class="col-md-5">
                <div class="form-area">  
                    <form id="form-email" role="form" action="IndexServlet" method="post">
                        <br style="clear:both">
                        <h3 style="margin-bottom: 25px; text-align: center;">Formulário de contato</h3>
                        <div class="form-group">
                            <input type="text" class="form-control" id="name" name="name" placeholder="Nome" >
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="email" name="email" placeholder="Email" >
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="mobile" name="mobile" placeholder="Celular" >
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="subject" name="subject" placeholder="Assunto" >
                        </div>
                        <div class="form-group">
                            <textarea class="form-control" type="textarea" name="message" id="message" placeholder="Message" maxlength="140" rows="7"></textarea>                                               
                        </div>
                        <button type="submit" id="submit" name="submit" class="btn btn-primary pull-right">Enviar</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>