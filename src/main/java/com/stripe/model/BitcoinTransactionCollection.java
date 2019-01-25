package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.stripe.generator.entity.SdkBuilder")
public class BitcoinTransactionCollection extends StripeCollection<BitcoinTransaction> {
  /** List bitcoin transacitons for a given receiver. */
  public BitcoinTransactionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List bitcoin transacitons for a given receiver. */
  public BitcoinTransactionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, BitcoinTransactionCollection.class, options);
  }
}
