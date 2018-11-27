<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta charset="utf-8" />
    	<title>Promociones</title>
    	<link rel="stylesheet" type="text/css" href="Promociones.css" />
    	<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
    	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
        crossorigin="anonymous">
        
	</head>

	<body>

			<div class="modal-wrapper" id="popup">
				<div class="popup-contenedor">
			
				<h2><%= request.getAttribute("titulo") %></h2>
				<p><%= request.getAttribute("mensaje") %></p>
			
				<a class="popup-cerrar" href="#popup">X</a>
			
				</div>
			</div>


	        <div class="navbar">
	
	            <div class="inline">
	
	                <div class="Logo">
	                    <img alt="LogotipoXTEC" src="IMAG/LogoDeXTEC.png" style="padding-left:30%">
	                </div>
	
	                <div class="dropdown">
	
	                    <button class="dropbtn"></button>
	                    <div class="dropdown-content">
	                        <a href="#">Darse de baja</a>
	                        <a href="PaginaInicio.html">Cerrar sesion</a>
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
			  <a  onclick="window.location='UserValidationServlet'+window.location.search;">Perfil</a>
			  <a  onclick="window.location='Dashboard.html'+window.location.search;">Dashboard</a>
			  <a  onclick="window.location='NuevaPromocionServlet'+window.location.search;">Promociones</a>
			  <a  onclick="window.location='ConfigurationServlet'+window.location.search;">Configuraciones</a>
			</div>
	
	        <div class="main">
	
	            <div class="inline">
	
	                <div class=info>
	                    <div class="administradores">
	                        
	                        <form action="PromocionSimpleServlet">
	                        <h4>Crear promoción</h4>
	                        <h4>Nombre de la promoción</h4>
 							<input type="text" name="nombre1">
 							<br><br> 
	                        <h4>Selecione material de reciclaje</h4>
	                        <i class="fas fa-recycle" id="icono"></i>
	                        <select name="materialS" id="materialesDeReciclaje"">
	                            
	                            <c:forEach items="${materiales}" var="material">
						            <option>${material.data}</option>
						     	</c:forEach>
						        
	                        </select>
	                        <br><br>
	                        <h4>Indique la cantidad del material</h4>
	                        <i class="fas fa-balance-scale" id="icono"></i>
	                        <input type="text" id="cantidadReciclajePrimerMaterial" name="simple">kg
	                        <br><br>
	                        <h4>Valor de la promoción</h4>
							 <i class="far fa-money-bill-alt" id="icono" ></i>
							 <input type="text" name="bonoS">
							 <br><br>
	                        <h4>Ingrese la fecha de finalización</h4>
                        	<input type="date" id="Fecha finalización" name= "fecha1">
                        	<br><br>
	                        
	                        <button type=submit class="Boton">Crear promoción</button>
	                        <br><br>
	                        <input name="miuser" id = "opcion" value= <%= request.getParameter("miuser") %>></input>
	                    	<input name="mipass" id="opcion" value=<%= request.getParameter("mipass") %>></input>
	                        </form>
	                        
	                    </div>
	                </div>
	
	
	                <div class=info2>
	                    <div class="administradores">
	                        <h4>Crear promoción doble</h4>
	                        <h4>Nombre de la promoción</h4>
	                        <form action="PromocionDobleServlet">
 							<input type="text" name="nombre2">
 							<br><br>
	                        <h4>Selecione material de reciclaje</h4>
	                        <i class="fas fa-recycle" id="icono"></i>
	                        
	                        
	                        
	                        <select name="materialD1" id="materialesDeReciclaje" >
	                            <c:forEach items="${materiales}" var="material">
						            <option>${material.data}</option>
						     </c:forEach>
	                        </select>
	                        
	                        <br>
	                        
	                        <h4>Indique la cantidad del material</h4>
	                        <i class="fas fa-balance-scale" id="icono"></i>
	                        <input type="text" id="cantidadReciclajePrimerMaterial" name="doble1">kg
	                        <br><br>
	                        <h4>Selecione material de reciclaje</h4>
	                        <i class="fas fa-recycle" id="icono"></i>
	                        <select name="materialD2" id="materialesDeReciclaje"">
	                            <c:forEach items="${materiales}" var="material">
						            <option>${material.data}</option>
						     </c:forEach>
	                        </select>
	                        <br>
	                        <h4>Indique la cantidad del material</h4>
	                        <i class="fas fa-balance-scale" id="icono"></i>
	                        <input type="text" id="cantidadReciclajePrimerMaterial" name="doble2">kg
	                        <br><br>
	                        <h4>Valor de la promoción</h4>
							 <i class="far fa-money-bill-alt" id="icono" ></i>
							 <input type="text" name="bonoD">
							 <br><br>
	                        <h4>Ingrese la fecha de finalización</h4>
                        	<input type="date" id="Fecha finalización" name= "fecha3">
                        	<br><br>
	                        <button type=submit class="Boton">Crear promoción</button>
	                        <br><br>
	                        <input name="miuser" id = "opcion" value= <%= request.getParameter("miuser") %>></input>
	                    	<input name="mipass" id="opcion" value=<%= request.getParameter("mipass") %>></input>
	                        </form>
	                    </div>
	                </div>
	            </div>
	
	            <div class=footer></div>
	
	        </div>
	</body>
</html>