// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: matrix.proto

package com.example.grpc.server.grpcserver;

public final class MatrixMult {
  private MatrixMult() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_matrixmult_MatrixRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_matrixmult_MatrixRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_matrixmult_MatrixReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_matrixmult_MatrixReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014matrix.proto\022\nmatrixmult\"\'\n\rMatrixRequ" +
      "est\022\n\n\002m1\030\001 \001(\005\022\n\n\002m2\030\002 \001(\005\"\031\n\013MatrixRep" +
      "ly\022\n\n\002m3\030\001 \001(\0052\230\001\n\rMatrixService\022E\n\rMult" +
      "iplyBlock\022\031.matrixmult.MatrixRequest\032\027.m" +
      "atrixmult.MatrixReply\"\000\022@\n\010AddBlock\022\031.ma" +
      "trixmult.MatrixRequest\032\027.matrixmult.Matr" +
      "ixReply\"\000B7\n\"com.example.grpc.server.grp" +
      "cserverB\nMatrixMultP\001\242\002\002MMb\006proto3"
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
    internal_static_matrixmult_MatrixRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_matrixmult_MatrixRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_matrixmult_MatrixRequest_descriptor,
        new java.lang.String[] { "M1", "M2", });
    internal_static_matrixmult_MatrixReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_matrixmult_MatrixReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_matrixmult_MatrixReply_descriptor,
        new java.lang.String[] { "M3", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
