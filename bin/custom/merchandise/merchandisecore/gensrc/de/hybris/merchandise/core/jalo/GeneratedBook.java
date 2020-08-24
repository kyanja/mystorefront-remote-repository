/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 24 août 2020 à 00:30:45                     ---
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
import de.hybris.merchandise.core.jalo.Author;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product Book}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedBook extends Product
{
	/** Qualifier of the <code>Book.isbn</code> attribute **/
	public static final String ISBN = "isbn";
	/** Qualifier of the <code>Book.price</code> attribute **/
	public static final String PRICE = "price";
	/** Qualifier of the <code>Book.bookType</code> attribute **/
	public static final String BOOKTYPE = "bookType";
	/** Qualifier of the <code>Book.author</code> attribute **/
	public static final String AUTHOR = "author";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AUTHOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBook> AUTHORHANDLER = new BidirectionalOneToManyHandler<GeneratedBook>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ISBN, AttributeMode.INITIAL);
		tmp.put(PRICE, AttributeMode.INITIAL);
		tmp.put(BOOKTYPE, AttributeMode.INITIAL);
		tmp.put(AUTHOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.author</code> attribute.
	 * @return the author
	 */
	public Author getAuthor(final SessionContext ctx)
	{
		return (Author)getProperty( ctx, AUTHOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.author</code> attribute.
	 * @return the author
	 */
	public Author getAuthor()
	{
		return getAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final SessionContext ctx, final Author value)
	{
		AUTHORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final Author value)
	{
		setAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.bookType</code> attribute.
	 * @return the bookType
	 */
	public String getBookType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BOOKTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.bookType</code> attribute.
	 * @return the bookType
	 */
	public String getBookType()
	{
		return getBookType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.bookType</code> attribute. 
	 * @param value the bookType
	 */
	public void setBookType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BOOKTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.bookType</code> attribute. 
	 * @param value the bookType
	 */
	public void setBookType(final String value)
	{
		setBookType( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AUTHORHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.isbn</code> attribute.
	 * @return the isbn
	 */
	public String getIsbn(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ISBN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.isbn</code> attribute.
	 * @return the isbn
	 */
	public String getIsbn()
	{
		return getIsbn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.isbn</code> attribute. 
	 * @param value the isbn
	 */
	public void setIsbn(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ISBN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.isbn</code> attribute. 
	 * @param value the isbn
	 */
	public void setIsbn(final String value)
	{
		setIsbn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.price</code> attribute.
	 * @return the price
	 */
	public Double getPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.price</code> attribute.
	 * @return the price
	 */
	public Double getPrice()
	{
		return getPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.price</code> attribute. 
	 * @return the price
	 */
	public double getPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.price</code> attribute. 
	 * @return the price
	 */
	public double getPriceAsPrimitive()
	{
		return getPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final Double value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final double value)
	{
		setPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final double value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
}
