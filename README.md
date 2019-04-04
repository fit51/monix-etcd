# monix-etcd
monix-etcd is a Scala client for etcd v3.  

Library uses [ScalaPB](https://github.com/scalapb/ScalaPB) to generate GRPC interaface from [these](https://github.com/etcd-io/jetcd/tree/master/jetcd-core/src/main/proto) etcd .proto files.  
Client implementation uses monix for concurrent and streaming operations.

Client API may not implement all of the etcd v3 [API](https://coreos.com/etcd/docs/latest/learning/api.html) in direct way. Futhermore monix-etcd provides а high-level, reactive abstraction over etcd functionality, using it's low-level API (Ex. Watch service).

## Note
Library is in development. It is used in [reactive-config]("https://github.com/fit51/reactive-config")