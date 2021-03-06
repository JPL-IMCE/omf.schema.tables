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

package gov.nasa.jpl.imce.oml.resolver.api

/*
 * An OML DescriptionBoxRefinement is an OML DescriptionBoxRelationship
 * from an OML DescriptionBox to another OML DescriptionBox where
 * the former refines the descriptions of the latter.
 */
trait DescriptionBoxRefinement
  extends DescriptionBoxRelationship
{
  override val uuid: taggedTypes.DescriptionBoxRefinementUUID

  val refinedDescriptionBox: gov.nasa.jpl.imce.oml.tables.taggedTypes.IRI

  def descriptionDomain
  ()(implicit extent: Extent): scala.Option[DescriptionBox]
  def targetModule
  ()(implicit extent: Extent): gov.nasa.jpl.imce.oml.tables.taggedTypes.IRI
}

object DescriptionBoxRefinement {

  def descriptionDomain
  (d: DescriptionBoxRefinement, ext: Extent)
  : scala.Option[DescriptionBox]
  = d.descriptionDomain()(ext)

  def targetModule
  (d: DescriptionBoxRefinement, ext: Extent)
  : gov.nasa.jpl.imce.oml.tables.taggedTypes.IRI
  = d.targetModule()(ext)

}
