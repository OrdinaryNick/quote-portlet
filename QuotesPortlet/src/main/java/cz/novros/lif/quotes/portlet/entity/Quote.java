package cz.novros.lif.quotes.portlet.entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Simple entity class to represents quote.
 * 
 * @author Rostislav Novak
 */
public class Quote {
	
	/** Text of quote. */
	private String text;
	/** Author of quote. */
	private String author;
	/** Author of this entity. */
	private String authorOfEntity;
	/** Date, when was entity created. */
	private String created;
	
	/**
	 * Create instance of quote with parameters.
	 * @param text Text of quote.
	 * @param author Author of quote.
	 * @param authorOfEntity Author of this entity.
	 */
	public Quote(String text, String author, String authorOfEntity) {
		super();
		this.text = text;
		this.author = author;
		this.authorOfEntity = authorOfEntity;
		
		final Calendar cal = Calendar.getInstance();
        final SimpleDateFormat sdf = new SimpleDateFormat("d.M.Y");
        created = sdf.format(cal.getTime());
	}

	/**
	 * Returns text of quote.
	 * 
	 * @return String with quote.
	 */
	public final String getText() {
		return text;
	}

	/**
	 * Set text of quote.
	 * 
	 * @param text Text for this quote.
	 */
	public final void setText(final String text) {
		this.text = text;
	}

	/**
	 * Returns author of this quote.
	 * 
	 * @return String with author of this quote.
	 */
	public final String getAuthor() {
		return author;
	}

	/**
	 * Set author of this quote.
	 * 
	 * @param author Author for this quote.
	 */
	public final void setAuthor(final String author) {
		this.author = author;
	}

	/**
	 * Returns author of this entity.
	 * 
	 * @return String with author of this entity.
	 */
	public final String getAuthorOfEntity() {
		return authorOfEntity;
	}

	/**
	 * Set author of this entity.
	 * 
	 * @param authorOfEntity Author of this entity.
	 */
	public final void setAuthorOfEntity(final String authorOfEntity) {
		this.authorOfEntity = authorOfEntity;
	}

	/**
	 * Returns date when was entity created.
	 * 
	 * @return String with date of creation.
	 */
	public final String getCreated() {
		return created;
	}

	/**
	 * Set date of creation.
	 * 
	 * @param created Date in string. Format is "d.M.Y".
	 */
	final void setCreated(final String created) {
		this.created = created;
	}
	
}