package fraudModel;

import graph.Graph;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pawan on 6/5/17.
 */
public class RealModel {

    public void model() {
        /**** defining the Fields ****/
        /* Transaction Fields */
        Field transaction_id = new Field("String", "transaction_id", null, null, null, true);  // primary key of Transaction fraudModel.Entity
        Field transaction_type = new Field("String", "transaction_type", null, null, null, false);
        Field amount = new Field("Int", "amount", null, null, null, false);
        Field transaction_account_id = new Field("String", "account_id", "Account", "account_id", "perform on", false);

        /* Account Fields */
        Field account_id = new Field("String", "account_id", null, null, null, true);  // primary key of Account fraudModel.Entity
        Field account_name = new Field("String", "account_name", null, null, null, false);
        Field account_address = new Field("String", "account_address", null, null, null, false);
        Field account_branch_id = new Field("String", "branch_id", "Branch", "branch", "belongs to", false);
        Field account_person_id = new Field("String", "person_id", "Person", "person_id", "belongs to", false);

        /* Person Fields */
        Field person_id = new Field("String", "person_id", null, null, null, true);   // primary key of Person fraudModel.Entity
        Field person_name = new Field("String", "person_name", null, null, null, false);
        Field person_address = new Field("String", "person_address", null, null, null, false);

        /* Branch Fields */
        Field branch_id = new Field("String", "branch_id", null, null, null, true);    // primary key of Branch fraudModel.Entity
        Field branch_name = new Field("String", "branch_name", null, null, null, false);
        Field branch_address = new Field("String", "branch_address", null, null, null, false);

        // ArrayLists of Fields
        ArrayList<Field> transaction_fields = new ArrayList<Field>();
        ArrayList<Field> account_fields = new ArrayList<Field>();
        ArrayList<Field> person_fields = new ArrayList<Field>();
        ArrayList<Field> branch_fields = new ArrayList<Field>();

        transaction_fields.add(transaction_id);
        transaction_fields.add(transaction_type);
        transaction_fields.add(amount);
        transaction_fields.add(transaction_account_id);

        account_fields.add(account_id);
        account_fields.add(account_name);
        account_fields.add(account_address);
        account_fields.add(account_branch_id);
        account_fields.add(account_person_id);

        person_fields.add(person_id);
        person_fields.add(person_name);
        person_fields.add(person_address);

        branch_fields.add(branch_id);
        branch_fields.add(branch_name);
        branch_fields.add(branch_address);

        /**** defining the fraudModel.Entity Types ****/
        EntityType transaction = new EntityType("Transaction", transaction_fields);
        EntityType account = new EntityType("Account", account_fields);
        EntityType person = new EntityType("Person", person_fields);
        EntityType branch = new EntityType("Branch", branch_fields);

        /**** adding Sample data ****/
        Map<String, Object> trans1Fields = new HashMap<String, Object>();
        Map<String, Object> trans2Fields = new HashMap<String, Object>();
        Map<String, Object> account1Fields = new HashMap<String, Object>();
        Map<String, Object> account2Fields = new HashMap<String, Object>();
        Map<String, Object> person1Fields = new HashMap<String, Object>();
        Map<String, Object> branch1Fields = new HashMap<String, Object>();
        Map<String, Object> branch2Fields = new HashMap<String, Object>();

        trans1Fields.put("transaction_id", "T1");
        trans1Fields.put("transaction_type", "credit card");
        trans1Fields.put("amount", 500);
        trans1Fields.put("account_id", "A1");

        trans2Fields.put("transaction_id", "T2");
        trans2Fields.put("transaction_type", "cash");
        trans2Fields.put("amount", 800);
        trans2Fields.put("account_id", "A2");

        account1Fields.put("account_id", "A1");
        account1Fields.put("name", "PM Gunaratne");
        account1Fields.put("address", "No48, NewRd, Colombo 3");
        account1Fields.put("person_id", "P1");
        account1Fields.put("branch_id", "B1");

        account2Fields.put("account_id", "A2");
        account2Fields.put("name", "PM Gunaratne");
        account2Fields.put("address", "No48, NewRd, Colombo 3");
        account2Fields.put("person_id", "P1");
        account2Fields.put("branch_id", "B2");

        person1Fields.put(person_id.getName(), "P1");
        person1Fields.put(person_name.getName(), "Pawan");
        person1Fields.put(person_address.getName(), "No48, NewRd, Colombo 2");

        branch1Fields.put("branch_id", "B1");
        branch1Fields.put("branch_name", "Colombo 3");
        branch1Fields.put("branch_address", "No34, FlowerRd, Colombo 3");

        branch2Fields.put("branch_id", "B2");
        branch2Fields.put("branch_name", "Colombo 2");
        branch2Fields.put("branch_address", "No4, ADSRd, Colombo 2");

        // sample entities
        Entity person1 = new Entity(person1Fields, person);
        Entity account1 = new Entity(account1Fields, account);
        Entity account2 = new Entity(account2Fields, account);
        Entity branch1 = new Entity(branch1Fields, branch);
        Entity trans1 = new Entity(trans1Fields, transaction);
        Entity trans2 = new Entity(trans2Fields, transaction);
        Entity branch2 = new Entity(branch1Fields, branch);
        // adding Entities to Entity Container
        EntityContainer ec = new EntityContainer();

        ec.addEntityType(person);
        ec.addEntityType(account);
        ec.addEntityType(branch);
        ec.addEntityType(transaction);

        ec.addEntity("P1", person1);
        ec.addEntity("A1", account1);
        ec.addEntity("A2", account2);
        ec.addEntity("B1", branch1);
        ec.addEntity("T1", trans1);
        ec.addEntity("T2", trans2);
        ec.addEntity("B2", branch2);

        Graph graph = new Graph(ec.getEntityList());
        graph.createNodes();
        graph.createEdges();

        JSONObject nodes = new JSONObject(graph.getNodes());
        System.out.println("JsonNodes : "+nodes);
        JSONObject edges = new JSONObject(graph.getEdges());
        System.out.println("JsonEdges : "+edges);

    }

    public static void main(String[] args) {
        RealModel rm = new RealModel();
        rm.model();
    }

    public void jsonCreater(){

    }

    public void entityCreater() {}

}
