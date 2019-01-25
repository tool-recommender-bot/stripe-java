package com.stripe.model;

import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class SourceTypeSepaCreditTransfer extends StripeObject {
  String bankName;

  String bic;

  String iban;

  String refundAccountHolderAddressCity;

  String refundAccountHolderAddressCountry;

  String refundAccountHolderAddressLine1;

  String refundAccountHolderAddressLine2;

  String refundAccountHolderAddressPostalCode;

  String refundAccountHolderAddressState;

  String refundAccountHolderName;

  String refundIban;
}
