/**
 * 
 */
package com.build.stuff.SweetMongo;

import java.io.File;
import java.io.IOException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

/**
 * @author Shailendra
 *
 */
public class MainMongo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		try{
			MongoClient client = new MongoClient("localhost",27017); //default port for mongo
			DB db = client.getDB("Test");
			System.out.println("Connect to database successfully");
			DBCollection table = db.getCollection("testCollection");
			BasicDBObject object = new BasicDBObject();
			object.put("1", "John Scully");
			object.put("2", "Shailendra Yadav");
			object.put("3", "Shashank Sharma");
			table.insert(object);
			System.out.println("Inserted into database successfully");
			
			saveImages(db);
			getImages(db);
			
			BasicDBObject searchQuery = new BasicDBObject();
			searchQuery.put("1", "John Scully");
		 
			DBCursor cursor = table.find(searchQuery);
		 
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private static void getImages(DB db) {
		String newFileName = "myimage";
		GridFS gfsPhoto = new GridFS(db, "photo");
		GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
		System.out.println(imageForOutput);
		
	}

	/**
	 * 
	 */
	private static void saveImages(DB db) {
		String newFileName = "myimage";
		File imageFile = new File("C:\\Users\\Shailendra\\Desktop\\Untitled.png");
		GridFS gfsPhoto = new GridFS(db, "photo");
		GridFSInputFile gfsFile = null;
		try {
			gfsFile = gfsPhoto.createFile(imageFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		gfsFile.setFilename(newFileName);
		gfsFile.save();
		
	}

}
