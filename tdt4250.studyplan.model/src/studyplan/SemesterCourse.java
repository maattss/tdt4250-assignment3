/**
 */
package studyplan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.SemesterCourse#getStatus <em>Status</em>}</li>
 *   <li>{@link studyplan.SemesterCourse#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getSemesterCourse()
 * @model
 * @generated
 */
public interface SemesterCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link studyplan.CourseStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see studyplan.CourseStatus
	 * @see #setStatus(CourseStatus)
	 * @see studyplan.StudyplanPackage#getSemesterCourse_Status()
	 * @model
	 * @generated
	 */
	CourseStatus getStatus();

	/**
	 * Sets the value of the '{@link studyplan.SemesterCourse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see studyplan.CourseStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CourseStatus value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference.
	 * @see #setCourse(Course)
	 * @see studyplan.StudyplanPackage#getSemesterCourse_Course()
	 * @model containment="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link studyplan.SemesterCourse#getCourse <em>Course</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' containment reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // SemesterCourse
