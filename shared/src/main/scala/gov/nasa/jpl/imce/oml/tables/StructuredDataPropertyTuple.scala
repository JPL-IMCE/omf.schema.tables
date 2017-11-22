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
import scala.Predef.ArrowAssoc

/**
  * @param uuid[1,1]
  * @param structuredDataPropertyUUID[1,1]
  * @param structuredDataPropertyContextUUID[1,1]
  */
@JSExportTopLevel("StructuredDataPropertyTuple")
case class StructuredDataPropertyTuple
(
  @(JSExport @field) uuid: taggedTypes.StructuredDataPropertyTupleUUID,
  @(JSExport @field) structuredDataPropertyUUID: taggedTypes.DataRelationshipToStructureUUID,
  @(JSExport @field) structuredDataPropertyContextUUID: taggedTypes.SingletonInstanceStructuredDataPropertyContextUUID
) {
  // Ctor(uuidWithContainer)   
  def this(
    oug: gov.nasa.jpl.imce.oml.uuid.OMLUUIDGenerator,
    structuredDataPropertyUUID: taggedTypes.DataRelationshipToStructureUUID,
    structuredDataPropertyContextUUID: taggedTypes.SingletonInstanceStructuredDataPropertyContextUUID)
  = this(
      taggedTypes.structuredDataPropertyTupleUUID(oug.namespaceUUID(
        "StructuredDataPropertyTuple",
        "structuredDataProperty" -> structuredDataPropertyUUID,
        "structuredDataPropertyContext" -> structuredDataPropertyContextUUID).toString),
      structuredDataPropertyUUID,
      structuredDataPropertyContextUUID)

val vertexId: scala.Long = uuid.hashCode.toLong

  override val hashCode
  : scala.Int 
  = (uuid, structuredDataPropertyUUID, structuredDataPropertyContextUUID).##
  
  override def equals(other: scala.Any): scala.Boolean = other match {
  	case that: StructuredDataPropertyTuple =>
  	  (this.uuid == that.uuid) &&
  	  (this.structuredDataPropertyUUID == that.structuredDataPropertyUUID)  &&
  	  (this.structuredDataPropertyContextUUID == that.structuredDataPropertyContextUUID) 
    case _ =>
      false
  }
  
}

@JSExportTopLevel("StructuredDataPropertyTupleHelper")
object StructuredDataPropertyTupleHelper {

  import io.circe.{Decoder, Encoder, HCursor, Json}
  import io.circe.parser.parse
  import scala.Predef.String

  val TABLE_JSON_FILENAME 
  : String 
  = "StructuredDataPropertyTuples.json"

  implicit val decodeStructuredDataPropertyTuple: Decoder[StructuredDataPropertyTuple]
  = Decoder.instance[StructuredDataPropertyTuple] { c: HCursor =>
    
    import cats.syntax.either._
  
    for {
    	  uuid <- c.downField("uuid").as[taggedTypes.StructuredDataPropertyTupleUUID]
    	  structuredDataPropertyUUID <- c.downField("structuredDataPropertyUUID").as[taggedTypes.DataRelationshipToStructureUUID]
    	  structuredDataPropertyContextUUID <- c.downField("structuredDataPropertyContextUUID").as[taggedTypes.SingletonInstanceStructuredDataPropertyContextUUID]
    	} yield StructuredDataPropertyTuple(
    	  uuid,
    	  structuredDataPropertyUUID,
    	  structuredDataPropertyContextUUID
    	)
  }
  
  implicit val encodeStructuredDataPropertyTuple: Encoder[StructuredDataPropertyTuple]
  = new Encoder[StructuredDataPropertyTuple] {
    override final def apply(x: StructuredDataPropertyTuple): Json 
    = Json.obj(
    	  ("uuid", taggedTypes.encodeStructuredDataPropertyTupleUUID(x.uuid)),
    	  ("structuredDataPropertyUUID", taggedTypes.encodeDataRelationshipToStructureUUID(x.structuredDataPropertyUUID)),
    	  ("structuredDataPropertyContextUUID", taggedTypes.encodeSingletonInstanceStructuredDataPropertyContextUUID(x.structuredDataPropertyContextUUID))
    )
  }

  @JSExport
  def toJSON(c: StructuredDataPropertyTuple)
  : String
  = encodeStructuredDataPropertyTuple(c).noSpaces

  @JSExport
  def fromJSON(c: String)
  : StructuredDataPropertyTuple
  = parse(c) match {
  	case scala.Right(json) =>
  	  decodeStructuredDataPropertyTuple(json.hcursor) match {
  	    	case scala.Right(result) =>
  	    	  result
  	    	case scala.Left(failure) =>
  	    	  throw failure
  	  }
    case scala.Left(failure) =>
  	  throw failure
  }

}
