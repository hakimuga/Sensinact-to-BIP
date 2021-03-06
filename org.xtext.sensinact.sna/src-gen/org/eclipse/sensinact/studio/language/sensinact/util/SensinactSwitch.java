/**
 */
package org.eclipse.sensinact.studio.language.sensinact.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.sensinact.studio.language.sensinact.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage
 * @generated
 */
public class SensinactSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SensinactPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensinactSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SensinactPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SensinactPackage.SENSINACT:
      {
        Sensinact sensinact = (Sensinact)theEObject;
        T result = caseSensinact(sensinact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_SENSINACT:
      {
        DSL_SENSINACT dsL_SENSINACT = (DSL_SENSINACT)theEObject;
        T result = caseDSL_SENSINACT(dsL_SENSINACT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CLOCK_STOCHASTIC:
      {
        DSL_CLOCK_STOCHASTIC dsL_CLOCK_STOCHASTIC = (DSL_CLOCK_STOCHASTIC)theEObject;
        T result = caseDSL_CLOCK_STOCHASTIC(dsL_CLOCK_STOCHASTIC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_FLAG_AUTOSTART:
      {
        DSL_FLAG_AUTOSTART dsL_FLAG_AUTOSTART = (DSL_FLAG_AUTOSTART)theEObject;
        T result = caseDSL_FLAG_AUTOSTART(dsL_FLAG_AUTOSTART);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_RESOURCE:
      {
        DSL_Resource dsL_Resource = (DSL_Resource)theEObject;
        T result = caseDSL_Resource(dsL_Resource);
        if (result == null) result = caseDSL_REF(dsL_Resource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_ON:
      {
        DSL_On dsL_On = (DSL_On)theEObject;
        T result = caseDSL_On(dsL_On);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_ECA_STATEMENT:
      {
        DSL_ECA_STATEMENT dsL_ECA_STATEMENT = (DSL_ECA_STATEMENT)theEObject;
        T result = caseDSL_ECA_STATEMENT(dsL_ECA_STATEMENT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_IF_DO:
      {
        DSL_IfDo dsL_IfDo = (DSL_IfDo)theEObject;
        T result = caseDSL_IfDo(dsL_IfDo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_ELSE_IF_DO:
      {
        DSL_ElseIfDo dsL_ElseIfDo = (DSL_ElseIfDo)theEObject;
        T result = caseDSL_ElseIfDo(dsL_ElseIfDo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_ELSE_DO:
      {
        DSL_ElseDo dsL_ElseDo = (DSL_ElseDo)theEObject;
        T result = caseDSL_ElseDo(dsL_ElseDo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_REF:
      {
        DSL_REF dsL_REF = (DSL_REF)theEObject;
        T result = caseDSL_REF(dsL_REF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_REF_CONDITION:
      {
        DSL_REF_CONDITION dsL_REF_CONDITION = (DSL_REF_CONDITION)theEObject;
        T result = caseDSL_REF_CONDITION(dsL_REF_CONDITION);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CEP_STATEMENT:
      {
        DSL_CEP_STATEMENT dsL_CEP_STATEMENT = (DSL_CEP_STATEMENT)theEObject;
        T result = caseDSL_CEP_STATEMENT(dsL_CEP_STATEMENT);
        if (result == null) result = caseDSL_REF(dsL_CEP_STATEMENT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CEP_AFTER:
      {
        DSL_CEP_AFTER dsL_CEP_AFTER = (DSL_CEP_AFTER)theEObject;
        T result = caseDSL_CEP_AFTER(dsL_CEP_AFTER);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CEP_BEFORE:
      {
        DSL_CEP_BEFORE dsL_CEP_BEFORE = (DSL_CEP_BEFORE)theEObject;
        T result = caseDSL_CEP_BEFORE(dsL_CEP_BEFORE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CEP_COINCIDE:
      {
        DSL_CEP_COINCIDE dsL_CEP_COINCIDE = (DSL_CEP_COINCIDE)theEObject;
        T result = caseDSL_CEP_COINCIDE(dsL_CEP_COINCIDE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CEP_MIN:
      {
        DSL_CEP_MIN dsL_CEP_MIN = (DSL_CEP_MIN)theEObject;
        T result = caseDSL_CEP_MIN(dsL_CEP_MIN);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CEP_MAX:
      {
        DSL_CEP_MAX dsL_CEP_MAX = (DSL_CEP_MAX)theEObject;
        T result = caseDSL_CEP_MAX(dsL_CEP_MAX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CEP_AVG:
      {
        DSL_CEP_AVG dsL_CEP_AVG = (DSL_CEP_AVG)theEObject;
        T result = caseDSL_CEP_AVG(dsL_CEP_AVG);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CEP_SUM:
      {
        DSL_CEP_SUM dsL_CEP_SUM = (DSL_CEP_SUM)theEObject;
        T result = caseDSL_CEP_SUM(dsL_CEP_SUM);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CEP_COUNT:
      {
        DSL_CEP_COUNT dsL_CEP_COUNT = (DSL_CEP_COUNT)theEObject;
        T result = caseDSL_CEP_COUNT(dsL_CEP_COUNT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CEP_DURATION:
      {
        DSL_CEP_DURATION dsL_CEP_DURATION = (DSL_CEP_DURATION)theEObject;
        T result = caseDSL_CEP_DURATION(dsL_CEP_DURATION);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CEP_DURATION_MIN:
      {
        DSL_CEP_DURATION_MIN dsL_CEP_DURATION_MIN = (DSL_CEP_DURATION_MIN)theEObject;
        T result = caseDSL_CEP_DURATION_MIN(dsL_CEP_DURATION_MIN);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_CEP_DURATION_SEC:
      {
        DSL_CEP_DURATION_SEC dsL_CEP_DURATION_SEC = (DSL_CEP_DURATION_SEC)theEObject;
        T result = caseDSL_CEP_DURATION_SEC(dsL_CEP_DURATION_SEC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_LIST_ACTIONS:
      {
        DSL_ListActions dsL_ListActions = (DSL_ListActions)theEObject;
        T result = caseDSL_ListActions(dsL_ListActions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_RESOURCE_ACTION:
      {
        DSL_ResourceAction dsL_ResourceAction = (DSL_ResourceAction)theEObject;
        T result = caseDSL_ResourceAction(dsL_ResourceAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_LIST_PARAM:
      {
        DSL_ListParam dsL_ListParam = (DSL_ListParam)theEObject;
        T result = caseDSL_ListParam(dsL_ListParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION:
      {
        DSL_Expression dsL_Expression = (DSL_Expression)theEObject;
        T result = caseDSL_Expression(dsL_Expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_OR:
      {
        DSL_Expression_Or dsL_Expression_Or = (DSL_Expression_Or)theEObject;
        T result = caseDSL_Expression_Or(dsL_Expression_Or);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_AND:
      {
        DSL_Expression_And dsL_Expression_And = (DSL_Expression_And)theEObject;
        T result = caseDSL_Expression_And(dsL_Expression_And);
        if (result == null) result = caseDSL_Expression(dsL_Expression_And);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_DIFF:
      {
        DSL_Expression_Diff dsL_Expression_Diff = (DSL_Expression_Diff)theEObject;
        T result = caseDSL_Expression_Diff(dsL_Expression_Diff);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Diff);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_EQUAL:
      {
        DSL_Expression_Equal dsL_Expression_Equal = (DSL_Expression_Equal)theEObject;
        T result = caseDSL_Expression_Equal(dsL_Expression_Equal);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Equal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_LARGER:
      {
        DSL_Expression_Larger dsL_Expression_Larger = (DSL_Expression_Larger)theEObject;
        T result = caseDSL_Expression_Larger(dsL_Expression_Larger);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Larger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_LARGER_EQUAL:
      {
        DSL_Expression_Larger_Equal dsL_Expression_Larger_Equal = (DSL_Expression_Larger_Equal)theEObject;
        T result = caseDSL_Expression_Larger_Equal(dsL_Expression_Larger_Equal);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Larger_Equal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_SMALLER:
      {
        DSL_Expression_Smaller dsL_Expression_Smaller = (DSL_Expression_Smaller)theEObject;
        T result = caseDSL_Expression_Smaller(dsL_Expression_Smaller);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Smaller);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_SMALLER_EQUAL:
      {
        DSL_Expression_Smaller_Equal dsL_Expression_Smaller_Equal = (DSL_Expression_Smaller_Equal)theEObject;
        T result = caseDSL_Expression_Smaller_Equal(dsL_Expression_Smaller_Equal);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Smaller_Equal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_PLUS:
      {
        DSL_Expression_Plus dsL_Expression_Plus = (DSL_Expression_Plus)theEObject;
        T result = caseDSL_Expression_Plus(dsL_Expression_Plus);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_MINUS:
      {
        DSL_Expression_Minus dsL_Expression_Minus = (DSL_Expression_Minus)theEObject;
        T result = caseDSL_Expression_Minus(dsL_Expression_Minus);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_MULTIPLICATION:
      {
        DSL_Expression_Multiplication dsL_Expression_Multiplication = (DSL_Expression_Multiplication)theEObject;
        T result = caseDSL_Expression_Multiplication(dsL_Expression_Multiplication);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_DIVISION:
      {
        DSL_Expression_Division dsL_Expression_Division = (DSL_Expression_Division)theEObject;
        T result = caseDSL_Expression_Division(dsL_Expression_Division);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Division);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_MODULO:
      {
        DSL_Expression_Modulo dsL_Expression_Modulo = (DSL_Expression_Modulo)theEObject;
        T result = caseDSL_Expression_Modulo(dsL_Expression_Modulo);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Modulo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_OBJECT_NUMBER:
      {
        DSL_Object_Number dsL_Object_Number = (DSL_Object_Number)theEObject;
        T result = caseDSL_Object_Number(dsL_Object_Number);
        if (result == null) result = caseDSL_Expression(dsL_Object_Number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_OBJECT_STRING:
      {
        DSL_Object_String dsL_Object_String = (DSL_Object_String)theEObject;
        T result = caseDSL_Object_String(dsL_Object_String);
        if (result == null) result = caseDSL_Expression(dsL_Object_String);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_OBJECT_BOOLEAN:
      {
        DSL_Object_Boolean dsL_Object_Boolean = (DSL_Object_Boolean)theEObject;
        T result = caseDSL_Object_Boolean(dsL_Object_Boolean);
        if (result == null) result = caseDSL_Expression(dsL_Object_Boolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_OBJECT_REF:
      {
        DSL_Object_Ref dsL_Object_Ref = (DSL_Object_Ref)theEObject;
        T result = caseDSL_Object_Ref(dsL_Object_Ref);
        if (result == null) result = caseDSL_Expression(dsL_Object_Ref);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SensinactPackage.DSL_EXPRESSION_NEGATE:
      {
        DSL_Expression_Negate dsL_Expression_Negate = (DSL_Expression_Negate)theEObject;
        T result = caseDSL_Expression_Negate(dsL_Expression_Negate);
        if (result == null) result = caseDSL_Expression(dsL_Expression_Negate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensinact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensinact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensinact(Sensinact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL SENSINACT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL SENSINACT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_SENSINACT(DSL_SENSINACT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CLOCK STOCHASTIC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CLOCK STOCHASTIC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CLOCK_STOCHASTIC(DSL_CLOCK_STOCHASTIC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL FLAG AUTOSTART</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL FLAG AUTOSTART</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_FLAG_AUTOSTART(DSL_FLAG_AUTOSTART object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Resource(DSL_Resource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL On</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL On</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_On(DSL_On object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL ECA STATEMENT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL ECA STATEMENT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_ECA_STATEMENT(DSL_ECA_STATEMENT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL If Do</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL If Do</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_IfDo(DSL_IfDo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Else If Do</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Else If Do</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_ElseIfDo(DSL_ElseIfDo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Else Do</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Else Do</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_ElseDo(DSL_ElseDo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL REF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL REF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_REF(DSL_REF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL REF CONDITION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL REF CONDITION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_REF_CONDITION(DSL_REF_CONDITION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CEP STATEMENT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CEP STATEMENT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CEP_STATEMENT(DSL_CEP_STATEMENT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CEP AFTER</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CEP AFTER</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CEP_AFTER(DSL_CEP_AFTER object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CEP BEFORE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CEP BEFORE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CEP_BEFORE(DSL_CEP_BEFORE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CEP COINCIDE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CEP COINCIDE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CEP_COINCIDE(DSL_CEP_COINCIDE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CEP MIN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CEP MIN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CEP_MIN(DSL_CEP_MIN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CEP MAX</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CEP MAX</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CEP_MAX(DSL_CEP_MAX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CEP AVG</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CEP AVG</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CEP_AVG(DSL_CEP_AVG object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CEP SUM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CEP SUM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CEP_SUM(DSL_CEP_SUM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CEP COUNT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CEP COUNT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CEP_COUNT(DSL_CEP_COUNT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CEP DURATION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CEP DURATION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CEP_DURATION(DSL_CEP_DURATION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CEP DURATION MIN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CEP DURATION MIN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CEP_DURATION_MIN(DSL_CEP_DURATION_MIN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL CEP DURATION SEC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL CEP DURATION SEC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_CEP_DURATION_SEC(DSL_CEP_DURATION_SEC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL List Actions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL List Actions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_ListActions(DSL_ListActions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Resource Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Resource Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_ResourceAction(DSL_ResourceAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL List Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL List Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_ListParam(DSL_ListParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression(DSL_Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Or(DSL_Expression_Or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_And(DSL_Expression_And object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Diff</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Diff</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Diff(DSL_Expression_Diff object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Equal(DSL_Expression_Equal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Larger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Larger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Larger(DSL_Expression_Larger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Larger Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Larger Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Larger_Equal(DSL_Expression_Larger_Equal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Smaller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Smaller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Smaller(DSL_Expression_Smaller object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Smaller Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Smaller Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Smaller_Equal(DSL_Expression_Smaller_Equal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Plus(DSL_Expression_Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Minus(DSL_Expression_Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Multiplication(DSL_Expression_Multiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Division</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Division</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Division(DSL_Expression_Division object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Modulo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Modulo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Modulo(DSL_Expression_Modulo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Object Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Object Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Object_Number(DSL_Object_Number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Object String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Object String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Object_String(DSL_Object_String object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Object Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Object Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Object_Boolean(DSL_Object_Boolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Object Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Object Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Object_Ref(DSL_Object_Ref object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Expression Negate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Expression Negate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL_Expression_Negate(DSL_Expression_Negate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SensinactSwitch
