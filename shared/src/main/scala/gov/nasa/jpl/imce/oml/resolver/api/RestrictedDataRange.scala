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
 * An OML RestrictedDataRange corresponds to an [OWL2 DataRange] defined
 * in terms of some kind of restriction of some other OML DataRange.
 * The specializations of OML RestrictedDataRange correspond to
 * the allowed restrictions in the [OWL2 Datatype Maps].
 * Node that the vocabulary of XSD fundamental facets is not included in OWL2-DL, consequently,
 * there is no support in OML for specifying datatype restrictions involving XSD fundamental facets as well.
 * Each specialization maps to an OWL2 Declaration of an [OWL2 Datatype] whose
 * [OWL2 DataRange] corresponds to the OWL2 mapping of that specialized restriction.
 */
trait RestrictedDataRange
  extends DataRange
{
  override val uuid: taggedTypes.RestrictedDataRangeUUID

  /*
   * The restricted (general) data range of this data range (specific)
   */
  val restrictedRange: DataRange
}
