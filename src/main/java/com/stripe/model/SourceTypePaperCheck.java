package com.stripe.model;

import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class SourceTypePaperCheck extends StripeObject {
  String mailingAddressCity;

  String mailingAddressCountry;

  String mailingAddressLine1;

  String mailingAddressLine2;

  String mailingAddressPostalCode;

  String mailingAddressState;
}
