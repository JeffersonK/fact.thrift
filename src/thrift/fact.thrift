
namespace java com.hvf.alephnull.fact.thrift

enum Operation {
  NOOP = 0,
  IDENTITYOP = 1,
  
  BLOBSTORE = 99 //used for put large digitial objects that are not simple API calls

}

enum CheckPointLabel {
  REMOTE_TX = 0,
  SERVER_RX = 1,
  AGENT_FORWARD = 2
  STREAM_QUEUED = 3,
  FULLY_PROCESSED = 4,
  COMMITTED_TO_FACTSTORE = 5,
}

enum ContentType {
  JSON = 0,
  BLOB = 1
}

typedef i64 MicroTimestamp

struct PhysicalLocation {
  1: required double lat;
  2: required double long;
}

struct VirtualLocation {
  1: optional string url;
  2: optional i32 ipv4_address;
  3: optional i64 ipv6_address;
}

struct DeviceContext {
  1: required map<string,string> tags;
}

struct DebugContext {
   1: required list<string> tags;
}

struct CheckPoint {
  1: required string label;
  2: required MicroTimestamp utc_ts;
}  

struct AlephNullFact {
  1: required string developer_key;
  2: required string application_key;
  3: required string p_uuid //physical uuid
  4: optional PhysicalLocation p_loc  
  5: optional string v_uuid //virtual uuid
  6: optional VirtualLocation v_loc
  7: required MicroTimestamp utc_tx;
  8: optional MicroTimestamp utc_rx;
  9: required i32 sequence_num; //restarts at 0 everytime a client connects to an agent
  
  10: required Operation op;
  11: optional ContentType ctype;
  12: required string payload;

  13: optional DeviceContext d_context;
  14: optional list<CheckPoint> chckpts;
  15: optional DebugContext dbg;
}