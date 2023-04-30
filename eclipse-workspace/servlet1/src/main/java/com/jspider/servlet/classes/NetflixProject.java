package com.jspider.servlet.classes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NetflixGit
 */
@WebServlet("/Netflix")
public class NetflixProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NetflixProject() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<html>\r\n"
				+ "  <head>\r\n"
				+ "    <meta name=\"description\" content=\"Hello this is my first web page!.\" />\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style/style.css\" />\r\n"
				+ "    <title>Netflix</title>\r\n"
				+ "    <link rel=\"shortcut icon\" type=\"image/png\" href=\"style/favicon.png\">\r\n"
				+ "    <link\r\n"
				+ "      rel=\"stylesheet\"\r\n"
				+ "      href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\"\r\n"
				+ "      integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\"\r\n"
				+ "      crossorigin=\"anonymous\"\r\n"
				+ "    />\r\n"
				+ "    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\r\n"
				+ "    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\r\n"
				+ "<link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@600&display=swap\" rel=\"stylesheet\">\r\n"
				
				+"<style>"
				+ "* {\r\n"
				+ "  margin: 0;\r\n"
				+ "  padding: 0;\r\n"
				+ "  box-sizing: border-box;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "a{\r\n"
				+ "  text-decoration: none;\r\n"
				+ "  color: white;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "body {\r\n"
				+ "  background-color: black;\r\n"
				+ "  color: white;\r\n"
				+ "  font-family: 'Quicksand', sans-serif;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".navbar {\r\n"
				+ "  position: absolute;\r\n"
				+ "  top: 0;\r\n"
				+ "  width: 100%;\r\n"
				+ "  display: flex;\r\n"
				+ "  justify-content: space-between;\r\n"
				+ "  padding: 3% 5%;\r\n"
				+ "  z-index: 10;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".navbar__brand {\r\n"
				+ "  width: 100px;\r\n"
				+ "  height: 100%;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".brand__logo {\r\n"
				+ "  width: 100%;\r\n"
				+ "  height: 100%;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".language__drop__down {\r\n"
				+ "  background: transparent;\r\n"
				+ "  border: none;\r\n"
				+ "  color: white;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".language__drop__down:focus {\r\n"
				+ "  outline: none;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".dropdown__container {\r\n"
				+ "  border: 1px solid white;\r\n"
				+ "  padding: 0.4rem;\r\n"
				+ "  border-radius: 4px;\r\n"
				+ "  background: rgba(0, 0, 0, 0.4);\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".signin__button {\r\n"
				+ "  background-color: #dc030f;\r\n"
				+ "  border: 1px solid #dc030f;\r\n"
				+ "  color: white;\r\n"
				+ "  padding: 0.25rem 0.5rem;\r\n"
				+ "  border-radius: 4px;\r\n"
				+ "  text-decoration: none;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".navbar__nav__items {\r\n"
				+ "  display: flex;\r\n"
				+ "  gap: 10px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".hero__bg__image__container {\r\n"
				+ "  width: 100%;\r\n"
				+ "  height: 80vh;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".hero__bg__image {\r\n"
				+ "  width: 100%;\r\n"
				+ "  height: 100%;\r\n"
				+ "  object-fit: cover;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".hero__bg__overlay {\r\n"
				+ "  position: absolute;\r\n"
				+ "  inset: 0;\r\n"
				+ "  width: 100%;\r\n"
				+ "  height: 80vh;\r\n"
				+ "  background: rgba(0, 0, 0, 0.4);\r\n"
				+ "  background-image: linear-gradient(\r\n"
				+ "    to top,\r\n"
				+ "    rgba(0, 0, 0, 0.8) 0,\r\n"
				+ "    rgba(0, 0, 0, 0) 60%,\r\n"
				+ "    rgba(0, 0, 0, 0.8) 100%\r\n"
				+ "  );\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".hero__card {\r\n"
				+ "  position: absolute;\r\n"
				+ "  top: 20%;\r\n"
				+ "  text-align: center;\r\n"
				+ "  display: flex;\r\n"
				+ "  flex-direction: column;\r\n"
				+ "  gap: 10px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".hero__title {\r\n"
				+ "  font-weight: 600;\r\n"
				+ "  font-size: 2rem;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".hero__subtitle,\r\n"
				+ ".hero__description {\r\n"
				+ "  font-weight: 400;\r\n"
				+ "  font-size: 1rem;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".hero__description {\r\n"
				+ "  margin: 0 50px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".email__input {\r\n"
				+ "  border: none;\r\n"
				+ "  background: transparent;\r\n"
				+ "  width: 100%;\r\n"
				+ "  height: 100%;\r\n"
				+ "  padding-left: 7px;\r\n"
				+ "}\r\n"
				+ ".email__label {\r\n"
				+ "  color: black;\r\n"
				+ "  position: absolute;\r\n"
				+ "  top: 28%;\r\n"
				+ "  left: 2%;\r\n"
				+ "  color: rgb(153, 149, 149);\r\n"
				+ "  transition: 0.5s;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".email__form__container {\r\n"
				+ "  display: flex;\r\n"
				+ "  flex-direction: column;\r\n"
				+ "  justify-content: center;\r\n"
				+ "  align-items: center;\r\n"
				+ "  gap: 15px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".form__container {\r\n"
				+ "  background-color: white;\r\n"
				+ "  width: 90%;\r\n"
				+ "  height: 50px;\r\n"
				+ "  position: relative;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".email__input:focus + .email__label {\r\n"
				+ "  top: 0.2rem;\r\n"
				+ "  font-size: 10px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".email__input:not(:placeholder-shown).email__input:not(:focus) + .email__label {\r\n"
				+ "  top: 0.2rem;\r\n"
				+ "  font-size: 10px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".email__input:focus-visible {\r\n"
				+ "  outline: none;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".primary__button {\r\n"
				+ "  background-color: #dc030f;\r\n"
				+ "  border: 1px solid #dc030f;\r\n"
				+ "  color: white;\r\n"
				+ "  padding: 0.8rem 1.2rem;\r\n"
				+ "  border-radius: 2px;\r\n"
				+ "  font-size: 15px;\r\n"
				+ "  letter-spacing: 1px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".feature {\r\n"
				+ "  border-top: 8px solid #222;\r\n"
				+ "  padding: 2rem 1rem;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".feature__details {\r\n"
				+ "  text-align: center;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".feature__title {\r\n"
				+ "  font-size: 25px;\r\n"
				+ "  font-weight: 600;\r\n"
				+ "  margin: 10px 0;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".feature__sub__title {\r\n"
				+ "  font-size: 15px;\r\n"
				+ "  font-weight: 400;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".feature__image__container {\r\n"
				+ "  width: 100%;\r\n"
				+ "  position: relative;\r\n"
				+ "}\r\n"
				+ ".feature__image {\r\n"
				+ "  width: 100%;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".feature__backgroud__video__container {\r\n"
				+ "  position: absolute;\r\n"
				+ "  width: 100%;\r\n"
				+ "  top: 20%;\r\n"
				+ "  left: 13%;\r\n"
				+ "  height: 100%;\r\n"
				+ "  max-width: 73%;\r\n"
				+ "  max-height: 54%;\r\n"
				+ "  z-index: -2;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".feature__backgroud__video {\r\n"
				+ "  width: 100%;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".feature__2__poster__container {\r\n"
				+ "  position: absolute;\r\n"
				+ "  bottom: 8%;\r\n"
				+ "  left: 50%;\r\n"
				+ "  transform: translateX(-50%);\r\n"
				+ "  width: 100%;\r\n"
				+ "  max-width: 16em;\r\n"
				+ "  display: flex;\r\n"
				+ "  align-items: center;\r\n"
				+ "  background-color: black;\r\n"
				+ "  border: 2px solid rgba(255, 255, 255, 0.25);\r\n"
				+ "  border-radius: 10px;\r\n"
				+ "  height: 60px;\r\n"
				+ "  padding: 0.25rem 0.6rem;\r\n"
				+ "  gap: 15px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".poster__container {\r\n"
				+ "  width: 20%;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".poster {\r\n"
				+ "  width: 100%;\r\n"
				+ "  height: 100%;\r\n"
				+ "}\r\n"
				+ ".poster__details {\r\n"
				+ "  width: 60%;\r\n"
				+ "}\r\n"
				+ ".poster__details > h4 {\r\n"
				+ "  font-size: 13px;\r\n"
				+ "  font-weight: 500;\r\n"
				+ "}\r\n"
				+ ".poster__details > h6 {\r\n"
				+ "  font-size: 12px;\r\n"
				+ "  font-weight: 400;\r\n"
				+ "  color: rgb(63, 63, 246);\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".download__gif__container {\r\n"
				+ "  width: 20%;\r\n"
				+ "  height: 100%;\r\n"
				+ "}\r\n"
				+ ".gif {\r\n"
				+ "  width: 100%;\r\n"
				+ "  height: 100%;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".feature__3__backgroud__video__container {\r\n"
				+ "  max-width: 63%;\r\n"
				+ "  max-height: 47%;\r\n"
				+ "  z-index: -2;\r\n"
				+ "  top: 9%;\r\n"
				+ "  left: 19%;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".FAQ__accordian {\r\n"
				+ "  width: 100%;\r\n"
				+ "}\r\n"
				+ ".FAQ__title {\r\n"
				+ "  width: 100%;\r\n"
				+ "  display: flex;\r\n"
				+ "  justify-content: space-between;\r\n"
				+ "  padding: 15px 20px;\r\n"
				+ "  font-size: 18px;\r\n"
				+ "  background-color: #303030;\r\n"
				+ "  border: 1px solid #303030;\r\n"
				+ "  color: white;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".FAQ__visible {\r\n"
				+ "  background-color: #303030;\r\n"
				+ "  border-top: 1px solid black;\r\n"
				+ "  max-height: 0;\r\n"
				+ "  overflow: hidden;\r\n"
				+ "  transition: max-height 0.5s ease-in-out;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".FAQ__visible > p {\r\n"
				+ "  margin: 1rem;\r\n"
				+ "}\r\n"
				+ ".FAQ__list__container {\r\n"
				+ "  border-top: 8px solid #222;\r\n"
				+ "  padding: 2rem 0;\r\n"
				+ "}\r\n"
				+ ".FAQ__heading {\r\n"
				+ "  font-size: 20px;\r\n"
				+ "  text-align: center;\r\n"
				+ "  font-weight: 600;\r\n"
				+ "  margin: 1rem 3rem;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".FAQ__list {\r\n"
				+ "  display: flex;\r\n"
				+ "  flex-direction: column;\r\n"
				+ "  justify-content: center;\r\n"
				+ "  align-items: center;\r\n"
				+ "  gap: 10px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".FAQ__get__started__email {\r\n"
				+ "  text-align: center;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".FAQ__get__started__email > h3 {\r\n"
				+ "  font-size: 18px;\r\n"
				+ "  font-weight: 400;\r\n"
				+ "  margin: 2rem 0;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "footer {\r\n"
				+ "  border-top: 8px solid #333;\r\n"
				+ "  padding: 2rem 1rem;\r\n"
				+ "  color: #757575;\r\n"
				+ "  display: flex;\r\n"
				+ "  flex-direction: column;\r\n"
				+ "  gap: 20px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".footer__row__2 {\r\n"
				+ "  display: flex;\r\n"
				+ "  flex-wrap: wrap;\r\n"
				+ "  justify-content: space-around;\r\n"
				+ "  gap: 20px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".footer__row__1 > h4 {\r\n"
				+ "  font-size: 15px;\r\n"
				+ "  font-weight: 500;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".footer__row__3 > .dropdown__container {\r\n"
				+ "  width: fit-content;\r\n"
				+ "  border: 1px solid #757575;\r\n"
				+ "  color: #757575;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".footer__row__3 > .dropdown__container > .language__drop__down {\r\n"
				+ "  color: #757575;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "@media (min-width: 768px) {\r\n"
				+ "  .hero__bg__image__container {\r\n"
				+ "    height: 100vh;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .hero__bg__overlay {\r\n"
				+ "    height: 100vh;\r\n"
				+ "  }\r\n"
				+ "  .hero__card {\r\n"
				+ "    top: 40%;\r\n"
				+ "    left: 30%;\r\n"
				+ "    transform: translate(-20%, -20%);\r\n"
				+ "  }\r\n"
				+ "  .hero__title {\r\n"
				+ "    font-size: 3rem;\r\n"
				+ "  }\r\n"
				+ "  .hero__subtitle,\r\n"
				+ "  .hero__description {\r\n"
				+ "    font-size: 1.3rem;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .feature {\r\n"
				+ "    padding: 4rem;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .feature__title {\r\n"
				+ "    font-size: 35px;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .feature__sub__title {\r\n"
				+ "    font-size: 20px;\r\n"
				+ "  }\r\n"
				+ "  .feature__2__poster__container {\r\n"
				+ "    max-width: 26em;\r\n"
				+ "    height: 85px;\r\n"
				+ "  }\r\n"
				+ "  .poster__container {\r\n"
				+ "    width: 15%;\r\n"
				+ "  }\r\n"
				+ "  .download__gif__container {\r\n"
				+ "    width: 3rem;\r\n"
				+ "    height: 3rem;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .poster__details > h4 {\r\n"
				+ "    font-size: 18px;\r\n"
				+ "  }\r\n"
				+ "  .poster__details > h6 {\r\n"
				+ "    font-size: 14px;\r\n"
				+ "  }\r\n"
				+ "  .FAQ__title {\r\n"
				+ "    font-size: 20px;\r\n"
				+ "  }\r\n"
				+ "  .FAQ__heading {\r\n"
				+ "    font-size: 38px;\r\n"
				+ "    font-weight: 500;\r\n"
				+ "    letter-spacing: 1px;\r\n"
				+ "  }\r\n"
				+ "  .FAQ__list {\r\n"
				+ "    padding: 1rem 5rem;\r\n"
				+ "  }\r\n"
				+ "  .FAQ__get__started__email {\r\n"
				+ "    width: 75%;\r\n"
				+ "    display: flex;\r\n"
				+ "    flex-direction: column;\r\n"
				+ "    justify-content: center;\r\n"
				+ "    transform: translateX(15%);\r\n"
				+ "  }\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "@media (min-width: 1024px) {\r\n"
				+ "  .navbar {\r\n"
				+ "    padding: 2% 5%;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .navbar__brand {\r\n"
				+ "    width: 150px;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .signin__button {\r\n"
				+ "    padding: 10px 20px;\r\n"
				+ "    font-size: 18px;\r\n"
				+ "  }\r\n"
				+ "  .dropdown__container {\r\n"
				+ "    padding: 10px 5px;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .navbar__nav__items {\r\n"
				+ "    gap: 30px;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .hero__card {\r\n"
				+ "    top: 50%;\r\n"
				+ "    left: 50%;\r\n"
				+ "    transform: translate(-50%, -50%);\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .form__container {\r\n"
				+ "    width: 50%;\r\n"
				+ "  }\r\n"
				+ "  .email__form__container {\r\n"
				+ "    flex-direction: row;\r\n"
				+ "    align-items: center;\r\n"
				+ "    gap: 1px;\r\n"
				+ "  }\r\n"
				+ "  .primary__button {\r\n"
				+ "    height: 50px;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .feature {\r\n"
				+ "    display: flex;\r\n"
				+ "    align-items: center;\r\n"
				+ "    justify-content: space-between;\r\n"
				+ "    gap: 20px;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .feature__details {\r\n"
				+ "    text-align: left;\r\n"
				+ "    padding: 0 6rem;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .feature__title {\r\n"
				+ "    font-size: 50px;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .feature__sub__title {\r\n"
				+ "    font-size: 25px;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .feature__image__container {\r\n"
				+ "    max-width: 500px;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .feature:nth-child(even) {\r\n"
				+ "    flex-direction: row-reverse;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .feature__2__poster__container {\r\n"
				+ "    max-width: 20em;\r\n"
				+ "    height: 100px;\r\n"
				+ "    padding: 1rem;\r\n"
				+ "  }\r\n"
				+ "  .poster__container {\r\n"
				+ "    width: 20%;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .FAQ__accordian {\r\n"
				+ "  width: 1000px;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .FAQ__list {\r\n"
				+ "    padding: 1rem 25rem;\r\n"
				+ "  }\r\n"
				+ "  .FAQ__get__started__email {\r\n"
				+ "    transform: translateX(16%);\r\n"
				+ "  }\r\n"
				+ "  footer {\r\n"
				+ "    padding: 2rem 25rem;\r\n"
				+ "    justify-content: flex-start;\r\n"
				+ "    text-align: left;\r\n"
				+ "    align-items: flex-start;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .footer__row__2 {\r\n"
				+ "    justify-content: space-between;\r\n"
				+ "    align-items: flex-start;\r\n"
				+ "    flex-wrap: nowrap;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .footer__row__1,\r\n"
				+ "  .footer__row__3,\r\n"
				+ "  .footer__row__4 {\r\n"
				+ "    align-self: flex-start;\r\n"
				+ "  }\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "@media (min-width: 1254px) {\r\n"
				+ "}"
				+ "</style>"
				
				+"<script>"
				+ "let accordian = document.getElementsByClassName(\"FAQ__title\");\r\n"
				+ "\r\n"
				+ "for (let i = 0; i < accordian.length; i++) {\r\n"
				+ "  accordian[i].addEventListener(\"click\", function () {\r\n"
				+ "    if (this.childNodes[1].classList.contains(\"fa-plus\")) {\r\n"
				+ "      this.childNodes[1].classList.remove(\"fa-plus\");\r\n"
				+ "      this.childNodes[1].classList.add(\"fa-times\");\r\n"
				+ "    } else {\r\n"
				+ "      this.childNodes[1].classList.remove(\"fa-times\");\r\n"
				+ "      this.childNodes[1].classList.add(\"fa-plus\");\r\n"
				+ "    }\r\n"
				+ "\r\n"
				+ "    let content = this.nextElementSibling;\r\n"
				+ "    if (content.style.maxHeight) {\r\n"
				+ "      content.style.maxHeight = null;\r\n"
				+ "    } else {\r\n"
				+ "      content.style.maxHeight = content.scrollHeight + \"px\";\r\n"
				+ "    }\r\n"
				+ "  });\r\n"
				+ "}"
				+ "</script>"
				
				
				+ "  </head>\r\n"
				+ "  <body>\r\n"
				+ "    <header>\r\n"
				+ "      <nav class=\"navbar\">\r\n"
				+ "        <div class=\"navbar__brand\">\r\n"
				+ "          <img\r\n"
				+ "            src=\"https://www.freepnglogos.com/uploads/netflix-logo-0.png\"\r\n"
				+ "            alt=\"logo\"\r\n"
				+ "            class=\"brand__logo\"\r\n"
				+ "          />\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <div class=\"navbar__nav__items\">\r\n"
				+ "          <div class=\"nav__item\">\r\n"
				+ "            <div class=\"dropdown__container\">\r\n"
				+ "              <i class=\"fas fa-globe\"></i>\r\n"
				+ "              <select\r\n"
				+ "                name=\"languages\"\r\n"
				+ "                id=\"languagesSelect\"\r\n"
				+ "                class=\"language__drop__down\"\r\n"
				+ "              >\r\n"
				+ "                <option value=\"english\" selected>English</option>\r\n"
				+ "                <option value=\"hindi\">Hindi</option>\r\n"
				+ "              </select>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "\r\n"
				+ "          <div class=\"nav__item\">\r\n"
				+ "            <button class=\"signin__button\"><a href=\"https://www.netflix.com/lk/login\">Sign in</a></button>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "      </nav>\r\n"
				+ "    </header>\r\n"
				+ "\r\n"
				+ "    <main>\r\n"
				+ "      <section class=\"hero\">\r\n"
				+ "        <div class=\"hero__bg__image__container\">\r\n"
				+ "          <img\r\n"
				+ "            src=\"https://assets.nflxext.com/ffe/siteui/vlv3/9c5457b8-9ab0-4a04-9fc1-e608d5670f1a/710d74e0-7158-408e-8d9b-23c219dee5df/IN-en-20210719-popsignuptwoweeks-perspective_alpha_website_large.jpg\"\r\n"
				+ "            alt=\"BG hero image\"\r\n"
				+ "            class=\"hero__bg__image\"\r\n"
				+ "          />\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"hero__bg__overlay\"></div>\r\n"
				+ "\r\n"
				+ "        <div class=\"hero__card\">\r\n"
				+ "          <h1 class=\"hero__title\">\r\n"
				+ "            Unlimited Movies TV,<br />\r\n"
				+ "            Shows and More.\r\n"
				+ "          </h1>\r\n"
				+ "          <p class=\"hero__subtitle\">Watch anywhere and cancel anytime.</p>\r\n"
				+ "          <p class=\"hero__description\">\r\n"
				+ "            Ready to watch? Enter your email to create or restart your\r\n"
				+ "            membership .\r\n"
				+ "          </p>\r\n"
				+ "\r\n"
				+ "          <div class=\"email__form__container\">\r\n"
				+ "            <div class=\"form__container\">\r\n"
				+ "              <input type=\"email\" class=\"email__input\" placeholder=\" \" required/>\r\n"
				+ "              <label class=\"email__label\">Email Address</label>\r\n"
				+ "            </div>\r\n"
				+ "            <button class=\"primary__button\">\r\n"
				+ "              <a href=\"https://www.netflix.com/signup/registration?locale=en-LK\">Get Started</a> <i class=\"fal fa-chevron-right\"></i>\r\n"
				+ "            </button>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "      </section>\r\n"
				+ "      <section class=\"features__container\">\r\n"
				+ "        <!-- Feature 1 -->\r\n"
				+ "        <div class=\"feature\">\r\n"
				+ "          <div class=\"feature__details\">\r\n"
				+ "            <h3 class=\"feature__title\">Enjoy on your TV.</h3>\r\n"
				+ "            <h5 class=\"feature__sub__title\">\r\n"
				+ "              Watch on smart TVs, PlayStation, Xbox, Chromecast, Apple TV,\r\n"
				+ "              Blu-ray players and more.\r\n"
				+ "            </h5>\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"feature__image__container\">\r\n"
				+ "            <img\r\n"
				+ "              src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/tv.png\"\r\n"
				+ "              alt=\"Feature image\"\r\n"
				+ "              class=\"feature__image\"\r\n"
				+ "            />\r\n"
				+ "            <div class=\"feature__backgroud__video__container\">\r\n"
				+ "              <video\r\n"
				+ "                autoplay=\"\"\r\n"
				+ "                loop=\"\"\r\n"
				+ "                muted=\"\"\r\n"
				+ "                class=\"feature__backgroud__video\"\r\n"
				+ "              >\r\n"
				+ "                <source\r\n"
				+ "                  src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/video-tv-in-0819.m4v\"\r\n"
				+ "                  type=\"video/mp4\"\r\n"
				+ "                />\r\n"
				+ "              </video>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "        <!-- Feature 2 -->\r\n"
				+ "        <div class=\"feature\">\r\n"
				+ "          <div class=\"feature__details\">\r\n"
				+ "            <h3 class=\"feature__title\">\r\n"
				+ "              Download your shows to watch offline.\r\n"
				+ "            </h3>\r\n"
				+ "            <h5 class=\"feature__sub__title\">\r\n"
				+ "              Save your favourites easily and always have something to watch.\r\n"
				+ "            </h5>\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"feature__image__container\">\r\n"
				+ "            <img\r\n"
				+ "              src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/mobile-0819.jpg\"\r\n"
				+ "              alt=\"Feature image\"\r\n"
				+ "              class=\"feature__image\"\r\n"
				+ "            />\r\n"
				+ "            <div class=\"feature__2__poster__container\">\r\n"
				+ "              <div class=\"poster__container\">\r\n"
				+ "                <img\r\n"
				+ "                  src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/boxshot.png\"\r\n"
				+ "                  alt=\"poster\"\r\n"
				+ "                  class=\"poster\"\r\n"
				+ "                />\r\n"
				+ "              </div>\r\n"
				+ "              <div class=\"poster__details\">\r\n"
				+ "                <h4>Stranger Things</h4>\r\n"
				+ "                <h6>Downloading...</h6>\r\n"
				+ "              </div>\r\n"
				+ "              <div class=\"download__gif__container\">\r\n"
				+ "                <img\r\n"
				+ "                  src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/download-icon.gif\"\r\n"
				+ "                  alt=\"downloading gif\"\r\n"
				+ "                  class=\"gif\"\r\n"
				+ "                />\r\n"
				+ "              </div>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "        <!-- Feature 3 -->\r\n"
				+ "        <div class=\"feature\">\r\n"
				+ "          <div class=\"feature__details\">\r\n"
				+ "            <h3 class=\"feature__title\">Watch everywhere.</h3>\r\n"
				+ "            <h5 class=\"feature__sub__title\">\r\n"
				+ "              Stream unlimited movies and TV shows on your phone, tablet,\r\n"
				+ "              laptop, and TV.\r\n"
				+ "            </h5>\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"feature__image__container feature__3__image__container\">\r\n"
				+ "            <img\r\n"
				+ "              src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/device-pile-in.png\"\r\n"
				+ "              alt=\"Feature image\"\r\n"
				+ "              class=\"feature__image feature__3__image\"\r\n"
				+ "            />\r\n"
				+ "            <div\r\n"
				+ "              class=\"\r\n"
				+ "                feature__backgroud__video__container\r\n"
				+ "                feature__3__backgroud__video__container\r\n"
				+ "              \"\r\n"
				+ "            >\r\n"
				+ "              <video\r\n"
				+ "                autoplay=\"\"\r\n"
				+ "                loop=\"\"\r\n"
				+ "                muted=\"\"\r\n"
				+ "                class=\"feature__backgroud__video feature__3__backgroud__video\"\r\n"
				+ "              >\r\n"
				+ "                <source\r\n"
				+ "                  src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/video-tv-0819.m4v\"\r\n"
				+ "                  type=\"video/mp4\"\r\n"
				+ "                />\r\n"
				+ "              </video>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "        <!-- Feature 4 -->\r\n"
				+ "        <div class=\"feature\">\r\n"
				+ "          <div class=\"feature__details\">\r\n"
				+ "            <h3 class=\"feature__title\">Create profiles for children.</h3>\r\n"
				+ "            <h5 class=\"feature__sub__title\">\r\n"
				+ "              Send children on adventures with their favourite characters in a\r\n"
				+ "              space made just for them�free with your membership.\r\n"
				+ "            </h5>\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"feature__image__container\">\r\n"
				+ "            <img\r\n"
				+ "              src=\"https://occ-0-4023-2164.1.nflxso.net/dnm/api/v6/19OhWN2dO19C9txTON9tvTFtefw/AAAABVxdX2WnFSp49eXb1do0euaj-F8upNImjofE77XStKhf5kUHG94DPlTiGYqPeYNtiox-82NWEK0Ls3CnLe3WWClGdiJP.png?r=5cf\"\r\n"
				+ "              alt=\"Feature image\"\r\n"
				+ "              class=\"feature__image\"\r\n"
				+ "            />\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "      </section>\r\n"
				+ "      <section class=\"FAQ__list__container\">\r\n"
				+ "        <h1 class=\"FAQ__heading\">Frequently Asked Questions</h1>\r\n"
				+ "        <div class=\"FAQ__list\">\r\n"
				+ "          <div class=\"FAQ__accordian\">\r\n"
				+ "            <button class=\"FAQ__title\">\r\n"
				+ "              What is Netflix?<i class=\"fal fa-plus\"></i>\r\n"
				+ "            </button>\r\n"
				+ "            <div class=\"FAQ__visible\">\r\n"
				+ "              <p>\r\n"
				+ "                Netflix is a streaming service that offers a wide variety of\r\n"
				+ "                award-winning TV shows, movies, anime, documentaries and more �\r\n"
				+ "                on thousands of internet-connected devices.\r\n"
				+ "              </p>\r\n"
				+ "              <p>\r\n"
				+ "                You can watch as much as you want, whenever you want, without a\r\n"
				+ "                single ad � all for one low monthly price. There's always\r\n"
				+ "                something new to discover, and new TV shows and movies are added\r\n"
				+ "                every week!\r\n"
				+ "              </p>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"FAQ__accordian\">\r\n"
				+ "            <button class=\"FAQ__title\">\r\n"
				+ "              How much does netflix cost?<i class=\"fal fa-plus\"></i>\r\n"
				+ "            </button>\r\n"
				+ "            <div class=\"FAQ__visible\">\r\n"
				+ "              <p>\r\n"
				+ "                Watch Netflix on your smartphone, tablet, Smart TV, laptop, or\r\n"
				+ "                streaming device, all for one fixed monthly fee. Plans range\r\n"
				+ "                from USD3.99 to USD11.99 a month. No extra costs, no contracts.\r\n"
				+ "              </p>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"FAQ__accordian\">\r\n"
				+ "            <button class=\"FAQ__title\">\r\n"
				+ "              Where can I watch?<i class=\"fal fa-plus\"></i>\r\n"
				+ "            </button>\r\n"
				+ "            <div class=\"FAQ__visible\">\r\n"
				+ "              <p>\r\n"
				+ "                Watch anywhere, anytime, on an unlimited number of devices. Sign\r\n"
				+ "                in with your Netflix account to watch instantly on the web at\r\n"
				+ "                netflix.com from your personal computer or on any\r\n"
				+ "                internet-connected device that offers the Netflix app, including\r\n"
				+ "                smart TVs, smartphones, tablets, streaming media players and\r\n"
				+ "                game consoles.\r\n"
				+ "              </p>\r\n"
				+ "              <p>\r\n"
				+ "                You can also download your favourite shows with the iOS,\r\n"
				+ "                Android, or Windows 10 app. Use downloads to watch while you're\r\n"
				+ "                on the go and without an internet connection. Take Netflix with\r\n"
				+ "                you anywhere.\r\n"
				+ "              </p>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"FAQ__get__started__email\">\r\n"
				+ "          <h3>\r\n"
				+ "            Ready to watch? Enter your email to create or restart your\r\n"
				+ "            membership.\r\n"
				+ "          </h3>\r\n"
				+ "          <div class=\"email__form__container\">\r\n"
				+ "            <div class=\"form__container\">\r\n"
				+ "              <input type=\"email\" class=\"email__input\" placeholder=\" \" required/>\r\n"
				+ "              <label class=\"email__label\">Email Address</label>\r\n"
				+ "            </div>\r\n"
				+ "            <button class=\"primary__button\">\r\n"
				+ "              <a href=\"https://www.netflix.com/signup/registration?locale=en-LK\">Get Started</a> <i class=\"fal fa-chevron-right\"></i>\r\n"
				+ "            </button>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "      </section>\r\n"
				+ "    </main>\r\n"
				+ "\r\n"
				+ "    <footer>\r\n"
				+ "      <div class=\"footer__row__1\">\r\n"
				+ "        <h4>Questions? Contact Us</h4>\r\n"
				+ "      </div>\r\n"
				+ "      <div class=\"footer__row__2\">\r\n"
				+ "        <div class=\"column__1\">\r\n"
				+ "          <p><a href=\"https://help.netflix.com/support/412\">FAQ</a></p>\r\n"
				+ "          <p><a href=\"http://ir.netflix.com/\">Investor Relations</a></p>\r\n"
				+ "          <p><a href=\"https://help.netflix.com/legal/privacy\">Privacy</a></p>\r\n"
				+ "          <p><a href=\"https://fast.com/\">Speed Test</a></p>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"column__2\">\r\n"
				+ "          <p><a href=\"https://help.netflix.com/\">Help Center</a></p>\r\n"
				+ "          <p><a href=\"https://jobs.netflix.com/jobs\">Jobs</a></p>\r\n"
				+ "          <p><a href=\"https://www.netflix.com/lk/#\">Cookies</a></p>\r\n"
				+ "          <p><a href=\"https://help.netflix.com/legal/notices\">Legal Notices</a></p>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"column__3\">\r\n"
				+ "          <p><a href=\"https://www.netflix.com/youraccount\">Account</a></p>\r\n"
				+ "          <p><a href=\"https://www.netflix.com/watch\">Ways to Watch</a></p>\r\n"
				+ "          <p><a href=\"https://help.netflix.com/legal/corpinfo\">Corporate Information</a></p>\r\n"
				+ "          <p><a href=\"https://www.netflix.com/lk/browse/genre/839338\">Only on Netflix</a></p>\r\n"
				+ "        </div>\r\n"
				+ "         <div class=\"column__4\">\r\n"
				+ "          <p><a href=\"https://media.netflix.com/\">Media Center</a></p>\r\n"
				+ "          <p><a href=\"https://help.netflix.com/legal/termsofuse\">Terms of Use</a></p>\r\n"
				+ "          <p><a href\"https://help.netflix.com/contactus\">Contact Us</a></p>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "      <div class=\"footer__row__3\">\r\n"
				+ "        <div class=\"dropdown__container\">\r\n"
				+ "          <i class=\"fas fa-globe\"></i>\r\n"
				+ "          <select\r\n"
				+ "            name=\"languages\"\r\n"
				+ "            id=\"languagesSelect\"\r\n"
				+ "            class=\"language__drop__down\"\r\n"
				+ "          >\r\n"
				+ "            <option value=\"english\" selected>English</option>\r\n"
				+ "            <option value=\"hindi\">Hindi</option>\r\n"
				+ "          </select>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "      <div class=\"footer__row__4\">\r\n"
				+ "        <p>Created By Tadeesha Nithesh</p>\r\n"
				+ "      </div>\r\n"
				+ "    </footer>\r\n"
				+ "\r\n"
				+ "    <script src=\"style/index.js\"></script>\r\n"
				+ "  </body>\r\n"
				+ "</html>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
