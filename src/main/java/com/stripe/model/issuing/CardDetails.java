package com.stripe.model.issuing;

import com.stripe.model.StripeObject;
import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class CardDetails extends StripeObject {
  Card card;

  /** The CVC number for the card. */
  String cvc;

  /** The expiration month of the card. */
  Long expMonth;

  /** The expiration year of the card. */
  Long expYear;

  /** The card number. */
  String number;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;
}
