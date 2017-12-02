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
 * An OML Resource is an abstraction for
 * a kind of an OML Element that has intrinsic identity
 * based on a single identity criteria: an IRI.
 * An OML Resource has a name; the relationship between
 * the name and IRI depends on the kind of OML Resource.
 */
trait Resource
  extends Element
  with IntrinsicIdentityKind
{
  override val uuid: taggedTypes.ResourceUUID

  def name
  (): gov.nasa.jpl.imce.oml.tables.taggedTypes.LocalName
  def abbrevIRI
  ()(implicit extent: Extent): scala.Option[scala.Predef.String]
}

object Resource {

  def abbrevIRI
  (r: Resource, ext: Extent)
  : scala.Option[scala.Predef.String]
  = r.abbrevIRI()(ext)

}
