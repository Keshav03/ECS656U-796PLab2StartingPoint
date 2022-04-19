package com.example.grpc.server.grpcserver;


import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
@GrpcService
public class MatrixServiceImpl extends MatrixServiceGrpc.MatrixServiceImplBase
{
	@Override
	public void addBlock(MatrixRequest request, StreamObserver<MatrixReply> reply)
	{
		System.out.println("Request received from client:\n" + request);

        	String mA_string = request.getM11();
 	        String mB_string = request.getM22();

		String[] rows= mA_string.split("\n");
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

		String rowsB[] = mB_string.split("\n");
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

		int mC_row = matrixA.length;
    		int mC_col = matrixA[0].length;
    		int[][] matrixC = null;
      		matrixC = new int[mC_row][mC_col];
		String mC = "";
      		for (int i = 0; i < mC_row; i++) {
        		for (int j = 0; j < mC_col; j++) {
          			matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
        			mC = mC +" " + String.valueOf(matrixC[i][j]);
			}
			mC = mC + "\n";
    		}

		MatrixReply response = MatrixReply.newBuilder().setM33(mC).build();
		reply.onNext(response);
		reply.onCompleted();

	}//END OF ADDBLOCK



	@Override
    	public void multiplyBlock(MatrixRequest request, StreamObserver<MatrixReply> reply)
    	{
        	System.out.println("Request received from client:\n" + request);
  
		//String mA_string = request.getM1();
                //String mB_string = request.getM2();

		int mA = request.getM1();
		int mB = request.getM2(); 


		/*String[] rows= mA_string.split("\n");
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

                String rowsB[] = mB_string.split("\n");
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
                }*/


                /*int mC_row = matrixA.length;
                int mC_col = matrixA[0].length;
                int[][] matrixC = null;
                matrixC = new int[mC_row][mC_col];
                String mC = "";

		for (int i = 0; i < mC_row; i++) {
            		for (int j = 0; j < mC_row; j++) {
                		for (int k = 0; k < mC_row; k++){
                    			matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
				}
				mC = mC + " " + String.valueOf(matrixC[i][j]);
			}
			 mC = mC + "\n";
        	}
		*/

		int mC = mA*mB;

		MatrixReply response = MatrixReply.newBuilder().setM3(mC).build();
                reply.onNext(response);
                reply.onCompleted();

	}





    	 public void addBlocks(MatrixRequest request, StreamObserver<MatrixReply> reply)
	 {
		System.out.println("Request received from client:\n" + request);
		int C=request.getM1()+request.getM2();
		MatrixReply response = MatrixReply.newBuilder().setM3(C).build();
		reply.onNext(response);
		reply.onCompleted();
	 }

}
