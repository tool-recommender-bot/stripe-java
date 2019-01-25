package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.stripe.generator.entity.SdkBuilder")
public interface ExternalAccount extends HasId {
  ExternalAccount update(Map<String, Object> params) throws StripeException;

  ExternalAccount update(Map<String, Object> params, RequestOptions options) throws StripeException;

  ExternalAccount delete() throws StripeException;

  ExternalAccount delete(RequestOptions options) throws StripeException;

  ExternalAccount delete(Map<String, Object> params) throws StripeException;

  ExternalAccount delete(Map<String, Object> params, RequestOptions options) throws StripeException;
}
