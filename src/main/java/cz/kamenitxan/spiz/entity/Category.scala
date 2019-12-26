package cz.kamenitxan.spiz.entity

import cz.kamenitxan.jakon.core.model.JakonObject
import cz.kamenitxan.jakon.validation.validators.NotEmpty
import cz.kamenitxan.jakon.webui.ObjectSettings
import cz.kamenitxan.jakon.webui.entity.JakonField

/**
  * Created by TPa on 2019-08-24.
  */
class Category extends JakonObject(classOf[Category].getName) {

	@NotEmpty
	@JakonField(searched = true)
	var name: String = _

	override val objectSettings: ObjectSettings = null

	override def toString(): String = s"$id: $name"
}
