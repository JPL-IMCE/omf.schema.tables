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
 
package gov.nasa.jpl.imce.omf.schema.tables

import scala.annotation.meta.field
import scala.scalajs.js.annotation.JSExport
import scala._
import scala.Predef._

/**
  * @param graphUUID[1,1]
  * @param uuid[1,1]
  * @param bundleUUID[1,1]
  * @param bundledTerminologyGraphUUID[1,1]
  */
@JSExport
case class BundledTerminologyGraphAxiom
(
 @(JSExport @field) graphUUID: UUID,
 @(JSExport @field) uuid: UUID,
 @(JSExport @field) bundleUUID: UUID,
 @(JSExport @field) bundledTerminologyGraphUUID: UUID
)

@JSExport
object BundledTerminologyGraphAxiomHelper {

  implicit val w
  : upickle.default.Writer[BundledTerminologyGraphAxiom]
  = upickle.default.macroW[BundledTerminologyGraphAxiom]

  @JSExport
  def toJSON(c: BundledTerminologyGraphAxiom)
  : String
  = upickle.default.write(expr=c, indent=0)

  implicit val r
  : upickle.default.Reader[BundledTerminologyGraphAxiom]
  = upickle.default.macroR[BundledTerminologyGraphAxiom]

  @JSExport
  def fromJSON(c: String)
  : BundledTerminologyGraphAxiom
  = upickle.default.read[BundledTerminologyGraphAxiom](c)

}	