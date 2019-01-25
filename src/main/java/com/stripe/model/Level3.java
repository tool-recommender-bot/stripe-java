package com.stripe.model;

import java.util.List;
import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class Level3 extends StripeObject {
  String customerReference;

  List<Level3LineItem> lineItems;

  String merchantReference;

  String shippingAddressZip;

  Long shippingAmount;

  String shippingFromZip;
}
