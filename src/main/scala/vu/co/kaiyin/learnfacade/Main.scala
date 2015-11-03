package vu.co.kaiyin.learnfacade

import org.scalajs.dom
import dom.document

import scala.scalajs.js.annotation.JSExport

/**
  * Created by kaiyin on 03/11/2015.
  */
@JSExport
object Main {
  @JSExport
  def main: Unit = {
    var mydiv = document.getElementById("#mydiv")
    mydiv.innerHTML = "<b></b>" + myfunctions.myadd(1, 2)
  }
}
