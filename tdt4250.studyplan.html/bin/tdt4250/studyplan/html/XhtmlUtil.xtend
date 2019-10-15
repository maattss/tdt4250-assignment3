package tdt4250.studyplan.html

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.util.FeatureMap
import org.eclipse.emf.ecore.util.FeatureMapUtil
import org.w3c.xhtml1.Xhtml1Package

class XhtmlUtil {

	def tag(String tagName) {
		val typeName = tagName + "Type"
		for (eClass : Xhtml1Package.eINSTANCE.EClassifiers.filter(EClass)) {
			val className = eClass.name
			if (className.equalsIgnoreCase(tagName) || className.equalsIgnoreCase(typeName)) {
				return eClass
			}
		}
	}

	def create(EClass tag) {
		EcoreUtil.create(tag)
	}

	def create(String tagName) {
		val tag = tag(tagName)
		if (tag !== null) {
			create(tag)
		}
	}

	def attr(EObject eObject, String attrName) {
		eObject.eClass.EAllStructuralFeatures.findFirst[name == attrName]
	}

	def operator_add(EObject eObject, Pair<String, String> attr) {
		val feature = attr(eObject, attr.key)
		if (feature !== null) {
			val featureType = feature.EType as EDataType
			val value = featureType.EPackage.EFactoryInstance.createFromString(featureType, attr.value)
			if (feature.many) {
//				(eObject.eGet(feature) as EList<?>).add(value)
			} else {
				eObject.eSet(feature, value)	
			}
		}
	}

	def featureMap(EObject featureMapOwner) {
		for (feature : featureMapOwner.eClass.EAllStructuralFeatures) {
			if (feature.EType == EcorePackage.eINSTANCE.EFeatureMapEntry) {
				return featureMapOwner.eGet(feature) as FeatureMap
			}
		}
	}

	def operator_add(EObject featureMapOwner, EObject eObject) {
		val featureMap = featureMap(featureMapOwner)
		if (featureMap !== null) {
			for (feature : featureMapOwner.eClass.EAllStructuralFeatures) {
				if (feature.EType.isInstance(eObject)) {
					featureMap.add(feature, eObject)
					return featureMapOwner
				}
			}
			System.err.println("Didn't find feature for " + eObject.eClass.name + " in " + featureMapOwner.eClass.name)
		}
		featureMapOwner
	}

	def operator_add(EObject featureMapOwner, Iterable<? extends EObject> eObjects) {
		for (eObject : eObjects) {
			featureMapOwner += eObject
		}
		featureMapOwner
	}

	def operator_add(FeatureMap featureMap, CharSequence text) {
		if (featureMap !== null) {
			FeatureMapUtil.addText(featureMap, if (text !== null) text.toString else "")
		}
		featureMap
	}

	def operator_add(EObject featureMapOwner, CharSequence text) {
		val featureMap = featureMap(featureMapOwner)
		if (featureMap !== null) {
			featureMap += text
		}
		featureMapOwner
	}
	
	def StringBuilder operator_doubleLessThan(StringBuilder stringBuilder, Object o) {
		return stringBuilder.append(o);
	}
}