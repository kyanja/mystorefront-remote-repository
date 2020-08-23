/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 23 août 2020 à 01:26:38                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.merchandise.core.jalo;

import de.hybris.merchandise.core.constants.MerchandiseCoreConstants;
import de.hybris.merchandise.core.jalo.Book;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Author}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAuthor extends GenericItem
{
	/** Qualifier of the <code>Author.authourId</code> attribute **/
	public static final String AUTHOURID = "authourId";
	/** Qualifier of the <code>Author.registrationNo</code> attribute **/
	public static final String REGISTRATIONNO = "registrationNo";
	/** Qualifier of the <code>Author.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Author.awards</code> attribute **/
	public static final String AWARDS = "awards";
	/** Qualifier of the <code>Author.gender</code> attribute **/
	public static final String GENDER = "gender";
	/** Qualifier of the <code>Author.hobbies</code> attribute **/
	public static final String HOBBIES = "hobbies";
	/** Qualifier of the <code>Author.books</code> attribute **/
	public static final String BOOKS = "books";
	/**
	* {@link OneToManyHandler} for handling 1:n BOOKS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Book> BOOKSHANDLER = new OneToManyHandler<Book>(
	MerchandiseCoreConstants.TC.BOOK,
	false,
	"author",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AUTHOURID, AttributeMode.INITIAL);
		tmp.put(REGISTRATIONNO, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(AWARDS, AttributeMode.INITIAL);
		tmp.put(GENDER, AttributeMode.INITIAL);
		tmp.put(HOBBIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.authourId</code> attribute.
	 * @return the authourId
	 */
	public String getAuthourId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AUTHOURID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.authourId</code> attribute.
	 * @return the authourId
	 */
	public String getAuthourId()
	{
		return getAuthourId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.authourId</code> attribute. 
	 * @param value the authourId
	 */
	public void setAuthourId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AUTHOURID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.authourId</code> attribute. 
	 * @param value the authourId
	 */
	public void setAuthourId(final String value)
	{
		setAuthourId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.awards</code> attribute.
	 * @return the awards
	 */
	public Collection<String> getAwards(final SessionContext ctx)
	{
		Collection<String> coll = (Collection<String>)getProperty( ctx, AWARDS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.awards</code> attribute.
	 * @return the awards
	 */
	public Collection<String> getAwards()
	{
		return getAwards( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.awards</code> attribute. 
	 * @param value the awards
	 */
	public void setAwards(final SessionContext ctx, final Collection<String> value)
	{
		setProperty(ctx, AWARDS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.awards</code> attribute. 
	 * @param value the awards
	 */
	public void setAwards(final Collection<String> value)
	{
		setAwards( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.books</code> attribute.
	 * @return the books
	 */
	public Collection<Book> getBooks(final SessionContext ctx)
	{
		return BOOKSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.books</code> attribute.
	 * @return the books
	 */
	public Collection<Book> getBooks()
	{
		return getBooks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.books</code> attribute. 
	 * @param value the books
	 */
	public void setBooks(final SessionContext ctx, final Collection<Book> value)
	{
		BOOKSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.books</code> attribute. 
	 * @param value the books
	 */
	public void setBooks(final Collection<Book> value)
	{
		setBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to books. 
	 * @param value the item to add to books
	 */
	public void addToBooks(final SessionContext ctx, final Book value)
	{
		BOOKSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to books. 
	 * @param value the item to add to books
	 */
	public void addToBooks(final Book value)
	{
		addToBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from books. 
	 * @param value the item to remove from books
	 */
	public void removeFromBooks(final SessionContext ctx, final Book value)
	{
		BOOKSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from books. 
	 * @param value the item to remove from books
	 */
	public void removeFromBooks(final Book value)
	{
		removeFromBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.hobbies</code> attribute.
	 * @return the hobbies
	 */
	public Map<String,String> getAllHobbies(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, HOBBIES);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.hobbies</code> attribute.
	 * @return the hobbies
	 */
	public Map<String,String> getAllHobbies()
	{
		return getAllHobbies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.hobbies</code> attribute. 
	 * @param value the hobbies
	 */
	public void setAllHobbies(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, HOBBIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.hobbies</code> attribute. 
	 * @param value the hobbies
	 */
	public void setAllHobbies(final Map<String,String> value)
	{
		setAllHobbies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.registrationNo</code> attribute.
	 * @return the registrationNo
	 */
	public String getRegistrationNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGISTRATIONNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.registrationNo</code> attribute.
	 * @return the registrationNo
	 */
	public String getRegistrationNo()
	{
		return getRegistrationNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.registrationNo</code> attribute. 
	 * @param value the registrationNo
	 */
	public void setRegistrationNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGISTRATIONNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.registrationNo</code> attribute. 
	 * @param value the registrationNo
	 */
	public void setRegistrationNo(final String value)
	{
		setRegistrationNo( getSession().getSessionContext(), value );
	}
	
}
