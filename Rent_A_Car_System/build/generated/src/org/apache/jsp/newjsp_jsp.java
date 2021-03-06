package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <title>AdminLTE 3 | Dashboard</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/fontawesome-free/css/all.min.css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("  <!-- Tempusdominus Bootstrap 4 -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css\">\r\n");
      out.write("  <!-- iCheck -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/icheck-bootstrap/icheck-bootstrap.min.css\">\r\n");
      out.write("  <!-- JQVMap -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/jqvmap/jqvmap.min.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"dist/css/adminlte.min.css\">\r\n");
      out.write("  <!-- overlayScrollbars -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/overlayScrollbars/css/OverlayScrollbars.min.css\">\r\n");
      out.write("  <!-- Daterange picker -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/daterangepicker/daterangepicker.css\">\r\n");
      out.write("  <!-- summernote -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/summernote/summernote-bs4.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition sidebar-mini layout-fixed\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Navbar -->\r\n");
      out.write("  <nav class=\"main-header navbar navbar-expand navbar-white navbar-light\">\r\n");
      out.write("    <!-- Left navbar links -->\r\n");
      out.write("    <ul class=\"navbar-nav\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\" role=\"button\"><i class=\"fas fa-bars\"></i></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("        <a href=\"index3.html\" class=\"nav-link\">Home</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>   \r\n");
      out.write("\r\n");
      out.write("    <!-- Right navbar links -->\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">  \r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-widget=\"fullscreen\" href=\"#\" role=\"button\">\r\n");
      out.write("          <i class=\"fas fa-expand-arrows-alt\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-widget=\"control-sidebar\" data-slide=\"true\" href=\"#\" role=\"button\">\r\n");
      out.write("          <i class=\"fas fa-th-large\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("  <!-- /.navbar -->\r\n");
      out.write("  <!-- Main Sidebar Container -->\r\n");
      out.write("  <aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\r\n");
      out.write("    <!-- Brand Logo -->\r\n");
      out.write("    <a href=\"index3.html\" class=\"brand-link\">\r\n");
      out.write("      <img src=\"dist/img/AdminLTELogo.png\" alt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\" style=\"opacity: .8\">\r\n");
      out.write("      <span class=\"brand-text font-weight-light\">AdminLTE 3</span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Sidebar -->\r\n");
      out.write("    <div class=\"sidebar\">\r\n");
      out.write("      <!-- Sidebar user panel (optional) -->\r\n");
      out.write("      <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\r\n");
      out.write("        <div class=\"image\">\r\n");
      out.write("          <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle elevation-2\" alt=\"User Image\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"info\">\r\n");
      out.write("          <a href=\"#\" class=\"d-block\">Alexander Pierce</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar Menu -->\r\n");
      out.write("      <nav class=\"mt-2\">\r\n");
      out.write("        <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\r\n");
      out.write("          <!-- Add icons to the links using the .nav-icon class\r\n");
      out.write("               with font-awesome or any other icon font library -->\r\n");
      out.write("          <li class=\"nav-item menu-open\">\r\n");
      out.write("            <a href=\"#\" class=\"nav-link active\">\r\n");
      out.write("              <i class=\"nav-icon fas fa-tachometer-alt\"></i>\r\n");
      out.write("              <p>\r\n");
      out.write("                Dashboard\r\n");
      out.write("                <i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("              </p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"nav nav-treeview\">\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"./index.html\" class=\"nav-link active\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>Dashboard v1</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"./index2.html\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>Dashboard v2</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"./index3.html\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>Dashboard v3</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </nav>\r\n");
      out.write("      <!-- /.sidebar-menu -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.sidebar -->\r\n");
      out.write("  </aside>\r\n");
      out.write("\r\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("  <div class=\"content-wrapper\">\r\n");
      out.write("    <!-- Content Header (Page header) -->\r\n");
      out.write("    <div class=\"content-header\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row mb-2\">\r\n");
      out.write("          <div class=\"col-sm-6\">\r\n");
      out.write("            <h1 class=\"m-0\">Dashboard</h1>\r\n");
      out.write("          </div><!-- /.col -->\r\n");
      out.write("          <div class=\"col-sm-6\">\r\n");
      out.write("            <ol class=\"breadcrumb float-sm-right\">\r\n");
      out.write("              <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\r\n");
      out.write("              <li class=\"breadcrumb-item active\">Dashboard v1</li>\r\n");
      out.write("            </ol>\r\n");
      out.write("          </div><!-- /.col -->\r\n");
      out.write("        </div><!-- /.row -->\r\n");
      out.write("      </div><!-- /.container-fluid -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.content-header -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Main content -->\r\n");
      out.write("    <section class=\"content\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <!-- Small boxes (Stat box) -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-lg-3 col-6\">\r\n");
      out.write("            <!-- small box -->\r\n");
      out.write("            <div class=\"small-box bg-info\">\r\n");
      out.write("              <div class=\"inner\">\r\n");
      out.write("                <h3>150</h3>\r\n");
      out.write("                <p>New Orders</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"icon\">\r\n");
      out.write("                <i class=\"ion ion-bag\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("              <a href=\"#\" class=\"small-box-footer\">More info <i class=\"fas fa-arrow-circle-right\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- ./col -->\r\n");
      out.write("          <div class=\"col-lg-3 col-6\">\r\n");
      out.write("            <!-- small box -->\r\n");
      out.write("            <div class=\"small-box bg-success\">\r\n");
      out.write("              <div class=\"inner\">\r\n");
      out.write("                <h3>53<sup style=\"font-size: 20px\">%</sup></h3>\r\n");
      out.write("\r\n");
      out.write("                <p>Bounce Rate</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"icon\">\r\n");
      out.write("                <i class=\"ion ion-stats-bars\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("              <a href=\"#\" class=\"small-box-footer\">More info <i class=\"fas fa-arrow-circle-right\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- ./col -->\r\n");
      out.write("          \r\n");
      out.write("          <!-- ./col -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("        <!-- Main row -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <!-- Left col -->\r\n");
      out.write("          <section class=\"col-lg-12 connectedSortable\">\r\n");
      out.write("            <!-- Custom tabs (Charts with tabs)-->\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("              <div class=\"card-header\">\r\n");
      out.write("                <h3 class=\"card-title\">\r\n");
      out.write("                  <i class=\"fas fa-chart-pie mr-1\"></i>\r\n");
      out.write("                  Sales\r\n");
      out.write("                </h3>\r\n");
      out.write("                <div class=\"card-tools\">\r\n");
      out.write("                  <ul class=\"nav nav-pills ml-auto\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                      <a class=\"nav-link active\" href=\"#revenue-chart\" data-toggle=\"tab\">Area</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                      <a class=\"nav-link\" href=\"#sales-chart\" data-toggle=\"tab\">Donut</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div><!-- /.card-header -->\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <div class=\"tab-content p-0\">\r\n");
      out.write("                  <!-- Morris chart - Sales -->\r\n");
      out.write("                  <div class=\"chart tab-pane active\" id=\"revenue-chart\"\r\n");
      out.write("                       style=\"position: relative; height: 300px;\">\r\n");
      out.write("                      <canvas id=\"revenue-chart-canvas\" height=\"300\" style=\"height: 300px;\"></canvas>\r\n");
      out.write("                   </div>\r\n");
      out.write("                  <div class=\"chart tab-pane\" id=\"sales-chart\" style=\"position: relative; height: 300px;\">\r\n");
      out.write("                    <canvas id=\"sales-chart-canvas\" height=\"300\" style=\"height: 300px;\"></canvas>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          <!-- /.Left col -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row (main row) -->\r\n");
      out.write("      </div><!-- /.container-fluid -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- /.content -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.content-wrapper -->\r\n");
      out.write("  <footer class=\"main-footer\">\r\n");
      out.write("    <strong>Copyright &copy; 2014-2020 <a href=\"https://adminlte.io\">AdminLTE.io</a>.</strong>\r\n");
      out.write("    All rights reserved.\r\n");
      out.write("    <div class=\"float-right d-none d-sm-inline-block\">\r\n");
      out.write("      <b>Version</b> 3.1.0-rc\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  <!-- Control Sidebar -->\r\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Control sidebar content goes here -->\r\n");
      out.write("  </aside>\r\n");
      out.write("  <!-- /.control-sidebar -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("<!-- jQuery UI 1.11.4 -->\r\n");
      out.write("<script src=\"plugins/jquery-ui/jquery-ui.min.js\"></script>\r\n");
      out.write("<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\r\n");
      out.write("<script>\r\n");
      out.write("  $.widget.bridge('uibutton', $.ui.button)\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Bootstrap 4 -->\r\n");
      out.write("<script src=\"plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<!-- ChartJS -->\r\n");
      out.write("<script src=\"plugins/chart.js/Chart.min.js\"></script>\r\n");
      out.write("<!-- Sparkline -->\r\n");
      out.write("<script src=\"plugins/sparklines/sparkline.js\"></script>\r\n");
      out.write("<!-- JQVMap -->\r\n");
      out.write("<script src=\"plugins/jqvmap/jquery.vmap.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/jqvmap/maps/jquery.vmap.usa.js\"></script>\r\n");
      out.write("<!-- jQuery Knob Chart -->\r\n");
      out.write("<script src=\"plugins/jquery-knob/jquery.knob.min.js\"></script>\r\n");
      out.write("<!-- daterangepicker -->\r\n");
      out.write("<script src=\"plugins/moment/moment.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("<!-- Tempusdominus Bootstrap 4 -->\r\n");
      out.write("<script src=\"plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js\"></script>\r\n");
      out.write("<!-- Summernote -->\r\n");
      out.write("<script src=\"plugins/summernote/summernote-bs4.min.js\"></script>\r\n");
      out.write("<!-- overlayScrollbars -->\r\n");
      out.write("<script src=\"plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"dist/js/adminlte.js\"></script>\r\n");
      out.write("<!-- AdminLTE for demo purposes -->\r\n");
      out.write("<script src=\"dist/js/demo.js\"></script>\r\n");
      out.write("<!-- AdminLTE dashboard demo (This is only for demo purposes) -->\r\n");
      out.write("<script src=\"dist/js/pages/dashboard.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
