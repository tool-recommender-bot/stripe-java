package com.stripe.model;

import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class InvoiceLineItemPeriod extends StripeObject {
  /** End of the line item's billing period. */
  Long end;

  /** Start of the line item's billing period. */
  Long start;
}
