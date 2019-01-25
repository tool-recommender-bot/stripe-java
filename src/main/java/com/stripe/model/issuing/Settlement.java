package com.stripe.model.issuing;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class Settlement extends ApiResource implements HasId, MetadataStore<Settlement> {
  /** The Bank Identification Number reflecting this settlement record. */
  String bin;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  String currency;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** The total interchange received as reimbursement for the transactions. */
  Long interchangeFees;

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

  /** The total net amount required to settle with the network. */
  Long netTotal;

  /** The total amount of fees owed to the network. */
  Long networkFees;

  /** The Settlement Identification Number assigned by the network. */
  String networkSettlementIdentifier;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** The date of the settlement event. */
  Long settlementDate;

  /**
   * One of `international`, `australia_national_net`, `canada_national_net`, `uk_national_net`,
   * `india_area_net`, `japan_national_net`, `south_korea_national_net`, `new_zealand_national_net`,
   * `sweden_national_net`, `singapore_national_net`, `colombia_national_net`,
   * `philippines_national_net`, `euro_area_net`, `south_africa_national_net`,
   * `nigeria_national_net`, `lebanon_usd_national_net`, `lebanon_lbp_national_net`,
   * `turkey_national_net`, `brazil_cip_national_net`, `malaysia_national_net`, or
   * `hong_kong_area_net`.
   */
  String settlementService;

  /** The total number of transactions reflected in this settlement. */
  Long transactionCount;

  /** The total transaction amount reflected in this settlement. */
  Long transactionVolume;

  /** Whether or not the transactions have been reconciled. */
  Boolean transactionsReconciled;

  /**
   * Returns a list of Issuing <code>Settlement</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static SettlementCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Settlement</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static SettlementCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/settlements");
    return requestCollection(url, params, SettlementCollection.class, options);
  }

  /** Retrieves an Issuing <code>Settlement</code> object. */
  public static Settlement retrieve(String settlement) throws StripeException {
    return retrieve(settlement, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing <code>Settlement</code> object. */
  public static Settlement retrieve(String settlement, RequestOptions options)
      throws StripeException {
    return retrieve(settlement, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing <code>Settlement</code> object. */
  public static Settlement retrieve(
      String settlement, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/issuing/settlements/%s", settlement));
    return request(ApiResource.RequestMethod.GET, url, params, Settlement.class, options);
  }

  /**
   * Updates the specified Issuing <code>Settlement</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Settlement update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Settlement</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Settlement update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/issuing/settlements/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Settlement.class, options);
  }
}
