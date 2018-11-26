<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.ArrayList" %>
 <%@page import="com.model.Correo" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Página de Perfil</title>
			<link rel="stylesheet" type="text/css" href="PaginaPerfil.css" />
			<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
	</head>

	<body>
	
		<div class="navbar">
		  
		  <div class="inline">
		  
		  	<div class="Logo">
				<img alt="LogotipoXTEC" src="IMAG/LogoDeXTEC.png" style="padding-left:30%" >
			</div>
					
			<div class="dropdown">
						 
				<button class="dropbtn"></button>
				<div class="dropdown-content">
					<a href="#">Darse de baja</a>
					<a href="#">Cerrar sesión</a>
				</div>
				
				</div> 
					
					<div class="dropdown">
						<button class="dropbtn2"></button>
						<div class="dropdown-content">
							<a href="#">Manual del usuario</a>	
						</div>
					
				</div>
		
		  	</div>
		  
		  </div>
		  
		  	<div class="sidenav">
			  <a href="PaginaPerfil.jsp">Perfil</a>
			  <a href="#">Dashboard</a>
			  <a href="PaginaCanjes.html">Canje TEColones</a>
			  <a href="#">Compartir con amigos</a>
			</div>
			
			<div class="main">
			  	
			  	<div class="Perfil">
			  	
			  		<img alt="ImagenPerfil" src="IMAG/PerfilFoto.png" height="100" width = "120" style="background-color:transparent;">
			  	
			  	</div>
			  	
			  	<div class="inline">
			  	
			  		<div class=info>
			  		
			  			<p class="t">Nombre Completo</p>
			  			<div class="inline">
			  			
			  				<img alt="Icono" src="IMAG/IconoHumano.png" style="background-color:transparent;">
			  				<p class="pt"><%= request.getAttribute("nombrecompleto") %></p>	
			  			
			  			</div>
			  			
			  			<p class="t">Universidad</p>
			  			<div class="inline">
			  			
			  				<img alt="Icono" src="IMAG/IconoU.png" style="background-color:transparent;">
			  				<p class="pt"><%= request.getAttribute("universidad") %></p>
			  			</div>
			  			
			  			
			  			<p class="t">Teléfono</p>
			  			<div class="inline">
			  			
			  				<img alt="Icono" src="IMAG/IconoTelefono.png" style="background-color:transparent;">
			  				<p class="pt"><%= request.getAttribute("telefono") %></p>			  				
			  			
			  			</div>
			  			
			  			<p class="t">Correo</p>
			  			<div class="inline">
			 
			  				<img alt="Icono" src="IMAG/IconoCorreo.png" style="background-color:transparent;">
			  				<p class="pt"><%= request.getAttribute("correo") %></p>
			  			
			  			</div>
			  			
			  			
			  			<p class="t">Miembro plataforma</p>
			  			<div class="inline">
			  			
			  				<img alt="Icono" src="IMAG/IconoGrupo.png" style="background-color:transparent;">
			  				<p class="pt">Te uniste el <%= request.getAttribute("fecha") %></p>	
			  			
			  			</div>
			  			
			  			
			  		</div>
			  		
			  		
			  		<div class=info2>
			  			<p class="t">Carnet</p>
			  			<div class="inline">
			  			
			  				<img alt="Icono" src="IMAG/IconoID.png" style="background-color:transparent;">
			  				<p class="pt"><%= request.getAttribute("carnet") %></p>
			  				
			  				
			  			</div>
			  			
			  			<p class="t">Carrera</p>
			  			<div class="inline">
			  			
			  				<img alt="Icono" src="IMAG/IconoSombrero.png" style="background-color:transparent;">
			  				<p class="pt"><%= request.getAttribute("carrera") %></p>	
			  				
			  			</div>
			  			
			  			
			  			<p class="t">Habilidades</p>
			  			<p class="pt"><%= request.getAttribute("habilidades") %></p>
			  			<p class="t">Descripción</p>
			  			<p class="pt"><%= request.getAttribute("descripcion") %></p>
			  			
			  		</div>
			  	
			  		<div class = botones>
			  			<button type= button class="Boton">Editar Perfil</button>
			  			<button type= button class="Boton">Darse de baja</button>
			  		</div>
			  		
			  	
			  	</div>
			  	
			  	<div class=footer></div>
			  	
			</div>	
	
	</body>

</html>