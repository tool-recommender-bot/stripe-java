package com.stripe.model;

import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class Level3LineItem extends StripeObject {
  Long discountAmount;

  String productCode;

  String productDescription;

  Long quantity;

  Long taxAmount;

  Long unitCost;
}
