package controllers

import play.api._
import play.api.mvc._
import play.api.test._
import play.api.test.Helpers._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

   def gitHub(id:String) = Action {
     
     Redirect("https://api.github.com/users/"+id)
   
     
  }
  
}