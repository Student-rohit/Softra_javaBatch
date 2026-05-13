package com.service;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.VendorBean;
import com.VendorReg_DAO;

@WebServlet("/VendorService")
public class VendorService extends HttpServlet {

    private static final long serialVersionUID = 1L;

    VendorReg_DAO dao;
    VendorBean bean;

    public void init(ServletConfig config) throws ServletException {

        dao = new VendorReg_DAO();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        bean = (VendorBean) session.getAttribute("vend");

        int status = dao.saveVendor(bean);

        if (status > 0) {

            out.print("Success");

        } else {

            out.print("Super Failure");

        }
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}