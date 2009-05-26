package org.jboss.seam.examples.booking.account;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.inject.BindingType;

import org.jboss.seam.examples.booking.model.User;

/**
 * A binding type representing something that is registererd.
 * In this simple application the only thing that can be
 * registered is a {@link User}.
 *
 * @author Dan Allen
 */
public
@Target(
{
   TYPE, METHOD, PARAMETER, FIELD
})
@Retention(RUNTIME)
@Documented
@BindingType
@Inherited
@interface Registered
{
}
