/**
 */
package core.impl;

import core.APIKeyLocation;
import core.CorePackage;
import core.OAuth2FlowType;
import core.Scope;
import core.SecuritySchema;
import core.SecuritySchemeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.SecuritySchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link core.impl.SecuritySchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link core.impl.SecuritySchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link core.impl.SecuritySchemaImpl#getIn <em>In</em>}</li>
 *   <li>{@link core.impl.SecuritySchemaImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link core.impl.SecuritySchemaImpl#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link core.impl.SecuritySchemaImpl#getTokenUrl <em>Token Url</em>}</li>
 *   <li>{@link core.impl.SecuritySchemaImpl#getGlobalName <em>Global Name</em>}</li>
 *   <li>{@link core.impl.SecuritySchemaImpl#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecuritySchemaImpl extends MinimalEObjectImpl.Container implements SecuritySchema {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SecuritySchemeType TYPE_EDEFAULT = SecuritySchemeType.BASIC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SecuritySchemeType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected static final APIKeyLocation IN_EDEFAULT = APIKeyLocation.QUERY;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected APIKeyLocation in = IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected static final OAuth2FlowType FLOW_EDEFAULT = OAuth2FlowType.IMPLICIT;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected OAuth2FlowType flow = FLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorizationUrl() <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZATION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorizationUrl() <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationUrl()
	 * @generated
	 * @ordered
	 */
	protected String authorizationUrl = AUTHORIZATION_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenUrl() <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenUrl() <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenUrl()
	 * @generated
	 * @ordered
	 */
	protected String tokenUrl = TOKEN_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlobalName() <em>Global Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalName()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalName() <em>Global Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalName()
	 * @generated
	 * @ordered
	 */
	protected String globalName = GLOBAL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<Scope> scopes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SECURITY_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySchemeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SecuritySchemeType newType) {
		SecuritySchemeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_SCHEMA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_SCHEMA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_SCHEMA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIKeyLocation getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(APIKeyLocation newIn) {
		APIKeyLocation oldIn = in;
		in = newIn == null ? IN_EDEFAULT : newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_SCHEMA__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuth2FlowType getFlow() {
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlow(OAuth2FlowType newFlow) {
		OAuth2FlowType oldFlow = flow;
		flow = newFlow == null ? FLOW_EDEFAULT : newFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_SCHEMA__FLOW, oldFlow, flow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorizationUrl() {
		return authorizationUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorizationUrl(String newAuthorizationUrl) {
		String oldAuthorizationUrl = authorizationUrl;
		authorizationUrl = newAuthorizationUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_SCHEMA__AUTHORIZATION_URL, oldAuthorizationUrl, authorizationUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokenUrl() {
		return tokenUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenUrl(String newTokenUrl) {
		String oldTokenUrl = tokenUrl;
		tokenUrl = newTokenUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_SCHEMA__TOKEN_URL, oldTokenUrl, tokenUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalName() {
		return globalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalName(String newGlobalName) {
		String oldGlobalName = globalName;
		globalName = newGlobalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_SCHEMA__GLOBAL_NAME, oldGlobalName, globalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scope> getScopes() {
		if (scopes == null) {
			scopes = new EObjectContainmentEList<Scope>(Scope.class, this, CorePackage.SECURITY_SCHEMA__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SECURITY_SCHEMA__SCOPES:
				return ((InternalEList<?>)getScopes()).basicRemove(otherEnd, msgs);
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
			case CorePackage.SECURITY_SCHEMA__TYPE:
				return getType();
			case CorePackage.SECURITY_SCHEMA__DESCRIPTION:
				return getDescription();
			case CorePackage.SECURITY_SCHEMA__NAME:
				return getName();
			case CorePackage.SECURITY_SCHEMA__IN:
				return getIn();
			case CorePackage.SECURITY_SCHEMA__FLOW:
				return getFlow();
			case CorePackage.SECURITY_SCHEMA__AUTHORIZATION_URL:
				return getAuthorizationUrl();
			case CorePackage.SECURITY_SCHEMA__TOKEN_URL:
				return getTokenUrl();
			case CorePackage.SECURITY_SCHEMA__GLOBAL_NAME:
				return getGlobalName();
			case CorePackage.SECURITY_SCHEMA__SCOPES:
				return getScopes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.SECURITY_SCHEMA__TYPE:
				setType((SecuritySchemeType)newValue);
				return;
			case CorePackage.SECURITY_SCHEMA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.SECURITY_SCHEMA__NAME:
				setName((String)newValue);
				return;
			case CorePackage.SECURITY_SCHEMA__IN:
				setIn((APIKeyLocation)newValue);
				return;
			case CorePackage.SECURITY_SCHEMA__FLOW:
				setFlow((OAuth2FlowType)newValue);
				return;
			case CorePackage.SECURITY_SCHEMA__AUTHORIZATION_URL:
				setAuthorizationUrl((String)newValue);
				return;
			case CorePackage.SECURITY_SCHEMA__TOKEN_URL:
				setTokenUrl((String)newValue);
				return;
			case CorePackage.SECURITY_SCHEMA__GLOBAL_NAME:
				setGlobalName((String)newValue);
				return;
			case CorePackage.SECURITY_SCHEMA__SCOPES:
				getScopes().clear();
				getScopes().addAll((Collection<? extends Scope>)newValue);
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
			case CorePackage.SECURITY_SCHEMA__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CorePackage.SECURITY_SCHEMA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.SECURITY_SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.SECURITY_SCHEMA__IN:
				setIn(IN_EDEFAULT);
				return;
			case CorePackage.SECURITY_SCHEMA__FLOW:
				setFlow(FLOW_EDEFAULT);
				return;
			case CorePackage.SECURITY_SCHEMA__AUTHORIZATION_URL:
				setAuthorizationUrl(AUTHORIZATION_URL_EDEFAULT);
				return;
			case CorePackage.SECURITY_SCHEMA__TOKEN_URL:
				setTokenUrl(TOKEN_URL_EDEFAULT);
				return;
			case CorePackage.SECURITY_SCHEMA__GLOBAL_NAME:
				setGlobalName(GLOBAL_NAME_EDEFAULT);
				return;
			case CorePackage.SECURITY_SCHEMA__SCOPES:
				getScopes().clear();
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
			case CorePackage.SECURITY_SCHEMA__TYPE:
				return type != TYPE_EDEFAULT;
			case CorePackage.SECURITY_SCHEMA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.SECURITY_SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.SECURITY_SCHEMA__IN:
				return in != IN_EDEFAULT;
			case CorePackage.SECURITY_SCHEMA__FLOW:
				return flow != FLOW_EDEFAULT;
			case CorePackage.SECURITY_SCHEMA__AUTHORIZATION_URL:
				return AUTHORIZATION_URL_EDEFAULT == null ? authorizationUrl != null : !AUTHORIZATION_URL_EDEFAULT.equals(authorizationUrl);
			case CorePackage.SECURITY_SCHEMA__TOKEN_URL:
				return TOKEN_URL_EDEFAULT == null ? tokenUrl != null : !TOKEN_URL_EDEFAULT.equals(tokenUrl);
			case CorePackage.SECURITY_SCHEMA__GLOBAL_NAME:
				return GLOBAL_NAME_EDEFAULT == null ? globalName != null : !GLOBAL_NAME_EDEFAULT.equals(globalName);
			case CorePackage.SECURITY_SCHEMA__SCOPES:
				return scopes != null && !scopes.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", in: ");
		result.append(in);
		result.append(", flow: ");
		result.append(flow);
		result.append(", authorizationUrl: ");
		result.append(authorizationUrl);
		result.append(", tokenUrl: ");
		result.append(tokenUrl);
		result.append(", globalName: ");
		result.append(globalName);
		result.append(')');
		return result.toString();
	}

} //SecuritySchemaImpl
