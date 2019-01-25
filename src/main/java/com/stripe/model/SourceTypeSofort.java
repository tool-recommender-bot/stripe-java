package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeSofort extends StripeObject {
  String bankCode;

  String bankName;

  String bic;

  String country;

  String ibanLast4;

  String preferredLanguage;

  String statementDescriptor;
}
