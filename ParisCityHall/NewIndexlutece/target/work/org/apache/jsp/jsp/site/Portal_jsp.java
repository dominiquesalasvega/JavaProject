/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.21
 * Generated at: 2019-08-28 13:24:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fr.paris.lutece.portal.service.security.UserNotSignedException;
import fr.paris.lutece.portal.service.security.SecurityService;
import java.util.Enumeration;
import java.lang.StringBuffer;
import fr.paris.lutece.portal.web.LocalVariables;
import fr.paris.lutece.portal.service.message.SiteMessageException;
import fr.paris.lutece.portal.service.page.PageNotFoundException;
import fr.paris.lutece.portal.service.util.AppPathService;
import fr.paris.lutece.portal.web.PortalJspBean;

public final class Portal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("fr.paris.lutece.portal.service.util.AppPathService");
    _jspx_imports_classes.add("fr.paris.lutece.portal.service.security.UserNotSignedException");
    _jspx_imports_classes.add("fr.paris.lutece.portal.web.LocalVariables");
    _jspx_imports_classes.add("fr.paris.lutece.portal.service.message.SiteMessageException");
    _jspx_imports_classes.add("fr.paris.lutece.portal.service.security.SecurityService");
    _jspx_imports_classes.add("java.util.Enumeration");
    _jspx_imports_classes.add("java.lang.StringBuffer");
    _jspx_imports_classes.add("fr.paris.lutece.portal.service.page.PageNotFoundException");
    _jspx_imports_classes.add("fr.paris.lutece.portal.web.PortalJspBean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"ErrorPagePortal.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "PortalHeader.jsp", out, false);
      fr.paris.lutece.portal.web.PortalJspBean portal = null;
      portal = (fr.paris.lutece.portal.web.PortalJspBean) _jspx_page_context.getAttribute("portal", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (portal == null){
        portal = new fr.paris.lutece.portal.web.PortalJspBean();
        _jspx_page_context.setAttribute("portal", portal, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }


	// Required by JSR168 portlets (added in v1.2)
	LocalVariables.setLocal( config, request, response );


	try
	{
		String strContent = portal.getContent( request );

		out.print( strContent );
		out.flush();
	}
	catch ( PageNotFoundException pnfe )
	{
		response.sendError(response.SC_NOT_FOUND);
	}
	catch( SiteMessageException lme )
	{
		response.sendRedirect( AppPathService.getSiteMessageUrl( request ) );
	}
	catch( UserNotSignedException e )
	{
		// This exception means that a content service needs the
		// user to be authenticated (Added in v1.1)
		// The user should be redirected to the Lutece login page

		if( SecurityService.getInstance(  ).isExternalAuthentication(  ) && 
				!SecurityService.getInstance(  ).isMultiAuthenticationSupported(  ) )
		{

      out.write("\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\tError : This page requires an authenticated user identified by an external service\r\n");
      out.write("\t\t\tbut no user is available.\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t</center>\r\n");

		}
		else
		{
			response.sendRedirect( PortalJspBean.redirectLogin( request ));
		}
	}
	finally
        {
            LocalVariables.setLocal( null, null, null );
        }


    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
