<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="Administrar.css" />
    	<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
    	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
        crossorigin="anonymous">
		<title>Configuraciones</title>
	</head>
	
	<body>

	    <div class="navbar">
	
	        <div class="inline">
	
	            <div class="Logo">
	                <img alt="LogotipoXTEC" src="IMAG/LogoDeXTEC.png" style="padding-left:30%">
	            </div>
	
	            <div class="dropdown">
	
	                <button class="dropbtn"></button>
	                <div class="dropdown-content">
	                    <a href="#">Darse de baja</a>
	                    <a href="PaginaInicio.html">Cerrar sesión</a>
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
	        <a onclick="window.location='UserValidationServlet'+window.location.search;">Perfil</a>
	        <a onclick="window.location='Dashboard.html'+window.location.search;">Dashboard</a>
	        <a href="#">Promociones</a>
	        <a onclick="window.location='ConfigurationServlet'+window.location.search;">Configuraciones</a>
	    </div>
	
	    <div class="main">
		
	        <div class="inline">
	
	            <div class=info>
	                <div class="CajaAdm">
	                    <h4>Privilegios de Administrador</h4>
	                    <i class="fas fa-user-shield" id="icono"></i>
	                    
	                    <form action="PrivilegeServlet">
	                    
	                    	<select name="funcionarioElegido" id="posiblesAdministradores" placeholder="( selecione el funcionario )">
		                    
	                    		 <c:forEach items="${funcionarios}" var="admin">
						            <option>${admin.data}</option>
						        </c:forEach>
						        
	                    	</select>
	                    
	                    	<input name="miuser" id = "opcion" value= <%= request.getParameter("miuser") %>></input>
	                    	<input name="mipass" id="opcion" value=<%= request.getParameter("mipass") %>></input>
	                    
	                    	<br><br>
	                    	<button type=submit class="Boton">Dar permiso</button>
	                    	<br><br>
	                    
	                    </form>
	                    
	                </div>
	                <br><br>
	                <div class="CajaAdm">
	                    <h4>Deshabilitar promocion</h4>
	                    <br>
	                    <i class="far fa-calendar-times" id="icono"></i>
	                    <select name="Promociones" id="posiblesAdministradores" value="( selecione el funcionario )">
	                        
	                        <c:forEach items="${promociones}" var="promo">
						            <option>${promo.data}</option>
						     </c:forEach>
	                        
	                    </select>
	                    <br><br>
	                    <button type=button class="Boton">Deshabilitar</button>
	                    <br><br>
	                </div>
	                <br><br>
	                <div class="CajaAdm">
	                    <h4>GenerarReporte</h4>
	                    <button type=button class="btnDes">Visualizar Reporte</button>
	                    <br>
	                    <button type=button class="btnDes">Descargar Reporte</button>
	                    <br><br>
	                </div>
	            </div>
	
	            <div class=info2>
	                <div class="CajaAdm">
	                    <h4>Modificar tasa de cambio</h4>
	                    <h4>Selecione material de reciclaje</h4>
	                    <i class="fas fa-recycle" id="icono"></i>
	                    <select name="materialesDeReciclaje" id="materialesDeReciclaje"">
							
							<c:forEach items="${materiales}" var="material">
						            <option>${material.data}</option>
						     </c:forEach>
						     
	                    </select>
	                    <h4>Indique el valor en TEColones que tendrá el kilo del material</h4>
	                    <i class="far fa-money-bill-alt" id="icono"></i>
	                    <input type="text" id="valorTEColonesXmaterial">
	                    <br><br>
	                    <button type=button class="Boton">Actualizar</button>
	                </div>
	                <br><br>
	                
	                <div class="CajaAdm">
                    <h4>Modificar tasa de cambio</h4>
                    <h4> 1 TEColón equivale a </h4>
                    
                    <i class="far fa-money-bill-alt" id="icono"></i>
                    <input type="text" id="valorTEColonesXmaterial"> Colones
                    <br><br>
                    <button type=button class="Boton">Actualizar</button>
                    <br><br>
                	</div>
	                
	            </div>
	        </div>
			
	        <div class=footer></div>
	
	    </div>
	
	</body>

</html>