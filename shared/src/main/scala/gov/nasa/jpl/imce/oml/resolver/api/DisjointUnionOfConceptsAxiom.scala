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
 * An OML DisjointUnionOfConceptsAxiom(s) specifies the logical union of non-leaf & leaf nodes in a concept taxonomy tree:
 * - Each non-leaf node is an OML AnonymousConceptUnionAxiom.
 * - Each leaf nodes is an OML SpecificDisjointConceptAxiom.
 */
trait DisjointUnionOfConceptsAxiom
  extends ElementCrossReferenceTuple
{
  override val uuid: taggedTypes.DisjointUnionOfConceptsAxiomUUID

  def conceptTreeDisjunctionParent
  ()(implicit extent: Extent): scala.Option[ConceptTreeDisjunction]
  def moduleContext
  ()(implicit extent: Extent): scala.Option[Module]
  def allNestedElements
  ()(implicit extent: Extent): scala.collection.immutable.Set[_ <: LogicalElement]
}

object DisjointUnionOfConceptsAxiom {

  def conceptTreeDisjunctionParent
  (d: DisjointUnionOfConceptsAxiom, ext: Extent)
  : scala.Option[ConceptTreeDisjunction]
  = d.conceptTreeDisjunctionParent()(ext)

  def moduleContext
  (d: DisjointUnionOfConceptsAxiom, ext: Extent)
  : scala.Option[Module]
  = d.moduleContext()(ext)

  def allNestedElements
  (d: DisjointUnionOfConceptsAxiom, ext: Extent)
  : scala.collection.immutable.Set[_ <: LogicalElement]
  = d.allNestedElements()(ext)

}
