/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author valentin
 */
public class BDD {
    MongoClient mongo;
    DB db;
    DBCollection collection;
    
    public BDD(String client, String database, String c)
    {
        try{
            mongo = new MongoClient(client);
            db =  mongo.getDB(database);
            collection = db.getCollection(c);
        } catch (UnknownHostException ex) {
            System.out.println(ex);
        }
        
    }
    
    public DBCollection getCollection() {return collection;}
    public void setCollection(String col){ collection = db.getCollection(col);}
}
