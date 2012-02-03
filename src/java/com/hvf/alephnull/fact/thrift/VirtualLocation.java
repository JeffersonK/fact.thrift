/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.hvf.alephnull.fact.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VirtualLocation implements org.apache.thrift.TBase<VirtualLocation, VirtualLocation._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("VirtualLocation");

  private static final org.apache.thrift.protocol.TField URL_FIELD_DESC = new org.apache.thrift.protocol.TField("url", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IPV4_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("ipv4_address", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField IPV6_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("ipv6_address", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VirtualLocationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VirtualLocationTupleSchemeFactory());
  }

  private String url; // optional
  private int ipv4_address; // optional
  private long ipv6_address; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    URL((short)1, "url"),
    IPV4_ADDRESS((short)2, "ipv4_address"),
    IPV6_ADDRESS((short)3, "ipv6_address");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // URL
          return URL;
        case 2: // IPV4_ADDRESS
          return IPV4_ADDRESS;
        case 3: // IPV6_ADDRESS
          return IPV6_ADDRESS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __IPV4_ADDRESS_ISSET_ID = 0;
  private static final int __IPV6_ADDRESS_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  private _Fields optionals[] = {_Fields.URL,_Fields.IPV4_ADDRESS,_Fields.IPV6_ADDRESS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.URL, new org.apache.thrift.meta_data.FieldMetaData("url", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IPV4_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("ipv4_address", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IPV6_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("ipv6_address", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(VirtualLocation.class, metaDataMap);
  }

  public VirtualLocation() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VirtualLocation(VirtualLocation other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetUrl()) {
      this.url = other.url;
    }
    this.ipv4_address = other.ipv4_address;
    this.ipv6_address = other.ipv6_address;
  }

  public VirtualLocation deepCopy() {
    return new VirtualLocation(this);
  }

  @Override
  public void clear() {
    this.url = null;
    setIpv4_addressIsSet(false);
    this.ipv4_address = 0;
    setIpv6_addressIsSet(false);
    this.ipv6_address = 0;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void unsetUrl() {
    this.url = null;
  }

  /** Returns true if field url is set (has been assigned a value) and false otherwise */
  public boolean isSetUrl() {
    return this.url != null;
  }

  public void setUrlIsSet(boolean value) {
    if (!value) {
      this.url = null;
    }
  }

  public int getIpv4_address() {
    return this.ipv4_address;
  }

  public void setIpv4_address(int ipv4_address) {
    this.ipv4_address = ipv4_address;
    setIpv4_addressIsSet(true);
  }

  public void unsetIpv4_address() {
    __isset_bit_vector.clear(__IPV4_ADDRESS_ISSET_ID);
  }

  /** Returns true if field ipv4_address is set (has been assigned a value) and false otherwise */
  public boolean isSetIpv4_address() {
    return __isset_bit_vector.get(__IPV4_ADDRESS_ISSET_ID);
  }

  public void setIpv4_addressIsSet(boolean value) {
    __isset_bit_vector.set(__IPV4_ADDRESS_ISSET_ID, value);
  }

  public long getIpv6_address() {
    return this.ipv6_address;
  }

  public void setIpv6_address(long ipv6_address) {
    this.ipv6_address = ipv6_address;
    setIpv6_addressIsSet(true);
  }

  public void unsetIpv6_address() {
    __isset_bit_vector.clear(__IPV6_ADDRESS_ISSET_ID);
  }

  /** Returns true if field ipv6_address is set (has been assigned a value) and false otherwise */
  public boolean isSetIpv6_address() {
    return __isset_bit_vector.get(__IPV6_ADDRESS_ISSET_ID);
  }

  public void setIpv6_addressIsSet(boolean value) {
    __isset_bit_vector.set(__IPV6_ADDRESS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case URL:
      if (value == null) {
        unsetUrl();
      } else {
        setUrl((String)value);
      }
      break;

    case IPV4_ADDRESS:
      if (value == null) {
        unsetIpv4_address();
      } else {
        setIpv4_address((Integer)value);
      }
      break;

    case IPV6_ADDRESS:
      if (value == null) {
        unsetIpv6_address();
      } else {
        setIpv6_address((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case URL:
      return getUrl();

    case IPV4_ADDRESS:
      return Integer.valueOf(getIpv4_address());

    case IPV6_ADDRESS:
      return Long.valueOf(getIpv6_address());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case URL:
      return isSetUrl();
    case IPV4_ADDRESS:
      return isSetIpv4_address();
    case IPV6_ADDRESS:
      return isSetIpv6_address();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof VirtualLocation)
      return this.equals((VirtualLocation)that);
    return false;
  }

  public boolean equals(VirtualLocation that) {
    if (that == null)
      return false;

    boolean this_present_url = true && this.isSetUrl();
    boolean that_present_url = true && that.isSetUrl();
    if (this_present_url || that_present_url) {
      if (!(this_present_url && that_present_url))
        return false;
      if (!this.url.equals(that.url))
        return false;
    }

    boolean this_present_ipv4_address = true && this.isSetIpv4_address();
    boolean that_present_ipv4_address = true && that.isSetIpv4_address();
    if (this_present_ipv4_address || that_present_ipv4_address) {
      if (!(this_present_ipv4_address && that_present_ipv4_address))
        return false;
      if (this.ipv4_address != that.ipv4_address)
        return false;
    }

    boolean this_present_ipv6_address = true && this.isSetIpv6_address();
    boolean that_present_ipv6_address = true && that.isSetIpv6_address();
    if (this_present_ipv6_address || that_present_ipv6_address) {
      if (!(this_present_ipv6_address && that_present_ipv6_address))
        return false;
      if (this.ipv6_address != that.ipv6_address)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_url = true && (isSetUrl());
    builder.append(present_url);
    if (present_url)
      builder.append(url);

    boolean present_ipv4_address = true && (isSetIpv4_address());
    builder.append(present_ipv4_address);
    if (present_ipv4_address)
      builder.append(ipv4_address);

    boolean present_ipv6_address = true && (isSetIpv6_address());
    builder.append(present_ipv6_address);
    if (present_ipv6_address)
      builder.append(ipv6_address);

    return builder.toHashCode();
  }

  public int compareTo(VirtualLocation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    VirtualLocation typedOther = (VirtualLocation)other;

    lastComparison = Boolean.valueOf(isSetUrl()).compareTo(typedOther.isSetUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.url, typedOther.url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIpv4_address()).compareTo(typedOther.isSetIpv4_address());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIpv4_address()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ipv4_address, typedOther.ipv4_address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIpv6_address()).compareTo(typedOther.isSetIpv6_address());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIpv6_address()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ipv6_address, typedOther.ipv6_address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("VirtualLocation(");
    boolean first = true;

    if (isSetUrl()) {
      sb.append("url:");
      if (this.url == null) {
        sb.append("null");
      } else {
        sb.append(this.url);
      }
      first = false;
    }
    if (isSetIpv4_address()) {
      if (!first) sb.append(", ");
      sb.append("ipv4_address:");
      sb.append(this.ipv4_address);
      first = false;
    }
    if (isSetIpv6_address()) {
      if (!first) sb.append(", ");
      sb.append("ipv6_address:");
      sb.append(this.ipv6_address);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class VirtualLocationStandardSchemeFactory implements SchemeFactory {
    public VirtualLocationStandardScheme getScheme() {
      return new VirtualLocationStandardScheme();
    }
  }

  private static class VirtualLocationStandardScheme extends StandardScheme<VirtualLocation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, VirtualLocation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.url = iprot.readString();
              struct.setUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IPV4_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.ipv4_address = iprot.readI32();
              struct.setIpv4_addressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IPV6_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.ipv6_address = iprot.readI64();
              struct.setIpv6_addressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, VirtualLocation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.url != null) {
        if (struct.isSetUrl()) {
          oprot.writeFieldBegin(URL_FIELD_DESC);
          oprot.writeString(struct.url);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIpv4_address()) {
        oprot.writeFieldBegin(IPV4_ADDRESS_FIELD_DESC);
        oprot.writeI32(struct.ipv4_address);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIpv6_address()) {
        oprot.writeFieldBegin(IPV6_ADDRESS_FIELD_DESC);
        oprot.writeI64(struct.ipv6_address);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VirtualLocationTupleSchemeFactory implements SchemeFactory {
    public VirtualLocationTupleScheme getScheme() {
      return new VirtualLocationTupleScheme();
    }
  }

  private static class VirtualLocationTupleScheme extends TupleScheme<VirtualLocation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, VirtualLocation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUrl()) {
        optionals.set(0);
      }
      if (struct.isSetIpv4_address()) {
        optionals.set(1);
      }
      if (struct.isSetIpv6_address()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUrl()) {
        oprot.writeString(struct.url);
      }
      if (struct.isSetIpv4_address()) {
        oprot.writeI32(struct.ipv4_address);
      }
      if (struct.isSetIpv6_address()) {
        oprot.writeI64(struct.ipv6_address);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, VirtualLocation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.url = iprot.readString();
        struct.setUrlIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ipv4_address = iprot.readI32();
        struct.setIpv4_addressIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ipv6_address = iprot.readI64();
        struct.setIpv6_addressIsSet(true);
      }
    }
  }

}
