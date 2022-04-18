
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


                String[] rows= mA.split("\n");
                int rowNo = rows.length;
                String columns[] = rows[0].split(" ");
                int columnNo = columns.length;
                int matrixA[][] = new int[rowNo][columnNo];
                for (int i=0; i<rowNo; i++) {
                        columns = rows[i].split(" ");
                        for(int j=0; j<columnNo; j++){
                                try{
                                        int numberA =  Integer.parseInt(columns[j].replaceAll("[^0-9]", ""));
                                        matrixA[i][j] = numberA;
                                }catch(NumberFormatException ex){
                                        System.out.println("Not a number!");
                                }
                        }
                }
                String rowsB[] = mB.split("\n");
                int rowNoB = rowsB.length;
                String columnsB[] = rowsB[0].split(" ");
                 int columnNoB = columnsB.length;
                int matrixB[][] = new int[rowNoB][columnNoB];
                for (int i=0; i<rowNoB; i++) {
                        columnsB = rowsB[i].split(" ");
                        for(int j=0; j<columnNoB; j++) {
                                try{
                                        int numberB =  Integer.parseInt(columnsB[j].replaceAll("[^0-9]", ""));
                                        matrixB[i][j] = numberB;
                                }catch(NumberFormatException ex){
                                        System.out.println("Not a number!");
                                }
                        }
                }


		MatrixReply A=stub.addBlock(MatrixRequest.newBuilder()
			.setM1(matrixA)
			.setM2(matrixB)
			.build());

		String resp = A.getM3();            
		return resp;
    }

    public String multiply(String mA,String mB,int deadline){
                //ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090)
                //.usePlaintext()
                //.build();
                //MatrixServiceGrpc.MatrixServiceBlockingStub stub
                //= MatrixServiceGrpc.newBlockingStub(channel);

                //MatrixReply A=stub.multiplyBlock(MatrixRequest.newBuilder()
                  //      .setM1(mA)
                    //    .setM2(mB)
                      //  .build());
		//String resp = A.getM3();

                String[] rows= mA.split("\n");
                int rowNo = rows.length;
                String columns[] = rows[0].split(" ");
                int columnNo = columns.length;
                int matrixA[][] = new int[rowNo][columnNo];
                for (int i=0; i<rowNo; i++) {
                        columns = rows[i].split(" ");
                        for(int j=0; j<columnNo; j++){
                                try{
                                        int numberA =  Integer.parseInt(columns[j].replaceAll("[^0-9]", ""));
                                        matrixA[i][j] = numberA;
                                }catch(NumberFormatException ex){
                                        System.out.println("Not a number!");
                                }
                        }
                }
                String rowsB[] = mB.split("\n");
                int rowNoB = rowsB.length;
                String columnsB[] = rowsB[0].split(" ");
                 int columnNoB = columnsB.length;
                int matrixB[][] = new int[rowNoB][columnNoB];
                for (int i=0; i<rowNoB; i++) {
                        columnsB = rowsB[i].split(" ");
                        for(int j=0; j<columnNoB; j++) {
                                try{
                                        int numberB =  Integer.parseInt(columnsB[j].replaceAll("[^0-9]", ""));
                                        matrixB[i][j] = numberB;
                                }catch(NumberFormatException ex){
                                        System.out.println("Not a number!");
                                }
                        }
                }

                String result = grpcClient(matrixA,matrixB,deadline);
		return resp;
    }


	public String grpcClient(int[][]a, int[][]b, int deadline){
                System.out.println("\n=====================================");
                System.out.println("Deadline: " + deadline + " seconds ");
 
                ManagedChannel channel1 = ManagedChannelBuilder.forAddress("35.188.76.82", 8080).usePlaintext().build();  
                ManagedChannel channel2 = ManagedChannelBuilder.forAddress("35.202.189.202", 8080).usePlaintext().build();  
                ManagedChannel channel3 = ManagedChannelBuilder.forAddress("35.226.251.88", 8080).usePlaintext().build();  
                ManagedChannel channel4 = ManagedChannelBuilder.forAddress("", 8080).usePlaintext().build();  
                ManagedChannel channel5 = ManagedChannelBuilder.forAddress("", 8080).usePlaintext().build();  
                ManagedChannel channel6 = ManagedChannelBuilder.forAddress("", 8080).usePlaintext().build();  
                ManagedChannel channel7 = ManagedChannelBuilder.forAddress("", 8080).usePlaintext().build();  
                ManagedChannel channel8 = ManagedChannelBuilder.forAddress("", 8080).usePlaintext().build();  

                MatrixServiceGrpc.MatrixServiceBlockingStub stub1 = MatrixServiceGrpc.newBlockingStub(channel1);
                MatrixServiceGrpc.MatrixServiceBlockingStub stub2 = MatrixServiceGrpc.newBlockingStub(channel2);
                MatrixServiceGrpc.MatrixServiceBlockingStub stub3 = MatrixServiceGrpc.newBlockingStub(channel3);
                MatrixServiceGrpc.MatrixServiceBlockingStub stub4 = MatrixServiceGrpc.newBlockingStub(channel4);
                MatrixServiceGrpc.MatrixServiceBlockingStub stub5 = MatrixServiceGrpc.newBlockingStub(channel5);
                MatrixServiceGrpc.MatrixServiceBlockingStub stub6 = MatrixServiceGrpc.newBlockingStub(channel6);
                MatrixServiceGrpc.MatrixServiceBlockingStub stub7 = MatrixServiceGrpc.newBlockingStub(channel7);
                MatrixServiceGrpc.MatrixServiceBlockingStub stub8 = MatrixServiceGrpc.newBlockingStub(channel8);

                ArrayList<MatrixServiceGrpc.MatrixServiceBlockingStub> stubs = new ArrayList<MatrixServiceGrpc.MatrixServiceBlockingStub>();
                stubss.add(stub1);
                stubss.add(stub2);
                stubss.add(stub3);
                stubss.add(stub4);
                stubss.add(stub5);
                stubss.add(stub6);
                stubss.add(stub7);
                stubss.add(stub8);

                // Counts stubs into the matrix calculation
                int stub = 0;

                // Length row
                int N = a.length;

                // use a random stub from the stub array to calculate footprint  
                Random r = new Random();
                int random = r.nextInt(8);

		long startTime = System.nanoTime();
                MatrixReply temp=stubss.get(random).multiplyBlock(MatrixRequest.newBuilder().setA(a).setB(b).build());
                long endTime = System.nanoTime();
                double footprint= (endTime-startTime)/1000000000;

                // Get execution time and number of needed servers
                int nOofcalls = (int) Math.pow(N, 2);
                double number_of_server_needed = (nOofcalls*footprint)/deadline;

                if (nOserver_needed < 1.00 ){
			 nOserver_needed = 1.00;
		}

                if(nOserver_needed <2.00 && number_of_server_needed > 1.00){
			 number_of_server_needed = 2.00;
                }
                System.out.println("Number of server needed: " + nOserver_needed);
                System.out.println("=====================================");
                System.out.println("Footprint: " + footprint + " seconds");
                System.out.println("=====================================");

                if((nOserver_needed > 8) ){
                        System.out.println("Expected Deadline too low, multiplication cannot be done!");
                        return;
                        }
                }
                System.out.println("Number of used servers: " + (int) Math.round(nOserver_needed));
                System.out.println("=====================================\n");
                
		int c[][] = new int[N][N];
                // Start the matrix calculation and print the result onto client 
                for (int i = 0; i < N; i++) { // row
                        for (int j = 0; j < N; j++) { // col
                            for (int k = 0; k < N; k++) {
                                
                                MatrixReply temp=stubs.get(stub).multiplyBlock(MatrixRequest.newBuilder().setA(a[i][k]).setB(b[k][j]).build());
                                if(stub == nOservers_in_use-1){
					 stub = 0;
				}
                                else{
					 stubs_index++;
				}
                                MatrixReply temp2=stubss.get(stubs_index).addBlock(MatrixRequest.newBuilder().setA(c[i][j]).setB(temp.getC()).build());
                                
				c[i][j] = temp2.getC();
			
                                if(stubs_index == number_of_servers_in_use-1){
					 stubs_index = 0;
				}
                                else{
					 stubs_index++;
				}
                            }
                        }
                 }


		String result = "";

                    // Print result matrix
                    for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[0].length; j++) {
			    result += c[i][j] + " ";
                            System.out.print(c[i][j] + " ");
                        }
			result = "\n";
                        System.out.println("");
                    }


                // Close channels
                channel1.shutdown();
                channel2.shutdown();
                channel3.shutdown();
                channel4.shutdown();
                channel5.shutdown();
                channel6.shutdown();
                channel7.shutdown();
                channel8.shutdown();
	    
		return result;

	}

}

}
