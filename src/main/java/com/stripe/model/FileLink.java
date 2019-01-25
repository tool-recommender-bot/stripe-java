package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class FileLink extends ApiResource implements HasId, MetadataStore<FileLink> {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** Whether this link is already expired. */
  Boolean expired;

  /** Time at which the link expires. */
  Long expiresAt;

  /** The file object this link points to. */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> file;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** The publicly accessible URL to download the file. */
  String url;

  /** Get id of expandable `file` object. */
  public String getFile() {
    return (this.file != null) ? this.file.getId() : null;
  }

  public void setFile(String id) {
    this.file = ApiResource.setExpandableFieldId(id, this.file);
  }

  /** Get expanded `file`. */
  public File getFileObject() {
    return (this.file != null) ? this.file.getExpanded() : null;
  }

  public void setFileObject(File expandableObject) {
    this.file = new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /** Retrieves the file link with the given ID. */
  public static FileLink retrieve(String link) throws StripeException {
    return retrieve(link, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the file link with the given ID. */
  public static FileLink retrieve(String link, RequestOptions options) throws StripeException {
    return retrieve(link, (Map<String, Object>) null, options);
  }

  /** Retrieves the file link with the given ID. */
  public static FileLink retrieve(String link, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/file_links/%s", link));
    return request(ApiResource.RequestMethod.GET, url, params, FileLink.class, options);
  }

  /** Creates a new file link object. */
  public static FileLink create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new file link object. */
  public static FileLink create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/file_links");
    return request(ApiResource.RequestMethod.POST, url, params, FileLink.class, options);
  }

  /** Updates an existing file link object. Expired links can no longer be updated. */
  public FileLink update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing file link object. Expired links can no longer be updated. */
  public FileLink update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/file_links/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, FileLink.class, options);
  }

  /** Returns a list of file links. */
  public static FileLinkCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of file links. */
  public static FileLinkCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/file_links");
    return requestCollection(url, params, FileLinkCollection.class, options);
  }
}
