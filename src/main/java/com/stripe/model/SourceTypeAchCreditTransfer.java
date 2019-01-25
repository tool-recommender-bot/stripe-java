package com.stripe.model;

import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class SourceTypeAchCreditTransfer extends StripeObject {
  String accountNumber;

  String bankName;

  String fingerprint;

  String refundAccountHolderName;

  String refundAccountHolderType;

  String refundAccountNumber;

  String refundRoutingNumber;

  String routingNumber;

  String swiftCode;
}
