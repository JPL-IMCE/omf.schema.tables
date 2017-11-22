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

import gov.nasa.jpl.imce.oml.taggedTypes.{decodeTag,encodeTag}
import gov.nasa.jpl.imce.oml.covariantTag
import gov.nasa.jpl.imce.oml.covariantTag.@@
import io.circe.{Decoder,Encoder}
import scala.Predef.String

object taggedTypes {

  trait AbbrevIRITag
  type AbbrevIRI = String @@ AbbrevIRITag
  def abbrevIRI(s: String) = covariantTag[AbbrevIRITag](s)
  
  implicit val decodeAbbrevIRI: Decoder[AbbrevIRI] = decodeTag[AbbrevIRITag]
  implicit val encodeAbbrevIRI: Encoder[AbbrevIRI] = encodeTag[AbbrevIRITag]
  
  trait AbstractDecimalDataTypeTag
  type AbstractDecimalDataType = String @@ AbstractDecimalDataTypeTag
  def abstractDecimalDataType(s: String) = covariantTag[AbstractDecimalDataTypeTag](s)
  
  implicit val decodeAbstractDecimalDataType: Decoder[AbstractDecimalDataType] = decodeTag[AbstractDecimalDataTypeTag]
  implicit val encodeAbstractDecimalDataType: Encoder[AbstractDecimalDataType] = encodeTag[AbstractDecimalDataTypeTag]
  
  trait DateTimeDataTypeTag
  type DateTimeDataType = String @@ DateTimeDataTypeTag
  def dateTimeDataType(s: String) = covariantTag[DateTimeDataTypeTag](s)
  
  implicit val decodeDateTimeDataType: Decoder[DateTimeDataType] = decodeTag[DateTimeDataTypeTag]
  implicit val encodeDateTimeDataType: Encoder[DateTimeDataType] = encodeTag[DateTimeDataTypeTag]
  
  trait DecimalDataTypeTag
  type DecimalDataType = String @@ DecimalDataTypeTag
  def decimalDataType(s: String) = covariantTag[DecimalDataTypeTag](s)
  
  implicit val decodeDecimalDataType: Decoder[DecimalDataType] = decodeTag[DecimalDataTypeTag]
  implicit val encodeDecimalDataType: Encoder[DecimalDataType] = encodeTag[DecimalDataTypeTag]
  
  trait FloatDataTypeTag
  type FloatDataType = String @@ FloatDataTypeTag
  def floatDataType(s: String) = covariantTag[FloatDataTypeTag](s)
  
  implicit val decodeFloatDataType: Decoder[FloatDataType] = decodeTag[FloatDataTypeTag]
  implicit val encodeFloatDataType: Encoder[FloatDataType] = encodeTag[FloatDataTypeTag]
  
  trait IRITag
  type IRI = String @@ IRITag
  def iri(s: String) = covariantTag[IRITag](s)
  
  implicit val decodeIRI: Decoder[IRI] = decodeTag[IRITag]
  implicit val encodeIRI: Encoder[IRI] = encodeTag[IRITag]
  
  trait LanguageTagDataTypeTag
  type LanguageTagDataType = String @@ LanguageTagDataTypeTag
  def languageTagDataType(s: String) = covariantTag[LanguageTagDataTypeTag](s)
  
  implicit val decodeLanguageTagDataType: Decoder[LanguageTagDataType] = decodeTag[LanguageTagDataTypeTag]
  implicit val encodeLanguageTagDataType: Encoder[LanguageTagDataType] = encodeTag[LanguageTagDataTypeTag]
  
  trait LiteralPatternTag
  type LiteralPattern = String @@ LiteralPatternTag
  def literalPattern(s: String) = covariantTag[LiteralPatternTag](s)
  
  implicit val decodeLiteralPattern: Decoder[LiteralPattern] = decodeTag[LiteralPatternTag]
  implicit val encodeLiteralPattern: Encoder[LiteralPattern] = encodeTag[LiteralPatternTag]
  
  trait LocalNameTag
  type LocalName = String @@ LocalNameTag
  def localName(s: String) = covariantTag[LocalNameTag](s)
  
  implicit val decodeLocalName: Decoder[LocalName] = decodeTag[LocalNameTag]
  implicit val encodeLocalName: Encoder[LocalName] = encodeTag[LocalNameTag]
  
  trait NamespacePrefixTag
  type NamespacePrefix = String @@ NamespacePrefixTag
  def namespacePrefix(s: String) = covariantTag[NamespacePrefixTag](s)
  
  implicit val decodeNamespacePrefix: Decoder[NamespacePrefix] = decodeTag[NamespacePrefixTag]
  implicit val encodeNamespacePrefix: Encoder[NamespacePrefix] = encodeTag[NamespacePrefixTag]
  
  trait PositiveIntegerLiteralTag
  type PositiveIntegerLiteral = String @@ PositiveIntegerLiteralTag
  def positiveIntegerLiteral(s: String) = covariantTag[PositiveIntegerLiteralTag](s)
  
  implicit val decodePositiveIntegerLiteral: Decoder[PositiveIntegerLiteral] = decodeTag[PositiveIntegerLiteralTag]
  implicit val encodePositiveIntegerLiteral: Encoder[PositiveIntegerLiteral] = encodeTag[PositiveIntegerLiteralTag]
  
  trait QuotedStringDataTypeTag
  type QuotedStringDataType = String @@ QuotedStringDataTypeTag
  def quotedStringDataType(s: String) = covariantTag[QuotedStringDataTypeTag](s)
  
  implicit val decodeQuotedStringDataType: Decoder[QuotedStringDataType] = decodeTag[QuotedStringDataTypeTag]
  implicit val encodeQuotedStringDataType: Encoder[QuotedStringDataType] = encodeTag[QuotedStringDataTypeTag]
  
  trait RationalDataTypeTag
  type RationalDataType = String @@ RationalDataTypeTag
  def rationalDataType(s: String) = covariantTag[RationalDataTypeTag](s)
  
  implicit val decodeRationalDataType: Decoder[RationalDataType] = decodeTag[RationalDataTypeTag]
  implicit val encodeRationalDataType: Encoder[RationalDataType] = encodeTag[RationalDataTypeTag]
  
  trait RawStringDataTypeTag
  type RawStringDataType = String @@ RawStringDataTypeTag
  def rawStringDataType(s: String) = covariantTag[RawStringDataTypeTag](s)
  
  implicit val decodeRawStringDataType: Decoder[RawStringDataType] = decodeTag[RawStringDataTypeTag]
  implicit val encodeRawStringDataType: Encoder[RawStringDataType] = encodeTag[RawStringDataTypeTag]
  
  trait RealDataTypeTag
  type RealDataType = String @@ RealDataTypeTag
  def realDataType(s: String) = covariantTag[RealDataTypeTag](s)
  
  implicit val decodeRealDataType: Decoder[RealDataType] = decodeTag[RealDataTypeTag]
  implicit val encodeRealDataType: Encoder[RealDataType] = encodeTag[RealDataTypeTag]
  
  trait StringDataTypeTag
  type StringDataType = String @@ StringDataTypeTag
  def stringDataType(s: String) = covariantTag[StringDataTypeTag](s)
  
  implicit val decodeStringDataType: Decoder[StringDataType] = decodeTag[StringDataTypeTag]
  implicit val encodeStringDataType: Encoder[StringDataType] = encodeTag[StringDataTypeTag]
  
  trait URIDataTypeTag
  type URIDataType = String @@ URIDataTypeTag
  def uRIDataType(s: String) = covariantTag[URIDataTypeTag](s)
  
  implicit val decodeURIDataType: Decoder[URIDataType] = decodeTag[URIDataTypeTag]
  implicit val encodeURIDataType: Encoder[URIDataType] = encodeTag[URIDataTypeTag]
  
  trait UUIDDataTypeTag
  type UUIDDataType = String @@ UUIDDataTypeTag
  def uUIDDataType(s: String) = covariantTag[UUIDDataTypeTag](s)
  
  implicit val decodeUUIDDataType: Decoder[UUIDDataType] = decodeTag[UUIDDataTypeTag]
  implicit val encodeUUIDDataType: Encoder[UUIDDataType] = encodeTag[UUIDDataTypeTag]
  
  
  trait AnnotationPropertyTag
  trait AnnotationPropertyValueTag
  trait AnonymousConceptUnionAxiomTag <: ConceptTreeDisjunctionTag with DisjointUnionOfConceptsAxiomTag
  trait AspectTag <: EntityTag with UnaryTermKindTag
  trait AspectPredicateTag <: UnarySegmentPredicateTag
  trait AspectSpecializationAxiomTag <: SpecializationAxiomTag
  trait BinaryScalarRestrictionTag <: RestrictedDataRangeTag
  trait BinarySegmentForwardPropertyPredicateTag <: BinarySegmentPropertyPredicateTag
  trait BinarySegmentPropertyPredicateTag <: SegmentPredicateTag
  trait BinarySegmentReversePropertyPredicateTag <: BinarySegmentPropertyPredicateTag
  trait BundleTag <: TerminologyBoxTag
  trait BundledTerminologyAxiomTag <: TerminologyBundleAxiomTag
  trait ChainRuleTag <: RuleTag
  trait ConceptTag <: ConceptualEntityTag with UnaryTermKindTag
  trait ConceptDesignationTerminologyAxiomTag <: TerminologyBoxAxiomTag
  trait ConceptInstanceTag <: ConceptualEntitySingletonInstanceTag
  trait ConceptPredicateTag <: UnarySegmentPredicateTag
  trait ConceptSpecializationAxiomTag <: SpecializationAxiomTag
  trait ConceptTreeDisjunctionTag <: ElementTag
  trait ConceptualEntityTag <: EntityTag
  trait ConceptualEntitySingletonInstanceTag <: ResourceTag with TerminologyInstanceAssertionTag
  trait DataRangeTag <: DatatypeTag
  trait DataRelationshipTag <: DirectedBinaryRelationshipKindTag with TermTag
  trait DataRelationshipDomainTag <: DataRelationshipTag
  trait DataRelationshipFromEntityTag <: DataRelationshipDomainTag
  trait DataRelationshipFromStructureTag <: DataRelationshipDomainTag
  trait DataRelationshipRangeTag <: DataRelationshipTag
  trait DataRelationshipToScalarTag <: DataRelationshipRangeTag
  trait DataRelationshipToStructureTag <: DataRelationshipRangeTag
  trait DatatypeTag <: TermTag
  trait DescriptionBoxTag <: ModuleTag
  trait DescriptionBoxExtendsClosedWorldDefinitionsTag <: DescriptionBoxRelationshipTag
  trait DescriptionBoxRefinementTag <: DescriptionBoxRelationshipTag
  trait DescriptionBoxRelationshipTag <: ModuleEdgeTag
  trait DirectedBinaryRelationshipKindTag <: TermTag
  trait DisjointUnionOfConceptsAxiomTag <: ElementTag
  trait ElementTag
  trait EntityTag <: TermTag
  trait EntityExistentialRestrictionAxiomTag <: EntityRestrictionAxiomTag
  trait EntityRelationshipTag <: DirectedBinaryRelationshipKindTag with TermTag
  trait EntityRestrictionAxiomTag <: TermAxiomTag
  trait EntityScalarDataPropertyTag <: DataRelationshipTag with DataRelationshipFromEntityTag with DataRelationshipToScalarTag
  trait EntityScalarDataPropertyExistentialRestrictionAxiomTag <: EntityScalarDataPropertyRestrictionAxiomTag
  trait EntityScalarDataPropertyParticularRestrictionAxiomTag <: EntityScalarDataPropertyRestrictionAxiomTag
  trait EntityScalarDataPropertyRestrictionAxiomTag <: TermAxiomTag
  trait EntityScalarDataPropertyUniversalRestrictionAxiomTag <: EntityScalarDataPropertyRestrictionAxiomTag
  trait EntityStructuredDataPropertyTag <: DataRelationshipTag with DataRelationshipFromEntityTag with DataRelationshipToStructureTag
  trait EntityStructuredDataPropertyParticularRestrictionAxiomTag <: EntityStructuredDataPropertyRestrictionAxiomTag with RestrictionStructuredDataPropertyContextTag
  trait EntityStructuredDataPropertyRestrictionAxiomTag <: TermAxiomTag
  trait EntityUniversalRestrictionAxiomTag <: EntityRestrictionAxiomTag
  trait ExtentTag
  trait IRIScalarRestrictionTag <: RestrictedDataRangeTag
  trait LiteralBooleanTag <: LiteralValueTag
  trait LiteralDateTimeTag <: LiteralValueTag
  trait LiteralDecimalTag <: LiteralNumberTag
  trait LiteralFloatTag <: LiteralNumberTag
  trait LiteralNumberTag <: LiteralValueTag
  trait LiteralQuotedStringTag <: LiteralStringTag
  trait LiteralRationalTag <: LiteralNumberTag
  trait LiteralRawStringTag <: LiteralStringTag
  trait LiteralRealTag <: LiteralNumberTag
  trait LiteralStringTag <: LiteralValueTag
  trait LiteralURITag <: LiteralValueTag
  trait LiteralUUIDTag <: LiteralValueTag
  trait LiteralValueTag
  trait ModuleTag <: ResourceTag
  trait ModuleEdgeTag <: ElementTag
  trait ModuleElementTag <: ElementTag
  trait NumericScalarRestrictionTag <: RestrictedDataRangeTag
  trait PlainLiteralScalarRestrictionTag <: RestrictedDataRangeTag
  trait ReifiedRelationshipTag <: ConceptualEntityTag with EntityRelationshipTag
  trait ReifiedRelationshipInstanceTag <: ConceptualEntitySingletonInstanceTag
  trait ReifiedRelationshipInstanceDomainTag <: TerminologyInstanceAssertionTag
  trait ReifiedRelationshipInstanceRangeTag <: TerminologyInstanceAssertionTag
  trait ReifiedRelationshipInversePropertyPredicateTag <: BinarySegmentReversePropertyPredicateTag
  trait ReifiedRelationshipPredicateTag <: UnarySegmentPredicateTag
  trait ReifiedRelationshipPropertyPredicateTag <: BinarySegmentForwardPropertyPredicateTag
  trait ReifiedRelationshipSourceInversePropertyPredicateTag <: BinarySegmentReversePropertyPredicateTag
  trait ReifiedRelationshipSourcePropertyPredicateTag <: BinarySegmentForwardPropertyPredicateTag
  trait ReifiedRelationshipSpecializationAxiomTag <: SpecializationAxiomTag
  trait ReifiedRelationshipTargetInversePropertyPredicateTag <: BinarySegmentReversePropertyPredicateTag
  trait ReifiedRelationshipTargetPropertyPredicateTag <: BinarySegmentForwardPropertyPredicateTag
  trait ResourceTag <: ElementTag
  trait RestrictedDataRangeTag <: DataRangeTag
  trait RestrictionScalarDataPropertyValueTag <: ElementTag
  trait RestrictionStructuredDataPropertyContextTag <: ModuleElementTag
  trait RestrictionStructuredDataPropertyTupleTag <: RestrictionStructuredDataPropertyContextTag
  trait RootConceptTaxonomyAxiomTag <: ConceptTreeDisjunctionTag with TerminologyBundleStatementTag
  trait RuleTag <: TermTag
  trait RuleBodySegmentTag <: ElementTag
  trait ScalarTag <: DataRangeTag with UnaryTermKindTag
  trait ScalarDataPropertyTag <: DataRelationshipTag with DataRelationshipFromStructureTag with DataRelationshipToScalarTag
  trait ScalarDataPropertyValueTag <: ElementTag
  trait ScalarOneOfLiteralAxiomTag <: TermAxiomTag
  trait ScalarOneOfRestrictionTag <: RestrictedDataRangeTag
  trait SegmentPredicateTag <: ElementTag
  trait SingletonInstanceScalarDataPropertyValueTag <: ModuleElementTag
  trait SingletonInstanceStructuredDataPropertyContextTag <: ElementTag
  trait SingletonInstanceStructuredDataPropertyValueTag <: ModuleElementTag with SingletonInstanceStructuredDataPropertyContextTag
  trait SpecializationAxiomTag <: TermAxiomTag
  trait SpecificDisjointConceptAxiomTag <: DisjointUnionOfConceptsAxiomTag
  trait StringScalarRestrictionTag <: RestrictedDataRangeTag
  trait StructureTag <: DatatypeTag with UnaryTermKindTag
  trait StructuredDataPropertyTag <: DataRelationshipTag with DataRelationshipFromStructureTag with DataRelationshipToStructureTag
  trait StructuredDataPropertyTupleTag <: SingletonInstanceStructuredDataPropertyContextTag
  trait SynonymScalarRestrictionTag <: RestrictedDataRangeTag
  trait TermTag <: ResourceTag with TerminologyBoxStatementTag
  trait TermAxiomTag <: TerminologyBoxStatementTag
  trait TerminologyAxiomTag <: ModuleEdgeTag
  trait TerminologyBoxTag <: ModuleTag
  trait TerminologyBoxAxiomTag <: TerminologyAxiomTag
  trait TerminologyBoxStatementTag <: ModuleElementTag
  trait TerminologyBundleAxiomTag <: TerminologyAxiomTag
  trait TerminologyBundleStatementTag <: ModuleElementTag
  trait TerminologyExtensionAxiomTag <: TerminologyBoxAxiomTag
  trait TerminologyGraphTag <: TerminologyBoxTag
  trait TerminologyInstanceAssertionTag <: ModuleElementTag
  trait TerminologyNestingAxiomTag <: TerminologyBoxAxiomTag
  trait TimeScalarRestrictionTag <: RestrictedDataRangeTag
  trait UnarySegmentPredicateTag <: SegmentPredicateTag
  trait UnaryTermKindTag <: TermTag
  trait UnreifiedRelationshipTag <: EntityRelationshipTag
  trait UnreifiedRelationshipInstanceTupleTag <: TerminologyInstanceAssertionTag
  trait UnreifiedRelationshipInversePropertyPredicateTag <: BinarySegmentReversePropertyPredicateTag
  trait UnreifiedRelationshipPropertyPredicateTag <: BinarySegmentForwardPropertyPredicateTag
  
  type AnnotationPropertyUUID 
  = String @@ AnnotationPropertyTag
  
  def annotationPropertyUUID(uuid: String)
  : AnnotationPropertyUUID
  = covariantTag[AnnotationPropertyTag][String](uuid)
  
  implicit val decodeAnnotationPropertyUUID
  : Decoder[AnnotationPropertyUUID]
  = decodeTag[AnnotationPropertyTag]
  
  implicit val encodeAnnotationPropertyUUID
  : Encoder[AnnotationPropertyUUID]
  = encodeTag[AnnotationPropertyTag]
  
  type AnnotationPropertyValueUUID 
  = String @@ AnnotationPropertyValueTag
  
  def annotationPropertyValueUUID(uuid: String)
  : AnnotationPropertyValueUUID
  = covariantTag[AnnotationPropertyValueTag][String](uuid)
  
  implicit val decodeAnnotationPropertyValueUUID
  : Decoder[AnnotationPropertyValueUUID]
  = decodeTag[AnnotationPropertyValueTag]
  
  implicit val encodeAnnotationPropertyValueUUID
  : Encoder[AnnotationPropertyValueUUID]
  = encodeTag[AnnotationPropertyValueTag]
  
  type AnonymousConceptUnionAxiomUUID 
  = String @@ AnonymousConceptUnionAxiomTag
  
  def anonymousConceptUnionAxiomUUID(uuid: String)
  : AnonymousConceptUnionAxiomUUID
  = covariantTag[AnonymousConceptUnionAxiomTag][String](uuid)
  
  implicit val decodeAnonymousConceptUnionAxiomUUID
  : Decoder[AnonymousConceptUnionAxiomUUID]
  = decodeTag[AnonymousConceptUnionAxiomTag]
  
  implicit val encodeAnonymousConceptUnionAxiomUUID
  : Encoder[AnonymousConceptUnionAxiomUUID]
  = encodeTag[AnonymousConceptUnionAxiomTag]
  
  type AspectUUID 
  = String @@ AspectTag
  
  def aspectUUID(uuid: String)
  : AspectUUID
  = covariantTag[AspectTag][String](uuid)
  
  implicit val decodeAspectUUID
  : Decoder[AspectUUID]
  = decodeTag[AspectTag]
  
  implicit val encodeAspectUUID
  : Encoder[AspectUUID]
  = encodeTag[AspectTag]
  
  type AspectPredicateUUID 
  = String @@ AspectPredicateTag
  
  def aspectPredicateUUID(uuid: String)
  : AspectPredicateUUID
  = covariantTag[AspectPredicateTag][String](uuid)
  
  implicit val decodeAspectPredicateUUID
  : Decoder[AspectPredicateUUID]
  = decodeTag[AspectPredicateTag]
  
  implicit val encodeAspectPredicateUUID
  : Encoder[AspectPredicateUUID]
  = encodeTag[AspectPredicateTag]
  
  type AspectSpecializationAxiomUUID 
  = String @@ AspectSpecializationAxiomTag
  
  def aspectSpecializationAxiomUUID(uuid: String)
  : AspectSpecializationAxiomUUID
  = covariantTag[AspectSpecializationAxiomTag][String](uuid)
  
  implicit val decodeAspectSpecializationAxiomUUID
  : Decoder[AspectSpecializationAxiomUUID]
  = decodeTag[AspectSpecializationAxiomTag]
  
  implicit val encodeAspectSpecializationAxiomUUID
  : Encoder[AspectSpecializationAxiomUUID]
  = encodeTag[AspectSpecializationAxiomTag]
  
  type BinaryScalarRestrictionUUID 
  = String @@ BinaryScalarRestrictionTag
  
  def binaryScalarRestrictionUUID(uuid: String)
  : BinaryScalarRestrictionUUID
  = covariantTag[BinaryScalarRestrictionTag][String](uuid)
  
  implicit val decodeBinaryScalarRestrictionUUID
  : Decoder[BinaryScalarRestrictionUUID]
  = decodeTag[BinaryScalarRestrictionTag]
  
  implicit val encodeBinaryScalarRestrictionUUID
  : Encoder[BinaryScalarRestrictionUUID]
  = encodeTag[BinaryScalarRestrictionTag]
  
  type BinarySegmentForwardPropertyPredicateUUID 
  = String @@ BinarySegmentForwardPropertyPredicateTag
  
  def binarySegmentForwardPropertyPredicateUUID(uuid: String)
  : BinarySegmentForwardPropertyPredicateUUID
  = covariantTag[BinarySegmentForwardPropertyPredicateTag][String](uuid)
  
  implicit val decodeBinarySegmentForwardPropertyPredicateUUID
  : Decoder[BinarySegmentForwardPropertyPredicateUUID]
  = decodeTag[BinarySegmentForwardPropertyPredicateTag]
  
  implicit val encodeBinarySegmentForwardPropertyPredicateUUID
  : Encoder[BinarySegmentForwardPropertyPredicateUUID]
  = encodeTag[BinarySegmentForwardPropertyPredicateTag]
  
  type BinarySegmentPropertyPredicateUUID 
  = String @@ BinarySegmentPropertyPredicateTag
  
  def binarySegmentPropertyPredicateUUID(uuid: String)
  : BinarySegmentPropertyPredicateUUID
  = covariantTag[BinarySegmentPropertyPredicateTag][String](uuid)
  
  implicit val decodeBinarySegmentPropertyPredicateUUID
  : Decoder[BinarySegmentPropertyPredicateUUID]
  = decodeTag[BinarySegmentPropertyPredicateTag]
  
  implicit val encodeBinarySegmentPropertyPredicateUUID
  : Encoder[BinarySegmentPropertyPredicateUUID]
  = encodeTag[BinarySegmentPropertyPredicateTag]
  
  type BinarySegmentReversePropertyPredicateUUID 
  = String @@ BinarySegmentReversePropertyPredicateTag
  
  def binarySegmentReversePropertyPredicateUUID(uuid: String)
  : BinarySegmentReversePropertyPredicateUUID
  = covariantTag[BinarySegmentReversePropertyPredicateTag][String](uuid)
  
  implicit val decodeBinarySegmentReversePropertyPredicateUUID
  : Decoder[BinarySegmentReversePropertyPredicateUUID]
  = decodeTag[BinarySegmentReversePropertyPredicateTag]
  
  implicit val encodeBinarySegmentReversePropertyPredicateUUID
  : Encoder[BinarySegmentReversePropertyPredicateUUID]
  = encodeTag[BinarySegmentReversePropertyPredicateTag]
  
  type BundleUUID 
  = String @@ BundleTag
  
  def bundleUUID(uuid: String)
  : BundleUUID
  = covariantTag[BundleTag][String](uuid)
  
  implicit val decodeBundleUUID
  : Decoder[BundleUUID]
  = decodeTag[BundleTag]
  
  implicit val encodeBundleUUID
  : Encoder[BundleUUID]
  = encodeTag[BundleTag]
  
  type BundledTerminologyAxiomUUID 
  = String @@ BundledTerminologyAxiomTag
  
  def bundledTerminologyAxiomUUID(uuid: String)
  : BundledTerminologyAxiomUUID
  = covariantTag[BundledTerminologyAxiomTag][String](uuid)
  
  implicit val decodeBundledTerminologyAxiomUUID
  : Decoder[BundledTerminologyAxiomUUID]
  = decodeTag[BundledTerminologyAxiomTag]
  
  implicit val encodeBundledTerminologyAxiomUUID
  : Encoder[BundledTerminologyAxiomUUID]
  = encodeTag[BundledTerminologyAxiomTag]
  
  type ChainRuleUUID 
  = String @@ ChainRuleTag
  
  def chainRuleUUID(uuid: String)
  : ChainRuleUUID
  = covariantTag[ChainRuleTag][String](uuid)
  
  implicit val decodeChainRuleUUID
  : Decoder[ChainRuleUUID]
  = decodeTag[ChainRuleTag]
  
  implicit val encodeChainRuleUUID
  : Encoder[ChainRuleUUID]
  = encodeTag[ChainRuleTag]
  
  type ConceptUUID 
  = String @@ ConceptTag
  
  def conceptUUID(uuid: String)
  : ConceptUUID
  = covariantTag[ConceptTag][String](uuid)
  
  implicit val decodeConceptUUID
  : Decoder[ConceptUUID]
  = decodeTag[ConceptTag]
  
  implicit val encodeConceptUUID
  : Encoder[ConceptUUID]
  = encodeTag[ConceptTag]
  
  type ConceptDesignationTerminologyAxiomUUID 
  = String @@ ConceptDesignationTerminologyAxiomTag
  
  def conceptDesignationTerminologyAxiomUUID(uuid: String)
  : ConceptDesignationTerminologyAxiomUUID
  = covariantTag[ConceptDesignationTerminologyAxiomTag][String](uuid)
  
  implicit val decodeConceptDesignationTerminologyAxiomUUID
  : Decoder[ConceptDesignationTerminologyAxiomUUID]
  = decodeTag[ConceptDesignationTerminologyAxiomTag]
  
  implicit val encodeConceptDesignationTerminologyAxiomUUID
  : Encoder[ConceptDesignationTerminologyAxiomUUID]
  = encodeTag[ConceptDesignationTerminologyAxiomTag]
  
  type ConceptInstanceUUID 
  = String @@ ConceptInstanceTag
  
  def conceptInstanceUUID(uuid: String)
  : ConceptInstanceUUID
  = covariantTag[ConceptInstanceTag][String](uuid)
  
  implicit val decodeConceptInstanceUUID
  : Decoder[ConceptInstanceUUID]
  = decodeTag[ConceptInstanceTag]
  
  implicit val encodeConceptInstanceUUID
  : Encoder[ConceptInstanceUUID]
  = encodeTag[ConceptInstanceTag]
  
  type ConceptPredicateUUID 
  = String @@ ConceptPredicateTag
  
  def conceptPredicateUUID(uuid: String)
  : ConceptPredicateUUID
  = covariantTag[ConceptPredicateTag][String](uuid)
  
  implicit val decodeConceptPredicateUUID
  : Decoder[ConceptPredicateUUID]
  = decodeTag[ConceptPredicateTag]
  
  implicit val encodeConceptPredicateUUID
  : Encoder[ConceptPredicateUUID]
  = encodeTag[ConceptPredicateTag]
  
  type ConceptSpecializationAxiomUUID 
  = String @@ ConceptSpecializationAxiomTag
  
  def conceptSpecializationAxiomUUID(uuid: String)
  : ConceptSpecializationAxiomUUID
  = covariantTag[ConceptSpecializationAxiomTag][String](uuid)
  
  implicit val decodeConceptSpecializationAxiomUUID
  : Decoder[ConceptSpecializationAxiomUUID]
  = decodeTag[ConceptSpecializationAxiomTag]
  
  implicit val encodeConceptSpecializationAxiomUUID
  : Encoder[ConceptSpecializationAxiomUUID]
  = encodeTag[ConceptSpecializationAxiomTag]
  
  type ConceptTreeDisjunctionUUID 
  = String @@ ConceptTreeDisjunctionTag
  
  def conceptTreeDisjunctionUUID(uuid: String)
  : ConceptTreeDisjunctionUUID
  = covariantTag[ConceptTreeDisjunctionTag][String](uuid)
  
  implicit val decodeConceptTreeDisjunctionUUID
  : Decoder[ConceptTreeDisjunctionUUID]
  = decodeTag[ConceptTreeDisjunctionTag]
  
  implicit val encodeConceptTreeDisjunctionUUID
  : Encoder[ConceptTreeDisjunctionUUID]
  = encodeTag[ConceptTreeDisjunctionTag]
  
  type ConceptualEntityUUID 
  = String @@ ConceptualEntityTag
  
  def conceptualEntityUUID(uuid: String)
  : ConceptualEntityUUID
  = covariantTag[ConceptualEntityTag][String](uuid)
  
  implicit val decodeConceptualEntityUUID
  : Decoder[ConceptualEntityUUID]
  = decodeTag[ConceptualEntityTag]
  
  implicit val encodeConceptualEntityUUID
  : Encoder[ConceptualEntityUUID]
  = encodeTag[ConceptualEntityTag]
  
  type ConceptualEntitySingletonInstanceUUID 
  = String @@ ConceptualEntitySingletonInstanceTag
  
  def conceptualEntitySingletonInstanceUUID(uuid: String)
  : ConceptualEntitySingletonInstanceUUID
  = covariantTag[ConceptualEntitySingletonInstanceTag][String](uuid)
  
  implicit val decodeConceptualEntitySingletonInstanceUUID
  : Decoder[ConceptualEntitySingletonInstanceUUID]
  = decodeTag[ConceptualEntitySingletonInstanceTag]
  
  implicit val encodeConceptualEntitySingletonInstanceUUID
  : Encoder[ConceptualEntitySingletonInstanceUUID]
  = encodeTag[ConceptualEntitySingletonInstanceTag]
  
  type DataRangeUUID 
  = String @@ DataRangeTag
  
  def dataRangeUUID(uuid: String)
  : DataRangeUUID
  = covariantTag[DataRangeTag][String](uuid)
  
  implicit val decodeDataRangeUUID
  : Decoder[DataRangeUUID]
  = decodeTag[DataRangeTag]
  
  implicit val encodeDataRangeUUID
  : Encoder[DataRangeUUID]
  = encodeTag[DataRangeTag]
  
  type DataRelationshipUUID 
  = String @@ DataRelationshipTag
  
  def dataRelationshipUUID(uuid: String)
  : DataRelationshipUUID
  = covariantTag[DataRelationshipTag][String](uuid)
  
  implicit val decodeDataRelationshipUUID
  : Decoder[DataRelationshipUUID]
  = decodeTag[DataRelationshipTag]
  
  implicit val encodeDataRelationshipUUID
  : Encoder[DataRelationshipUUID]
  = encodeTag[DataRelationshipTag]
  
  type DataRelationshipDomainUUID 
  = String @@ DataRelationshipDomainTag
  
  def dataRelationshipDomainUUID(uuid: String)
  : DataRelationshipDomainUUID
  = covariantTag[DataRelationshipDomainTag][String](uuid)
  
  implicit val decodeDataRelationshipDomainUUID
  : Decoder[DataRelationshipDomainUUID]
  = decodeTag[DataRelationshipDomainTag]
  
  implicit val encodeDataRelationshipDomainUUID
  : Encoder[DataRelationshipDomainUUID]
  = encodeTag[DataRelationshipDomainTag]
  
  type DataRelationshipFromEntityUUID 
  = String @@ DataRelationshipFromEntityTag
  
  def dataRelationshipFromEntityUUID(uuid: String)
  : DataRelationshipFromEntityUUID
  = covariantTag[DataRelationshipFromEntityTag][String](uuid)
  
  implicit val decodeDataRelationshipFromEntityUUID
  : Decoder[DataRelationshipFromEntityUUID]
  = decodeTag[DataRelationshipFromEntityTag]
  
  implicit val encodeDataRelationshipFromEntityUUID
  : Encoder[DataRelationshipFromEntityUUID]
  = encodeTag[DataRelationshipFromEntityTag]
  
  type DataRelationshipFromStructureUUID 
  = String @@ DataRelationshipFromStructureTag
  
  def dataRelationshipFromStructureUUID(uuid: String)
  : DataRelationshipFromStructureUUID
  = covariantTag[DataRelationshipFromStructureTag][String](uuid)
  
  implicit val decodeDataRelationshipFromStructureUUID
  : Decoder[DataRelationshipFromStructureUUID]
  = decodeTag[DataRelationshipFromStructureTag]
  
  implicit val encodeDataRelationshipFromStructureUUID
  : Encoder[DataRelationshipFromStructureUUID]
  = encodeTag[DataRelationshipFromStructureTag]
  
  type DataRelationshipRangeUUID 
  = String @@ DataRelationshipRangeTag
  
  def dataRelationshipRangeUUID(uuid: String)
  : DataRelationshipRangeUUID
  = covariantTag[DataRelationshipRangeTag][String](uuid)
  
  implicit val decodeDataRelationshipRangeUUID
  : Decoder[DataRelationshipRangeUUID]
  = decodeTag[DataRelationshipRangeTag]
  
  implicit val encodeDataRelationshipRangeUUID
  : Encoder[DataRelationshipRangeUUID]
  = encodeTag[DataRelationshipRangeTag]
  
  type DataRelationshipToScalarUUID 
  = String @@ DataRelationshipToScalarTag
  
  def dataRelationshipToScalarUUID(uuid: String)
  : DataRelationshipToScalarUUID
  = covariantTag[DataRelationshipToScalarTag][String](uuid)
  
  implicit val decodeDataRelationshipToScalarUUID
  : Decoder[DataRelationshipToScalarUUID]
  = decodeTag[DataRelationshipToScalarTag]
  
  implicit val encodeDataRelationshipToScalarUUID
  : Encoder[DataRelationshipToScalarUUID]
  = encodeTag[DataRelationshipToScalarTag]
  
  type DataRelationshipToStructureUUID 
  = String @@ DataRelationshipToStructureTag
  
  def dataRelationshipToStructureUUID(uuid: String)
  : DataRelationshipToStructureUUID
  = covariantTag[DataRelationshipToStructureTag][String](uuid)
  
  implicit val decodeDataRelationshipToStructureUUID
  : Decoder[DataRelationshipToStructureUUID]
  = decodeTag[DataRelationshipToStructureTag]
  
  implicit val encodeDataRelationshipToStructureUUID
  : Encoder[DataRelationshipToStructureUUID]
  = encodeTag[DataRelationshipToStructureTag]
  
  type DatatypeUUID 
  = String @@ DatatypeTag
  
  def datatypeUUID(uuid: String)
  : DatatypeUUID
  = covariantTag[DatatypeTag][String](uuid)
  
  implicit val decodeDatatypeUUID
  : Decoder[DatatypeUUID]
  = decodeTag[DatatypeTag]
  
  implicit val encodeDatatypeUUID
  : Encoder[DatatypeUUID]
  = encodeTag[DatatypeTag]
  
  type DescriptionBoxUUID 
  = String @@ DescriptionBoxTag
  
  def descriptionBoxUUID(uuid: String)
  : DescriptionBoxUUID
  = covariantTag[DescriptionBoxTag][String](uuid)
  
  implicit val decodeDescriptionBoxUUID
  : Decoder[DescriptionBoxUUID]
  = decodeTag[DescriptionBoxTag]
  
  implicit val encodeDescriptionBoxUUID
  : Encoder[DescriptionBoxUUID]
  = encodeTag[DescriptionBoxTag]
  
  type DescriptionBoxExtendsClosedWorldDefinitionsUUID 
  = String @@ DescriptionBoxExtendsClosedWorldDefinitionsTag
  
  def descriptionBoxExtendsClosedWorldDefinitionsUUID(uuid: String)
  : DescriptionBoxExtendsClosedWorldDefinitionsUUID
  = covariantTag[DescriptionBoxExtendsClosedWorldDefinitionsTag][String](uuid)
  
  implicit val decodeDescriptionBoxExtendsClosedWorldDefinitionsUUID
  : Decoder[DescriptionBoxExtendsClosedWorldDefinitionsUUID]
  = decodeTag[DescriptionBoxExtendsClosedWorldDefinitionsTag]
  
  implicit val encodeDescriptionBoxExtendsClosedWorldDefinitionsUUID
  : Encoder[DescriptionBoxExtendsClosedWorldDefinitionsUUID]
  = encodeTag[DescriptionBoxExtendsClosedWorldDefinitionsTag]
  
  type DescriptionBoxRefinementUUID 
  = String @@ DescriptionBoxRefinementTag
  
  def descriptionBoxRefinementUUID(uuid: String)
  : DescriptionBoxRefinementUUID
  = covariantTag[DescriptionBoxRefinementTag][String](uuid)
  
  implicit val decodeDescriptionBoxRefinementUUID
  : Decoder[DescriptionBoxRefinementUUID]
  = decodeTag[DescriptionBoxRefinementTag]
  
  implicit val encodeDescriptionBoxRefinementUUID
  : Encoder[DescriptionBoxRefinementUUID]
  = encodeTag[DescriptionBoxRefinementTag]
  
  type DescriptionBoxRelationshipUUID 
  = String @@ DescriptionBoxRelationshipTag
  
  def descriptionBoxRelationshipUUID(uuid: String)
  : DescriptionBoxRelationshipUUID
  = covariantTag[DescriptionBoxRelationshipTag][String](uuid)
  
  implicit val decodeDescriptionBoxRelationshipUUID
  : Decoder[DescriptionBoxRelationshipUUID]
  = decodeTag[DescriptionBoxRelationshipTag]
  
  implicit val encodeDescriptionBoxRelationshipUUID
  : Encoder[DescriptionBoxRelationshipUUID]
  = encodeTag[DescriptionBoxRelationshipTag]
  
  type DirectedBinaryRelationshipKindUUID 
  = String @@ DirectedBinaryRelationshipKindTag
  
  def directedBinaryRelationshipKindUUID(uuid: String)
  : DirectedBinaryRelationshipKindUUID
  = covariantTag[DirectedBinaryRelationshipKindTag][String](uuid)
  
  implicit val decodeDirectedBinaryRelationshipKindUUID
  : Decoder[DirectedBinaryRelationshipKindUUID]
  = decodeTag[DirectedBinaryRelationshipKindTag]
  
  implicit val encodeDirectedBinaryRelationshipKindUUID
  : Encoder[DirectedBinaryRelationshipKindUUID]
  = encodeTag[DirectedBinaryRelationshipKindTag]
  
  type DisjointUnionOfConceptsAxiomUUID 
  = String @@ DisjointUnionOfConceptsAxiomTag
  
  def disjointUnionOfConceptsAxiomUUID(uuid: String)
  : DisjointUnionOfConceptsAxiomUUID
  = covariantTag[DisjointUnionOfConceptsAxiomTag][String](uuid)
  
  implicit val decodeDisjointUnionOfConceptsAxiomUUID
  : Decoder[DisjointUnionOfConceptsAxiomUUID]
  = decodeTag[DisjointUnionOfConceptsAxiomTag]
  
  implicit val encodeDisjointUnionOfConceptsAxiomUUID
  : Encoder[DisjointUnionOfConceptsAxiomUUID]
  = encodeTag[DisjointUnionOfConceptsAxiomTag]
  
  type ElementUUID 
  = String @@ ElementTag
  
  def elementUUID(uuid: String)
  : ElementUUID
  = covariantTag[ElementTag][String](uuid)
  
  implicit val decodeElementUUID
  : Decoder[ElementUUID]
  = decodeTag[ElementTag]
  
  implicit val encodeElementUUID
  : Encoder[ElementUUID]
  = encodeTag[ElementTag]
  
  type EntityUUID 
  = String @@ EntityTag
  
  def entityUUID(uuid: String)
  : EntityUUID
  = covariantTag[EntityTag][String](uuid)
  
  implicit val decodeEntityUUID
  : Decoder[EntityUUID]
  = decodeTag[EntityTag]
  
  implicit val encodeEntityUUID
  : Encoder[EntityUUID]
  = encodeTag[EntityTag]
  
  type EntityExistentialRestrictionAxiomUUID 
  = String @@ EntityExistentialRestrictionAxiomTag
  
  def entityExistentialRestrictionAxiomUUID(uuid: String)
  : EntityExistentialRestrictionAxiomUUID
  = covariantTag[EntityExistentialRestrictionAxiomTag][String](uuid)
  
  implicit val decodeEntityExistentialRestrictionAxiomUUID
  : Decoder[EntityExistentialRestrictionAxiomUUID]
  = decodeTag[EntityExistentialRestrictionAxiomTag]
  
  implicit val encodeEntityExistentialRestrictionAxiomUUID
  : Encoder[EntityExistentialRestrictionAxiomUUID]
  = encodeTag[EntityExistentialRestrictionAxiomTag]
  
  type EntityRelationshipUUID 
  = String @@ EntityRelationshipTag
  
  def entityRelationshipUUID(uuid: String)
  : EntityRelationshipUUID
  = covariantTag[EntityRelationshipTag][String](uuid)
  
  implicit val decodeEntityRelationshipUUID
  : Decoder[EntityRelationshipUUID]
  = decodeTag[EntityRelationshipTag]
  
  implicit val encodeEntityRelationshipUUID
  : Encoder[EntityRelationshipUUID]
  = encodeTag[EntityRelationshipTag]
  
  type EntityRestrictionAxiomUUID 
  = String @@ EntityRestrictionAxiomTag
  
  def entityRestrictionAxiomUUID(uuid: String)
  : EntityRestrictionAxiomUUID
  = covariantTag[EntityRestrictionAxiomTag][String](uuid)
  
  implicit val decodeEntityRestrictionAxiomUUID
  : Decoder[EntityRestrictionAxiomUUID]
  = decodeTag[EntityRestrictionAxiomTag]
  
  implicit val encodeEntityRestrictionAxiomUUID
  : Encoder[EntityRestrictionAxiomUUID]
  = encodeTag[EntityRestrictionAxiomTag]
  
  type EntityScalarDataPropertyUUID 
  = String @@ EntityScalarDataPropertyTag
  
  def entityScalarDataPropertyUUID(uuid: String)
  : EntityScalarDataPropertyUUID
  = covariantTag[EntityScalarDataPropertyTag][String](uuid)
  
  implicit val decodeEntityScalarDataPropertyUUID
  : Decoder[EntityScalarDataPropertyUUID]
  = decodeTag[EntityScalarDataPropertyTag]
  
  implicit val encodeEntityScalarDataPropertyUUID
  : Encoder[EntityScalarDataPropertyUUID]
  = encodeTag[EntityScalarDataPropertyTag]
  
  type EntityScalarDataPropertyExistentialRestrictionAxiomUUID 
  = String @@ EntityScalarDataPropertyExistentialRestrictionAxiomTag
  
  def entityScalarDataPropertyExistentialRestrictionAxiomUUID(uuid: String)
  : EntityScalarDataPropertyExistentialRestrictionAxiomUUID
  = covariantTag[EntityScalarDataPropertyExistentialRestrictionAxiomTag][String](uuid)
  
  implicit val decodeEntityScalarDataPropertyExistentialRestrictionAxiomUUID
  : Decoder[EntityScalarDataPropertyExistentialRestrictionAxiomUUID]
  = decodeTag[EntityScalarDataPropertyExistentialRestrictionAxiomTag]
  
  implicit val encodeEntityScalarDataPropertyExistentialRestrictionAxiomUUID
  : Encoder[EntityScalarDataPropertyExistentialRestrictionAxiomUUID]
  = encodeTag[EntityScalarDataPropertyExistentialRestrictionAxiomTag]
  
  type EntityScalarDataPropertyParticularRestrictionAxiomUUID 
  = String @@ EntityScalarDataPropertyParticularRestrictionAxiomTag
  
  def entityScalarDataPropertyParticularRestrictionAxiomUUID(uuid: String)
  : EntityScalarDataPropertyParticularRestrictionAxiomUUID
  = covariantTag[EntityScalarDataPropertyParticularRestrictionAxiomTag][String](uuid)
  
  implicit val decodeEntityScalarDataPropertyParticularRestrictionAxiomUUID
  : Decoder[EntityScalarDataPropertyParticularRestrictionAxiomUUID]
  = decodeTag[EntityScalarDataPropertyParticularRestrictionAxiomTag]
  
  implicit val encodeEntityScalarDataPropertyParticularRestrictionAxiomUUID
  : Encoder[EntityScalarDataPropertyParticularRestrictionAxiomUUID]
  = encodeTag[EntityScalarDataPropertyParticularRestrictionAxiomTag]
  
  type EntityScalarDataPropertyRestrictionAxiomUUID 
  = String @@ EntityScalarDataPropertyRestrictionAxiomTag
  
  def entityScalarDataPropertyRestrictionAxiomUUID(uuid: String)
  : EntityScalarDataPropertyRestrictionAxiomUUID
  = covariantTag[EntityScalarDataPropertyRestrictionAxiomTag][String](uuid)
  
  implicit val decodeEntityScalarDataPropertyRestrictionAxiomUUID
  : Decoder[EntityScalarDataPropertyRestrictionAxiomUUID]
  = decodeTag[EntityScalarDataPropertyRestrictionAxiomTag]
  
  implicit val encodeEntityScalarDataPropertyRestrictionAxiomUUID
  : Encoder[EntityScalarDataPropertyRestrictionAxiomUUID]
  = encodeTag[EntityScalarDataPropertyRestrictionAxiomTag]
  
  type EntityScalarDataPropertyUniversalRestrictionAxiomUUID 
  = String @@ EntityScalarDataPropertyUniversalRestrictionAxiomTag
  
  def entityScalarDataPropertyUniversalRestrictionAxiomUUID(uuid: String)
  : EntityScalarDataPropertyUniversalRestrictionAxiomUUID
  = covariantTag[EntityScalarDataPropertyUniversalRestrictionAxiomTag][String](uuid)
  
  implicit val decodeEntityScalarDataPropertyUniversalRestrictionAxiomUUID
  : Decoder[EntityScalarDataPropertyUniversalRestrictionAxiomUUID]
  = decodeTag[EntityScalarDataPropertyUniversalRestrictionAxiomTag]
  
  implicit val encodeEntityScalarDataPropertyUniversalRestrictionAxiomUUID
  : Encoder[EntityScalarDataPropertyUniversalRestrictionAxiomUUID]
  = encodeTag[EntityScalarDataPropertyUniversalRestrictionAxiomTag]
  
  type EntityStructuredDataPropertyUUID 
  = String @@ EntityStructuredDataPropertyTag
  
  def entityStructuredDataPropertyUUID(uuid: String)
  : EntityStructuredDataPropertyUUID
  = covariantTag[EntityStructuredDataPropertyTag][String](uuid)
  
  implicit val decodeEntityStructuredDataPropertyUUID
  : Decoder[EntityStructuredDataPropertyUUID]
  = decodeTag[EntityStructuredDataPropertyTag]
  
  implicit val encodeEntityStructuredDataPropertyUUID
  : Encoder[EntityStructuredDataPropertyUUID]
  = encodeTag[EntityStructuredDataPropertyTag]
  
  type EntityStructuredDataPropertyParticularRestrictionAxiomUUID 
  = String @@ EntityStructuredDataPropertyParticularRestrictionAxiomTag
  
  def entityStructuredDataPropertyParticularRestrictionAxiomUUID(uuid: String)
  : EntityStructuredDataPropertyParticularRestrictionAxiomUUID
  = covariantTag[EntityStructuredDataPropertyParticularRestrictionAxiomTag][String](uuid)
  
  implicit val decodeEntityStructuredDataPropertyParticularRestrictionAxiomUUID
  : Decoder[EntityStructuredDataPropertyParticularRestrictionAxiomUUID]
  = decodeTag[EntityStructuredDataPropertyParticularRestrictionAxiomTag]
  
  implicit val encodeEntityStructuredDataPropertyParticularRestrictionAxiomUUID
  : Encoder[EntityStructuredDataPropertyParticularRestrictionAxiomUUID]
  = encodeTag[EntityStructuredDataPropertyParticularRestrictionAxiomTag]
  
  type EntityStructuredDataPropertyRestrictionAxiomUUID 
  = String @@ EntityStructuredDataPropertyRestrictionAxiomTag
  
  def entityStructuredDataPropertyRestrictionAxiomUUID(uuid: String)
  : EntityStructuredDataPropertyRestrictionAxiomUUID
  = covariantTag[EntityStructuredDataPropertyRestrictionAxiomTag][String](uuid)
  
  implicit val decodeEntityStructuredDataPropertyRestrictionAxiomUUID
  : Decoder[EntityStructuredDataPropertyRestrictionAxiomUUID]
  = decodeTag[EntityStructuredDataPropertyRestrictionAxiomTag]
  
  implicit val encodeEntityStructuredDataPropertyRestrictionAxiomUUID
  : Encoder[EntityStructuredDataPropertyRestrictionAxiomUUID]
  = encodeTag[EntityStructuredDataPropertyRestrictionAxiomTag]
  
  type EntityUniversalRestrictionAxiomUUID 
  = String @@ EntityUniversalRestrictionAxiomTag
  
  def entityUniversalRestrictionAxiomUUID(uuid: String)
  : EntityUniversalRestrictionAxiomUUID
  = covariantTag[EntityUniversalRestrictionAxiomTag][String](uuid)
  
  implicit val decodeEntityUniversalRestrictionAxiomUUID
  : Decoder[EntityUniversalRestrictionAxiomUUID]
  = decodeTag[EntityUniversalRestrictionAxiomTag]
  
  implicit val encodeEntityUniversalRestrictionAxiomUUID
  : Encoder[EntityUniversalRestrictionAxiomUUID]
  = encodeTag[EntityUniversalRestrictionAxiomTag]
  
  type ExtentUUID 
  = String @@ ExtentTag
  
  def extentUUID(uuid: String)
  : ExtentUUID
  = covariantTag[ExtentTag][String](uuid)
  
  implicit val decodeExtentUUID
  : Decoder[ExtentUUID]
  = decodeTag[ExtentTag]
  
  implicit val encodeExtentUUID
  : Encoder[ExtentUUID]
  = encodeTag[ExtentTag]
  
  type IRIScalarRestrictionUUID 
  = String @@ IRIScalarRestrictionTag
  
  def iriScalarRestrictionUUID(uuid: String)
  : IRIScalarRestrictionUUID
  = covariantTag[IRIScalarRestrictionTag][String](uuid)
  
  implicit val decodeIRIScalarRestrictionUUID
  : Decoder[IRIScalarRestrictionUUID]
  = decodeTag[IRIScalarRestrictionTag]
  
  implicit val encodeIRIScalarRestrictionUUID
  : Encoder[IRIScalarRestrictionUUID]
  = encodeTag[IRIScalarRestrictionTag]
  
  type LiteralBooleanUUID 
  = String @@ LiteralBooleanTag
  
  def literalBooleanUUID(uuid: String)
  : LiteralBooleanUUID
  = covariantTag[LiteralBooleanTag][String](uuid)
  
  implicit val decodeLiteralBooleanUUID
  : Decoder[LiteralBooleanUUID]
  = decodeTag[LiteralBooleanTag]
  
  implicit val encodeLiteralBooleanUUID
  : Encoder[LiteralBooleanUUID]
  = encodeTag[LiteralBooleanTag]
  
  type LiteralDateTimeUUID 
  = String @@ LiteralDateTimeTag
  
  def literalDateTimeUUID(uuid: String)
  : LiteralDateTimeUUID
  = covariantTag[LiteralDateTimeTag][String](uuid)
  
  implicit val decodeLiteralDateTimeUUID
  : Decoder[LiteralDateTimeUUID]
  = decodeTag[LiteralDateTimeTag]
  
  implicit val encodeLiteralDateTimeUUID
  : Encoder[LiteralDateTimeUUID]
  = encodeTag[LiteralDateTimeTag]
  
  type LiteralDecimalUUID 
  = String @@ LiteralDecimalTag
  
  def literalDecimalUUID(uuid: String)
  : LiteralDecimalUUID
  = covariantTag[LiteralDecimalTag][String](uuid)
  
  implicit val decodeLiteralDecimalUUID
  : Decoder[LiteralDecimalUUID]
  = decodeTag[LiteralDecimalTag]
  
  implicit val encodeLiteralDecimalUUID
  : Encoder[LiteralDecimalUUID]
  = encodeTag[LiteralDecimalTag]
  
  type LiteralFloatUUID 
  = String @@ LiteralFloatTag
  
  def literalFloatUUID(uuid: String)
  : LiteralFloatUUID
  = covariantTag[LiteralFloatTag][String](uuid)
  
  implicit val decodeLiteralFloatUUID
  : Decoder[LiteralFloatUUID]
  = decodeTag[LiteralFloatTag]
  
  implicit val encodeLiteralFloatUUID
  : Encoder[LiteralFloatUUID]
  = encodeTag[LiteralFloatTag]
  
  type LiteralNumberUUID 
  = String @@ LiteralNumberTag
  
  def literalNumberUUID(uuid: String)
  : LiteralNumberUUID
  = covariantTag[LiteralNumberTag][String](uuid)
  
  implicit val decodeLiteralNumberUUID
  : Decoder[LiteralNumberUUID]
  = decodeTag[LiteralNumberTag]
  
  implicit val encodeLiteralNumberUUID
  : Encoder[LiteralNumberUUID]
  = encodeTag[LiteralNumberTag]
  
  type LiteralQuotedStringUUID 
  = String @@ LiteralQuotedStringTag
  
  def literalQuotedStringUUID(uuid: String)
  : LiteralQuotedStringUUID
  = covariantTag[LiteralQuotedStringTag][String](uuid)
  
  implicit val decodeLiteralQuotedStringUUID
  : Decoder[LiteralQuotedStringUUID]
  = decodeTag[LiteralQuotedStringTag]
  
  implicit val encodeLiteralQuotedStringUUID
  : Encoder[LiteralQuotedStringUUID]
  = encodeTag[LiteralQuotedStringTag]
  
  type LiteralRationalUUID 
  = String @@ LiteralRationalTag
  
  def literalRationalUUID(uuid: String)
  : LiteralRationalUUID
  = covariantTag[LiteralRationalTag][String](uuid)
  
  implicit val decodeLiteralRationalUUID
  : Decoder[LiteralRationalUUID]
  = decodeTag[LiteralRationalTag]
  
  implicit val encodeLiteralRationalUUID
  : Encoder[LiteralRationalUUID]
  = encodeTag[LiteralRationalTag]
  
  type LiteralRawStringUUID 
  = String @@ LiteralRawStringTag
  
  def literalRawStringUUID(uuid: String)
  : LiteralRawStringUUID
  = covariantTag[LiteralRawStringTag][String](uuid)
  
  implicit val decodeLiteralRawStringUUID
  : Decoder[LiteralRawStringUUID]
  = decodeTag[LiteralRawStringTag]
  
  implicit val encodeLiteralRawStringUUID
  : Encoder[LiteralRawStringUUID]
  = encodeTag[LiteralRawStringTag]
  
  type LiteralRealUUID 
  = String @@ LiteralRealTag
  
  def literalRealUUID(uuid: String)
  : LiteralRealUUID
  = covariantTag[LiteralRealTag][String](uuid)
  
  implicit val decodeLiteralRealUUID
  : Decoder[LiteralRealUUID]
  = decodeTag[LiteralRealTag]
  
  implicit val encodeLiteralRealUUID
  : Encoder[LiteralRealUUID]
  = encodeTag[LiteralRealTag]
  
  type LiteralStringUUID 
  = String @@ LiteralStringTag
  
  def literalStringUUID(uuid: String)
  : LiteralStringUUID
  = covariantTag[LiteralStringTag][String](uuid)
  
  implicit val decodeLiteralStringUUID
  : Decoder[LiteralStringUUID]
  = decodeTag[LiteralStringTag]
  
  implicit val encodeLiteralStringUUID
  : Encoder[LiteralStringUUID]
  = encodeTag[LiteralStringTag]
  
  type LiteralURIUUID 
  = String @@ LiteralURITag
  
  def literalURIUUID(uuid: String)
  : LiteralURIUUID
  = covariantTag[LiteralURITag][String](uuid)
  
  implicit val decodeLiteralURIUUID
  : Decoder[LiteralURIUUID]
  = decodeTag[LiteralURITag]
  
  implicit val encodeLiteralURIUUID
  : Encoder[LiteralURIUUID]
  = encodeTag[LiteralURITag]
  
  type LiteralUUIDUUID 
  = String @@ LiteralUUIDTag
  
  def literalUUIDUUID(uuid: String)
  : LiteralUUIDUUID
  = covariantTag[LiteralUUIDTag][String](uuid)
  
  implicit val decodeLiteralUUIDUUID
  : Decoder[LiteralUUIDUUID]
  = decodeTag[LiteralUUIDTag]
  
  implicit val encodeLiteralUUIDUUID
  : Encoder[LiteralUUIDUUID]
  = encodeTag[LiteralUUIDTag]
  
  type LiteralValueUUID 
  = String @@ LiteralValueTag
  
  def literalValueUUID(uuid: String)
  : LiteralValueUUID
  = covariantTag[LiteralValueTag][String](uuid)
  
  implicit val decodeLiteralValueUUID
  : Decoder[LiteralValueUUID]
  = decodeTag[LiteralValueTag]
  
  implicit val encodeLiteralValueUUID
  : Encoder[LiteralValueUUID]
  = encodeTag[LiteralValueTag]
  
  type ModuleUUID 
  = String @@ ModuleTag
  
  def moduleUUID(uuid: String)
  : ModuleUUID
  = covariantTag[ModuleTag][String](uuid)
  
  implicit val decodeModuleUUID
  : Decoder[ModuleUUID]
  = decodeTag[ModuleTag]
  
  implicit val encodeModuleUUID
  : Encoder[ModuleUUID]
  = encodeTag[ModuleTag]
  
  type ModuleEdgeUUID 
  = String @@ ModuleEdgeTag
  
  def moduleEdgeUUID(uuid: String)
  : ModuleEdgeUUID
  = covariantTag[ModuleEdgeTag][String](uuid)
  
  implicit val decodeModuleEdgeUUID
  : Decoder[ModuleEdgeUUID]
  = decodeTag[ModuleEdgeTag]
  
  implicit val encodeModuleEdgeUUID
  : Encoder[ModuleEdgeUUID]
  = encodeTag[ModuleEdgeTag]
  
  type ModuleElementUUID 
  = String @@ ModuleElementTag
  
  def moduleElementUUID(uuid: String)
  : ModuleElementUUID
  = covariantTag[ModuleElementTag][String](uuid)
  
  implicit val decodeModuleElementUUID
  : Decoder[ModuleElementUUID]
  = decodeTag[ModuleElementTag]
  
  implicit val encodeModuleElementUUID
  : Encoder[ModuleElementUUID]
  = encodeTag[ModuleElementTag]
  
  type NumericScalarRestrictionUUID 
  = String @@ NumericScalarRestrictionTag
  
  def numericScalarRestrictionUUID(uuid: String)
  : NumericScalarRestrictionUUID
  = covariantTag[NumericScalarRestrictionTag][String](uuid)
  
  implicit val decodeNumericScalarRestrictionUUID
  : Decoder[NumericScalarRestrictionUUID]
  = decodeTag[NumericScalarRestrictionTag]
  
  implicit val encodeNumericScalarRestrictionUUID
  : Encoder[NumericScalarRestrictionUUID]
  = encodeTag[NumericScalarRestrictionTag]
  
  type PlainLiteralScalarRestrictionUUID 
  = String @@ PlainLiteralScalarRestrictionTag
  
  def plainLiteralScalarRestrictionUUID(uuid: String)
  : PlainLiteralScalarRestrictionUUID
  = covariantTag[PlainLiteralScalarRestrictionTag][String](uuid)
  
  implicit val decodePlainLiteralScalarRestrictionUUID
  : Decoder[PlainLiteralScalarRestrictionUUID]
  = decodeTag[PlainLiteralScalarRestrictionTag]
  
  implicit val encodePlainLiteralScalarRestrictionUUID
  : Encoder[PlainLiteralScalarRestrictionUUID]
  = encodeTag[PlainLiteralScalarRestrictionTag]
  
  type ReifiedRelationshipUUID 
  = String @@ ReifiedRelationshipTag
  
  def reifiedRelationshipUUID(uuid: String)
  : ReifiedRelationshipUUID
  = covariantTag[ReifiedRelationshipTag][String](uuid)
  
  implicit val decodeReifiedRelationshipUUID
  : Decoder[ReifiedRelationshipUUID]
  = decodeTag[ReifiedRelationshipTag]
  
  implicit val encodeReifiedRelationshipUUID
  : Encoder[ReifiedRelationshipUUID]
  = encodeTag[ReifiedRelationshipTag]
  
  type ReifiedRelationshipInstanceUUID 
  = String @@ ReifiedRelationshipInstanceTag
  
  def reifiedRelationshipInstanceUUID(uuid: String)
  : ReifiedRelationshipInstanceUUID
  = covariantTag[ReifiedRelationshipInstanceTag][String](uuid)
  
  implicit val decodeReifiedRelationshipInstanceUUID
  : Decoder[ReifiedRelationshipInstanceUUID]
  = decodeTag[ReifiedRelationshipInstanceTag]
  
  implicit val encodeReifiedRelationshipInstanceUUID
  : Encoder[ReifiedRelationshipInstanceUUID]
  = encodeTag[ReifiedRelationshipInstanceTag]
  
  type ReifiedRelationshipInstanceDomainUUID 
  = String @@ ReifiedRelationshipInstanceDomainTag
  
  def reifiedRelationshipInstanceDomainUUID(uuid: String)
  : ReifiedRelationshipInstanceDomainUUID
  = covariantTag[ReifiedRelationshipInstanceDomainTag][String](uuid)
  
  implicit val decodeReifiedRelationshipInstanceDomainUUID
  : Decoder[ReifiedRelationshipInstanceDomainUUID]
  = decodeTag[ReifiedRelationshipInstanceDomainTag]
  
  implicit val encodeReifiedRelationshipInstanceDomainUUID
  : Encoder[ReifiedRelationshipInstanceDomainUUID]
  = encodeTag[ReifiedRelationshipInstanceDomainTag]
  
  type ReifiedRelationshipInstanceRangeUUID 
  = String @@ ReifiedRelationshipInstanceRangeTag
  
  def reifiedRelationshipInstanceRangeUUID(uuid: String)
  : ReifiedRelationshipInstanceRangeUUID
  = covariantTag[ReifiedRelationshipInstanceRangeTag][String](uuid)
  
  implicit val decodeReifiedRelationshipInstanceRangeUUID
  : Decoder[ReifiedRelationshipInstanceRangeUUID]
  = decodeTag[ReifiedRelationshipInstanceRangeTag]
  
  implicit val encodeReifiedRelationshipInstanceRangeUUID
  : Encoder[ReifiedRelationshipInstanceRangeUUID]
  = encodeTag[ReifiedRelationshipInstanceRangeTag]
  
  type ReifiedRelationshipInversePropertyPredicateUUID 
  = String @@ ReifiedRelationshipInversePropertyPredicateTag
  
  def reifiedRelationshipInversePropertyPredicateUUID(uuid: String)
  : ReifiedRelationshipInversePropertyPredicateUUID
  = covariantTag[ReifiedRelationshipInversePropertyPredicateTag][String](uuid)
  
  implicit val decodeReifiedRelationshipInversePropertyPredicateUUID
  : Decoder[ReifiedRelationshipInversePropertyPredicateUUID]
  = decodeTag[ReifiedRelationshipInversePropertyPredicateTag]
  
  implicit val encodeReifiedRelationshipInversePropertyPredicateUUID
  : Encoder[ReifiedRelationshipInversePropertyPredicateUUID]
  = encodeTag[ReifiedRelationshipInversePropertyPredicateTag]
  
  type ReifiedRelationshipPredicateUUID 
  = String @@ ReifiedRelationshipPredicateTag
  
  def reifiedRelationshipPredicateUUID(uuid: String)
  : ReifiedRelationshipPredicateUUID
  = covariantTag[ReifiedRelationshipPredicateTag][String](uuid)
  
  implicit val decodeReifiedRelationshipPredicateUUID
  : Decoder[ReifiedRelationshipPredicateUUID]
  = decodeTag[ReifiedRelationshipPredicateTag]
  
  implicit val encodeReifiedRelationshipPredicateUUID
  : Encoder[ReifiedRelationshipPredicateUUID]
  = encodeTag[ReifiedRelationshipPredicateTag]
  
  type ReifiedRelationshipPropertyPredicateUUID 
  = String @@ ReifiedRelationshipPropertyPredicateTag
  
  def reifiedRelationshipPropertyPredicateUUID(uuid: String)
  : ReifiedRelationshipPropertyPredicateUUID
  = covariantTag[ReifiedRelationshipPropertyPredicateTag][String](uuid)
  
  implicit val decodeReifiedRelationshipPropertyPredicateUUID
  : Decoder[ReifiedRelationshipPropertyPredicateUUID]
  = decodeTag[ReifiedRelationshipPropertyPredicateTag]
  
  implicit val encodeReifiedRelationshipPropertyPredicateUUID
  : Encoder[ReifiedRelationshipPropertyPredicateUUID]
  = encodeTag[ReifiedRelationshipPropertyPredicateTag]
  
  type ReifiedRelationshipSourceInversePropertyPredicateUUID 
  = String @@ ReifiedRelationshipSourceInversePropertyPredicateTag
  
  def reifiedRelationshipSourceInversePropertyPredicateUUID(uuid: String)
  : ReifiedRelationshipSourceInversePropertyPredicateUUID
  = covariantTag[ReifiedRelationshipSourceInversePropertyPredicateTag][String](uuid)
  
  implicit val decodeReifiedRelationshipSourceInversePropertyPredicateUUID
  : Decoder[ReifiedRelationshipSourceInversePropertyPredicateUUID]
  = decodeTag[ReifiedRelationshipSourceInversePropertyPredicateTag]
  
  implicit val encodeReifiedRelationshipSourceInversePropertyPredicateUUID
  : Encoder[ReifiedRelationshipSourceInversePropertyPredicateUUID]
  = encodeTag[ReifiedRelationshipSourceInversePropertyPredicateTag]
  
  type ReifiedRelationshipSourcePropertyPredicateUUID 
  = String @@ ReifiedRelationshipSourcePropertyPredicateTag
  
  def reifiedRelationshipSourcePropertyPredicateUUID(uuid: String)
  : ReifiedRelationshipSourcePropertyPredicateUUID
  = covariantTag[ReifiedRelationshipSourcePropertyPredicateTag][String](uuid)
  
  implicit val decodeReifiedRelationshipSourcePropertyPredicateUUID
  : Decoder[ReifiedRelationshipSourcePropertyPredicateUUID]
  = decodeTag[ReifiedRelationshipSourcePropertyPredicateTag]
  
  implicit val encodeReifiedRelationshipSourcePropertyPredicateUUID
  : Encoder[ReifiedRelationshipSourcePropertyPredicateUUID]
  = encodeTag[ReifiedRelationshipSourcePropertyPredicateTag]
  
  type ReifiedRelationshipSpecializationAxiomUUID 
  = String @@ ReifiedRelationshipSpecializationAxiomTag
  
  def reifiedRelationshipSpecializationAxiomUUID(uuid: String)
  : ReifiedRelationshipSpecializationAxiomUUID
  = covariantTag[ReifiedRelationshipSpecializationAxiomTag][String](uuid)
  
  implicit val decodeReifiedRelationshipSpecializationAxiomUUID
  : Decoder[ReifiedRelationshipSpecializationAxiomUUID]
  = decodeTag[ReifiedRelationshipSpecializationAxiomTag]
  
  implicit val encodeReifiedRelationshipSpecializationAxiomUUID
  : Encoder[ReifiedRelationshipSpecializationAxiomUUID]
  = encodeTag[ReifiedRelationshipSpecializationAxiomTag]
  
  type ReifiedRelationshipTargetInversePropertyPredicateUUID 
  = String @@ ReifiedRelationshipTargetInversePropertyPredicateTag
  
  def reifiedRelationshipTargetInversePropertyPredicateUUID(uuid: String)
  : ReifiedRelationshipTargetInversePropertyPredicateUUID
  = covariantTag[ReifiedRelationshipTargetInversePropertyPredicateTag][String](uuid)
  
  implicit val decodeReifiedRelationshipTargetInversePropertyPredicateUUID
  : Decoder[ReifiedRelationshipTargetInversePropertyPredicateUUID]
  = decodeTag[ReifiedRelationshipTargetInversePropertyPredicateTag]
  
  implicit val encodeReifiedRelationshipTargetInversePropertyPredicateUUID
  : Encoder[ReifiedRelationshipTargetInversePropertyPredicateUUID]
  = encodeTag[ReifiedRelationshipTargetInversePropertyPredicateTag]
  
  type ReifiedRelationshipTargetPropertyPredicateUUID 
  = String @@ ReifiedRelationshipTargetPropertyPredicateTag
  
  def reifiedRelationshipTargetPropertyPredicateUUID(uuid: String)
  : ReifiedRelationshipTargetPropertyPredicateUUID
  = covariantTag[ReifiedRelationshipTargetPropertyPredicateTag][String](uuid)
  
  implicit val decodeReifiedRelationshipTargetPropertyPredicateUUID
  : Decoder[ReifiedRelationshipTargetPropertyPredicateUUID]
  = decodeTag[ReifiedRelationshipTargetPropertyPredicateTag]
  
  implicit val encodeReifiedRelationshipTargetPropertyPredicateUUID
  : Encoder[ReifiedRelationshipTargetPropertyPredicateUUID]
  = encodeTag[ReifiedRelationshipTargetPropertyPredicateTag]
  
  type ResourceUUID 
  = String @@ ResourceTag
  
  def resourceUUID(uuid: String)
  : ResourceUUID
  = covariantTag[ResourceTag][String](uuid)
  
  implicit val decodeResourceUUID
  : Decoder[ResourceUUID]
  = decodeTag[ResourceTag]
  
  implicit val encodeResourceUUID
  : Encoder[ResourceUUID]
  = encodeTag[ResourceTag]
  
  type RestrictedDataRangeUUID 
  = String @@ RestrictedDataRangeTag
  
  def restrictedDataRangeUUID(uuid: String)
  : RestrictedDataRangeUUID
  = covariantTag[RestrictedDataRangeTag][String](uuid)
  
  implicit val decodeRestrictedDataRangeUUID
  : Decoder[RestrictedDataRangeUUID]
  = decodeTag[RestrictedDataRangeTag]
  
  implicit val encodeRestrictedDataRangeUUID
  : Encoder[RestrictedDataRangeUUID]
  = encodeTag[RestrictedDataRangeTag]
  
  type RestrictionScalarDataPropertyValueUUID 
  = String @@ RestrictionScalarDataPropertyValueTag
  
  def restrictionScalarDataPropertyValueUUID(uuid: String)
  : RestrictionScalarDataPropertyValueUUID
  = covariantTag[RestrictionScalarDataPropertyValueTag][String](uuid)
  
  implicit val decodeRestrictionScalarDataPropertyValueUUID
  : Decoder[RestrictionScalarDataPropertyValueUUID]
  = decodeTag[RestrictionScalarDataPropertyValueTag]
  
  implicit val encodeRestrictionScalarDataPropertyValueUUID
  : Encoder[RestrictionScalarDataPropertyValueUUID]
  = encodeTag[RestrictionScalarDataPropertyValueTag]
  
  type RestrictionStructuredDataPropertyContextUUID 
  = String @@ RestrictionStructuredDataPropertyContextTag
  
  def restrictionStructuredDataPropertyContextUUID(uuid: String)
  : RestrictionStructuredDataPropertyContextUUID
  = covariantTag[RestrictionStructuredDataPropertyContextTag][String](uuid)
  
  implicit val decodeRestrictionStructuredDataPropertyContextUUID
  : Decoder[RestrictionStructuredDataPropertyContextUUID]
  = decodeTag[RestrictionStructuredDataPropertyContextTag]
  
  implicit val encodeRestrictionStructuredDataPropertyContextUUID
  : Encoder[RestrictionStructuredDataPropertyContextUUID]
  = encodeTag[RestrictionStructuredDataPropertyContextTag]
  
  type RestrictionStructuredDataPropertyTupleUUID 
  = String @@ RestrictionStructuredDataPropertyTupleTag
  
  def restrictionStructuredDataPropertyTupleUUID(uuid: String)
  : RestrictionStructuredDataPropertyTupleUUID
  = covariantTag[RestrictionStructuredDataPropertyTupleTag][String](uuid)
  
  implicit val decodeRestrictionStructuredDataPropertyTupleUUID
  : Decoder[RestrictionStructuredDataPropertyTupleUUID]
  = decodeTag[RestrictionStructuredDataPropertyTupleTag]
  
  implicit val encodeRestrictionStructuredDataPropertyTupleUUID
  : Encoder[RestrictionStructuredDataPropertyTupleUUID]
  = encodeTag[RestrictionStructuredDataPropertyTupleTag]
  
  type RootConceptTaxonomyAxiomUUID 
  = String @@ RootConceptTaxonomyAxiomTag
  
  def rootConceptTaxonomyAxiomUUID(uuid: String)
  : RootConceptTaxonomyAxiomUUID
  = covariantTag[RootConceptTaxonomyAxiomTag][String](uuid)
  
  implicit val decodeRootConceptTaxonomyAxiomUUID
  : Decoder[RootConceptTaxonomyAxiomUUID]
  = decodeTag[RootConceptTaxonomyAxiomTag]
  
  implicit val encodeRootConceptTaxonomyAxiomUUID
  : Encoder[RootConceptTaxonomyAxiomUUID]
  = encodeTag[RootConceptTaxonomyAxiomTag]
  
  type RuleUUID 
  = String @@ RuleTag
  
  def ruleUUID(uuid: String)
  : RuleUUID
  = covariantTag[RuleTag][String](uuid)
  
  implicit val decodeRuleUUID
  : Decoder[RuleUUID]
  = decodeTag[RuleTag]
  
  implicit val encodeRuleUUID
  : Encoder[RuleUUID]
  = encodeTag[RuleTag]
  
  type RuleBodySegmentUUID 
  = String @@ RuleBodySegmentTag
  
  def ruleBodySegmentUUID(uuid: String)
  : RuleBodySegmentUUID
  = covariantTag[RuleBodySegmentTag][String](uuid)
  
  implicit val decodeRuleBodySegmentUUID
  : Decoder[RuleBodySegmentUUID]
  = decodeTag[RuleBodySegmentTag]
  
  implicit val encodeRuleBodySegmentUUID
  : Encoder[RuleBodySegmentUUID]
  = encodeTag[RuleBodySegmentTag]
  
  type ScalarUUID 
  = String @@ ScalarTag
  
  def scalarUUID(uuid: String)
  : ScalarUUID
  = covariantTag[ScalarTag][String](uuid)
  
  implicit val decodeScalarUUID
  : Decoder[ScalarUUID]
  = decodeTag[ScalarTag]
  
  implicit val encodeScalarUUID
  : Encoder[ScalarUUID]
  = encodeTag[ScalarTag]
  
  type ScalarDataPropertyUUID 
  = String @@ ScalarDataPropertyTag
  
  def scalarDataPropertyUUID(uuid: String)
  : ScalarDataPropertyUUID
  = covariantTag[ScalarDataPropertyTag][String](uuid)
  
  implicit val decodeScalarDataPropertyUUID
  : Decoder[ScalarDataPropertyUUID]
  = decodeTag[ScalarDataPropertyTag]
  
  implicit val encodeScalarDataPropertyUUID
  : Encoder[ScalarDataPropertyUUID]
  = encodeTag[ScalarDataPropertyTag]
  
  type ScalarDataPropertyValueUUID 
  = String @@ ScalarDataPropertyValueTag
  
  def scalarDataPropertyValueUUID(uuid: String)
  : ScalarDataPropertyValueUUID
  = covariantTag[ScalarDataPropertyValueTag][String](uuid)
  
  implicit val decodeScalarDataPropertyValueUUID
  : Decoder[ScalarDataPropertyValueUUID]
  = decodeTag[ScalarDataPropertyValueTag]
  
  implicit val encodeScalarDataPropertyValueUUID
  : Encoder[ScalarDataPropertyValueUUID]
  = encodeTag[ScalarDataPropertyValueTag]
  
  type ScalarOneOfLiteralAxiomUUID 
  = String @@ ScalarOneOfLiteralAxiomTag
  
  def scalarOneOfLiteralAxiomUUID(uuid: String)
  : ScalarOneOfLiteralAxiomUUID
  = covariantTag[ScalarOneOfLiteralAxiomTag][String](uuid)
  
  implicit val decodeScalarOneOfLiteralAxiomUUID
  : Decoder[ScalarOneOfLiteralAxiomUUID]
  = decodeTag[ScalarOneOfLiteralAxiomTag]
  
  implicit val encodeScalarOneOfLiteralAxiomUUID
  : Encoder[ScalarOneOfLiteralAxiomUUID]
  = encodeTag[ScalarOneOfLiteralAxiomTag]
  
  type ScalarOneOfRestrictionUUID 
  = String @@ ScalarOneOfRestrictionTag
  
  def scalarOneOfRestrictionUUID(uuid: String)
  : ScalarOneOfRestrictionUUID
  = covariantTag[ScalarOneOfRestrictionTag][String](uuid)
  
  implicit val decodeScalarOneOfRestrictionUUID
  : Decoder[ScalarOneOfRestrictionUUID]
  = decodeTag[ScalarOneOfRestrictionTag]
  
  implicit val encodeScalarOneOfRestrictionUUID
  : Encoder[ScalarOneOfRestrictionUUID]
  = encodeTag[ScalarOneOfRestrictionTag]
  
  type SegmentPredicateUUID 
  = String @@ SegmentPredicateTag
  
  def segmentPredicateUUID(uuid: String)
  : SegmentPredicateUUID
  = covariantTag[SegmentPredicateTag][String](uuid)
  
  implicit val decodeSegmentPredicateUUID
  : Decoder[SegmentPredicateUUID]
  = decodeTag[SegmentPredicateTag]
  
  implicit val encodeSegmentPredicateUUID
  : Encoder[SegmentPredicateUUID]
  = encodeTag[SegmentPredicateTag]
  
  type SingletonInstanceScalarDataPropertyValueUUID 
  = String @@ SingletonInstanceScalarDataPropertyValueTag
  
  def singletonInstanceScalarDataPropertyValueUUID(uuid: String)
  : SingletonInstanceScalarDataPropertyValueUUID
  = covariantTag[SingletonInstanceScalarDataPropertyValueTag][String](uuid)
  
  implicit val decodeSingletonInstanceScalarDataPropertyValueUUID
  : Decoder[SingletonInstanceScalarDataPropertyValueUUID]
  = decodeTag[SingletonInstanceScalarDataPropertyValueTag]
  
  implicit val encodeSingletonInstanceScalarDataPropertyValueUUID
  : Encoder[SingletonInstanceScalarDataPropertyValueUUID]
  = encodeTag[SingletonInstanceScalarDataPropertyValueTag]
  
  type SingletonInstanceStructuredDataPropertyContextUUID 
  = String @@ SingletonInstanceStructuredDataPropertyContextTag
  
  def singletonInstanceStructuredDataPropertyContextUUID(uuid: String)
  : SingletonInstanceStructuredDataPropertyContextUUID
  = covariantTag[SingletonInstanceStructuredDataPropertyContextTag][String](uuid)
  
  implicit val decodeSingletonInstanceStructuredDataPropertyContextUUID
  : Decoder[SingletonInstanceStructuredDataPropertyContextUUID]
  = decodeTag[SingletonInstanceStructuredDataPropertyContextTag]
  
  implicit val encodeSingletonInstanceStructuredDataPropertyContextUUID
  : Encoder[SingletonInstanceStructuredDataPropertyContextUUID]
  = encodeTag[SingletonInstanceStructuredDataPropertyContextTag]
  
  type SingletonInstanceStructuredDataPropertyValueUUID 
  = String @@ SingletonInstanceStructuredDataPropertyValueTag
  
  def singletonInstanceStructuredDataPropertyValueUUID(uuid: String)
  : SingletonInstanceStructuredDataPropertyValueUUID
  = covariantTag[SingletonInstanceStructuredDataPropertyValueTag][String](uuid)
  
  implicit val decodeSingletonInstanceStructuredDataPropertyValueUUID
  : Decoder[SingletonInstanceStructuredDataPropertyValueUUID]
  = decodeTag[SingletonInstanceStructuredDataPropertyValueTag]
  
  implicit val encodeSingletonInstanceStructuredDataPropertyValueUUID
  : Encoder[SingletonInstanceStructuredDataPropertyValueUUID]
  = encodeTag[SingletonInstanceStructuredDataPropertyValueTag]
  
  type SpecializationAxiomUUID 
  = String @@ SpecializationAxiomTag
  
  def specializationAxiomUUID(uuid: String)
  : SpecializationAxiomUUID
  = covariantTag[SpecializationAxiomTag][String](uuid)
  
  implicit val decodeSpecializationAxiomUUID
  : Decoder[SpecializationAxiomUUID]
  = decodeTag[SpecializationAxiomTag]
  
  implicit val encodeSpecializationAxiomUUID
  : Encoder[SpecializationAxiomUUID]
  = encodeTag[SpecializationAxiomTag]
  
  type SpecificDisjointConceptAxiomUUID 
  = String @@ SpecificDisjointConceptAxiomTag
  
  def specificDisjointConceptAxiomUUID(uuid: String)
  : SpecificDisjointConceptAxiomUUID
  = covariantTag[SpecificDisjointConceptAxiomTag][String](uuid)
  
  implicit val decodeSpecificDisjointConceptAxiomUUID
  : Decoder[SpecificDisjointConceptAxiomUUID]
  = decodeTag[SpecificDisjointConceptAxiomTag]
  
  implicit val encodeSpecificDisjointConceptAxiomUUID
  : Encoder[SpecificDisjointConceptAxiomUUID]
  = encodeTag[SpecificDisjointConceptAxiomTag]
  
  type StringScalarRestrictionUUID 
  = String @@ StringScalarRestrictionTag
  
  def stringScalarRestrictionUUID(uuid: String)
  : StringScalarRestrictionUUID
  = covariantTag[StringScalarRestrictionTag][String](uuid)
  
  implicit val decodeStringScalarRestrictionUUID
  : Decoder[StringScalarRestrictionUUID]
  = decodeTag[StringScalarRestrictionTag]
  
  implicit val encodeStringScalarRestrictionUUID
  : Encoder[StringScalarRestrictionUUID]
  = encodeTag[StringScalarRestrictionTag]
  
  type StructureUUID 
  = String @@ StructureTag
  
  def structureUUID(uuid: String)
  : StructureUUID
  = covariantTag[StructureTag][String](uuid)
  
  implicit val decodeStructureUUID
  : Decoder[StructureUUID]
  = decodeTag[StructureTag]
  
  implicit val encodeStructureUUID
  : Encoder[StructureUUID]
  = encodeTag[StructureTag]
  
  type StructuredDataPropertyUUID 
  = String @@ StructuredDataPropertyTag
  
  def structuredDataPropertyUUID(uuid: String)
  : StructuredDataPropertyUUID
  = covariantTag[StructuredDataPropertyTag][String](uuid)
  
  implicit val decodeStructuredDataPropertyUUID
  : Decoder[StructuredDataPropertyUUID]
  = decodeTag[StructuredDataPropertyTag]
  
  implicit val encodeStructuredDataPropertyUUID
  : Encoder[StructuredDataPropertyUUID]
  = encodeTag[StructuredDataPropertyTag]
  
  type StructuredDataPropertyTupleUUID 
  = String @@ StructuredDataPropertyTupleTag
  
  def structuredDataPropertyTupleUUID(uuid: String)
  : StructuredDataPropertyTupleUUID
  = covariantTag[StructuredDataPropertyTupleTag][String](uuid)
  
  implicit val decodeStructuredDataPropertyTupleUUID
  : Decoder[StructuredDataPropertyTupleUUID]
  = decodeTag[StructuredDataPropertyTupleTag]
  
  implicit val encodeStructuredDataPropertyTupleUUID
  : Encoder[StructuredDataPropertyTupleUUID]
  = encodeTag[StructuredDataPropertyTupleTag]
  
  type SynonymScalarRestrictionUUID 
  = String @@ SynonymScalarRestrictionTag
  
  def synonymScalarRestrictionUUID(uuid: String)
  : SynonymScalarRestrictionUUID
  = covariantTag[SynonymScalarRestrictionTag][String](uuid)
  
  implicit val decodeSynonymScalarRestrictionUUID
  : Decoder[SynonymScalarRestrictionUUID]
  = decodeTag[SynonymScalarRestrictionTag]
  
  implicit val encodeSynonymScalarRestrictionUUID
  : Encoder[SynonymScalarRestrictionUUID]
  = encodeTag[SynonymScalarRestrictionTag]
  
  type TermUUID 
  = String @@ TermTag
  
  def termUUID(uuid: String)
  : TermUUID
  = covariantTag[TermTag][String](uuid)
  
  implicit val decodeTermUUID
  : Decoder[TermUUID]
  = decodeTag[TermTag]
  
  implicit val encodeTermUUID
  : Encoder[TermUUID]
  = encodeTag[TermTag]
  
  type TermAxiomUUID 
  = String @@ TermAxiomTag
  
  def termAxiomUUID(uuid: String)
  : TermAxiomUUID
  = covariantTag[TermAxiomTag][String](uuid)
  
  implicit val decodeTermAxiomUUID
  : Decoder[TermAxiomUUID]
  = decodeTag[TermAxiomTag]
  
  implicit val encodeTermAxiomUUID
  : Encoder[TermAxiomUUID]
  = encodeTag[TermAxiomTag]
  
  type TerminologyAxiomUUID 
  = String @@ TerminologyAxiomTag
  
  def terminologyAxiomUUID(uuid: String)
  : TerminologyAxiomUUID
  = covariantTag[TerminologyAxiomTag][String](uuid)
  
  implicit val decodeTerminologyAxiomUUID
  : Decoder[TerminologyAxiomUUID]
  = decodeTag[TerminologyAxiomTag]
  
  implicit val encodeTerminologyAxiomUUID
  : Encoder[TerminologyAxiomUUID]
  = encodeTag[TerminologyAxiomTag]
  
  type TerminologyBoxUUID 
  = String @@ TerminologyBoxTag
  
  def terminologyBoxUUID(uuid: String)
  : TerminologyBoxUUID
  = covariantTag[TerminologyBoxTag][String](uuid)
  
  implicit val decodeTerminologyBoxUUID
  : Decoder[TerminologyBoxUUID]
  = decodeTag[TerminologyBoxTag]
  
  implicit val encodeTerminologyBoxUUID
  : Encoder[TerminologyBoxUUID]
  = encodeTag[TerminologyBoxTag]
  
  type TerminologyBoxAxiomUUID 
  = String @@ TerminologyBoxAxiomTag
  
  def terminologyBoxAxiomUUID(uuid: String)
  : TerminologyBoxAxiomUUID
  = covariantTag[TerminologyBoxAxiomTag][String](uuid)
  
  implicit val decodeTerminologyBoxAxiomUUID
  : Decoder[TerminologyBoxAxiomUUID]
  = decodeTag[TerminologyBoxAxiomTag]
  
  implicit val encodeTerminologyBoxAxiomUUID
  : Encoder[TerminologyBoxAxiomUUID]
  = encodeTag[TerminologyBoxAxiomTag]
  
  type TerminologyBoxStatementUUID 
  = String @@ TerminologyBoxStatementTag
  
  def terminologyBoxStatementUUID(uuid: String)
  : TerminologyBoxStatementUUID
  = covariantTag[TerminologyBoxStatementTag][String](uuid)
  
  implicit val decodeTerminologyBoxStatementUUID
  : Decoder[TerminologyBoxStatementUUID]
  = decodeTag[TerminologyBoxStatementTag]
  
  implicit val encodeTerminologyBoxStatementUUID
  : Encoder[TerminologyBoxStatementUUID]
  = encodeTag[TerminologyBoxStatementTag]
  
  type TerminologyBundleAxiomUUID 
  = String @@ TerminologyBundleAxiomTag
  
  def terminologyBundleAxiomUUID(uuid: String)
  : TerminologyBundleAxiomUUID
  = covariantTag[TerminologyBundleAxiomTag][String](uuid)
  
  implicit val decodeTerminologyBundleAxiomUUID
  : Decoder[TerminologyBundleAxiomUUID]
  = decodeTag[TerminologyBundleAxiomTag]
  
  implicit val encodeTerminologyBundleAxiomUUID
  : Encoder[TerminologyBundleAxiomUUID]
  = encodeTag[TerminologyBundleAxiomTag]
  
  type TerminologyBundleStatementUUID 
  = String @@ TerminologyBundleStatementTag
  
  def terminologyBundleStatementUUID(uuid: String)
  : TerminologyBundleStatementUUID
  = covariantTag[TerminologyBundleStatementTag][String](uuid)
  
  implicit val decodeTerminologyBundleStatementUUID
  : Decoder[TerminologyBundleStatementUUID]
  = decodeTag[TerminologyBundleStatementTag]
  
  implicit val encodeTerminologyBundleStatementUUID
  : Encoder[TerminologyBundleStatementUUID]
  = encodeTag[TerminologyBundleStatementTag]
  
  type TerminologyExtensionAxiomUUID 
  = String @@ TerminologyExtensionAxiomTag
  
  def terminologyExtensionAxiomUUID(uuid: String)
  : TerminologyExtensionAxiomUUID
  = covariantTag[TerminologyExtensionAxiomTag][String](uuid)
  
  implicit val decodeTerminologyExtensionAxiomUUID
  : Decoder[TerminologyExtensionAxiomUUID]
  = decodeTag[TerminologyExtensionAxiomTag]
  
  implicit val encodeTerminologyExtensionAxiomUUID
  : Encoder[TerminologyExtensionAxiomUUID]
  = encodeTag[TerminologyExtensionAxiomTag]
  
  type TerminologyGraphUUID 
  = String @@ TerminologyGraphTag
  
  def terminologyGraphUUID(uuid: String)
  : TerminologyGraphUUID
  = covariantTag[TerminologyGraphTag][String](uuid)
  
  implicit val decodeTerminologyGraphUUID
  : Decoder[TerminologyGraphUUID]
  = decodeTag[TerminologyGraphTag]
  
  implicit val encodeTerminologyGraphUUID
  : Encoder[TerminologyGraphUUID]
  = encodeTag[TerminologyGraphTag]
  
  type TerminologyInstanceAssertionUUID 
  = String @@ TerminologyInstanceAssertionTag
  
  def terminologyInstanceAssertionUUID(uuid: String)
  : TerminologyInstanceAssertionUUID
  = covariantTag[TerminologyInstanceAssertionTag][String](uuid)
  
  implicit val decodeTerminologyInstanceAssertionUUID
  : Decoder[TerminologyInstanceAssertionUUID]
  = decodeTag[TerminologyInstanceAssertionTag]
  
  implicit val encodeTerminologyInstanceAssertionUUID
  : Encoder[TerminologyInstanceAssertionUUID]
  = encodeTag[TerminologyInstanceAssertionTag]
  
  type TerminologyNestingAxiomUUID 
  = String @@ TerminologyNestingAxiomTag
  
  def terminologyNestingAxiomUUID(uuid: String)
  : TerminologyNestingAxiomUUID
  = covariantTag[TerminologyNestingAxiomTag][String](uuid)
  
  implicit val decodeTerminologyNestingAxiomUUID
  : Decoder[TerminologyNestingAxiomUUID]
  = decodeTag[TerminologyNestingAxiomTag]
  
  implicit val encodeTerminologyNestingAxiomUUID
  : Encoder[TerminologyNestingAxiomUUID]
  = encodeTag[TerminologyNestingAxiomTag]
  
  type TimeScalarRestrictionUUID 
  = String @@ TimeScalarRestrictionTag
  
  def timeScalarRestrictionUUID(uuid: String)
  : TimeScalarRestrictionUUID
  = covariantTag[TimeScalarRestrictionTag][String](uuid)
  
  implicit val decodeTimeScalarRestrictionUUID
  : Decoder[TimeScalarRestrictionUUID]
  = decodeTag[TimeScalarRestrictionTag]
  
  implicit val encodeTimeScalarRestrictionUUID
  : Encoder[TimeScalarRestrictionUUID]
  = encodeTag[TimeScalarRestrictionTag]
  
  type UnarySegmentPredicateUUID 
  = String @@ UnarySegmentPredicateTag
  
  def unarySegmentPredicateUUID(uuid: String)
  : UnarySegmentPredicateUUID
  = covariantTag[UnarySegmentPredicateTag][String](uuid)
  
  implicit val decodeUnarySegmentPredicateUUID
  : Decoder[UnarySegmentPredicateUUID]
  = decodeTag[UnarySegmentPredicateTag]
  
  implicit val encodeUnarySegmentPredicateUUID
  : Encoder[UnarySegmentPredicateUUID]
  = encodeTag[UnarySegmentPredicateTag]
  
  type UnaryTermKindUUID 
  = String @@ UnaryTermKindTag
  
  def unaryTermKindUUID(uuid: String)
  : UnaryTermKindUUID
  = covariantTag[UnaryTermKindTag][String](uuid)
  
  implicit val decodeUnaryTermKindUUID
  : Decoder[UnaryTermKindUUID]
  = decodeTag[UnaryTermKindTag]
  
  implicit val encodeUnaryTermKindUUID
  : Encoder[UnaryTermKindUUID]
  = encodeTag[UnaryTermKindTag]
  
  type UnreifiedRelationshipUUID 
  = String @@ UnreifiedRelationshipTag
  
  def unreifiedRelationshipUUID(uuid: String)
  : UnreifiedRelationshipUUID
  = covariantTag[UnreifiedRelationshipTag][String](uuid)
  
  implicit val decodeUnreifiedRelationshipUUID
  : Decoder[UnreifiedRelationshipUUID]
  = decodeTag[UnreifiedRelationshipTag]
  
  implicit val encodeUnreifiedRelationshipUUID
  : Encoder[UnreifiedRelationshipUUID]
  = encodeTag[UnreifiedRelationshipTag]
  
  type UnreifiedRelationshipInstanceTupleUUID 
  = String @@ UnreifiedRelationshipInstanceTupleTag
  
  def unreifiedRelationshipInstanceTupleUUID(uuid: String)
  : UnreifiedRelationshipInstanceTupleUUID
  = covariantTag[UnreifiedRelationshipInstanceTupleTag][String](uuid)
  
  implicit val decodeUnreifiedRelationshipInstanceTupleUUID
  : Decoder[UnreifiedRelationshipInstanceTupleUUID]
  = decodeTag[UnreifiedRelationshipInstanceTupleTag]
  
  implicit val encodeUnreifiedRelationshipInstanceTupleUUID
  : Encoder[UnreifiedRelationshipInstanceTupleUUID]
  = encodeTag[UnreifiedRelationshipInstanceTupleTag]
  
  type UnreifiedRelationshipInversePropertyPredicateUUID 
  = String @@ UnreifiedRelationshipInversePropertyPredicateTag
  
  def unreifiedRelationshipInversePropertyPredicateUUID(uuid: String)
  : UnreifiedRelationshipInversePropertyPredicateUUID
  = covariantTag[UnreifiedRelationshipInversePropertyPredicateTag][String](uuid)
  
  implicit val decodeUnreifiedRelationshipInversePropertyPredicateUUID
  : Decoder[UnreifiedRelationshipInversePropertyPredicateUUID]
  = decodeTag[UnreifiedRelationshipInversePropertyPredicateTag]
  
  implicit val encodeUnreifiedRelationshipInversePropertyPredicateUUID
  : Encoder[UnreifiedRelationshipInversePropertyPredicateUUID]
  = encodeTag[UnreifiedRelationshipInversePropertyPredicateTag]
  
  type UnreifiedRelationshipPropertyPredicateUUID 
  = String @@ UnreifiedRelationshipPropertyPredicateTag
  
  def unreifiedRelationshipPropertyPredicateUUID(uuid: String)
  : UnreifiedRelationshipPropertyPredicateUUID
  = covariantTag[UnreifiedRelationshipPropertyPredicateTag][String](uuid)
  
  implicit val decodeUnreifiedRelationshipPropertyPredicateUUID
  : Decoder[UnreifiedRelationshipPropertyPredicateUUID]
  = decodeTag[UnreifiedRelationshipPropertyPredicateTag]
  
  implicit val encodeUnreifiedRelationshipPropertyPredicateUUID
  : Encoder[UnreifiedRelationshipPropertyPredicateUUID]
  = encodeTag[UnreifiedRelationshipPropertyPredicateTag]
  
}