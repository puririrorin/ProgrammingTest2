
public class AddRequest extends Request {
    private AddRequest(String course,String studentID){
        createRequest(REQUEST_ADD,studentID,course);
    }
}

