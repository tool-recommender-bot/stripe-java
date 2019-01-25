package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class Account extends ApiResource implements PaymentSource, MetadataStore<Account> {
  String applicationIcon;

  String applicationLogo;

  String applicationName;

  String applicationUrl;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A logo for this account (at
   * least 128px x 128px).
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> businessLogo;

  /** The publicly visible name of the business. */
  String businessName;

  /** A CSS hex color value representing the primary branding color for this account. */
  String businessPrimaryColor;

  /** The publicly visible website of the business. */
  String businessUrl;

  /** Whether the account can create live charges. */
  Boolean chargesEnabled;

  /** The account's country. */
  String country;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /**
   * A Boolean indicating if Stripe should try to reclaim negative balances from an attached bank
   * account. See our [Understanding Connect Account Balances](/docs/connect/account-balances)
   * documentation for details.
   */
  Boolean debitNegativeBalances;

  /**
   * Account-level settings to automatically decline certain types of charges regardless of the
   * decision of the card issuer.
   */
  DeclineChargeOn declineChargeOn;

  /**
   * Three-letter ISO currency code representing the default currency for the account. This must be
   * a currency that [Stripe supports in the account's country](https://stripe.com/docs/payouts).
   */
  String defaultCurrency;

  /** Always true for a deleted object. */
  Boolean deleted;

  /**
   * Whether account details have been submitted. Standard accounts cannot receive payouts before
   * this is true.
   */
  Boolean detailsSubmitted;

  /**
   * The display name for this account. This is used on the Stripe Dashboard to differentiate
   * between accounts.
   */
  String displayName;

  /** The primary user's email address. */
  String email;

  /** External accounts (bank accounts and debit cards) currently attached to this account. */
  ExternalAccountCollection externalAccounts;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  Keys keys;

  /**
   * Information about the legal entity itself, including about the associated account
   * representative.
   */
  LegalEntity legalEntity;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /**
   * Details on when funds from charges are available, and when they are paid out to an external
   * account. See our [Setting Bank and Debit Card
   * Payouts](/docs/connect/bank-transfers#payout-information) documentation for details.
   */
  PayoutSchedule payoutSchedule;

  /**
   * The text that appears on the bank account statement for payouts. If not set, this defaults to
   * the platform's bank descriptor as set in the Dashboard.
   */
  String payoutStatementDescriptor;

  /** Whether Stripe can send payouts to this account. */
  Boolean payoutsEnabled;

  /**
   * Internal-only description of the product sold or service provided by the business. It's used by
   * Stripe for risk and underwriting purposes.
   */
  String productDescription;

  /**
   * The default text that appears on credit card statements when a charge is made [directly on the
   * account](/docs/connect/direct-charges).
   */
  String statementDescriptor;

  /** A publicly shareable support mailing address for the business. */
  Address supportAddress;

  /** A publicly shareable support email address for the business. */
  String supportEmail;

  /** A publicly shareable support phone number for the business. */
  String supportPhone;

  /** A publicly available website for handling support issues. */
  String supportUrl;

  /**
   * The timezone used in the Stripe Dashboard for this account. A list of possible time zone values
   * is maintained at the [IANA Time Zone Database](http://www.iana.org/time-zones).
   */
  String timezone;

  TosAcceptance tosAcceptance;

  /** The Stripe account type. Can be `standard`, `express`, or `custom`. */
  String type;

  Requirements verification;

  /** Get id of expandable `businessLogo` object. */
  public String getBusinessLogo() {
    return (this.businessLogo != null) ? this.businessLogo.getId() : null;
  }

  public void setBusinessLogo(String id) {
    this.businessLogo = ApiResource.setExpandableFieldId(id, this.businessLogo);
  }

  /** Get expanded `businessLogo`. */
  public File getBusinessLogoObject() {
    return (this.businessLogo != null) ? this.businessLogo.getExpanded() : null;
  }

  public void setBusinessLogoObject(File expandableObject) {
    this.businessLogo = new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /** Retrieves the details of the account. */
  public static Account retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of the account. */
  public static Account retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /** Retrieves the details of the account. */
  public static Account retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/account");
    return request(ApiResource.RequestMethod.GET, url, params, Account.class, options);
  }

  /** Retrieves the details of the account. */
  public static Account retrieve(String account) throws StripeException {
    return retrieve(account, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of the account. */
  public static Account retrieve(String account, RequestOptions options) throws StripeException {
    return retrieve(account, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of the account. */
  public static Account retrieve(String account, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/accounts/%s", account));
    return request(ApiResource.RequestMethod.GET, url, params, Account.class, options);
  }

  /**
   * Updates a connected <a href="/docs/connect/accounts">Express or Custom account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged. Most
   * parameters can be changed only for Custom accounts. (These are marked <strong>Custom
   * Only</strong> below.) Parameters marked <strong>Custom and Express</strong> are supported by
   * both account types.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="/docs/connect/updating-accounts">Connect</a> documentation to learn more about updating
   * accounts.
   */
  public Account update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a connected <a href="/docs/connect/accounts">Express or Custom account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged. Most
   * parameters can be changed only for Custom accounts. (These are marked <strong>Custom
   * Only</strong> below.) Parameters marked <strong>Custom and Express</strong> are supported by
   * both account types.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="/docs/connect/updating-accounts">Connect</a> documentation to learn more about updating
   * accounts.
   */
  public Account update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/accounts/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Account.class, options);
  }

  /**
   * Returns a list of accounts connected to your platform via <a href="/docs/connect">Connect</a>.
   * If you’re not a platform, the list is empty.
   */
  public static AccountCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of accounts connected to your platform via <a href="/docs/connect">Connect</a>.
   * If you’re not a platform, the list is empty.
   */
  public static AccountCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/accounts");
    return requestCollection(url, params, AccountCollection.class, options);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you can create Stripe accounts for your users. To do
   * this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>For Standard accounts, parameters other than <code>country</code>, <code>email</code>, and
   * <code>type</code> are used to prefill the account application that we ask the account holder to
   * complete.
   */
  public static Account create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you can create Stripe accounts for your users. To do
   * this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>For Standard accounts, parameters other than <code>country</code>, <code>email</code>, and
   * <code>type</code> are used to prefill the account application that we ask the account holder to
   * complete.
   */
  public static Account create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/accounts");
    return request(ApiResource.RequestMethod.POST, url, params, Account.class, options);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you may delete Custom accounts you manage.
   *
   * <p>Custom accounts created using test-mode keys can be deleted at any time. Custom accounts
   * created using live-mode keys may only be deleted once all balances are zero.
   *
   * <p>If you are looking to close your own account, use the <a
   * href="https://dashboard.stripe.com/account/data">data tab in your account settings</a> instead.
   */
  public Account delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you may delete Custom accounts you manage.
   *
   * <p>Custom accounts created using test-mode keys can be deleted at any time. Custom accounts
   * created using live-mode keys may only be deleted once all balances are zero.
   *
   * <p>If you are looking to close your own account, use the <a
   * href="https://dashboard.stripe.com/account/data">data tab in your account settings</a> instead.
   */
  public Account delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you may delete Custom accounts you manage.
   *
   * <p>Custom accounts created using test-mode keys can be deleted at any time. Custom accounts
   * created using live-mode keys may only be deleted once all balances are zero.
   *
   * <p>If you are looking to close your own account, use the <a
   * href="https://dashboard.stripe.com/account/data">data tab in your account settings</a> instead.
   */
  public Account delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you may delete Custom accounts you manage.
   *
   * <p>Custom accounts created using test-mode keys can be deleted at any time. Custom accounts
   * created using live-mode keys may only be deleted once all balances are zero.
   *
   * <p>If you are looking to close your own account, use the <a
   * href="https://dashboard.stripe.com/account/data">data tab in your account settings</a> instead.
   */
  public Account delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/accounts/%s", this.getId()));
    return request(ApiResource.RequestMethod.DELETE, url, params, Account.class, options);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you may flag accounts as suspicious.
   *
   * <p>Test-mode Custom and Express accounts can be rejected at any time. Accounts created using
   * live-mode keys may only be rejected once all balances are zero.
   */
  public Account reject(Map<String, Object> params) throws StripeException {
    return reject(params, (RequestOptions) null);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you may flag accounts as suspicious.
   *
   * <p>Test-mode Custom and Express accounts can be rejected at any time. Accounts created using
   * live-mode keys may only be rejected once all balances are zero.
   */
  public Account reject(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/accounts/%s/reject", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Account.class, options);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection persons() throws StripeException {
    return persons((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection persons(Map<String, Object> params) throws StripeException {
    return persons(params, (RequestOptions) null);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection persons(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/accounts/%s/persons", this.getId()));
    return requestCollection(url, params, PersonCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DeclineChargeOn extends StripeObject {
    /**
     * Whether Stripe automatically declines charges with an incorrect ZIP or postal code. This
     * setting only applies when a ZIP or postal code is provided and they fail bank verification.
     */
    Boolean avsFailure;

    /**
     * Whether Stripe automatically declines charges with an incorrect CVC. This setting only
     * applies when a CVC is provided and it fails bank verification.
     */
    Boolean cvcFailure;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Keys extends StripeObject {
    /**
     * Key used to identify your account with Stripe. It can be publicly placed in your front-end or
     * mobile client.
     */
    String publishable;

    /**
     * Confidential key used to perform API requests to Stripe. It should be kept confidential and
     * only stored on your own servers.
     */
    String secret;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    /**
     * If the account is disabled, this string describes why the account can’t create charges or
     * receive payouts. Can be `rejected.fraud`, `rejected.terms_of_service`, `rejected.listed`,
     * `rejected.other`, `fields_needed`, `listed`, `under_review`, or `other`.
     */
    String disabledReason;

    /**
     * By what time the `fields_needed` must be provided. If this date is in the past, the account
     * is already in bad standing, and providing `fields_needed` is necessary to re-enable payouts
     * and prevent other consequences. If this date is in the future, `fields_needed` must be
     * provided to ensure the account remains in good standing.
     */
    Long dueBy;

    /**
     * Field names that need to be provided for the account to remain in good standing. Nested
     * fields are separated by `.` (for example, `legal_entity.first_name`).
     */
    List<String> fieldsNeeded;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TosAcceptance extends StripeObject {
    /**
     * The Unix timestamp marking when the Stripe Services Agreement was accepted by the account
     * representative.
     */
    Long date;

    /**
     * The IP address from which the Stripe Services Agreement was accepted by the account
     * representative.
     */
    String ip;

    /**
     * The user agent of the browser from which the Stripe Services Agreement was accepted by the
     * account representative.
     */
    String userAgent;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PayoutSchedule extends StripeObject {
    /** The number of days charges for the account will be held before being paid out. */
    Long delayDays;

    /**
     * How frequently funds will be paid out. One of `manual` (transfers only created via API call),
     * `daily`, `weekly`, or `monthly`.
     */
    String interval;

    /**
     * The day of the month funds will be paid out. Only shown if `interval` is monthly. Payouts
     * scheduled between the 29th and 31st of the month are sent on the last day of shorter months.
     */
    Long monthlyAnchor;

    /**
     * The day of the week funds will be paid out, of the style 'monday', 'tuesday', etc. Only shown
     * if `interval` is weekly.
     */
    String weeklyAnchor;
  }
}
