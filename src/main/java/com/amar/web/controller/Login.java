package com.amar.web.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.db.ibatis.dao.UserDAO;
import com.amar.util.ServletUtil;
import com.amar.util.TimeDateUtil;
import com.amar.web.framework.BaseController;
import com.amar.web.model.User;

@Controller
@RequestMapping( "login.amar" )
public class Login extends BaseController
{

	@Resource( name = "userDAO" )
	private UserDAO userDAO;

	@RequestMapping( params = "method=logintest" )
	public void toAddArea( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		response.setHeader( "Content-Type" , "text/plain;charset=UTF-8" );
		JSONObject json = new JSONObject();
		String name = request.getParameter( "name" );
		String pw = request.getParameter( "pw" );

		json.put( "name" , name );
		json.put( "pw" , pw );

		response.getWriter().write( json.toString() );
	}

	@RequestMapping( params = "method=beBrower" )
	public String beBrower( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		return "main";
	}

	@RequestMapping( params = "method=exit" )
	public String exitLogin( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		request.getSession().removeAttribute( "user" );

		return "main";
	}

	@RequestMapping( params = "method=tologin" )
	public String toLogin( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{

		return "login/login";
	}

	@RequestMapping( params = "method=toRegist" )
	public String toRegist( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{

		return "login/regist";
	}

	@RequestMapping( params = "method=regist" )
	public String regist( HttpServletRequest request , HttpServletResponse response )
	{
		boolean result = false;

		try
		{
			User user = ServletUtil.request2Bean( request , User.class );

			user.setRegtime( new Date() );

			user.setLastlogintime( new Date() );

			String brithdays = request.getParameter( "brithdays" );
			String pw = request.getParameter( "_pw" );
			String loginname = request.getParameter( "_loginname" );

			Date brithday = new Date( TimeDateUtil.getLongDay( brithdays ) );

			user.setBrithday( brithday );
			user.setPw( pw );
			user.setLoginname( loginname );

			userDAO.addUser( user );

			request.getSession().setAttribute( "user" , user );

			result = true;
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}

		if ( result )
		{
			return "main";
		}
		else
		{
			request.setAttribute( "errorinfo" , "<font color='red'>error</font>" );
			return "login/regist";
		}
	}

	@RequestMapping( params = "method=main" )
	public String main( HttpServletRequest request , HttpServletResponse response )
	{
		String waring = request.getParameter( "waring" );
		if ( waring != null && waring.length() > 0 )
		{
			request.setAttribute( "waring" , waring );
		}

		return "main";
	}

	@RequestMapping( params = "method=login" )
	public String login( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		User user = ServletUtil.request2Bean( request , User.class );

		if ( user.getPw() == null || user.getLoginname() == null )
		{
			user.setPw( "22222" );
			user.setLoginname( "22222" );
		}

		List<User> userList = userDAO.findUser( user , new RowBounds( 0 , 10 ) );

		if ( userList != null && userList.size() > 0 )
		{
			request.getSession().setAttribute( "user" , userList.get( 0 ) );
			return "main";
		}
		else
		{
			request.setAttribute( "errorinfo" , "用户名或密码错误" );
			return "login/login";
		}
	}

}
