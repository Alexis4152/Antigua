 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Bienvenido | Menu Principal</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="<c:url value="/resources/ConfiguracionAdminLTE/plugins/fontawesome-free/css/all.min.css"/>"
	type="text/css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">

<!-- Tempusdominus Bbootstrap 4 -->
<link rel="stylesheet"
	href="<c:url value="/resources/ConfiguracionAdminLTE/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css"/>"
	type="text/css">
<!-- iCheck -->
<link rel="stylesheet"
	href="<c:url value="/resources/ConfiguracionAdminLTE/plugins/icheck-bootstrap/icheck-bootstrap.min.css"/>"
	type="text/css">
<!-- JQVMap -->
<link rel="stylesheet"
	href="<c:url value="/resources/ConfiguracionAdminLTE/plugins/jqvmap/jqvmap.min.css"/>"
	type="text/css">
<!-- Theme style -->
<link rel="stylesheet"
	href="<c:url value="/resources/ConfiguracionAdminLTE/dist/css/adminlte.min.css"/>"
	type="text/css">
<!-- overlayScrollbars -->
<link rel="stylesheet"
	href="<c:url value="/resources/ConfiguracionAdminLTE/plugins/overlayScrollbars/css/OverlayScrollbars.min.css"/>"
	type="text/css">
<!-- Daterange picker -->
<link rel="stylesheet"
	href="<c:url value="/resources/ConfiguracionAdminLTE/plugins/daterangepicker/daterangepicker.css"/>"
	type="text/css">
<!-- summernote -->
<link rel="stylesheet"href="<c:url value="/resources/ConfiguracionAdminLTE/plugins/summernote/summernote-bs4.css"/>" type="text/css">
<!-- Google Font: Source Sans Pro -->
<linkhref="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">

</head>

<!--  =============== EMPIEZA =================================  AKI EMPIEZA LO K ESTOY AGREGANDO NUEVO DEL DASHHBOARDA  =============================================  -->
	
	
	<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="index3.html" class="nav-link">Home</a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="#" class="nav-link">Contact</a>
      </li>
    </ul>

    <!-- SEARCH FORM -->
    <form class="form-inline ml-3">
      <div class="input-group input-group-sm">
        <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
        <div class="input-group-append">
          <button class="btn btn-navbar" type="submit">
            <i class="fas fa-search"></i>
          </button>
        </div>
      </div>
    </form>

    <!-- Icono del usuario logueado -->
    <ul class="navbar-nav ml-auto">
    
   
      <li class="nav-item dropdown user-menu">
        <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">
          <img src="<%=request.getContextPath()%>/resources/ConfiguracionAdminLTE/dist/img/user2-160x160.jpg" class="user-image img-circle elevation-2" alt="User Image">
          <span class="d-none d-md-inline">
          <strong><security:authentication property="principal.Username" /></strong>
          </span>
        </a>
        <ul class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          <!-- User image -->
          <li class="user-header bg-primary">
            <img src="<%=request.getContextPath()%>/resources/ConfiguracionAdminLTE/dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">

            <p>
              <strong><security:authentication property="principal.Username" /></strong>
              <small>Imprimir ROL aki</small>
            </p>
          </li>
          
          
        			  <!-- Menu Body -->
			          <!-- <li class="user-body">
			            <div class="row">
			              <div class="col-4 text-center">
			                <a href="#">Followers</a>
			              </div>
			              <div class="col-4 text-center">
			                <a href="#">Sales</a>
			              </div>
			              <div class="col-4 text-center">
			                <a href="#">Friends</a>
			              </div>
			            </div>            
			          </li> -->
          
          
          <!-- Menu Footer-->
          <li class="user-footer">
            <!-- <a href="#" class="btn btn-default btn-flat">Profile</a> -->
            <a href="<c:url value='/j_spring_security_logout'/>" class="btn btn-default btn-flat float-right">Cerrar Sesión</a>
          </li>
        </ul>
      </li>
      
    </ul>
    
    
  </nav>
  <!-- /.navbar -->



  <!-- Main Sidebar Container AKI EMPIEZA EL MENU PRINCIPAL DE LADO IZQ-->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo --> 
    <a href="index3.html" class="brand-link">
      <img  src="<%=request.getContextPath()%>/resources/ConfiguracionAdminLTE/dist/img/AdminLTELogo.png"
      alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
           style="opacity: .8">
      <span class="brand-text font-weight-light">.: La Antigua :.</span>
    </a>

    <!-- Sidebar --> 
    <div class="sidebar">
    
      <!-- Sidebar user panel (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
         <div class="image">
          <img src="<%=request.getContextPath()%>/resources/ConfiguracionAdminLTE/dist/img/user2-160x160.jpg"
          class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
          <a href="#" class="d-block">Alexander Pierce</a>
        </div> 
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          
<!-- Add icons to the links using the .nav-icon class with font-awesome or any other icon font library -->
          <li class="nav-item has-treeview menu-open">
          
            <a href="<c:url value='Menu'/>" class="nav-link active">
              <i class="nav-icon fas fa-home"></i>
              <p> Menu principal </p>
            </a>
                                    
          </li>
          
           <li class="nav-item"> 
            <a href="<c:url value='Navbar'/>" class="nav-link">       
              <i class="nav-icon far fa-image"></i>
              <p>
                new navbar MIO                
              </p>
            </a>
          </li>
          
          
          <li class="nav-item">
            <a href="<c:url value='Memoria'/>" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
                Memorias
                <span class="right badge badge-danger">New</span>
              </p>
            </a>
          </li>
          
          
         <!--  <li class="nav-item">
            <a href="pages/widgets.html" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
                Widgets
                <span class="right badge badge-danger">New</span>
              </p>
            </a>
          </li> -->
          
          
       <!--    <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-copy"></i>
              <p>
                Layout Options
                <i class="fas fa-angle-left right"></i>
                <span class="badge badge-info right">6</span>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="pages/layout/top-nav.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Top Navigation</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/layout/top-nav-sidebar.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Top Navigation + Sidebar</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/layout/boxed.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Boxed</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/layout/fixed-sidebar.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Fixed Sidebar</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/layout/fixed-topnav.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Fixed Navbar</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/layout/fixed-footer.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Fixed Footer</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/layout/collapsed-sidebar.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Collapsed Sidebar</p>
                </a>
              </li>
            </ul>
          </li> -->
          
          
          				<!-- MENU PARA SALONES    -->
          <li class="nav-item"> 
            <a href="<c:url value='Salones'/>" class="nav-link">       
              <i class="nav-icon far fa-image"></i>
              <p>
                Salones              
              </p>
            </a>
          </li>
          
          
         
          
          
          <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-tree"></i>
              <p>
                UI Elements
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="pages/UI/general.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>General</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/UI/icons.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Icons</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/UI/buttons.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Buttons</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/UI/sliders.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Sliders</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/UI/modals.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Modals & Alerts</p>
                </a>
              </li>
              <li class="nav-item">
                <!--<a href="pages/UI/navbar.html" class="nav-link">-->
                <a href="<c:url value='/Mobiliario'/>" class = "nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Mobiliario</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/UI/timeline.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Timeline</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/UI/ribbons.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Ribbons</p>
                </a>
              </li>
            </ul>
          </li>
          
          
        
          
        
          
          <li class="nav-header">Calendario de Eventos</li>
          <li class="nav-item"> 
            <a href="<c:url value='Calendar'/>" class="nav-link">       
              <i class="nav-icon far fa-calendar-alt"></i>
              <p>
                Calendar
                <span class="badge badge-info right">2</span>
              </p>
            </a>
          </li>
         
          
          
          <!-- <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-book"></i>
              <p>
                Pages
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="pages/examples/invoice.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Invoice</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/profile.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Profile</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/e-commerce.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>E-commerce</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/projects.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Projects</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/project-add.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Project Add</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/project-edit.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Project Edit</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/project-detail.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Project Detail</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/contacts.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Contacts</p>
                </a>
              </li>
            </ul>
          </li> -->
          
          <!-- <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon far fa-plus-square"></i>
              <p>
                Extras
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="pages/examples/login.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Login</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/register.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Register</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/forgot-password.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Forgot Password</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/recover-password.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Recover Password</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/lockscreen.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Lockscreen</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/legacy-user-menu.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Legacy User Menu</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/language-menu.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Language Menu</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/404.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Error 404</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/500.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Error 500</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/pace.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Pace</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/examples/blank.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Blank Page</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="starter.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Starter Page</p>
                </a>
              </li>
            </ul>
          </li> -->
         
          
          
        
          
         
          
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>



  			<!-- Content Wrapper. Contains page content PARATE DEL BODY LOS RECUADROS INFORMATIVOS -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0 text-dark">Dashboard</h1>
          </div><!-- /.col -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Dashboard v1</li>
            </ol>
          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <!-- Small boxes (Stat box) -->
        <div class="row">
          <div class="col-lg-3 col-6">
            <!-- small box -->
            <div class="small-box bg-info">
              <div class="inner">
                <h3>150</h3>

                <p>New Orders</p>
              </div>
              <div class="icon">
                <i class="ion ion-bag"></i>
              </div>
              <a href="#" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
            </div>
          </div>
          <!-- ./col -->
          <div class="col-lg-3 col-6">
            <!-- small box -->
            <div class="small-box bg-success">
              <div class="inner">
                <h3>53<sup style="font-size: 20px">%</sup></h3>

                <p>Bounce Rate</p>
              </div>
              <div class="icon">
                <i class="ion ion-stats-bars"></i>
              </div>
              <a href="#" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
            </div>
          </div>
          <!-- ./col -->
          <div class="col-lg-3 col-6">
            <!-- small box -->
            <div class="small-box bg-warning">
              <div class="inner">
                <h3>44</h3>

                <p>User Registrations</p>
              </div>
              <div class="icon">
                <i class="ion ion-person-add"></i>
              </div>
              <a href="#" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
            </div>
          </div>
          <!-- ./col -->
          <div class="col-lg-3 col-6">
            <!-- small box -->
            <div class="small-box bg-danger">
              <div class="inner">
                <h3>65</h3>

                <p>Unique Visitors</p>
              </div>
              <div class="icon">
                <i class="ion ion-pie-graph"></i>
              </div>
              <a href="#" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
            </div>
          </div>
          <!-- ./col -->
        </div>
        <!-- /.row -->
        <!-- Main row -->
        
        
        
     
     
      </div>
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <strong>Copyright &copy; 2014-2019 <a href="http://adminlte.io">AdminLTE.io</a>.</strong>
    All rights reserved.
    <div class="float-right d-none d-sm-inline-block">
      <b>Version</b> 3.0.5
    </div>
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/jquery/jquery.min.js" />"></script>
<!-- jQuery UI 1.11.4 -->  
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/jquery-ui/jquery-ui.min.js" />"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button)
</script>
<!-- Bootstrap 4 --> 
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/bootstrap/js/bootstrap.bundle.js" />"></script>
<!-- ChartJS --> 
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/chart.js/Chart.min.js" />"></script>
<!-- Sparkline -->														
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/sparklines/sparkline.js" />"></script>
<!-- JQVMap -->     
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/jqvmap/jquery.vmap.min.js" />"></script>
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/jqvmap/maps/continents/jquery.vmap.north-america.js" />"></script>
<!-- 	/LaGranjaWeb/src/main/webapp/resources/ConfiguracionAdminLTE/plugins/jqvmap/maps/continents/jquery.vmap.south-america.js      jquery.vmap.world.js -->
<!-- jQuery Knob Chart -->  																									 	   
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/jquery-knob/jquery.knob.min.js" />"></script>
<!-- daterangepicker -->  
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/moment/moment.min.js" />"></script>
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/daterangepicker/daterangepicker.js" />"></script>
<!-- Tempusdominus Bootstrap 4 --> 
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js" />"></script>
<!-- Summernote --> 
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/summernote/summernote-bs4.min.js" />"></script>
<!-- overlayScrollbars --> 
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js" />"></script>
<!-- AdminLTE App --> 
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/dist/js/adminlte.js" />"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/dist/js/pages/dashboard.js" />"></script>
<!-- AdminLTE for demo purposes --> 
	<script lenguaje="JavaScript" type="text/javascript"src="<c:url value="/resources/ConfiguracionAdminLTE/dist/js/demo.js" />"></script>
	 
	 
	 
	 




<!--  =============== TERMINA ===================================  AKI TERMINA LO K ESTOY AGREGANDO NUEVO DEL DASHHBOARDA  ===========================================  -->
 

</body>
</html>


