package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Topup extends ApiResource implements BalanceTransactionSource, MetadataStore<Topup> {
  /** Amount transferred. */
  Long amount;

  /**
   * ID of the balance transaction that describes the impact of this top-up on your account balance.
   * May not be specified depending on status of top-up.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> balanceTransaction;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  String description;

  /**
   * Date the funds are expected to arrive in your Stripe account for payouts. This factors in
   * delays like weekends or bank holidays. May not be specified depending on status of top-up.
   */
  Long expectedAvailabilityDate;

  /**
   * Error code explaining reason for top-up failure if available (see [the errors
   * section](/docs/api#errors) for a list of codes).
   */
  String failureCode;

  /** Message to user further explaining reason for top-up failure if available. */
  String failureMessage;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  Source source;

  /**
   * Extra information about a top-up. This will appear on your source's bank statement. It must
   * contain at least one letter.
   */
  String statementDescriptor;

  /**
   * The status of the top-up is either `canceled`, `failed`, `pending`, `reversed`, or `succeeded`.
   */
  String status;

  /** A string that identifies this top-up as part of a group. */
  String transferGroup;

  /** Get id of expandable `balanceTransaction` object. */
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String id) {
    this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
  }

  /** Get expanded `balanceTransaction`. */
  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.balanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Top up the balance of an account. */
  public static Topup create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Top up the balance of an account. */
  public static Topup create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/topups");
    return request(ApiResource.RequestMethod.POST, url, params, Topup.class, options);
  }

  /** Returns a list of top-ups. */
  public static TopupCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of top-ups. */
  public static TopupCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/topups");
    return requestCollection(url, params, TopupCollection.class, options);
  }

  /**
   * Retrieves the details of a top-up that has previously been created. Supply the unique top-up ID
   * that was returned from your previous request, and Stripe will return the corresponding top-up
   * information.
   */
  public static Topup retrieve(String topup) throws StripeException {
    return retrieve(topup, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a top-up that has previously been created. Supply the unique top-up ID
   * that was returned from your previous request, and Stripe will return the corresponding top-up
   * information.
   */
  public static Topup retrieve(String topup, RequestOptions options) throws StripeException {
    return retrieve(topup, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a top-up that has previously been created. Supply the unique top-up ID
   * that was returned from your previous request, and Stripe will return the corresponding top-up
   * information.
   */
  public static Topup retrieve(String topup, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/topups/%s", topup));
    return request(ApiResource.RequestMethod.GET, url, params, Topup.class, options);
  }

  /** Updates the metadata of a top-up. Other top-up details are not editable by design. */
  public Topup update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the metadata of a top-up. Other top-up details are not editable by design. */
  public Topup update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/topups/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Topup.class, options);
  }

  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/topups/%s/cancel", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Topup.class, options);
  }
}
