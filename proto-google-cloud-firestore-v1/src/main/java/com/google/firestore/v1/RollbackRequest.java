/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

package com.google.firestore.v1;

/**
 *
 *
 * <pre>
 * The request for [Firestore.Rollback][google.firestore.v1.Firestore.Rollback].
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1.RollbackRequest}
 */
public final class RollbackRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1.RollbackRequest)
    RollbackRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RollbackRequest.newBuilder() to construct.
  private RollbackRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RollbackRequest() {
    database_ = "";
    transaction_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RollbackRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              database_ = s;
              break;
            }
          case 18:
            {
              transaction_ = input.readBytes();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.firestore.v1.FirestoreProto
        .internal_static_google_firestore_v1_RollbackRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1.FirestoreProto
        .internal_static_google_firestore_v1_RollbackRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1.RollbackRequest.class,
            com.google.firestore.v1.RollbackRequest.Builder.class);
  }

  public static final int DATABASE_FIELD_NUMBER = 1;
  private volatile java.lang.Object database_;
  /**
   *
   *
   * <pre>
   * Required. The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getDatabase() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      database_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString getDatabaseBytes() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      database_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSACTION_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString transaction_;
  /**
   *
   *
   * <pre>
   * Required. The transaction to roll back.
   * </pre>
   *
   * <code>bytes transaction = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString getTransaction() {
    return transaction_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getDatabaseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, database_);
    }
    if (!transaction_.isEmpty()) {
      output.writeBytes(2, transaction_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDatabaseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, database_);
    }
    if (!transaction_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, transaction_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.firestore.v1.RollbackRequest)) {
      return super.equals(obj);
    }
    com.google.firestore.v1.RollbackRequest other = (com.google.firestore.v1.RollbackRequest) obj;

    if (!getDatabase().equals(other.getDatabase())) return false;
    if (!getTransaction().equals(other.getTransaction())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATABASE_FIELD_NUMBER;
    hash = (53 * hash) + getDatabase().hashCode();
    hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
    hash = (53 * hash) + getTransaction().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1.RollbackRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.RollbackRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.RollbackRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.RollbackRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.RollbackRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.RollbackRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.RollbackRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.RollbackRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.RollbackRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.RollbackRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.RollbackRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.RollbackRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.firestore.v1.RollbackRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request for [Firestore.Rollback][google.firestore.v1.Firestore.Rollback].
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1.RollbackRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1.RollbackRequest)
      com.google.firestore.v1.RollbackRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.v1.FirestoreProto
          .internal_static_google_firestore_v1_RollbackRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1.FirestoreProto
          .internal_static_google_firestore_v1_RollbackRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1.RollbackRequest.class,
              com.google.firestore.v1.RollbackRequest.Builder.class);
    }

    // Construct using com.google.firestore.v1.RollbackRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      database_ = "";

      transaction_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.v1.FirestoreProto
          .internal_static_google_firestore_v1_RollbackRequest_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1.RollbackRequest getDefaultInstanceForType() {
      return com.google.firestore.v1.RollbackRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1.RollbackRequest build() {
      com.google.firestore.v1.RollbackRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1.RollbackRequest buildPartial() {
      com.google.firestore.v1.RollbackRequest result =
          new com.google.firestore.v1.RollbackRequest(this);
      result.database_ = database_;
      result.transaction_ = transaction_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.firestore.v1.RollbackRequest) {
        return mergeFrom((com.google.firestore.v1.RollbackRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1.RollbackRequest other) {
      if (other == com.google.firestore.v1.RollbackRequest.getDefaultInstance()) return this;
      if (!other.getDatabase().isEmpty()) {
        database_ = other.database_;
        onChanged();
      }
      if (other.getTransaction() != com.google.protobuf.ByteString.EMPTY) {
        setTransaction(other.getTransaction());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.firestore.v1.RollbackRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.firestore.v1.RollbackRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object database_ = "";
    /**
     *
     *
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getDatabase() {
      java.lang.Object ref = database_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        database_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString getDatabaseBytes() {
      java.lang.Object ref = database_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        database_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDatabase(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      database_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearDatabase() {

      database_ = getDefaultInstance().getDatabase();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDatabaseBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      database_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString transaction_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Required. The transaction to roll back.
     * </pre>
     *
     * <code>bytes transaction = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString getTransaction() {
      return transaction_;
    }
    /**
     *
     *
     * <pre>
     * Required. The transaction to roll back.
     * </pre>
     *
     * <code>bytes transaction = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTransaction(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      transaction_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The transaction to roll back.
     * </pre>
     *
     * <code>bytes transaction = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTransaction() {

      transaction_ = getDefaultInstance().getTransaction();
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.firestore.v1.RollbackRequest)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1.RollbackRequest)
  private static final com.google.firestore.v1.RollbackRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1.RollbackRequest();
  }

  public static com.google.firestore.v1.RollbackRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RollbackRequest> PARSER =
      new com.google.protobuf.AbstractParser<RollbackRequest>() {
        @java.lang.Override
        public RollbackRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RollbackRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RollbackRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RollbackRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1.RollbackRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
