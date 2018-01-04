// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/ChatMessage.proto

package proto;

public final class ChatMessageProto {
  private ChatMessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChatMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ChatMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 timestamp = 1;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>required int64 timestamp = 1;</code>
     */
    long getTimestamp();

    /**
     * <code>optional int64 userID = 2;</code>
     */
    boolean hasUserID();
    /**
     * <code>optional int64 userID = 2;</code>
     */
    long getUserID();

    /**
     * <code>optional int64 groupID = 3;</code>
     */
    boolean hasGroupID();
    /**
     * <code>optional int64 groupID = 3;</code>
     */
    long getGroupID();

    /**
     * <code>optional string content = 4;</code>
     */
    boolean hasContent();
    /**
     * <code>optional string content = 4;</code>
     */
    java.lang.String getContent();
    /**
     * <code>optional string content = 4;</code>
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>optional bytes image = 5;</code>
     */
    boolean hasImage();
    /**
     * <code>optional bytes image = 5;</code>
     */
    com.google.protobuf.ByteString getImage();
  }
  /**
   * Protobuf type {@code proto.ChatMessage}
   */
  public  static final class ChatMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.ChatMessage)
      ChatMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChatMessage.newBuilder() to construct.
    private ChatMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChatMessage() {
      timestamp_ = 0L;
      userID_ = 0L;
      groupID_ = 0L;
      content_ = "";
      image_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChatMessage(
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
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              timestamp_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              userID_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              groupID_ = input.readInt64();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              content_ = bs;
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              image_ = input.readBytes();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.ChatMessageProto.internal_static_proto_ChatMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.ChatMessageProto.internal_static_proto_ChatMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.ChatMessageProto.ChatMessage.class, proto.ChatMessageProto.ChatMessage.Builder.class);
    }

    private int bitField0_;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long timestamp_;
    /**
     * <code>required int64 timestamp = 1;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 timestamp = 1;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int USERID_FIELD_NUMBER = 2;
    private long userID_;
    /**
     * <code>optional int64 userID = 2;</code>
     */
    public boolean hasUserID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 userID = 2;</code>
     */
    public long getUserID() {
      return userID_;
    }

    public static final int GROUPID_FIELD_NUMBER = 3;
    private long groupID_;
    /**
     * <code>optional int64 groupID = 3;</code>
     */
    public boolean hasGroupID() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 groupID = 3;</code>
     */
    public long getGroupID() {
      return groupID_;
    }

    public static final int CONTENT_FIELD_NUMBER = 4;
    private volatile java.lang.Object content_;
    /**
     * <code>optional string content = 4;</code>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string content = 4;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          content_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string content = 4;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IMAGE_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString image_;
    /**
     * <code>optional bytes image = 5;</code>
     */
    public boolean hasImage() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bytes image = 5;</code>
     */
    public com.google.protobuf.ByteString getImage() {
      return image_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTimestamp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, timestamp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, userID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, groupID_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, content_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, image_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, timestamp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, userID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, groupID_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, content_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, image_);
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
      if (!(obj instanceof proto.ChatMessageProto.ChatMessage)) {
        return super.equals(obj);
      }
      proto.ChatMessageProto.ChatMessage other = (proto.ChatMessageProto.ChatMessage) obj;

      boolean result = true;
      result = result && (hasTimestamp() == other.hasTimestamp());
      if (hasTimestamp()) {
        result = result && (getTimestamp()
            == other.getTimestamp());
      }
      result = result && (hasUserID() == other.hasUserID());
      if (hasUserID()) {
        result = result && (getUserID()
            == other.getUserID());
      }
      result = result && (hasGroupID() == other.hasGroupID());
      if (hasGroupID()) {
        result = result && (getGroupID()
            == other.getGroupID());
      }
      result = result && (hasContent() == other.hasContent());
      if (hasContent()) {
        result = result && getContent()
            .equals(other.getContent());
      }
      result = result && (hasImage() == other.hasImage());
      if (hasImage()) {
        result = result && getImage()
            .equals(other.getImage());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTimestamp()) {
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getTimestamp());
      }
      if (hasUserID()) {
        hash = (37 * hash) + USERID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getUserID());
      }
      if (hasGroupID()) {
        hash = (37 * hash) + GROUPID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getGroupID());
      }
      if (hasContent()) {
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent().hashCode();
      }
      if (hasImage()) {
        hash = (37 * hash) + IMAGE_FIELD_NUMBER;
        hash = (53 * hash) + getImage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static proto.ChatMessageProto.ChatMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.ChatMessageProto.ChatMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.ChatMessageProto.ChatMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.ChatMessageProto.ChatMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.ChatMessageProto.ChatMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.ChatMessageProto.ChatMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.ChatMessageProto.ChatMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.ChatMessageProto.ChatMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.ChatMessageProto.ChatMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static proto.ChatMessageProto.ChatMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.ChatMessageProto.ChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.ChatMessageProto.ChatMessage parseFrom(
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
    public static Builder newBuilder(proto.ChatMessageProto.ChatMessage prototype) {
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
     * Protobuf type {@code proto.ChatMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ChatMessage)
        proto.ChatMessageProto.ChatMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return proto.ChatMessageProto.internal_static_proto_ChatMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return proto.ChatMessageProto.internal_static_proto_ChatMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                proto.ChatMessageProto.ChatMessage.class, proto.ChatMessageProto.ChatMessage.Builder.class);
      }

      // Construct using proto.ChatMessageProto.ChatMessage.newBuilder()
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
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        userID_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        groupID_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        content_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        image_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return proto.ChatMessageProto.internal_static_proto_ChatMessage_descriptor;
      }

      public proto.ChatMessageProto.ChatMessage getDefaultInstanceForType() {
        return proto.ChatMessageProto.ChatMessage.getDefaultInstance();
      }

      public proto.ChatMessageProto.ChatMessage build() {
        proto.ChatMessageProto.ChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public proto.ChatMessageProto.ChatMessage buildPartial() {
        proto.ChatMessageProto.ChatMessage result = new proto.ChatMessageProto.ChatMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.userID_ = userID_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.groupID_ = groupID_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.content_ = content_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.image_ = image_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof proto.ChatMessageProto.ChatMessage) {
          return mergeFrom((proto.ChatMessageProto.ChatMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(proto.ChatMessageProto.ChatMessage other) {
        if (other == proto.ChatMessageProto.ChatMessage.getDefaultInstance()) return this;
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasUserID()) {
          setUserID(other.getUserID());
        }
        if (other.hasGroupID()) {
          setGroupID(other.getGroupID());
        }
        if (other.hasContent()) {
          bitField0_ |= 0x00000008;
          content_ = other.content_;
          onChanged();
        }
        if (other.hasImage()) {
          setImage(other.getImage());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTimestamp()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        proto.ChatMessageProto.ChatMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (proto.ChatMessageProto.ChatMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long timestamp_ ;
      /**
       * <code>required int64 timestamp = 1;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 timestamp = 1;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>required int64 timestamp = 1;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000001;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 timestamp = 1;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private long userID_ ;
      /**
       * <code>optional int64 userID = 2;</code>
       */
      public boolean hasUserID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 userID = 2;</code>
       */
      public long getUserID() {
        return userID_;
      }
      /**
       * <code>optional int64 userID = 2;</code>
       */
      public Builder setUserID(long value) {
        bitField0_ |= 0x00000002;
        userID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 userID = 2;</code>
       */
      public Builder clearUserID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        userID_ = 0L;
        onChanged();
        return this;
      }

      private long groupID_ ;
      /**
       * <code>optional int64 groupID = 3;</code>
       */
      public boolean hasGroupID() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int64 groupID = 3;</code>
       */
      public long getGroupID() {
        return groupID_;
      }
      /**
       * <code>optional int64 groupID = 3;</code>
       */
      public Builder setGroupID(long value) {
        bitField0_ |= 0x00000004;
        groupID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 groupID = 3;</code>
       */
      public Builder clearGroupID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        groupID_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <code>optional string content = 4;</code>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string content = 4;</code>
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            content_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string content = 4;</code>
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string content = 4;</code>
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string content = 4;</code>
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000008);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>optional string content = 4;</code>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        content_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString image_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes image = 5;</code>
       */
      public boolean hasImage() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bytes image = 5;</code>
       */
      public com.google.protobuf.ByteString getImage() {
        return image_;
      }
      /**
       * <code>optional bytes image = 5;</code>
       */
      public Builder setImage(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        image_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes image = 5;</code>
       */
      public Builder clearImage() {
        bitField0_ = (bitField0_ & ~0x00000010);
        image_ = getDefaultInstance().getImage();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:proto.ChatMessage)
    }

    // @@protoc_insertion_point(class_scope:proto.ChatMessage)
    private static final proto.ChatMessageProto.ChatMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new proto.ChatMessageProto.ChatMessage();
    }

    public static proto.ChatMessageProto.ChatMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ChatMessage>
        PARSER = new com.google.protobuf.AbstractParser<ChatMessage>() {
      public ChatMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChatMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChatMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChatMessage> getParserForType() {
      return PARSER;
    }

    public proto.ChatMessageProto.ChatMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ChatMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ChatMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027proto/ChatMessage.proto\022\005proto\"a\n\013Chat" +
      "Message\022\021\n\ttimestamp\030\001 \002(\003\022\016\n\006userID\030\002 \001" +
      "(\003\022\017\n\007groupID\030\003 \001(\003\022\017\n\007content\030\004 \001(\t\022\r\n\005" +
      "image\030\005 \001(\014B\022B\020ChatMessageProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ChatMessage_descriptor,
        new java.lang.String[] { "Timestamp", "UserID", "GroupID", "Content", "Image", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
