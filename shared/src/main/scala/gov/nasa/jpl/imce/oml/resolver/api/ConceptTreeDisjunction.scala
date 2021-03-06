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
 * An OML ConceptTreeDisjunction represents the root & non-leaf nodes of a concept taxonomy:
 * - Root node is a RootConceptTaxonomyAxiom.
 * - Non-leaf nodes are AnonymousConceptTaxonomyAxioms.
 */
trait ConceptTreeDisjunction
  extends ElementCrossReferenceTuple
{
  override val uuid: taggedTypes.ConceptTreeDisjunctionUUID

  def bundleContainer
  ()(implicit extent: Extent): scala.Option[Bundle]
  def allNestedElements
  ()(implicit extent: Extent): scala.collection.immutable.Set[_ <: LogicalElement]
}

object ConceptTreeDisjunction {

  def bundleContainer
  (c: ConceptTreeDisjunction, ext: Extent)
  : scala.Option[Bundle]
  = c.bundleContainer()(ext)

  def allNestedElements
  (c: ConceptTreeDisjunction, ext: Extent)
  : scala.collection.immutable.Set[_ <: LogicalElement]
  = c.allNestedElements()(ext)

}
