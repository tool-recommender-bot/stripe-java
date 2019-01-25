package com.stripe.model.issuing;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Verification extends ApiResource implements HasId {
  /** The id of the `Card` on which the verification was requested. */
  String card;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** Timestamp of the expiry for that verification. */
  Long expiresAt;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** The scope of the verification. */
  String scope;

  /** The method by which the cardholder will be sent a one-time password. */
  String verificationMethod;

  /** Some actions (eg: updating a PIN) need confirmation from the cardholder. */
  public static Verification create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Some actions (eg: updating a PIN) need confirmation from the cardholder. */
  public static Verification create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/verifications");
    return request(ApiResource.RequestMethod.POST, url, params, Verification.class, options);
  }
}
