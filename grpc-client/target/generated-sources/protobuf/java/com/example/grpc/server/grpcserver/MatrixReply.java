// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: matrix.proto

package com.example.grpc.server.grpcserver;

/**
 * <pre>
 * The response message containing the result marix
 * </pre>
 *
 * Protobuf type {@code matrixmult.MatrixReply}
 */
public  final class MatrixReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:matrixmult.MatrixReply)
    MatrixReplyOrBuilder {
  // Use MatrixReply.newBuilder() to construct.
  private MatrixReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MatrixReply() {
    m3_ = 0;
    m33_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MatrixReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            m3_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            m33_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.server.grpcserver.MatrixMult.internal_static_matrixmult_MatrixReply_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.server.grpcserver.MatrixMult.internal_static_matrixmult_MatrixReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.server.grpcserver.MatrixReply.class, com.example.grpc.server.grpcserver.MatrixReply.Builder.class);
  }

  public static final int M3_FIELD_NUMBER = 1;
  private int m3_;
  /**
   * <code>int32 m3 = 1;</code>
   */
  public int getM3() {
    return m3_;
  }

  public static final int M33_FIELD_NUMBER = 2;
  private volatile java.lang.Object m33_;
  /**
   * <code>string m33 = 2;</code>
   */
  public java.lang.String getM33() {
    java.lang.Object ref = m33_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      m33_ = s;
      return s;
    }
  }
  /**
   * <code>string m33 = 2;</code>
   */
  public com.google.protobuf.ByteString
      getM33Bytes() {
    java.lang.Object ref = m33_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      m33_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (m3_ != 0) {
      output.writeInt32(1, m3_);
    }
    if (!getM33Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, m33_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (m3_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, m3_);
    }
    if (!getM33Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, m33_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.grpc.server.grpcserver.MatrixReply)) {
      return super.equals(obj);
    }
    com.example.grpc.server.grpcserver.MatrixReply other = (com.example.grpc.server.grpcserver.MatrixReply) obj;

    boolean result = true;
    result = result && (getM3()
        == other.getM3());
    result = result && getM33()
        .equals(other.getM33());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + M3_FIELD_NUMBER;
    hash = (53 * hash) + getM3();
    hash = (37 * hash) + M33_FIELD_NUMBER;
    hash = (53 * hash) + getM33().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.server.grpcserver.MatrixReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.MatrixReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.MatrixReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.MatrixReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.MatrixReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.MatrixReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.MatrixReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.MatrixReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.MatrixReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.MatrixReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.MatrixReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.MatrixReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.grpc.server.grpcserver.MatrixReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The response message containing the result marix
   * </pre>
   *
   * Protobuf type {@code matrixmult.MatrixReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:matrixmult.MatrixReply)
      com.example.grpc.server.grpcserver.MatrixReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.server.grpcserver.MatrixMult.internal_static_matrixmult_MatrixReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.server.grpcserver.MatrixMult.internal_static_matrixmult_MatrixReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.server.grpcserver.MatrixReply.class, com.example.grpc.server.grpcserver.MatrixReply.Builder.class);
    }

    // Construct using com.example.grpc.server.grpcserver.MatrixReply.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      m3_ = 0;

      m33_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.server.grpcserver.MatrixMult.internal_static_matrixmult_MatrixReply_descriptor;
    }

    public com.example.grpc.server.grpcserver.MatrixReply getDefaultInstanceForType() {
      return com.example.grpc.server.grpcserver.MatrixReply.getDefaultInstance();
    }

    public com.example.grpc.server.grpcserver.MatrixReply build() {
      com.example.grpc.server.grpcserver.MatrixReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.server.grpcserver.MatrixReply buildPartial() {
      com.example.grpc.server.grpcserver.MatrixReply result = new com.example.grpc.server.grpcserver.MatrixReply(this);
      result.m3_ = m3_;
      result.m33_ = m33_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.server.grpcserver.MatrixReply) {
        return mergeFrom((com.example.grpc.server.grpcserver.MatrixReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.server.grpcserver.MatrixReply other) {
      if (other == com.example.grpc.server.grpcserver.MatrixReply.getDefaultInstance()) return this;
      if (other.getM3() != 0) {
        setM3(other.getM3());
      }
      if (!other.getM33().isEmpty()) {
        m33_ = other.m33_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.grpc.server.grpcserver.MatrixReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.server.grpcserver.MatrixReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int m3_ ;
    /**
     * <code>int32 m3 = 1;</code>
     */
    public int getM3() {
      return m3_;
    }
    /**
     * <code>int32 m3 = 1;</code>
     */
    public Builder setM3(int value) {
      
      m3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 m3 = 1;</code>
     */
    public Builder clearM3() {
      
      m3_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object m33_ = "";
    /**
     * <code>string m33 = 2;</code>
     */
    public java.lang.String getM33() {
      java.lang.Object ref = m33_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        m33_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string m33 = 2;</code>
     */
    public com.google.protobuf.ByteString
        getM33Bytes() {
      java.lang.Object ref = m33_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        m33_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string m33 = 2;</code>
     */
    public Builder setM33(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      m33_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string m33 = 2;</code>
     */
    public Builder clearM33() {
      
      m33_ = getDefaultInstance().getM33();
      onChanged();
      return this;
    }
    /**
     * <code>string m33 = 2;</code>
     */
    public Builder setM33Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      m33_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:matrixmult.MatrixReply)
  }

  // @@protoc_insertion_point(class_scope:matrixmult.MatrixReply)
  private static final com.example.grpc.server.grpcserver.MatrixReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.server.grpcserver.MatrixReply();
  }

  public static com.example.grpc.server.grpcserver.MatrixReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MatrixReply>
      PARSER = new com.google.protobuf.AbstractParser<MatrixReply>() {
    public MatrixReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MatrixReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MatrixReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MatrixReply> getParserForType() {
    return PARSER;
  }

  public com.example.grpc.server.grpcserver.MatrixReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

