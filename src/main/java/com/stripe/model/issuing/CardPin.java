package com.stripe.model.issuing;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
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
public class CardPin extends ApiResource {
  Card card;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** The PIN (4 digits number). */
  String pin;

  /**
   * Retrieves the PIN for a card object, subject to cardholder verification, see <a
   * href="/docs/issuing/pin_management">Retrieve and update cardholder PIN</a>.
   */
  public static CardPin retrieve(String card) throws StripeException {
    return retrieve(card, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the PIN for a card object, subject to cardholder verification, see <a
   * href="/docs/issuing/pin_management">Retrieve and update cardholder PIN</a>.
   */
  public static CardPin retrieve(String card, RequestOptions options) throws StripeException {
    return retrieve(card, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the PIN for a card object, subject to cardholder verification, see <a
   * href="/docs/issuing/pin_management">Retrieve and update cardholder PIN</a>.
   */
  public static CardPin retrieve(String card, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/issuing/cards/%s/pin", card));
    return request(ApiResource.RequestMethod.GET, url, params, CardPin.class, options);
  }

  /**
   * Updates the PIN for a card, subject to cardholder verification. See <a
   * href="/docs/issuing/pin_management">Retrieve and update cardholder PIN</a>
   */
  public static CardPin update(String card, Map<String, Object> params) throws StripeException {
    return update(card, params, (RequestOptions) null);
  }

  /**
   * Updates the PIN for a card, subject to cardholder verification. See <a
   * href="/docs/issuing/pin_management">Retrieve and update cardholder PIN</a>
   */
  public static CardPin update(String card, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/issuing/cards/%s/pin", card));
    return request(ApiResource.RequestMethod.POST, url, params, CardPin.class, options);
  }
}
