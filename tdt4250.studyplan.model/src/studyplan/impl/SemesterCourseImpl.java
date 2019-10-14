/**
 */
package studyplan.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import studyplan.Course;
import studyplan.CourseStatus;
import studyplan.SemesterCourse;
import studyplan.StudyplanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyplan.impl.SemesterCourseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link studyplan.impl.SemesterCourseImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterCourseImpl extends MinimalEObjectImpl.Container implements SemesterCourse {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CourseStatus STATUS_EDEFAULT = CourseStatus.MANDATORY;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CourseStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterCourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplanPackage.Literals.SEMESTER_COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CourseStatus newStatus) {
		CourseStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER_COURSE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourse(Course newCourse, NotificationChain msgs) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER_COURSE__COURSE, oldCourse, newCourse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		if (newCourse != course) {
			NotificationChain msgs = null;
			if (course != null)
				msgs = ((InternalEObject)course).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.SEMESTER_COURSE__COURSE, null, msgs);
			if (newCourse != null)
				msgs = ((InternalEObject)newCourse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.SEMESTER_COURSE__COURSE, null, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER_COURSE__COURSE, newCourse, newCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER_COURSE__COURSE:
				return basicSetCourse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER_COURSE__STATUS:
				return getStatus();
			case StudyplanPackage.SEMESTER_COURSE__COURSE:
				return getCourse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER_COURSE__STATUS:
				setStatus((CourseStatus)newValue);
				return;
			case StudyplanPackage.SEMESTER_COURSE__COURSE:
				setCourse((Course)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER_COURSE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case StudyplanPackage.SEMESTER_COURSE__COURSE:
				setCourse((Course)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER_COURSE__STATUS:
				return status != STATUS_EDEFAULT;
			case StudyplanPackage.SEMESTER_COURSE__COURSE:
				return course != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //SemesterCourseImpl
