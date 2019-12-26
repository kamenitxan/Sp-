package cz.kamenitxan.spiz

import cz.kamenitxan.jakon.JakonInit
import cz.kamenitxan.jakon.core.database.DBHelper
import cz.kamenitxan.spiz.entity.{Category, Item}

/**
  * Created by TPa on 2019-08-24.
  */
class AppInit extends JakonInit {
	override def daoSetup(): Unit = {
		DBHelper.addDao(classOf[Category])
		DBHelper.addDao(classOf[Item])

	}


}