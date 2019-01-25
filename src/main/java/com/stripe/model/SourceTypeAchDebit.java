package com.stripe.model;

import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class SourceTypeAchDebit extends StripeObject {
  String bankName;

  String country;

  String fingerprint;

  String last4;

  String routingNumber;

  String type;
}
