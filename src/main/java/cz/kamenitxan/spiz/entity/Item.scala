package cz.kamenitxan.spiz.entity

import java.time.LocalDate
import java.util.Date

import cz.kamenitxan.jakon.core.model.JakonObject
import cz.kamenitxan.jakon.validation.validators.{Future, NotEmpty}
import cz.kamenitxan.jakon.webui.ObjectSettings
import cz.kamenitxan.jakon.webui.entity.JakonField
import javax.persistence.ManyToOne

/**
  * Created by TPa on 2019-08-24.
  */
class Item extends JakonObject(classOf[Item].getName) {

	@NotEmpty
	@JakonField(searched = true)
	var name: String = _
	@Future
	@JakonField(searched = true, required = false)
	var bestBefore: Date = _
	@JakonField(searched = true, required = false)
	var manufactured: Date = _
	@JakonField(required = false)
	var amount: String = _
	@NotEmpty
	@JakonField(searched = true)
	var kind: Kind = _
	@ManyToOne
	@NotEmpty
	@JakonField(searched = true)
	var category: Category = _


	override val objectSettings: ObjectSettings = null
}
