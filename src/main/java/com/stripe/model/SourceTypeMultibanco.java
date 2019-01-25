package com.stripe.model;

import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class SourceTypeMultibanco extends StripeObject {
  String entity;

  String reference;

  String refundAccountHolderAddressCity;

  String refundAccountHolderAddressCountry;

  String refundAccountHolderAddressLine1;

  String refundAccountHolderAddressLine2;

  String refundAccountHolderAddressPostalCode;

  String refundAccountHolderAddressState;

  String refundAccountHolderName;

  String refundIban;
}
