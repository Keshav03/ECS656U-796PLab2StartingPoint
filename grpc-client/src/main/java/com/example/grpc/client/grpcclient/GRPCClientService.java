
package com.example.grpc.client.grpcclient;

import com.example.grpc.server.grpcserver.PingRequest;
import com.example.grpc.server.grpcserver.PongResponse;
import com.example.grpc.server.grpcserver.PingPongServiceGrpc;
import com.example.grpc.server.grpcserver.MatrixRequest;
import com.example.grpc.server.grpcserver.MatrixReply;
import com.example.grpc.server.grpcserver.MatrixServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
@Service
public class GRPCClientService {
    public String ping() {
        	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();        
		PingPongServiceGrpc.PingPongServiceBlockingStub stub
                = PingPongServiceGrpc.newBlockingStub(channel);        
		PongResponse helloResponse = stub.ping(PingRequest.newBuilder()
                .setPing("")
                .build());        
		channel.shutdown();        
		return helloResponse.getPong();
    }
    public String add(String mA,String mB){
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090)
		.usePlaintext()
		.build();
		MatrixServiceGrpc.MatrixServiceBlockingStub stub
		 = MatrixServiceGrpc.newBlockingStub(channel);

		MatrixReply A=stub.addBlock(MatrixRequest.newBuilder()
			.setM1(mA)
			.setM2(mB)
			.build());

		String resp = A.getM3();            
		return resp;
    }

    public String multiply(String mA,String mB){
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090)
                .usePlaintext()
                .build();
                MatrixServiceGrpc.MatrixServiceBlockingStub stub
                 = MatrixServiceGrpc.newBlockingStub(channel);

                MatrixReply A=stub.multiplyBlock(MatrixRequest.newBuilder()
                        .setM1(mA)
                        .setM2(mB)
                        .build());
                String resp = A.getM3();            
                return resp;
    }


	private static double footPrint(MatrixServiceGrpc.MatrixServiceBlockingStub stub, int a, int b){

                double startTime = System.nanoTime();
                MatrixReply temp=stub.multiplyBlock(MatrixRequest.newBuilder().setA(a).setB(b).build());
                double endTime = System.nanoTime();
                double footprint= endTime-startTime;
                return (footprint/1000000000);
        }

}
