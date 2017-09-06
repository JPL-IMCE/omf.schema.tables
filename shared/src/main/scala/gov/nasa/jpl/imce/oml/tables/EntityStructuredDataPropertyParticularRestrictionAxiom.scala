/*
 * Copyright 2016 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * License Terms
 */

 
package gov.nasa.jpl.imce.oml.tables

import scala.annotation.meta.field
import scala.scalajs.js.annotation.{JSExport,JSExportTopLevel}
import scala._
import scala.Predef._

/**
  * @param uuid[1,1]
  * @param tboxUUID[1,1]
  * @param structuredDataPropertyUUID[1,1]
  * @param restrictedEntityUUID[1,1]
  */
@JSExportTopLevel("EntityStructuredDataPropertyParticularRestrictionAxiom")
case class EntityStructuredDataPropertyParticularRestrictionAxiom
(
  @(JSExport @field) uuid: UUID,
  @(JSExport @field) tboxUUID: UUID,
  @(JSExport @field) structuredDataPropertyUUID: UUID,
  @(JSExport @field) restrictedEntityUUID: UUID
) {
  // Ctor(uuidWithContainer)   
  def this(
    oug: gov.nasa.jpl.imce.oml.uuid.OMLUUIDGenerator,
    tboxUUID: UUID,
    structuredDataPropertyUUID: UUID,
    restrictedEntityUUID: UUID)
  = this(
      oug.namespaceUUID(
        "EntityStructuredDataPropertyParticularRestrictionAxiom",
        "tbox" -> tboxUUID,
        "structuredDataProperty" -> structuredDataPropertyUUID,
        "restrictedEntity" -> restrictedEntityUUID).toString,
      tboxUUID,
      structuredDataPropertyUUID,
      restrictedEntityUUID)

  override val hashCode
  : scala.Int 
  = (uuid, tboxUUID, structuredDataPropertyUUID, restrictedEntityUUID).##
  
  override def equals(other: scala.Any): scala.Boolean = other match {
  	case that: EntityStructuredDataPropertyParticularRestrictionAxiom =>
  	  (this.uuid == that.uuid) &&
  	  (this.tboxUUID == that.tboxUUID) &&
  	  (this.structuredDataPropertyUUID == that.structuredDataPropertyUUID) &&
  	  (this.restrictedEntityUUID == that.restrictedEntityUUID)
    case _ =>
      false
  }
  
}

@JSExportTopLevel("EntityStructuredDataPropertyParticularRestrictionAxiomHelper")
object EntityStructuredDataPropertyParticularRestrictionAxiomHelper {

  val TABLE_JSON_FILENAME 
  : scala.Predef.String 
  = "EntityStructuredDataPropertyParticularRestrictionAxioms.json"
  
  implicit val w
  : upickle.default.Writer[EntityStructuredDataPropertyParticularRestrictionAxiom]
  = upickle.default.macroW[EntityStructuredDataPropertyParticularRestrictionAxiom]

  @JSExport
  def toJSON(c: EntityStructuredDataPropertyParticularRestrictionAxiom)
  : String
  = upickle.default.write(expr=c, indent=0)

  implicit val r
  : upickle.default.Reader[EntityStructuredDataPropertyParticularRestrictionAxiom]
  = upickle.default.macroR[EntityStructuredDataPropertyParticularRestrictionAxiom]

  @JSExport
  def fromJSON(c: String)
  : EntityStructuredDataPropertyParticularRestrictionAxiom
  = upickle.default.read[EntityStructuredDataPropertyParticularRestrictionAxiom](c)

}	
