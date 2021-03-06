package runner;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class UploadFile {

	private static final String SUFFIX = "/";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AWSCredentials credentials = new BasicAWSCredentials(
				"AKIAJVBOBIQIPVOISF4A", 
				"cIXAkuO2Sz04cv6HcoUw11iP34dotMvpiGjLYpk0");
		
		// create a client connection based on credentials
		AmazonS3 s3client = new AmazonS3Client(credentials);
				
		// list buckets
		for (Bucket bucket : s3client.listBuckets()) {
			if(bucket.getName().contains("qa-screenshot"))
			{
				System.out.println(" - " + bucket.getName());				
			}
		}
		
		String folderName = "qa-screenshot";
		String fileName = folderName + SUFFIX +"Eagle-large.jpg";
		s3client.putObject(new PutObjectRequest("qa-screenshot", fileName, 
				new File("src/test/resources/images/Eagle-large.jpg"))
				.withCannedAcl(CannedAccessControlList.PublicRead));

		String url = s3client.getUrl(folderName, folderName+"/Eagle-large.jpg").toString();
		System.out.println("The url is "+url);
	}

}
