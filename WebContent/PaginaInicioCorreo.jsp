<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<meta charset="ISO-8859-1">
		<title>Página de Inicio</title>
		<link rel="stylesheet" type="text/css" href="PaginaInicioCorreo.css">
		<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
    	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		
		<script>
		
	    	var conteoCorreos = 0;
		
			function addFieldsCorreo(){
	            
	            var container = document.getElementById("correos");
	           
	            var input = document.createElement("input");
	            input.type = "email";
	            input.placeholder = "Correo";
	            input.name = "Correo"+ conteoCorreos;
	            container.appendChild(input);
	            container.appendChild(document.createElement("br"));
	            
	            conteoCorreos = conteoCorreos + 1;
	            
	            var contadorCor = document.getElementById("contadorCor");
	            contadorCor.value = conteoCorreos;
            
	        }
	
		</script>
		
		<script>
		
			function changeForm(){
				
				
				var list = document.getElementById("ddtipos");
				var opcion = list.options[list.selectedIndex].text;
				var carnet = document.getElementById("Carn");
				var carrera = document.getElementById("Carr")
				
				if(opcion != "Estudiante"){
				
					carnet.placeholder = "Cédula";
					carrera.style.visibility = "hidden";
					
				}else{
					
					carnet.placeholder = "Carnet";
					carrera.style.visibility = "visible";
						
				}
				
			}
		
		</script>
		
		<script>
	    	
			var conteoTelefonos = 0;
		
			function addFieldsTelefono(){
	            
	            var container = document.getElementById("telefonos");
	           
	            var input = document.createElement("input");
	            input.type = "text";
	            input.placeholder = "Teléfono";
	            input.name = "Telefono"+ conteoTelefonos;
	            container.appendChild(input);
	            container.appendChild(document.createElement("br"));
	            
	            conteoTelefonos = conteoTelefonos + 1;
	            
	            var contadorTel = document.getElementById("contadorTel");
	            contadorTel.value = conteoTelefonos;
	            
	        }
    	</script>
    	
	</head>
	
	<body>
	
		<div class="modal-wrapper" id="popup">
			<div class="popup-contenedor">
			
				<h2>Activación de la cuenta!</h2>
				<p>Favor ingresar al correo <%= request.getParameter("Correo") %> para activar la cuenta.</p>
			
				<a class="popup-cerrar" href="#popup">X</a>
			
			</div>
		</div>
	
		<header>
			<div class="InlineWrapper">
					<div class="Logo">
						<img alt="LogotipoXTEC" src="IMAG//LogoDeXTEC.png" style="background-color:transparent;">
					</div>
					
					<div class="FormWrapper">
						<form class="form-inline" action="UserValidationServlet">
							<input type="text" id="user" name="miuser" placeholder="Usuario">
							<input type="password" id="pwd" name="mipass" placeholder="Contraseña">
							<button type="submit"">Iniciar Sesión</button>
						</form>	
					</div>
			</div>
		</header>
		
		
		<div class="InlineWrapper">
			
			<article>
					<div class="Titulo">
						
						<h2>TEColones</h2>
						<h3>Una ecomoneda virtual</h3><br>
						<div id="IR">
							<img alt="ImagenReciclaje" src="IMAG/LogoReciclaje.png">
						</div>
					
					</div>
					<br>
					<br>
					<div class="InlineWrapper">
						<div>
							<img alt="IconoBillete" src="IMAG/IconoDinero.png">
						</div>
						<h3>Paga créditos universitarios reciclando</h3>
					</div>
					<br>
					<br>
					<div class="InlineWrapper">
						<h3>Obten crédito en la soda al reciclar</h3>
						<div>
							<img alt="IconoComida" src="IMAG/IconoCubiertos.png">
						</div>
					</div>
					<br>
					<br>
					<div class="InlineWrapper">
						<div>
							<img alt="IconoHoja" src="IMAG/IconoHoja.png">
						</div>
						<h3>Ayuda a tu universidad a reciclar</h3>
					</div>
					
					
					
				</article>
				
				<article>
					
					<h2>Registrate ya</h2>
					
					
					
					<form action = RegistrationServlet>
						
						<div class="form-inline2">
						<select name="TipoUsuario" class="DropList" onchange="changeForm()" id="ddtipos">
							<option selected>Estudiante</option>
							<option>Funcionario</option>
							<option>Encargado Centro de Acopio</option>
						</select>
						
						</div>
						
						<div class="form-inline2">
								<input type="text" name="Nombre"  placeholder="Nombre">
								<input type="text" name="Apellidos" placeholder="Apellidos">
						</div>	
						
						<div class="form-inline2">
								<input type="text" name="Universidad"  placeholder="Universidad">
								<input type="text" name="Contrasena" placeholder="Contraseña">
						</div>
						
						<div class="form-inline2">
								<input type="email" name="Correo"  placeholder="Correo">
								<input type="text" name="Carnet" placeholder="Carnet" id = "Carn">
								<button type="button" onclick="addFieldsCorreo()"></button>
						</div>
						
						<div class="InputDynamic" id="correos">
							
						
						</div>
						
						<div class="form-inline2">
								<input type="text" name="Telefono" placeholder="Teléfono">
								<input type="text" name="Carrera" placeholder="Carrera(Opcional)" id = "Carr">
								<button type="button" onclick="addFieldsTelefono()"></button>
						</div>
						
						<div class="InputDynamic" id="telefonos">
							
						
						</div>
						
						<div class="form-wideinline">
								<textarea name="Habilidades" placeholder="Habilidades"></textarea> 
								<textarea name ="Descripcion" placeholder="Descripción(Opcional)"></textarea> 
						</div>
							<button type="button" class="Subir"></button>
						<div class="form-inline">
							<button type="submit" id="Registrarse">Registrarse</button>
						</div>
						
						<input type="text" name="contadorCorreo" id="contadorCor">
						<input type="text" name="contadorTelefono" id="contadorTel">
						
					</form>
					
				</article>
		
		</div>
		<br>
		<br>
		<br>
		<footer></footer>
		 			
	</body>
</html>
