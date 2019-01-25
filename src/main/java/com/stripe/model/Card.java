package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Card extends ApiResource
    implements ExternalAccount, PaymentSource, MetadataStore<Card> {
  /**
   * The account this card belongs to. This attribute will not be in the card object if the card
   * belongs to a customer or recipient instead.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> account;

  /** City/District/Suburb/Town/Village. */
  String addressCity;

  /** Billing address country, if provided when creating card. */
  String addressCountry;

  /** Address line 1 (Street address/PO Box/Company name). */
  String addressLine1;

  /**
   * If `address_line1` was provided, results of the check: `pass`, `fail`, `unavailable`, or
   * `unchecked`.
   */
  String addressLine1Check;

  /** Address line 2 (Apartment/Suite/Unit/Building). */
  String addressLine2;

  /** State/County/Province/Region. */
  String addressState;

  /** ZIP or postal code. */
  String addressZip;

  /**
   * If `address_zip` was provided, results of the check: `pass`, `fail`, `unavailable`, or
   * `unchecked`.
   */
  String addressZipCheck;

  /**
   * A set of available payout methods for this card. Will be either `["standard"]` or `["standard",
   * "instant"]`. Only values from this set should be passed as the `method` when creating a
   * transfer.
   */
  List<String> availablePayoutMethods;

  /**
   * Card brand. Can be `American Express`, `Diners Club`, `Discover`, `JCB`, `MasterCard`,
   * `UnionPay`, `Visa`, or `Unknown`.
   */
  String brand;

  /**
   * Two-letter ISO code representing the country of the card. You could use this attribute to get a
   * sense of the international breakdown of cards you've collected.
   */
  String country;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  String currency;

  /**
   * The customer that this card belongs to. This attribute will not be in the card object if the
   * card belongs to an account or recipient instead.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** If a CVC was provided, results of the check: `pass`, `fail`, `unavailable`, or `unchecked`. */
  String cvcCheck;

  /** Whether this card is the default external account for its currency. */
  Boolean defaultForCurrency;

  /** Always true for a deleted object. */
  Boolean deleted;

  /**
   * Card description. (Only for internal use only and not typically available in standard API
   * requests.)
   */
  String description;

  /** (For tokenized numbers only.) The last four digits of the device account number. */
  String dynamicLast4;

  /** Two-digit number representing the card's expiration month. */
  Long expMonth;

  /** Four-digit number representing the card's expiration year. */
  Long expYear;

  /**
   * Uniquely identifies this particular card number. You can use this attribute to check whether
   * two customers who've signed up with you are using the same card number, for example.
   */
  String fingerprint;

  /** Card funding type. Can be `credit`, `debit`, `prepaid`, or `unknown`. */
  String funding;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * Issuer identification number of the card. (Only for internal use only and not typically
   * available in standard API requests.)
   */
  String iin;

  /**
   * Issuer bank name of the card. (Only for internal use only and not typically available in
   * standard API requests.)
   */
  String issuer;

  /** The last four digits of the card. */
  String last4;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  /** Cardholder name. */
  String name;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /**
   * The recipient that this card belongs to. This attribute will not be in the card object if the
   * card belongs to a customer or account instead.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Recipient> recipient;

  /**
   * If the card number is tokenized, this is the method that was used. Can be `apple_pay` or
   * `google_pay`.
   */
  String tokenizationMethod;

  /** Get id of expandable `account` object. */
  public String getAccount() {
    return (this.account != null) ? this.account.getId() : null;
  }

  public void setAccount(String id) {
    this.account = ApiResource.setExpandableFieldId(id, this.account);
  }

  /** Get expanded `account`. */
  public Account getAccountObject() {
    return (this.account != null) ? this.account.getExpanded() : null;
  }

  public void setAccountObject(Account expandableObject) {
    this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `customer` object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded `customer`. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `recipient` object. */
  public String getRecipient() {
    return (this.recipient != null) ? this.recipient.getId() : null;
  }

  public void setRecipient(String id) {
    this.recipient = ApiResource.setExpandableFieldId(id, this.recipient);
  }

  /** Get expanded `recipient`. */
  public Recipient getRecipientObject() {
    return (this.recipient != null) ? this.recipient.getExpanded() : null;
  }

  public void setRecipientObject(Recipient expandableObject) {
    this.recipient = new ExpandableField<Recipient>(expandableObject.getId(), expandableObject);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="/docs/connect/custom-accounts">Custom account</a>, and optionally sets it as the
   * default for its currency. Other bank account details are not editable by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   *
   * <p>Update a specified source for a given customer.
   */
  public Card update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="/docs/connect/custom-accounts">Custom account</a>, and optionally sets it as the
   * default for its currency. Other bank account details are not editable by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   *
   * <p>Update a specified source for a given customer.
   */
  public Card update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url;
    if (this.getAccount() != null) {
      url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/accounts/%s/external_accounts/%s", this.getAccount(), this.getId()));
    } else if (this.getCustomer() != null) {
      url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format("/v1/customers/%s/sources/%s", this.getCustomer(), this.getId()));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account, customer] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    return request(ApiResource.RequestMethod.POST, url, params, Card.class, options);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  public Card delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  public Card delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  public Card delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  public Card delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url;
    if (this.getAccount() != null) {
      url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/accounts/%s/external_accounts/%s", this.getAccount(), this.getId()));
    } else if (this.getCustomer() != null) {
      url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format("/v1/customers/%s/sources/%s", this.getCustomer(), this.getId()));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account, customer] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    return request(ApiResource.RequestMethod.DELETE, url, params, Card.class, options);
  }
}
