
package com.example.grpc.client.grpcclient;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestMapping;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.ui.Model;

@Controller
public class FileController {

    @RequestMapping("/")
    public String index(){
	return "interface";
    }

    @RequestMapping("/upload")
    public String uploadFiles(Model model,@RequestParam("file") MultipartFile[] files) {
	String matrixA_string = "";
	String matrixB_string = "";
	//-------------------------------------//
        //    CHECK IF 2 FILES IS UPLOADED    //
       //------------------------------------//

	if (files.length!=2){
	    model.addAttribute("status","Please upload only 2 files!");
	    return "interface";
	}

	try{
	   byte[] file1 = files[0].getBytes();
	   byte[] file2 = files[1].getBytes();
	   matrixA_string = new String(file1);
	   matrixB_string = new String(file2);


           ////////////////
	   // MATRIX A ////
           ///////////////
	   // Converting to matrix A

	   String[] rows= matrixA_string.split("\n");
	   int rowNo = rows.length;
           String columns[] = rows[0].split(" ");
           int columnNo = columns.length;
           int matrixA[][] = new int[rowNo][columnNo];
           for (int i=0; i<rowNo; i++) {
        	columns = rows[i].split(" ");
		if (columns.length != rowNo){
               		model.addAttribute("status","Invalid! Please upload a valid square matrix!");
               		return "interface";
                }
       		for(int j=0; j<columnNo; j++){
			try{
                               	int numberA =  Integer.parseInt(columns[j].replaceAll("[^0-9]", ""));
				matrixA[i][j] = numberA;
                        }catch(NumberFormatException ex){
				System.out.println("Not a number!");
                        }
    		}
	    }

	   ////////////////
           // MATRIX B ////
           ///////////////
	  // Converting to matrix


           String rowsB[] = matrixB_string.split("\n");
           int rowNoB = rowsB.length;
           String columnsB[] = rowsB[0].split(" ");
           int columnNoB = columnsB.length;
           int matrixB[][] = new int[rowNoB][columnNoB];
           for (int i=0; i<rowNoB; i++) {
                    columnsB = rowsB[i].split(" ");
                    if (columnsB.length != rowNoB){
                        model.addAttribute("status","Please upload a square matrix!Matrix B is not a square matrix");
                        return "interface";
                    }
                    for(int j=0; j<columnNoB; j++) {
                        try{
                            int numberB =  Integer.parseInt(columnsB[j].replaceAll("[^0-9]", ""));
                               	matrixB[i][j] = numberB;
                        }catch(NumberFormatException ex){
                                System.out.println("Not a number!");
                        }
                    }
           }

	if(matrixA.length != matrixB.length){
		model.addAttribute("status","Both matrices should have the same size nxn");
                return "interface";
	}
	


 	   }catch (IOException e){
	 	System.out.println("something went wrong");
       	   }


	//---------------------------//
       //    Storing files          //
      //---------------------------//

	    List<String> fileNames = new ArrayList<>();
            // read and write the file to the local folder
            Arrays.asList(files).stream().forEach(file -> {
                byte[] bytes = new byte[0];
                try {
                    bytes = file.getBytes();
                    Files.write(Paths.get(System.getProperty("user.dir")+ "/files", file.getOriginalFilename()), bytes);
                    fileNames.add(file.getOriginalFilename());
                } catch (IOException e) {

                }
            });
     //-----------------------------------//
    //        END OF STORING FILES       //
   //-----------------------------------//

	model.addAttribute("message","You successfully uploaded " + fileNames.get(0) + " and " + fileNames.get(1) + " .");
	model.addAttribute("mA",matrixA_string);
	model.addAttribute("mB",matrixB_string);
	return "upload";

    }
}
